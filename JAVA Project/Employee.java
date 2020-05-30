public class Employee {
        
    String name;
    int empId;
    double salary;
    
    
    public void setName(String name){       
        this.name = name; 
    }
    
    public void setNid(int nid){
        empId = nid;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public String getName(){
        return name;
    }
    
    public int getNid(){
        return empId;
    }
    
    public double getSalary(){
        return salary;
    }
    
}