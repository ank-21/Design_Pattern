public class EmployeeDaoProxy implements EmployeeDAO{
    EmployeeDaoImpl employeeDao;

    public EmployeeDaoProxy(){
        employeeDao = new EmployeeDaoImpl();
    }
    @Override
    public void create(String empName, int employeeId) throws Exception {
        if("ADMIN".equals(empName)){

            employeeDao.create(empName, employeeId);
            return;
        }
        throw new Exception("Access Denied!");
    }

    @Override
    public void delete(String empName, int employeeId) throws Exception {
        if("ADMIN".equals(empName)){

            employeeDao.delete(empName, employeeId);
            return;
        }
        throw new Exception("Access Denied!");
    }

    @Override
    public Employee get(String empName, int employeeId) throws Exception {
        if("ADMIN".equals(empName) || "USER".equals(empName)){

            Employee employee = employeeDao.get(empName, employeeId);
            return employee;
        }
        throw new Exception("Access Denied!");
    }
}
