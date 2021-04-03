package Collection.ArrayList;

import java.util.ArrayList;

class MyQueue{
    private ArrayList<String> arrayListQueue = new ArrayList<String>();

    public void enQueue(String data){
        arrayListQueue.add(data);
    }
    public String deQueue(){
        int len = arrayListQueue.size();
        if (len == 0){
            System.out.println("Queue is NULL");
            return null;
        }
        return arrayListQueue.remove(0);
    }
}

public class QueueTest {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        myQueue.enQueue("A");
        myQueue.enQueue("B");
        myQueue.enQueue("C");

        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());

    }
}
