
package org.example.app;

import java.util.Arrays;
import java.util.LinkedList;


public class App {
    public static void main(String[] args) {
        LinkedList<String> tokens = new LinkedList<>(Arrays.asList(split(getMessage(), ",")));
        // Seu código continua aqui...
    }

    public static String getMessage() {
        return "a,b,c";
    }

    public static String[] split(String str, String sep) {
        return str.split(sep);
    }
}
