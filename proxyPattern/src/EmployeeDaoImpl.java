public class EmployeeDaoImpl implements EmployeeDAO{
    @Override
    public void create(String empName, int employeeId) throws Exception {
        Employee emp = new Employee(empName, employeeId);
        System.out.println("Created an employee with name " + empName + " and employee Id " + employeeId);
    }

    @Override
    public void delete(String empName, int employeeId) throws Exception {
        System.out.println("Deleted an employee with name " + empName + " and employee Id " + employeeId);
    }

    @Override
    public Employee get(String empName, int employeeId) throws Exception {
        System.out.println("Fetching an employee with name " + empName + " and employee Id " + employeeId);
        return new Employee(empName, employeeId);
    }
}
