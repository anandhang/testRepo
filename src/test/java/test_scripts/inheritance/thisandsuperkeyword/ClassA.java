package test_scripts.inheritance.thisandsuperkeyword;

public class ClassA {
    String Name;
    String CompanyName;

    public ClassA(){
        System.out.println("This construtor");
    }

    public ClassA(String Name, String CompanyName){
        this();
        this.Name = Name;
        this.CompanyName = CompanyName;
        this.display();
    }

    public void Employee(String Name, String CompanyName){
        this.Name = Name;
        this.CompanyName = CompanyName;
        this.display();
    }

    public void display(){
        System.out.println("Name of Employee : "+Name);
        System.out.println("Company of Employee : "+CompanyName);
    }
}
