public class Director {
    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student CreateStudent(){
        if(this.studentBuilder instanceof EngineeringStudentBuilder){
            return studentBuilder.setName("Ankit").setAge(26).setRollNumber(1).setBatch("2021").setSubjects().build();
        }else if(this.studentBuilder instanceof MBAStudentBuilder){
            return studentBuilder.setName("Aayusha").setAge(25).setRollNumber(2).setSubjects().build();
        }
        return null;
    }
}
