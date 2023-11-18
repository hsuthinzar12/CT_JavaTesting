package chapter4_OOPconcept;

public class Lesson1_Variables {
    int num1 = 252;
    static int num2 = 343;
    Boolean tf = true;
    String str1 = "Hello World";
    public static void main(String[] args) {
        int a = 25;
        System.out.println(a);

        Lesson1_Variables obj = new Lesson1_Variables();
        System.out.println(obj.num1);

        System.out.println(num2);
        System.out.println(Lesson1_Variables.num2);
        System.out.println(obj.tf);
        System.out.println(obj.str1);
    }
}
