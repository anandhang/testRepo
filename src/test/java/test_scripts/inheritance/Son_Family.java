package test_scripts.inheritance;

public class Son_Family extends Father_Family{
    String myName = "Anandhan";
    String wifeName = "SubhaShree";

    public void display_Son(){
        System.out.println("My Name: "+myName);
        System.out.println("My Wife Name: "+wifeName);
    }
}
