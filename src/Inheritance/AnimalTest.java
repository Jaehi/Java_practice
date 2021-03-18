package Inheritance;

import java.util.ArrayList;

class Animal{
    public void move(){
        System.out.println("동물이 움직인다.");
    }

}

class Human extends Animal{
    @Override
    public void move() {
        System.out.println("사람이 두발로 걷는다");
    }
    public void readBook(){
        System.out.println("사람이 책을 읽는다");
    }
}
class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("고양이가 네발로 뛴다");
    }
    public void hunting(){
        System.out.println("고양이가 사냥을 한다");
    }
}
class Eagle extends Animal{
    @Override
    public void move() {
        System.out.println("독수리가 난다");
    }
    public void flying(){
        System.out.println("하늘을 난다");
    }
}
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.moveAnimal(new Human());
        test.moveAnimal(new Cat());
        test.moveAnimal(new Eagle());

        ArrayList<Animal> animalList = new ArrayList<Animal>();

        Animal[] animals = new Animal[3];

        animalList.add(new Eagle());
        animalList.add(new Cat());
        animalList.add(new Human());

        animals[0] = new Human();
        animals[1] = new Cat();
        animals[2] = new Eagle();

    }

    public void moveAnimal(Animal animal){
        animal.move();

        if (animal instanceof Human){
            Human human = (Human) animal;
            human.readBook();
        }else if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.hunting();
        }else if (animal instanceof Eagle){
            Eagle eagle = (Eagle) animal;
            eagle.flying();
        }

    }
}
