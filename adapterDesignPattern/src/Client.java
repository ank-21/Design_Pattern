import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Student> allStudents = new ArrayList<>();
        CollegeStudent collegeStudent1 = new CollegeStudent("Minal Srivastava", "minal@gmail.com", "7258825122");
        CollegeStudent collegeStudent2 = new CollegeStudent("Mohit Srivastava", "mohit@gmail.com", "7209811122");

        SchoolLegacyCode schoolStudent = new SchoolLegacyCode("Kavish", "Srivastava","kavish@gmail.com", "9234587876");

        allStudents.add(collegeStudent1);
        allStudents.add(collegeStudent2);
        // Now this will throw an error since it is not adabtable, hence will use adapter design pattern

        // allStudents.add(schoolStudent);

        allStudents.add(new SchoolStudents(schoolStudent));
        printList(allStudents);
    }

    private static void printList(List<Student> allStudents){
        for(Student student : allStudents){
            System.out.println("Name: " + student.getEmailId() + " Email Id: " + student.getEmailId() + " Mobile no. " + student.getMobileNo());
        }
    }
}
