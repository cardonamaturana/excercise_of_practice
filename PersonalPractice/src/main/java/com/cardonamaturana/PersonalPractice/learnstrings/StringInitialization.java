package com.cardonamaturana.PersonalPractice.learnstrings;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class StringInitialization {

  public static void start() {

    printSection("Constructor of Strings Excercise #1 ");

    //we make one array of chars.
    char[] chars = {'m', 'a', 'r', 'i', 'a'};

    List<String> strings = new ArrayList<String>();

    System.out.printf("Content of the string is: %n");
    printStringWithIndex(String.valueOf(chars));

    // we make one String from array of chars when we get all characters.
    int from = 0;
    int to = 5;

    System.out.printf("Characters from %d to %d: %s%n", from, to,
        new String(chars, from, to));

    to = 4;
    System.out.printf("Characters from %d to %d: %s%n", from, to,
        new String(chars, from, to));

    to = 3;
    System.out.printf("Characters from %d to %d: %s%n", from, to,
        new String(chars, from, to));

    to = 2;
    System.out.printf("Characters from %d to %d: %s%n", from, to,
        new String(chars, from, to));

    to = 1;
    System.out.printf("Characters from %d to %d: %s%n", from, to,
        new String(chars, from, to));

    to = 0;
    System.out.printf("Characters from %d to %d: %s%n", from, to,
        new String(chars, from, to));

    // we make one String from array of chars and we decrement one position in next line.

    strings.add(new String(chars, 0, 4));

    strings.add(new String(chars, 0, 3));

    strings.add(new String(chars, 0, 2));

    strings.add(new String(chars, 0, 1));

    strings.add(new String(chars, 0, 0));

    printSection("Practice method charAt Excercise #2 ");

    // chars = {'m', 'a', 'r', 'i', 'a'};
    String getCharAt = String.valueOf(chars);

    printStringWithIndex(getCharAt);

    int position = 0;
    System.out.printf("charAt of index(%d) : %c%n", position, getCharAt.charAt(position));

    position = 1;
    System.out.printf("charAt of index(%d) : %c%n", position, getCharAt.charAt(position));

    position = 2;
    System.out.printf("charAt of index(%d) : %c%n", position, getCharAt.charAt(position));

    position = 3;
    System.out.printf("charAt of index(%d) : %c%n", position, getCharAt.charAt(position));

    position = 4;
    System.out.printf("charAt of index(%d) : %c%n", position, getCharAt.charAt(position));


    String phraseOne = "Mi primer nombre es julio";

    printSection("we get different characters with indexOf Excersice #3");
    printStringWithIndex(phraseOne);

    System.out.printf("%n la posicion del caracter 'e' es: %d", phraseOne.indexOf("e"));
    System.out.printf("%n la posicion del caracter ' ' es: %d", phraseOne.indexOf(" "));

    printSection("we get differents characters with lastIndexOf");
    printStringWithIndex(phraseOne);
    System.out.printf("%n la posicion del caracter 'e' es: %d", phraseOne.lastIndexOf("e"));
    System.out.printf("%n la posicion del caracter ' ' es: %d", phraseOne.lastIndexOf(" "));

  }

  private static void printSection(String sectionName) {
    System.out.println("\n \n ----->    " + sectionName + "    <-------\n\n");
  }

  private static void printStringWithIndex(String sectionName) {
    char[] chars = sectionName.toCharArray();
    int i = 0;
    for (char c : chars) {
      System.out.printf("|%d|", i++);
    }
    i = 0;
    System.out.printf("%n");
    for (char c : chars) {
      System.out.printf(i++ > 9 ? "  %c " : " %c ", c);
    }
    System.out.printf("%n");
  }
}
