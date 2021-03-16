package Inheritance;

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
}
class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("고양이가 네발로 뛴다");
    }
}
class Eagle extends Animal{
    @Override
    public void move() {
        System.out.println("독수리가 난다");
    }
}
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.moveAnimal(new Human());
        test.moveAnimal(new Cat());
        test.moveAnimal(new Eagle());

    }

    public void moveAnimal(Animal animal){
        animal.move();
    }
}
