public class Client {
    public static void main(String[] args){

        Director dir1 = new Director(new EngineeringStudentBuilder());
        Director dir2 = new Director(new MBAStudentBuilder());

        Student engStudent = dir1.CreateStudent();
        Student mbaStudent = dir2.CreateStudent();

        System.out.println(engStudent.toString());
        System.out.println(mbaStudent.toString());
    }
}
