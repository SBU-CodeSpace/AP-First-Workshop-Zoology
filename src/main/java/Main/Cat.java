package Main;

public class Cat extends Mammal implements Carnivore,Herbivore {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println(this.name + "is walking");
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + "Meow");
    }

    @Override
    public void eatMeat() {
        System.out.println(this.name + "is eating meat");
    }

    @Override
    public void eatPlants(){
        System.out.println(this.name + "is eating plants");
    }
}
