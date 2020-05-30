
public abstract class Account implements ITransactions{
    int accountNumber;
    double balance;
    
    void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    
    void setBalance(double balance){
        this.balance = balance;
    }
    
    int getAccountNumber(){
        return accountNumber;
    }
    
    double getBalance(){
        return balance;
    }
    
    public abstract void showInfo();
    
    /////////////////////////
    
    
    public void deposit(double amount){
        this.balance = this.balance+amount;
    }
    public void withdraw(double amount){
        this.balance = this.balance-amount;
    }
    public void transfer(Account a, double amount){
        a.balance = a.balance+amount;
    }    
}
