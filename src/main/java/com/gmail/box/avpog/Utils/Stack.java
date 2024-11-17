package com.gmail.box.avpog.Utils;

public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int head;

    public Stack (int max) {
        this.maxSize = max;
        this.stackArray = new int[maxSize];
        this.head = -1;
    }

    public void addElementToStack(int element) {
        if (isFull()) {
            System.out.println("Stack is full! Can not add element!");
        } else stackArray[++head] = element;

    }
    public int deleteElementFromStack() {
        return stackArray[head--];
    }

    public Integer readHead() {
        if (isEmpty()) {
            return null;
        }
        return stackArray[head];
    }

    public boolean isEmpty() {
        return (head == -1);
    }

    public boolean isFull() {
        return (head == maxSize - 1);
    }



}
