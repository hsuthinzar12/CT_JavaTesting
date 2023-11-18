package chapter4_OOPconcept;

public class Lesson3_ObjectInitialization {
    int num1;
    String str;

    public static void main(String[] args) {
        int num2 = 21;
        num2 = 22;
        System.out.println(num2);

        //create obj
        // object => instance => reference

        Lesson3_ObjectInitialization obj = new Lesson3_ObjectInitialization();
        obj.num1 = 15;
        obj.str = "Hello World";

        System.out.println(obj.num1);
        System.out.println(obj.str);

        Lesson3_ObjectInitialization obj1 = new Lesson3_ObjectInitialization();
        obj1.num1 = 20;
        obj1.str = "Code Wall";

        System.out.println(obj1.num1);
        System.out.println(obj1.str);

        Lesson3_ObjectInitialization.Alien alien1 = obj.new Alien();
        alien1.id = 1;
        alien1.name = "Woof";

        // Printing Alien data
        System.out.println(alien1.id + ": " + alien1.name);

    }

    class Alien{
        int id;
        String name;

    }


}
