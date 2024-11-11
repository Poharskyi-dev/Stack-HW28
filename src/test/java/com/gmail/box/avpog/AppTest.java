package com.gmail.box.avpog;

import com.gmail.box.avpog.Utils.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


;


public class AppTest {

    @Test
    void testStackFullnes() {
        //given
        Stack stack = new Stack(5);
        stack.addElementToStack(10);
        stack.addElementToStack(20);
        stack.addElementToStack(30);
        stack.addElementToStack(40);
        stack.addElementToStack(50);
        stack.addElementToStack(60);
        //when
        int expectedHEad = stack.readHead();
        //then
        Assertions.assertEquals(50, expectedHEad);

    }

    @Test
    void testStackEmptiness() {
        //given
        Stack stack = new Stack(999);
        //when
        boolean isEmpty = stack.isEmpty();
        //then
        Assertions.assertEquals(true, isEmpty);
        //

    }

    // Як вiдтестувати output String з методу який повинен видавати int?
    @Test
    void testStackMessage() {
        Stack stack = new Stack(999);
        stack.readHead();
    }
}
