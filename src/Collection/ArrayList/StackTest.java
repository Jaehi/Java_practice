package Collection.ArrayList;

import java.util.ArrayList;

class MyStack{
    private ArrayList<String> arrayListStack = new ArrayList<String >();

    public void push(String data){
        arrayListStack.add(data);
    }

    public String pop(){
        int len = arrayListStack.size();
        if (len == 0){
            System.out.println("Stack is NULL");
            return null;
        }
        return arrayListStack.remove(len -1);
    }

    public String peek(){
        int len = arrayListStack.size();
        if (len == 0){
            System.out.println("Stack is NULL");
            return null;
        }
        return arrayListStack.get(len -1);
    }
}

public class StackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        myStack.push("A");
        myStack.push("B");
        myStack.push("C");

        System.out.println(myStack.peek());

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());


    }
}
