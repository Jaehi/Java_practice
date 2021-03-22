package Object;

class Point{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "x = " + x + " y = " + y;
    }
}
class Circle implements Cloneable{
    Point point;
    private int radious;

    public Circle(int x, int y, int radious){
        point = new Point(x,y);
        this.radious = radious;
    }

    @Override
    public String
    toString() {
        return "원점 : "+this.point+" 반지름 : " + radious;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle = new Circle(10,20,5);
        Circle clone_cirle = (Circle) circle.clone();
        System.out.println(System.identityHashCode(circle));
        System.out.println(System.identityHashCode(clone_cirle));
        System.out.println(circle);
        System.out.println(clone_cirle);
    }
}
