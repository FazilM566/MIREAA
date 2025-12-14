package ПР17;

public class MVCPatternDemo {
    public static void main(String[] args) {

        Student model = retriveCourseFromDatabase();

        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();

        controller.setStudentName("Vasif");
        System.out.println("nAfter updating, Course Details are as follows");
        controller.updateView();
    }
        private static Student retriveCourseFromDatabase(){
            Student course = new Student();
            course.setName("Fazil");
            course.setRollNo("01");

            return course;
        }
}
