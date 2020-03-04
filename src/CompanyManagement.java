import java.util.List;
import java.util.Scanner;

public class CompanyManagement {
    public static void main(String[] args) {
        //create interface instant
        EmployeeDAO dao = EmployeeDAOImpl.getInstance();

        //Get all Employee
        displayAllEmployee (dao);
        addNewEmployee (dao);
    }//main

    private static void addNewEmployee(EmployeeDAO dao) {
        Scanner sc = new Scanner(System.in);
        //input data
        System.out.println("Enter employee id: ");
        int id = Integer.parseInt(sc.nextLine().trim());
        System.out.println("Enter employee name: ");
        String name = sc.nextLine().trim();
        System.out.println("Enter employee position: ");
        String position = sc.nextLine().trim();
        System.out.println("Enter employee salary: ");
        double salary = Double.parseDouble(sc.nextLine().trim());
        //
        Employee newEmp = new Employee(id, name, position, salary);
        dao.addEmp(newEmp);
    }

    private static void displayAllEmployee(EmployeeDAO dao) {
        List<Employee> myEmp = dao.gatAllEmp();
        for (Employee emp:myEmp){
            System.out.println(emp.toString());
        }
    }
}//class