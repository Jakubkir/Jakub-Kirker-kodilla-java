package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;



public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Welcom", (str) -> str.toUpperCase());
        poemBeautifier.beautify("Welcom", (str) -> str.substring(0, 5));
        poemBeautifier.beautify("Welcom", (str) -> str + "ABC");

    }
}
