package com.rick.controller;

import com.rick.task.Task1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

@RestController
public class TaskController {

    @Autowired
    private Task1 task1;

    @RequestMapping("/task1")
    public String task1() throws  Exception{
        Future<String> test1 = task1.doTaskOne();
        Future<String> test2 = task1.doTaskTwo();
        Future<String> test3 = task1.doTaskThree();

        while (true){
            if(test1.isDone()){
                System.out.println("====================test1 is done=========================");
            }

            if(test2.isDone()){
                System.out.println("====================test2 is done=========================");
            }

            if(test3.isDone()){
                System.out.println("====================test3 is done=========================");
            }

            if(test1.isDone() && test2.isDone() && test3.isDone()){
                break;
            }
            Thread.sleep(1000);
        }

        return "task1";
    }



}
