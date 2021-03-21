package GameLevel;

public class BegginerLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("천천히 달린다");
    }

    @Override
    public void jump() {
        System.out.println("점프할 수 없다");
    }

    @Override
    public void turn() {
        System.out.println("턴할 수 없다");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("뉴비");
    }
}
