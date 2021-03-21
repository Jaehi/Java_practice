package GameLevel;

public class SuperLevel extends PlayerLevel{

    @Override
    public void run() {
        System.out.println("엄청 빨리 뛴다");
    }

    @Override
    public void jump() {
        System.out.println("높이 높이 뛴다");
    }

    @Override
    public void turn() {
        System.out.println("한 바퀴 돈다");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("고인물");
    }
}
