package test_scripts.polymorphism.methodoverload;
//compile time polymorbism
public class Overloading {
    public void Add(int a){
        System.out.println("Result of Method:"+a);
    }
    public void Add(int a, int b){
        System.out.println("Result of Method:"+(a+b));
    }
    public void Add(int a, int b, int c){
        System.out.println("Result of Method:"+(a+b+c));
    }
    public void Add(String Name, int age){
        System.out.println("String and int:"+Name+" "+age);
    }
    public void Add(int age, String Name){
        System.out.println("int and String:"+age+" "+Name);
    }
    public void Add(String age, String Name){
        System.out.println("String and String:"+Name+" "+age);
    }
}
