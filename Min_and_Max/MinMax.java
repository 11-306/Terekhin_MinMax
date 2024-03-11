package Min_and_Max;

import java.util.Deque;
import java.util.EmptyStackException;
import java.util.LinkedList;

public class MinMax {
    private Deque<Integer> data;
    private Deque<Integer> min;
    private Deque<Integer> max;

    public MinMax(){
        data = new LinkedList<>();
        min = new LinkedList<>();
        max = new LinkedList<>();
    }
    void push(int num){
        data.push(num);
        if(min.isEmpty() || min.peek() >= num){ min.push(num);}
        if(max.isEmpty() || max.peek() <= num){max.push(num);}
    }
    void pop(){
        if(!data.isEmpty()){
            int cur = data.pop();

            if(!max.isEmpty() && max.peek() == cur){
                max.pop();
            }
            if(!min.isEmpty() && min.peek() == cur){
                min.pop();
            }
        }
        else{
            throw new EmptyStackException();
        }
    }

    int getMax(){
        if(max.isEmpty()){
            throw new EmptyStackException();
        }
        return max.peek();
    }

    int getMin(){
        if(min.isEmpty()){
            throw new EmptyStackException();
        }
        return min.peek();
    }
    void print(){
        for(int s: data){
            System.out.print(s + " ");
        }
    }
}
