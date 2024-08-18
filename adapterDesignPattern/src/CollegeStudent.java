public class CollegeStudent implements Student{
    private String name;
    private String emailId;
    private String mobileNo;

    public CollegeStudent(String name, String emailId, String mobileNo) {
        this.name = name;
        this.emailId = emailId;
        this.mobileNo = mobileNo;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getEmailId() {
        return this.emailId;
    }

    @Override
    public String getMobileNo() {
        return this.emailId;
    }
}
