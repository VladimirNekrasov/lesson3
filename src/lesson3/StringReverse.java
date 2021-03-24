package lesson3;

import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        reverseString("abcdddef");
    }

    public static String reverseString(String userText){

        String[] text = userText.split("");
        MyStack<String> stack = new MyStack<>(userText.length());
        String[] list = new String[text.length];


        for (int i = 0; i < text.length; i++) {
            stack.push(text[i]);
        }
        System.out.println(stack.size());
        for (int i = 0; i < stack.size(); i++) {

            System.out.println(stack.pop());
        }
        return Arrays.toString(list);
    }
}
