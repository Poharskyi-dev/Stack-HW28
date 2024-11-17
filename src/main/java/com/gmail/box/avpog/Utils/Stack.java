package com.gmail.box.avpog.Utils;

import com.gmail.box.avpog.Utils.Exceptions.IsEmptyException;
import com.gmail.box.avpog.Utils.Exceptions.IsFullException;

public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int head;

    public Stack(int max) {
        this.maxSize = max;
        this.stackArray = new int[maxSize];
        this.head = -1;
    }

    public void addElementToStack(int element) throws IsFullException {
        if (isFull()) {
            throw new IsFullException("Stack is full!");
        } else stackArray[++head] = element;

    }

    public int deleteElementFromStack() {
        return stackArray[head--];
    }

    // чи це ок? наскiльки я зрозумiв, тест цього throw зробити майже неможливо
    public Integer readHead() throws IsEmptyException {
        try {
            if (isEmpty()) {
                throw new IsEmptyException("Stack is empty!");
            }
            return stackArray[head];
        } catch (IsEmptyException e) {
            return null;
        }
    }

    public boolean isEmpty() {
        return (head == -1);
    }

    public boolean isFull() {
        return (head == maxSize - 1);
    }


}
