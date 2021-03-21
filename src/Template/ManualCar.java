package Template;

public class ManualCar extends Car{
    @Override
    public void drive() {
        System.out.println("사람이 핸들을 조작한다");
    }

    @Override
    public void stop() {
        System.out.println("사람이 브레이크를 밟는다");
    }

    @Override
    public void wiper() {
        System.out.println("사람이 수동으로 와이퍼를 움직인다");
    }
}
