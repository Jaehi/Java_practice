package Scheduler;

public class PriorityAllocation implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("고객의 등급이 가장 높은 고의 전화를 먼저 가져옵니다");
    }

    @Override
    public void sendCalltoAgent() {
        System.out.println("업무 스킬이 가장 높은 상담원의 대기열에 우선 배분 합니다");
    }
}
