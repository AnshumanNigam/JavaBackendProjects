package JAVA2;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public String getname()
    {
        return name;
    }
    public int age()
    {
        return age;
    }
    public static void main(String args[])
    {
        Person alice=new Person("Alice",25);
        Person bob=new Person("Bob",30);
        System.out.println("Person 1:");
        System.out.println("Name: "+alice.getname());
        System.out.println("Age: "+alice.age()+"\n");
        System.out.println("Person 2:");
        System.out.println("Name: "+bob.getname());
        System.out.println("Age: "+bob.age());
    }
}
