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

package org.example.app;

import org.example.list.LinkedList;

import static org.example.utilities.StringUtils.join;
import static org.example.utilities.StringUtils.split;
import static org.example.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
