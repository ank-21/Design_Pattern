import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{

    @Override
    public EngineeringStudentBuilder setSubjects(){

        List<String> subjects = new ArrayList<>();
        subjects.add("DSA");
        subjects.add("BEE");
        subjects.add("Maths");
        subjects.add("CN");

        this.subjects = subjects;
        return this;
    }
}
