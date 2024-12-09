package com.gmail.box.avpog.Utils;

import com.gmail.box.avpog.Utils.Exceptions.IsEmptyException;
import com.gmail.box.avpog.Utils.Exceptions.IsFullException;

import java.util.Arrays;
import java.util.Optional;

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

    public Integer readHead() throws IsEmptyException {
        if (isEmpty()) {
            throw new IsEmptyException("Stack is empty!");
        } else return stackArray[head];
    }


    public boolean isEmpty() {
        return (head == -1);
    }

    public boolean isFull() {
        return (head == maxSize - 1);
    }

    public Optional<Integer> getNumber(int number) {
        for (int i = 0; i < stackArray.length; i++) {
            if (number == stackArray[i]) {
                return Optional.of(stackArray[i]);
            }
        }
        return Optional.empty();
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(stackArray, 0, head + 1));
    }

}


