package com.gmail.box.avpog;

import com.gmail.box.avpog.Utils.Exceptions.IsEmptyException;
import com.gmail.box.avpog.Utils.Exceptions.IsFullException;
import com.gmail.box.avpog.Utils.Stack;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


;import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AppTest {

    @Test
    void testStackFullnes() throws IsFullException, IsEmptyException {
        //given
        Stack stack = new Stack(5);
        stack.addElementToStack(10);
        stack.addElementToStack(20);
        stack.addElementToStack(30);
        stack.addElementToStack(40);
        stack.addElementToStack(50);
        stack.addElementToStack(60);
        //when
        int expectedHead = stack.readHead();
        //then
        Assertions.assertEquals(50, expectedHead);

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

    @Test
    void testStackMessage() throws IsEmptyException {
        // given
        Stack stack = new Stack(999);
        // when
        Integer whenRead = stack.readHead();
        // then
        Assertions.assertEquals(null, whenRead);
    }

    @Test
    void isEmptyExceptionWork() throws IsEmptyException {
        // given
        Stack stack = new Stack(999);
        // when
        // then
        Assertions.assertThrows(IsEmptyException.class, () -> {
            stack.readHead();
        });
    }

    @Test
    void isFullExceptionWork() throws IsFullException {
        // given
        Stack stack = new Stack(3);
        // when
        stack.addElementToStack(10);
        stack.addElementToStack(20);
        stack.addElementToStack(30);
        // then
        Assertions.assertThrows(IsFullException.class, () -> {
            stack.addElementToStack(5);
        });
    }

    @Test
    void isOptionalEmpty() throws IsFullException {
        // given
        Stack stack = new Stack(3);
        // when
        stack.addElementToStack(10);
        stack.addElementToStack(20);
        stack.addElementToStack(30);
        Optional <Integer> result = stack.getNumber(3);
        // then
        assertFalse(result.isPresent());
    }

    @Test
    void isOptionalReturn() throws IsFullException {
        // given
        Stack stack = new Stack(3);
        // when
        stack.addElementToStack(10);
        stack.addElementToStack(20);
        stack.addElementToStack(30);
        Optional <Integer> result = stack.getNumber(10);
        // then
        assertTrue(result.isPresent());
    }
}
