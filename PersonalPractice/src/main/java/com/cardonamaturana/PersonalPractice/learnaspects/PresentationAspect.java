package com.cardonamaturana.PersonalPractice.learnaspects;

import org.springframework.stereotype.Component;

@Component
public class PresentationAspect {

  public static void present() {
    StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();

    if (stackTrace.length > 1) {
      StackTraceElement caller = stackTrace[2];
      String className = caller.getFileName();
      System.out.printf("%n Executing : %s%n%n", className);
    }
  }

}
