package com.gmail.box.avpog;

import com.gmail.box.avpog.Utils.Exceptions.IsFullException;
import com.gmail.box.avpog.Utils.Stack;

import java.util.Arrays;

public class App
{
    public static void main( String[] args ) throws IsFullException {

        Stack stack = new Stack(5);

        stack.addElementToStack(1);
        stack.addElementToStack(2);
        stack.addElementToStack(3);
        stack.addElementToStack(4);
        stack.addElementToStack(5);

        System.out.println(stack);

        System.out.println(stack.getNumber(3));

        System.out.println(stack.getNumber(24));

        System.out.println(stack.getNumber(24).isPresent());

    }
}
