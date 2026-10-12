class StudentView {

    public void displayStudent(Student student) {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name:    " + student.getName());
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Marks:   " + student.getMarks());
    }
}
