public class TestMVC {
    public static void main(String[] args) {
        Student stu=new Student("1" ,"Raj" , "A");

        StudentView view=new StudentView();

        StudentController sCon=new StudentController(stu, view);

        sCon.updateView();
        sCon.setSName("Jay");
        sCon.setSGrade("C");
        sCon.updateView();
    }
}
