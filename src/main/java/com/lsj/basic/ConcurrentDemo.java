package com.lsj.basic;

import java.util.Date;
import java.util.concurrent.*;

/**
 * @author shijia.liu
 */
public class ConcurrentDemo {
    private final static int threadCount = 50;
    private final static int taskCount = 250;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(threadCount);
        CountDownLatch countDownLatch = new CountDownLatch(taskCount);

        Date beforeExecution = new Date();
        for(int index = 1; index <= taskCount; index ++){
            executor.submit(new RunnableTask("Task_" + index, countDownLatch));
        }
        executor.shutdown();
        System.out.println("Waiting for all task done...");
        try {
            countDownLatch.await();
            Date afterExecution = new Date();
            long timeCost = afterExecution.getTime() - beforeExecution.getTime();
            System.out.println("All tasks finish running, cost " + timeCost + " milliseconds");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class RunnableTask implements Runnable {

    private String taskName;
    private CountDownLatch countDownLatch;

    public RunnableTask(String taskName, CountDownLatch countDownLatch){
        this.taskName = taskName;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run(){
        System.out.println(taskName + " running...");
        try {
            Thread.sleep(3000);
            System.out.println(taskName + " finish running");
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            countDownLatch.countDown();
        }
    }
}
