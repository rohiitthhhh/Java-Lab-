class StudentController {

    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentRollNo(int rollNo) {
        model.setRollNo(rollNo);
    }

    public int getStudentRollNo() {
        return model.getRollNo();
    }

    public void setStudentMarks(double marks) {
        model.setMarks(marks);
    }

    public double getStudentMarks() {
        return model.getMarks();
    }

    public void updateView() {
        view.displayStudent(model);
    }
}
