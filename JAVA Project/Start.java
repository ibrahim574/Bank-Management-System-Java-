import java.io.*;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) {

        Bank bank = new Bank();

        Account accounts[] = new Account[10];
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Customer();
        }

        Employee employee[] = new Employee[10];
        for (int i = 0; i < 10; i++) {
            employee[i] = new Employee();
        }

        Customer customer[] = new Customer[10];
        for (int i = 0; i < 10; i++) {
            customer[i] = new Customer();
        }

        Scanner s = new Scanner(System.in);

        int n, a, b, c, d;

        do {
            System.out.println();
            System.out.println("*****MAIN MENUE*****");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Customer Account Management");
            System.out.println("4. Account Transation");
            System.out.println("5. Exit");
            System.out.println("---------------------------");

            System.out.print("Enter your choice : ");

            n = s.nextInt();

            System.out.println("---------------------------");
            System.out.println();
            int i = -1;
            int j = -1;
            int ec = -1;
            int cc = -1;
            //int m=0;
            switch (n) {
                //// employee management ->
                case 1:

                    do {
                        System.out.println("**Inside Employee Management**");
                        System.out.println("1. Insert New Employee");
                        System.out.println("2. Get Existing Employee by Id");
                        System.out.println("3. Show All Employees");
                        System.out.println("4. Exit");
                        System.out.print("Enter your choice : ");
                        a = s.nextInt();
                        System.out.println();

                        switch (a) {
                            case 1:
                                ec++;
                                System.out.print("Enter the Employee name : ");
                                String empName = s.next();
                                employee[ec].setName(empName);
                                System.out.print("Enter the Employee Id : ");
                                int id = s.nextInt();
                                employee[ec].setNid(id);
                                System.out.print("Enter Employee salary : ");
                                double sal = s.nextDouble();
                                employee[ec].setSalary(sal);
                                bank.insertEmployee(employee[ec]);
                                System.out.println();
                                //System.out.println("ec : " + ec);

                                break;

                            case 2:

                                System.out.print("Enter Employee ID : ");
                                int e = s.nextInt();

                                FileReader fr = null;
                                BufferedReader br = null;
                                File file = new File("C:\\Users\\Ibrahim\\Desktop\\JAVA Project\\Employee.txt");
                                int f2 = 0;
                                String line = "";
                                String line2 = "";
                                try {
                                    fr = new FileReader(file);
                                    br = new BufferedReader(fr);

                                    while ((line = br.readLine()) != null) {
                                        if (line.contains(String.valueOf(e))) {
                                            line2 = line;
                                            f2 = 1;
                                        }
                                    }

                                } catch (Exception ex) {
                                    System.out.println("Exception caught");
                                } finally {
                                    try {
                                        fr.close();
                                    } catch (Exception ex) {
                                        System.out.println("Exception caught");
                                    }
                                }

                                if (f2 == 1) {
                                    String s1[] = line2.split(" ");
                                    System.out.println();
                                    System.out.println("Employee found ");
                                    System.out.println("Employee information -> ");
                                    System.out.println("Employee Name : " + s1[0]);
                                    System.out.println("Employee Id : " + s1[1]);
                                    System.out.println("Employee Salary : " + s1[2]);
                                } else {
                                    System.out.println("Employee not found");
                                }

                                System.out.println();

                                break;

                            case 3:
                                System.out.println("All Employes ->");
                                System.out.println("Name    Id   Salary");
                                System.out.println("----    ---  ------ ");
                                bank.showAllEmployee();
                                System.out.println();
                                break;

                        }

                    } while (a != 4);
                    break;

                case 2:
                    do {
                        System.out.println("**Inside Customer Management**");
                        System.out.println("1. Insert New Customer");
                        System.out.println("2. Get Existing Customer by Id");
                        System.out.println("3. Show All Customer");
                        System.out.println("4. Exit");
                        System.out.print("Enter your choice : ");
                        b = s.nextInt();
                        System.out.println();

                        switch (b) {
                            case 1:
                                cc++;
                                System.out.print("Enter the Customer name : ");
                                String custName = s.next();
                                customer[cc].setName(custName);
                                System.out.print("Enter Customer Id : ");
                                int id = s.nextInt();
                                customer[cc].setNid(id);
                                bank.insertCustoer(customer[cc]);
                                System.out.println();

                                break;

                            case 2:

                                System.out.print("Enter Customer ID : ");
                                int e = s.nextInt();

                                FileReader fr = null;
                                BufferedReader br = null;
                                File file = new File("C:\\Users\\Ibrahim\\Desktop\\JAVA Project\\Customer.txt");
                                int f2 = 0;
                                String line = "";
                                String line2 = "";

                                try {
                                    fr = new FileReader(file);
                                    br = new BufferedReader(fr);

                                    while ((line = br.readLine()) != null) {
                                        if (line.contains(String.valueOf(e))) {
                                            line2 = line;
                                            f2 = 1;
                                        }
                                    }

                                } catch (Exception ex) {
                                    System.out.println("Exception caught");
                                } finally {
                                    try {
                                        fr.close();
                                    } catch (Exception ex) {
                                        System.out.println("Exception caught");
                                    }
                                }

                                if (f2 == 1) {
                                    String s1[] = line2.split(" ");
                                    System.out.println();
                                    System.out.println("Customer found ");
                                    System.out.println("Customer information -> ");
                                    System.out.println("Customer Name : " + s1[0]);
                                    System.out.println("Customer Id : " + s1[1]);
                                } else {
                                    System.out.println("Customer not found");
                                }

                                System.out.println();

                                break;

                            case 3:
                                System.out.println();
                                System.out.println("All Customer ->");
                                System.out.println("Name  Id ");
                                System.out.println("----  ---");
                                bank.showAllCustomers();
                                System.out.println();
                                break;
                        }

                    } while (b != 4);

                    break;

                case 3:

                    do {
                        System.out.println("**Inside Customer Account Management**");
                        System.out.println("1. Insert New Account");
                        System.out.println("2. Get Existing Account by Id");
                        System.out.println("3. 3. Show All Accounts");
                        System.out.println("4. Exit");
                        System.out.print("Enter your choice : ");
                        c = s.nextInt();
                        System.out.println();

                        switch (c) {

                            case 1:

                                System.out.println("Enter Account Option : ");
                                System.out.println("1. Fixed Account ");
                                System.out.println("2. Saving Account ");
                                System.out.print("Choose your option : ");
                                int z = s.nextInt();

                                FileWriter filewriter = null;
                                File file = new File("C:\\Users\\Ibrahim\\Desktop\\JAVA Project\\Account.txt");

                                switch (z) {
                                    case 1:
                                        FixedAccount fa = new FixedAccount();
                                        int f = 0;
                                        int cid = 0;
                                        System.out.println();
                                        System.out.print("Enter Customer id : ");
                                        int custid = s.nextInt();
                                        for (int k = 0; k < 10; k++) {
                                            if (custid == customer[k].getNid()) {
                                                f = 1;
                                                cid = k;
                                                break;
                                            }
                                        }

                                        if (f == 1) {
                                            System.out.println("Customer id found ");
                                        } else {
                                            System.out.println("Customer id not found ");
                                            break;
                                        }

                                        i++;
                                        j++;

                                        try {
                                            filewriter = new FileWriter(file, true);
                                            filewriter.write(String.valueOf(customer[cid].nid));
                                            filewriter.write(" fixed ");

                                        } catch (Exception e) {
                                            System.out.println("Exception caught while writing the file");
                                        } finally {
                                            try {

                                                filewriter.close();

                                            } catch (Exception e) {
                                                System.out.println("Exception caught while closing the file ");
                                            }

                                        }

                                        System.out.print("Insert 4 digit Account Number : ");
                                        int x = s.nextInt();
                                        accounts[i].setAccountNumber(x);
                                        System.out.print("Enter Balane : ");
                                        double y = s.nextDouble();
                                        accounts[i].setBalance(y);
                                        System.out.print("Enter tenure Year : ");
                                        int ty = s.nextInt();
                                        fa.setTenureYear(ty);
                                        //System.out.println("start i = "+i+" "+ accounts[i].accountNumber + " " + accounts[i].balance);
                                        customer[i].insertAccount(accounts[i]);
                                        System.out.println();
                                        //System.out.println(i+" "+j);

                                        break;

                                    case 2:
                                        SavingAccount sa = new SavingAccount();

                                        int f1 = 0;
                                        int cid1 = 0;
                                        System.out.println();
                                        System.out.print("Enter Customer id : ");
                                        int custid1 = s.nextInt();
                                        for (int k = 0; k < 10; k++) {
                                            if (custid1 == customer[k].getNid()) {
                                                f1 = 1;
                                                cid1 = k;
                                                break;
                                            }
                                        }

                                        if (f1 == 1) {
                                            System.out.println("Customer id found ");
                                        } else {
                                            System.out.println("Customer id not found ");
                                            break;
                                        }

                                        i++;
                                        j++;

                                        try {
                                            filewriter = new FileWriter(file, true);
                                            filewriter.write(String.valueOf(customer[cid1].getNid()));
                                            filewriter.write(" saving ");

                                        } catch (Exception e) {
                                            System.out.println("Exception caught while writing the file");
                                        } finally {
                                            try {

                                                filewriter.close();

                                            } catch (Exception e) {
                                                System.out.println("Exception caught while closing the file ");
                                            }

                                        }

                                        System.out.print("Insert 4 digit Account Number : ");
                                        int k = s.nextInt();
                                        accounts[i].setAccountNumber(k);
                                        System.out.print("Enter Balane : ");
                                        double l = s.nextDouble();
                                        accounts[i].setBalance(l);
                                        System.out.print("Enter interest rate : ");
                                        int ir = s.nextInt();
                                        //System.out.println("start i = "+i+" "+ accounts[i].accountNumber + " " + accounts[i].balance);
                                        customer[i].insertAccount(accounts[i]);
                                        System.out.println();
                                        //System.out.println(i+" "+j);

                                        break;
                                }

                                break;

                            case 2:

                                System.out.print("Enter Account ID : ");
                                int e = s.nextInt();

                                FileReader fr = null;
                                BufferedReader br = null;
                                File file2 = new File("C:\\Users\\Ibrahim\\Desktop\\JAVA Project\\Account.txt");
                                int f2 = 0;
                                String line = "";
                                String line2 = "";

                                try {
                                    fr = new FileReader(file2);
                                    br = new BufferedReader(fr);

                                    while ((line = br.readLine()) != null) {
                                        if (line.contains(String.valueOf(e))) {
                                            line2 = line;
                                            f2 = 1;
                                        }
                                    }

                                } catch (Exception ex) {
                                    System.out.println("Exception caught");
                                } finally {
                                    try {
                                        fr.close();
                                    } catch (Exception ex) {
                                        System.out.println("Exception caught");
                                    }
                                }

                                if (f2 == 1) {
                                    String s1[] = line2.split(" ");
                                    System.out.println();
                                    System.out.println("Account found ");
                                    System.out.println("Account information -> ");
                                    System.out.println("Customer id : " + s1[0]);
                                    System.out.println("Account Type : " + s1[1]);
                                    System.out.println("Account Number : " + s1[2]);
                                    System.out.println("Balance  : " + s1[3]);
                                } else {
                                    System.out.println("Account not found");
                                }

                                System.out.println();

                                break;

                            case 3:

                                System.out.println();
                                System.out.println("All Account ->");
                                System.out.println("Customer id   Account type    Account number  Balance ");
                                System.out.println("------------ --------------  ---------------- --------");
                                customer[0].showAllAccount();
                                System.out.println();

                                break;
                        }

                    } while (c != 4);

                    break;

                case 4:

                    do {
                        System.out.println("**Inside Account Transactions**");
                        System.out.println("1. Deposit Money");
                        System.out.println("2. Withdraw Money");
                        System.out.println("3. Transfer Money");
                        System.out.println("4. Exit");
                        System.out.print("Enter your choice : ");
                        d = s.nextInt();
                        System.out.println();

                        switch (d) {
                            case 1:
                                int m1 = 0;

                                System.out.print("Enter the 4 digit account number : ");
                                int az = s.nextInt();
                                int fl = 0;
                                for (int ii = 0; ii < 10; ii++) {
                                    if (az == accounts[ii].getAccountNumber()) {
                                        m1 = ii;
                                        fl = 1;
                                        System.out.println("Account number found");
                                        break;
                                    }
                                }

                                if (fl == 0) {
                                    System.out.println("Account not found ");
                                    break;
                                }

                                System.out.print("Enter the amount to deposite : ");
                                double w = s.nextDouble();

                                accounts[m1].deposit(w);
                                //System.out.println("Balance is : "+accounts[m].balance);
                                System.out.println("Customer id : " + customer[m1].getNid());
                                System.out.println("new Balance : " + accounts[m1].getBalance());

                                File file = new File("C:\\Users\\Ibrahim\\Desktop\\JAVA Project\\ITransactions.txt");
                                FileWriter filewriter = null;
                                
                                try {
                                    filewriter = new FileWriter(file, true);

                                    filewriter.write(accounts[m1].accountNumber+ " ");
                                    filewriter.write("Deposit ");
                                    filewriter.write(String.valueOf(w));
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

                                System.out.println();
                                break;

                            case 2:
                                int m2 = 0;
                                int fl2 = 0;
                                System.out.print("Enter account id : ");
                                int v = s.nextInt();

                                for (int ii = 0; ii < 10; ii++) {
                                    if (v == accounts[ii].getAccountNumber()) {
                                        m2 = ii;
                                        fl2 = 1;
                                        System.out.println("Account number found");
                                        break;
                                    }
                                }

                                if (fl2 == 0) {
                                    System.out.println("Account not found ");
                                    break;
                                }

                                System.out.print("Enter the amount to withdraw : ");
                                double u = s.nextDouble();

                                accounts[m2].withdraw(u);
                                System.out.println("Customer id : " + customer[m2].getNid());
                                System.out.println("new Balance : " + accounts[m2].getBalance());
                                
                                
                                File file2 = new File("C:\\Users\\Ibrahim\\Desktop\\JAVA Project\\ITransactions.txt");
                                FileWriter filewriter1 = null;
                                
                                try {
                                    filewriter1 = new FileWriter(file2, true);

                                    filewriter1.write(accounts[m2].accountNumber+ " ");
                                    filewriter1.write("Withdraw ");
                                    filewriter1.write(String.valueOf(u));
                                    filewriter1.write("\n");

                                } catch (Exception e) {
                                    System.out.println("Exception caught while writing the file");
                                } finally {
                                    try {
                                        filewriter1.close();
                                    } catch (Exception e) {
                                        System.out.println("Exception caught while closing the file ");
                                    }
                                }
                                
                                
                                System.out.println();
                                break;

                            case 3:

                                System.out.print("Enter your account number : ");

                                int m3 = 0;
                                int fl3 = 0;
                                int v1 = s.nextInt();

                                for (int ii = 0; ii < 10; ii++) {
                                    if (v1 == accounts[ii].getAccountNumber()) {
                                        m3 = ii;
                                        fl3 = 1;
                                        System.out.println("Account number found");
                                        break;
                                    }
                                }

                                if (fl3 == 0) {
                                    System.out.println("Account not found ");
                                    break;
                                }

                                System.out.print("Enter the receiver's Account number : ");

                                int m4 = 0;
                                int fl4 = 0;
                                int v2 = s.nextInt();

                                for (int ii = 0; ii < 10; ii++) {
                                    if (v2 == accounts[ii].getAccountNumber()) {
                                        m4 = ii;
                                        fl4 = 1;
                                        System.out.println("Account number found");
                                        break;
                                    }
                                }

                                if (fl4 == 0) {
                                    System.out.println("Account not found ");
                                    break;
                                }

                                System.out.print("Enter the amount to transfer : ");
                                double amou = s.nextDouble();

                                accounts[m3].withdraw(amou);
                                accounts[m4].transfer(accounts[m4], amou);
                                System.out.println("New balance of your account is : " + accounts[m3].getBalance());
                                System.out.println("New balance of receiver account is : " + accounts[m4].getBalance());
                                
                                
                                
                                File file3 = new File("C:\\Users\\Ibrahim\\Desktop\\JAVA Project\\ITransactions.txt");
                                FileWriter filewriter2 = null;
                                
                                try {
                                    filewriter2 = new FileWriter(file3, true);

                                    filewriter2.write(accounts[m4].accountNumber+ " ");
                                    filewriter2.write("Transfer ");
                                    filewriter2.write(String.valueOf(amou));
                                    filewriter2.write("\n");

                                } catch (Exception e) {
                                    System.out.println("Exception caught while writing the file");
                                } finally {
                                    try {
                                        filewriter2.close();
                                    } catch (Exception e) {
                                        System.out.println("Exception caught while closing the file ");
                                    }
                                }
                                
                                
                                
                                System.out.println();

                                break;
                        }

                    } while (d != 4);

                    break;
            }

        } while (n != 5);

    }

}
