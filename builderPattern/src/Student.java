import java.util.List;

public class Student {
    int rollNumber;
    int age;
    String name;
    String batch;
    List<String> subjects;

    public Student(StudentBuilder studentBuilder){
        this.rollNumber = studentBuilder.rollNumber;
        this.age = studentBuilder.age;
        this.name = studentBuilder.name;
        this.batch = studentBuilder.batch;
        this.subjects = studentBuilder.subjects;
    }
    public String toString(){
        return " roll number: " + this.rollNumber +
                " age: " + this.age +
                " name: " + this.name +
                " batch: " + this.batch +
                " subjects: " + subjects.get(0) + "," + subjects.get(1) + "," + subjects.get(2);
    }


}
