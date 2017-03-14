package ext155;

import java.util.*;

public class MinStack {
	LinkedList<Integer> mStack ;
	LinkedList<Integer> minNum;
	static final int MAXINT = 2147483647;


    /** initialize your data structure here. */
    public MinStack() {
    	mStack = new LinkedList<Integer>();
    	minNum = new LinkedList<Integer>();
    	minNum.addFirst(MAXINT);
    }
    
    public void push(int x) {
       mStack.addFirst( x);
       if(x <= minNum.getFirst()) {
    	   minNum.addFirst(x);
       }
    }
    
    public void pop() {
    	int x;
        x = mStack.getFirst();
        if(x == minNum.getFirst()) {
        	minNum.removeFirst();
        }
    	mStack.removeFirst();
        
    }
    
    public int top() {
        int x;
        x = mStack.getFirst();
        return x;
    }
    
    public int getMin() {
    	return minNum.getFirst();
        
    }
    public static void main(String[] args) {
    	MinStack s1 = new MinStack();
		int [] nums = {2, 31, 12, 2, 31};
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		System.out.println(minStack.getMin());
		minStack.pop();
		
		System.out.println(minStack.top());
		  
		System.out.println(minStack.getMin());
		System.out.println();
	}
}