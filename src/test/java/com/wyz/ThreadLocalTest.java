package com.wyz;

import org.junit.jupiter.api.Test;

public class ThreadLocalTest {
    @Test
    public void  testThreadLocalSetAndGet(){
        // 提供一个threadlocal对象
        ThreadLocal tl = new ThreadLocal();
        new Thread(()->{
            tl.set("角色1");
            System.out.println( Thread.currentThread().getName() + ": " + tl.get());
            System.out.println( Thread.currentThread().getName() + ": " + tl.get());
            System.out.println( Thread.currentThread().getName() + ": " + tl.get());

        }, "蓝色").start();


        new Thread(()->{
            tl.set("角色2");
            System.out.println( Thread.currentThread().getName() + ": " + tl.get());
            System.out.println( Thread.currentThread().getName() + ": " + tl.get());
            System.out.println( Thread.currentThread().getName() + ": " + tl.get());

        }, "绿色").start();
    }
}
