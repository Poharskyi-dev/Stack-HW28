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

    public Optional<String> getNumber(int number) {
        for (int i = 0; i < stackArray.length; i++) {
            if (number == stackArray[i]) {
                return Optional.of(String.valueOf(stackArray[i]));
            }
        }
        return Optional.empty();
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(stackArray, 0, head + 1));
    }

}


