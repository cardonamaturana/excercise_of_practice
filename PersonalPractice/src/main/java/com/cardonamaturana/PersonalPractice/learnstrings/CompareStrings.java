package com.cardonamaturana.PersonalPractice.learnstrings;

public class CompareStrings {

  public static void start() {

    char[] chars = {'m', 'a', 'r', 'i', 'a'};

    String result = new String(chars, 2, 3);

    System.out.printf("antes : %s%n Despues : %s%n", String.valueOf(chars), result);
  }

}
