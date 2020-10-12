package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Main {
    public static final int START = 0;
    public static final int CHARS = 1;

    public static void main(String[] args) {

        List<Character> letters = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
                'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
        Set<Integer> endStates = Collections.singleton(CHARS);
        StateMachine stateMachine = new StateMachine(START, endStates);
        stateMachine.add(START, letters, CHARS);
        stateMachine.add(CHARS, letters, CHARS);
        String str = "AaAaAAaABXYZ";
        String str2 = "zzz";
        String str3 = " ";
        stateMachine.findAll(str);
        stateMachine.findAll(str2);
        stateMachine.findAll(str3);
    }
}
