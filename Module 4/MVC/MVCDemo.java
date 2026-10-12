class MVCDemo {

    public static void main(String[] args) {

        // Create Model
        Student student = new Student("Achyuth", 23, 88.5);

        // Create View
        StudentView view = new StudentView();

        // Create Controller
        StudentController controller =
            new StudentController(student, view);

        // Display initial student details
        System.out.println("Initial Student Data:");
        controller.updateView();

        // Update student details through controller
        controller.setStudentName("Naveen");
        controller.setStudentRollNo(24);
        controller.setStudentMarks(92.0);

        // Display updated student details
        System.out.println("\nAfter Update:");
        controller.updateView();
    }
}
