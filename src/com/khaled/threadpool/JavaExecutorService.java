package com.khaled.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JavaExecutorService {
    public static void main(String[] args) {
        int processorsNumber = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(processorsNumber);
        for (int i = 0; i < 100; i++) {
            executorService.submit(new CpuintsiveTask());

        }

    }
    static class  CpuintsiveTask implements Runnable {
        @Override
        public void run() {

        }
    }
}


