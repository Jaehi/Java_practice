package Template;

public class AICar extends Car{
    @Override
    public void drive() {
        System.out.println("자율 주행 한다");
        System.out.println("스스로 방향을 전환한다");
    }

    @Override
    public void stop() {
        System.out.println("스스로 멈춘다");
    }

    @Override
    public void wiper() {
        System.out.println("눈과 비의 양에 따라 스스로 와이퍼를 작동 시킨다");
    }

    @Override
    public void washCar() {
        System.out.println("스스로 세차를 한다");
    }
}
