package test_scripts.inheritance;

public class Young_Father_Family extends Grand_Father_Family{
    String YoungFatherName = "Gunasekaran";
    String YoungMotherName = "Pachaiammal";

    public void display_Young_Father(){
        System.out.println("Young Father Name: "+ YoungFatherName);
        System.out.println("Young Mother Name: "+ YoungMotherName);
    }
}
