package test_scripts.inheritance.thisandsuperkeyword;

public class ClassB {
    String Name ="Subhashree";
    String CompanyName = "KumarStore";

    public ClassB(){
        this.Employee();
    }

    public void Employee(){
        System.out.println("Name of Employee : "+Name);
        System.out.println("Company of Employee : "+CompanyName);
    }
}
