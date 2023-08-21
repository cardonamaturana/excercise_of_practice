package com.cardonamaturana.PersonalPractice.learnaspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PresentationAspectWrapper {
  @Before("execution(* com.xyz.service.*.*(..))")
  public void startPresentation(JoinPoint joinPoint){
    PresentationAspect.present();
  }

}
