package com.cardonamaturana.PersonalPractice.learnstrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.stereotype.Component;

@Component
public class StringInitialization {

  public static void start() {

    printSection("CONSTRUCTORS and TO_CHAR_ARRAY of Strings Excercise #1 ");

    String strOne = "maria";
    //we make one array of chars.
    char[] chars = {'m', 'a', 'r', 'i', 'a'};
    chars = strOne.toCharArray();

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

    printSection("Practice method CHAR_AT Excercise #2 ");

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

    printSection("we get different characters with INDEX_OF Excersice #3");
    printStringWithIndex(phraseOne);

    System.out.printf("%n la posicion del caracter 'e' es: %d", phraseOne.indexOf("e"));
    System.out.printf("%n la posicion del caracter ' ' es: %d", phraseOne.indexOf(" "));

    printSection("we get differents characters with LAST_INDEX_OF");
    printStringWithIndex(phraseOne);
    System.out.printf("%n la posicion del caracter 'e' es: %d", phraseOne.lastIndexOf("e"));
    System.out.printf("%n la posicion del caracter ' ' es: %d", phraseOne.lastIndexOf(" "));

    printSection("let's compare strings with EQUALS and ==  Excersice #4");

    String word1 = "maria";
    String word2 = new String("maria");
    String word3 = String.valueOf(chars);
    String word4 = "".concat("maria");
    String word5 = "" + "maria";
    String word6 = "maria".concat("");
    String word7 = "maria" + "";

    String word01 = "String word1 = \"maria\";";
    String word02 = "String word2 = new String(\"maria\");";
    String word03 = "String word3 = String.valueOf(chars);";
    String word04 = "String word4 = \"\".concat(\"maria\");";
    String word05 = "String word5 = \"\"+\"maria\";";
    String word06 = "String word6 = \"maria\".concat(\"\");";
    String word07 = "String word7 = \"maria\"+\"\";";

    List<String> nameWords = new ArrayList<>();

    nameWords.add(word01);
    nameWords.add(word02);
    nameWords.add(word03);
    nameWords.add(word04);
    nameWords.add(word05);
    nameWords.add(word06);
    nameWords.add(word07);

    List<String> words = new ArrayList<>();

    words.add(word1);
    words.add(word2);
    words.add(word3);
    words.add(word4);
    words.add(word5);
    words.add(word6);
    words.add(word7);

    printSection("Entrando al ciclo HAS CODE... convert to HEX");

    for (String w : words) {
      System.out.println(Integer.toHexString(w.hashCode()));
    }

    printSection("Entrando al ciclo SYSTEM IDENTY HAS CODE...convert to HEX");

    for (int i = 0; i < words.size(); i++) {
      System.out.println(Integer.toHexString(System.identityHashCode(words.get(i))));
    }

    printSection("Entrando al ciclo EQUALS...");

    System.out.println("Entrando al ciclo EQUALS...");
    for (int i = 0; i < words.size(); i++) {
      for (int j = i; j < words.size(); j++){
        System.out.printf("EQUALS - [%s] - [%s] --> [%b]%n", nameWords.get(i),nameWords.get(j), words.get(i).equals(words.get(j)) );
      }
    }

    printSection("Entrando al ciclo ==...");

    System.out.println("Entrando al ciclo ==...");
    for (int i = 0; i < words.size(); i++) {
      for (int j = i; j < words.size(); j++){
        System.out.printf(" == - [%s] - [%s] --> [%b]%n", nameWords.get(i),nameWords.get(j), words.get(i) == words.get(j));
      }
    }



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
