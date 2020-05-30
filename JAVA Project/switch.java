do {
            System.out.println();
            System.out.println("/////////////Bank Management System//////////");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Customer Account Management");
            System.out.println("4. Account Transation");
            System.out.println("5. Exit");
            System.out.println("---------------------------");

            System.out.print("Enter your choice : ");

            n = s.nextInt();

            
            switch (n) {
                
                case 1:

                    do {
                        System.out.println("/////Employee Management//////");
                        System.out.println("1. Insert New Employee");
                        System.out.println("2. Get Existing Employee by Id");
                        System.out.println("3. Show All Employees");
                        System.out.println("4. Back");
                        System.out.print("Enter your choice : ");
                        a = s.nextInt();
                        System.out.println();

                        switch (a) {
                            case 1:
                                

                                break;

                            case 2:

                              

                                break;

                            case 3:
                                
                                break;

                        }

                    } while (a != 4);
                    break;

                case 2:
                    do {
                        System.out.println("Customer Management");
                        System.out.println("1. Insert New Customer");
                        System.out.println("2. Get Existing Customer by Id");
                        System.out.println("3. Show All Customer");
                        System.out.println("4. Back");
                        System.out.print("Enter your choice : ");
                        b = s.nextInt();
                        System.out.println();

                        switch (b) {
                            case 1:
                               

                                break;

                            case 2:

                                break;

                            case 3:
                                
                                break;
                        }

                    } while (b != 4);

                    break;

                case 3:

                    do {
                        System.out.println("/////Customer Account Management/////");
                        System.out.println("1. Insert New Account");
                        System.out.println("2. Get Existing Account by Id");
                        System.out.println("3. 3. Show All Accounts");
                        System.out.println("4. Back");
                        System.out.print("Enter your choice : ");
                        c = s.nextInt();
                        System.out.println();

                        switch (c) {

                            case 1:

                                System.out.println("Enter Account Type : ");
                                System.out.println("1. Fixed Account ");
                                System.out.println("2. Saving Account ");
                                System.out.print("Choose your option : ");
                                int z = s.nextInt();


                                switch (z) {
                                    case 1:

                                        break;

                                    case 2:
                                        
                                        break;
										
                                        }                                     

                                    break;
                                }

                                break;

                            case 2:

                                

                                break;

                            case 3:


                                break;
                        }

                    } while (c != 4);

                    break;

                case 4:

                    do {
                        System.out.println("////Account Transactions///");
                        System.out.println("1. Deposit Money");
                        System.out.println("2. Withdraw Money");
                        System.out.println("3. Transfer Money");
                        System.out.println("4. Back");
                        System.out.print("Enter your choice : ");
                        d = s.nextInt();
                        System.out.println();

                        switch (d) {
                            case 1:
                                
                                break;

                            case 2:
                               
                              
                                break;

                            case 3:                                

                                break;
                        }

                    } while (d != 4);

                    break;
            }

        } while (n != 5);