class Animal
{
    void sound()
    {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal
{
    void sound()
    {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal
{
    void sound()
    {
        System.out.println("Cat meows");
    }
}

class Main
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        Cat c = new Cat();

        d.sound();
        c.sound();
    }
}
