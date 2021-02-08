package test_scripts.inheritance.thisandsuperkeyword;

public class ClassC extends ClassB{
    String Name ="Anandhan";
    String CompanyName = "Capgemini";

    public ClassC(){

    }

    public void Employee(){
        System.out.println("Name of Employee : "+super.Name);
        System.out.println("Company of Employee : "+CompanyName);
        super.Employee();
    }
}
