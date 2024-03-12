public class Client {
    public static void main(String[] args){

        try {
            EmployeeDaoProxy employeeDaoProxy = new EmployeeDaoProxy();
            employeeDaoProxy.create("ADMIN", 21);
            employeeDaoProxy.delete("USER", 2);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
