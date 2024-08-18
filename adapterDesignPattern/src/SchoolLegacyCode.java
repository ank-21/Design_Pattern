public class SchoolLegacyCode {
    private String firstName;
    private String surname;
    private String email;
    private String mobileNumber;

    public SchoolLegacyCode(String firstName, String surname, String email, String mobileNumber) {
        this.firstName = firstName;
        this.surname = surname;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
}
