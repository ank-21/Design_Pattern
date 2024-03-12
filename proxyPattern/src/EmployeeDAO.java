public interface EmployeeDAO {
    public void create(String empName, int employeeId) throws Exception;
    public void delete(String empName, int employeeId) throws Exception;
    public Employee get(String empName, int employeeId) throws Exception;
}
