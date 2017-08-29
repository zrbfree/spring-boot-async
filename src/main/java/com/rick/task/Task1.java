package com.rick.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.Future;

/**
 * Desc :  任务类
 * User : RICK
 * Time : 2017/8/29 9:56
  */

@Component
public class Task1 {

    public Random random = new Random();

    /**
     * Desc :  @Async所修饰的函数不要定义为static类型，否则异步调用不会生效
     *  这里通过返回Future<T>来返回异步调用的结果，实现异步回调
     * User : RICK
     * Time : 2017/8/29 10:30
      */

    //任务一
    @Async
    public Future<String> doTaskOne() throws Exception{
        System.out.println("开始做任务一");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("完成任务一，耗时：" + (end - start) + "毫秒");
        return new AsyncResult<>("test1 is done!");
    }

    //任务二;
    @Async
    public Future<String> doTaskTwo() throws Exception {
        System.out.println("开始做任务二");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("完成任务二，耗时：" + (end - start) + "毫秒");
        return new AsyncResult<>("test2 is done!");
    }

    //任务3;
    @Async
    public Future<String> doTaskThree() throws Exception {
        System.out.println("开始做任务三");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("完成任务三，耗时：" + (end - start) + "毫秒");
        return new AsyncResult<>("test3 is done!");
    }


}
