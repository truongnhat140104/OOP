class Animal{
    private String name;
    public Animal(String name){
        this.name=name;
    }
    public String toString(){
        return "Animal[name="+ this.name+"]";
    }
}
class Mammal extends Animal{
    public Mammal (String name){
        super(name);
    }
    @Override
    public String toString() {
        return "Mammal["+super.toString()+ "]";
    }
}
class Cat extends Mammal{
    public Cat(String name){
        super(name);
    }
    public void Greets(){
        System.out.println("Meow");
    }
    public String toString(){
        return "Cat["+super.toString()+"]";
    }
}
class Dog extends Mammal{
    public Dog (String name){
        super(name);
    }
    public void Greets (){
        System.out.println("Woof");
    }
    public void Greets(Dog another){
        System.out.println("Woooof");
    }
}


public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("dog");
        System.out.println(dog.toString());
    }
}