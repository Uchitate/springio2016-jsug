package com.example.core.monitor;

import com.example.core.entity.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceMonitor {

    @Before("execution(* *..*searchUser(long))")
    public void showMessageBefore() {
        System.out.println("Before!メソッドが呼ばれる前に出てくるよ");
    }

    @After("execution(* com.example.core.service.UserService.searchUser(..))")
    public void showMessageAfter() {
        System.out.println("After!メソッドが呼ばれた後に出てくるよ");
    }

    @Around("execution(* com.example.core.service.UserService.searchUser(long))")
    public User showMessageAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("AroundBefore!メソッドを呼ぶ前に出てくるよ");
        User user = (User) proceedingJoinPoint.proceed();
        System.out.println("AroundAfter!メソッドを呼んだ後に出てくるよ");
        return user;
    }

    @AfterReturning("execution(* com.example.core.service.UserService.searchUser(long))")
    public void showMessageAfterReturning(JoinPoint joinpoint) {
        System.out.println("AfterReturning!メソッドを読んだ後に出てくるよ");
    }
}
