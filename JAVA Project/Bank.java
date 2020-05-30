import java.io.*;

public class Bank implements CustomerOperations, EmployeeOperations {

    public Customer customer[] = new Customer[10];
    public Employee employee[] = new Employee[10];
    
    
    FileWriter filewriter = null;

    public void insertCustoer(Customer c) {

        File file = new File("C:\\Users\\Ibrahim\\Desktop\\JAVA Project\\Customer.txt");

        try {
            filewriter = new FileWriter(file, true);

            filewriter.write(c.name + " ");
            filewriter.write(String.valueOf(c.nid));
            filewriter.write("\n");

        } catch (Exception e) {
            System.out.println("Exception caught while writing the file");
        } finally {
            try {
                filewriter.close();
            } catch (Exception e) {
                System.out.println("Exception caught while closing the file ");
            }
        }

    }

    public Customer getCustomer(int nid) {
        return null;

    }

    public void showAllCustomers() {
        
        File file = new File("C:\\Users\\Ibrahim\\Desktop\\JAVA Project\\Customer.txt");

        FileReader fr = null;
        BufferedReader br = null;

        try {

            fr = new FileReader(file);
            br = new BufferedReader(fr);

            String s = "";
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }

        } catch (Exception e) {
            System.out.println("Exception caught");
        } finally {
            try {
                fr.close();
            } catch (Exception e) {
                System.out.println("Exception caught");
            }
        }
        
    }

    //////////////////////////////////////////////////
    public void insertEmployee(Employee e) {

        File file = new File("C:\\Users\\Ibrahim\\Desktop\\JAVA Project\\Employee.txt");

        try {
            filewriter = new FileWriter(file, true);

            filewriter.write(e.name + " ");
            filewriter.write(String.valueOf(e.empId) + " ");
            filewriter.write(String.valueOf(e.salary));
            filewriter.write("\n");

        } catch (Exception ex) {
            System.out.println("Exception caught while writing the file");
        } finally {
            try {
                filewriter.close();
            } catch (Exception ex) {
                System.out.println("Exception caught while closing the file ");
            }
        }

    }

    public Employee getEmployee(int empId) {
        return null;   
    }

    public void showAllEmployee() {

        File file = new File("C:\\Users\\Ibrahim\\Desktop\\JAVA Project\\Employee.txt");

        FileReader fr = null;
        BufferedReader br = null;

        try {

            fr = new FileReader(file);
            br = new BufferedReader(fr);

            String s = "";
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }

        } catch (Exception e) {
            System.out.println("Exception caught");
        } finally {
            try {
                fr.close();
            } catch (Exception e) {
                System.out.println("Exception caught");
            }
        }

    }

}
