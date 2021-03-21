package GameLevel;

public class AdvencedLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("빨리 달린다");
    }

    @Override
    public void jump() {
        System.out.println("점프 한다");
    }

    @Override
    public void turn() {
        System.out.println("턴을 할 수 없다");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("그냥그런애");
    }
}
