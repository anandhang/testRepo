package test_scripts.inheritance;

public class Father_Family extends  Grand_Father_Family{
    String fatherName = "Periyathambi";
    String motherName = "Valarmathi";

    public void display_Father(){
        System.out.println("Father Name: "+ fatherName);
        System.out.println("Mother Namee: "+ motherName);
    }
}
