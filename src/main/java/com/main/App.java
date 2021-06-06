package com.main;

import com.aaa.TextEditorMain;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!!, this is main class for Java Practice project!");

        String inputText = "abcaa xyzzz 123 456 78901 001 00233";
        int wrapLength = 20;
        TextEditorMain.wrapText(inputText, wrapLength);

    }

}
