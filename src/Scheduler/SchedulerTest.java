package Scheduler;

import java.io.IOException;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {
        System.out.println("상담원에게 배분할 스케줄링 방법을 선택하세요 R, L, P");
        int ch = System.in.read();
        Scheduler scheduler = null;

        if (ch == 'R' || ch == 'r'){
            scheduler = new RoundRobin();
        }else if(ch == 'L' || ch == 'l'){
            scheduler = new Leastjob();
        }else if (ch == 'P' || ch == 'p'){
            scheduler = new PriorityAllocation();
        }else {
            System.out.println("ERROR");
            return;
        }
        scheduler.getNextCall();
        scheduler.sendCalltoAgent();
    }
}
