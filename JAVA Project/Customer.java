import java.io.*;

public class Customer extends Account implements AccountOperations {
    
    FileWriter filewriter = null;
    
    String name;
    int nid;
    public Account accounts[] = new Account[10];
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setNid(int id){
        nid = id;    
    }
    
    public String getName(){
        return name;
    }
    
    public int getNid(){
        return nid;
    }
    
    /////////////////////////////////////
    
    
    public void insertAccount(Account a){
        
        
        File file = new File("C:\\Users\\Ibrahim\\Desktop\\JAVA Project\\Account.txt");
        
        try{
            filewriter = new FileWriter(file,true);
            
            filewriter.write(a.accountNumber+" ");
            filewriter.write(String.valueOf(a.balance));     
            filewriter.write("\n");
            System.out.println("Account number : "+a.accountNumber+" balance : "+a.balance);
            
        }catch(Exception e){
            System.out.println("Exception caught while writing the file");
        }
        finally{
            try{
                filewriter.close();
            }catch(Exception e){
                System.out.println("Exception caught while closing the file ");
            }
        }
        
    }
    public Account getAccount(int accountNumber){
        return null;
    }
    public void showAllAccount(){
        
        File file = new File("C:\\Users\\Ibrahim\\Desktop\\JAVA Project\\Account.txt");

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
    
    ///////////////////////////////////
    
     public void showInfo(){
         
     }
    
    
}
