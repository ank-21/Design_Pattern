public class SchoolStudents implements Student{
    SchoolLegacyCode schoolLegacyCode;

    public SchoolStudents(SchoolLegacyCode schoolLegacyCode) {
        this.schoolLegacyCode = schoolLegacyCode;
    }

    @Override
    public String getName() {
        return this.schoolLegacyCode.getFirstName() + this.schoolLegacyCode.getSurname();
    }

    @Override
    public String getEmailId() {
        return this.schoolLegacyCode.getEmail();
    }

    @Override
    public String getMobileNo() {
        return this.schoolLegacyCode.getMobileNumber();
    }
}
