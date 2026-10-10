import java.sql.*;
import java.io.*;

class BlobClob {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root", "Rohith@123"
            );

            Statement st = con.createStatement();

            st.executeUpdate(
                "CREATE TABLE IF NOT EXISTS files (id INT PRIMARY KEY, image BLOB, details CLOB)"
            );

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO files VALUES (?, ?, ?)"
            );

            ps.setInt(1, 1);

            FileInputStream fis = new FileInputStream("photo.jpg");
            ps.setBinaryStream(2, fis);

            ps.setString(3, "This is a sample student document.");
            ps.executeUpdate();
            fis.close();

            ResultSet rs = st.executeQuery(
                "SELECT image, details FROM files WHERE id=1"
            );

            if (rs.next()) {
                InputStream in = rs.getBinaryStream("image");
                FileOutputStream out = new FileOutputStream("copy.jpg");

                byte[] b = new byte[1024];
                int n;

                while ((n = in.read(b)) != -1)
                    out.write(b, 0, n);

                in.close();
                out.close();

                System.out.println(rs.getString("details"));
                System.out.println("Image retrieved");
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
