import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CartServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        String action = request.getParameter("action");

        // Get or create cart
        List<String> cart =
            (List<String>) session.getAttribute("cart");

        if (cart == null) {
            cart = new ArrayList<>();
            session.setAttribute("cart", cart);
        }

        // Handle add item
        String item = request.getParameter("item");
        if (item != null && !item.isEmpty()) {
            cart.add(item);
        }

        // Handle remove item
        if ("remove".equals(action)) {
            String removeItem =
                request.getParameter("removeItem");
            cart.remove(removeItem);
        }

        // Handle clear cart
        if ("clear".equals(action)) {
            cart.clear();
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Shopping Cart</title></head>");
        out.println("<body>");
        out.println("<h2>Shopping Cart (Session Demo)</h2>");
        out.println("<p>Session ID: " +
                    session.getId() + "</p>");

        // Add item form
        out.println("<form method='GET' action='cart'>");
        out.println("Add Item: <input type='text' " +
                    "name='item'> ");
        out.println("<input type='submit' " +
                    "value='Add to Cart'>");
        out.println("</form>");

        // Display cart
        out.println("<h3>Cart Items:</h3>");

        if (cart.isEmpty()) {
            out.println("<p>Cart is empty</p>");
        }
        else {
            out.println("<ol>");
            for (String cartItem : cart) {
                out.println("<li>" + cartItem +
                    " - <a href='cart?action=remove" +
                    "&removeItem=" + cartItem +
                    "'>Remove</a></li>");
            }
            out.println("</ol>");
            out.println("<p>Total items: " +
                        cart.size() + "</p>");
        }

        out.println("<br><a href='cart?action=clear'>" +
                    "Clear Cart</a>");
        out.println("</body>");
        out.println("</html>");
    }
}

/*
web.xml configuration:

<servlet>
    <servlet-name>CartServlet</servlet-name>
    <servlet-class>CartServlet</servlet-class>
</servlet>
<servlet-mapping>
    <servlet-name>CartServlet</servlet-name>
    <url-pattern>/cart</url-pattern>
</servlet-mapping>
*/
