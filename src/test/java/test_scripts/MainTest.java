package test_scripts;

import test_scripts.inheritance.Father_Family;
import test_scripts.inheritance.Son_Family;
import test_scripts.inheritance.Young_Father_Family;
import test_scripts.inheritance.thisandsuperkeyword.ClassA;
import test_scripts.inheritance.thisandsuperkeyword.ClassC;
import test_scripts.polymorphism.methodoverload.Overloading;
import test_scripts.polymorphism.methodoverride.Child;
import test_scripts.polymorphism.methodoverride.Parent;

public class MainTest {

    public static void main(String[] arg){
     /*
        inheritanceExamples();
        thisKeywordTest();
        superKeywordTest();
        methodoverloadingtest();

      */
        methodoverridingtest();
    }

    private static void methodoverridingtest(){
        Parent objRef;
        objRef = new Child();
        objRef.display();
        objRef = new Parent();
        objRef.display();
        /*
        Parent obj = new Child();//up casting
        obj.display();
        Parent obj2 = new Parent();
        obj2.display();

         */
    }

    private static void methodoverloadingtest() {
        Overloading obj = new Overloading();
        obj.Add(5);
        obj.Add(4,7);
        obj.Add(6,4,89);
        obj.Add(1,"anandhan");
        obj.Add("Anahd",7);
        obj.Add("sgdfg","sgsdg");
    }

    public static void inheritanceExamples(){
        System.out.println("-------SINGLE INHERITANCE----------");
        Father_Family si = new Father_Family();
        si.display_grandFather();
        si.display_Father();
        System.out.println("--------MULTI INHERITANCE---------");
        Son_Family mi = new Son_Family();
        mi.display_grandFather();
        mi.display_Father();
        mi.display_Son();
        System.out.println("---------HIRARRICAL INHERITANCE--------");
        Young_Father_Family hi1 = new Young_Father_Family();
        hi1.display_grandFather();
        hi1.display_Young_Father();
        Father_Family hi2 = new Father_Family();
        hi2.display_grandFather();
        hi2.display_Father();
    }

    public static void thisKeywordTest(){
        System.out.println("------this keyword use cases----");
        ClassA obj1 = new ClassA();
        obj1.Employee("Subha","KumarMart");
        System.out.println("============================");
        ClassA obj = new ClassA("Anandhan","Capgemini");
        System.out.println("============================");
        obj.Employee("Riyana","Indian Miltory");
    }

    public static void superKeywordTest(){
        ClassC obj = new ClassC();

    }


}
