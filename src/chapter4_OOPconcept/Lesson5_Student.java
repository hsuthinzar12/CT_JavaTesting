package chapter4_OOPconcept;

public class Lesson5_Student {
    int id;
    String name;
    int age;
    static String schName = "Code Wall";
    public static void main(String[] args) {
        System.out.println("\"Student Lists\"");
        System.out.println();

        Lesson5_Student stu1 = new Lesson5_Student();
        stu1.id = 1;
        stu1.name="Hsu Hsu";
        stu1.age=22;

        Lesson5_Student stu2 = new Lesson5_Student();
        stu2.id = 2;
        stu2.name = "Nine Nine";
        stu2.age = 20;

        Lesson5_Student stu3 = new Lesson5_Student();
        stu3.id = 3;
        stu3.name = "Hmue";
        stu3.age = 20;

        System.out.println("Student Id: " +stu1.id);
        System.out.println("Student Name: " +stu1.name);
        System.out.println("Student Age: " +stu1.age);

        System.out.println();

        System.out.println("Student Id: " +stu2.id);
        System.out.println("Student Name: " +stu2.name);
        System.out.println("Student Age: " +stu2.age);

        System.out.println();


        System.out.println("Student Id: " +stu3.id);
        System.out.println("Student Name: " +stu3.name);
        System.out.println("Student Age: " +stu3.age);

        System.out.println();

        System.out.println(Lesson5_Student.schName + " Technologies");
/*        Lesson5_Student.schName = "Technologies";
        System.out.println(Lesson5_Student.schName);*/


    }
}
