package org.xiao.patterns.singleton;

/**
 * 测试单例模式是否真的有效
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/22 15:04
 */
public class ChocolateBoilerMain {

    /*
    * this.cnt++;
    * 两个线程，同时执行addCnt方法。
    * 第一个， cnt = 0;
    * 第二个， cnt = 0；
    * 第一个，cnt = cnt + 1； result:1=0+1
    * 第二个，cnt = cnt + 1； result:1=0+1
    * 最终结果，cnt的值变成了1，但是实际却加了两次。
    *
    * */

    private static final int THREAD_SIZE = 10;

    public void multiRun() {
        ChocolateBoiler boiler = new ChocolateBoilerUnSafe();
//    ChocolateBoiler boiler = ChocolateBoilerSafe.getInstance();

        long start = System.currentTimeMillis();
        long end = start;

        ThreadTask[] tasks = new ThreadTask[THREAD_SIZE];
        for (int i = 0; i < THREAD_SIZE; i++) {
            tasks[i] = new ThreadTask(boiler);
        }

        while ((end - start) <= 1 * 1000) {
            Thread[] threads = new Thread[THREAD_SIZE];
            for (int i = 0; i < THREAD_SIZE; i++) {
                threads[i] = new Thread(tasks[i]);
            }

            for (int i = 0; i < THREAD_SIZE; i++) {
                threads[i].start();
            }

            for (int i = 0; i < THREAD_SIZE; i++) {
                try {
                    threads[i].join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            end = System.currentTimeMillis();

        }

    }

    class ThreadTask implements Runnable {
        private ChocolateBoiler boiler;

        public ThreadTask(ChocolateBoiler boiler) {
            this.boiler = boiler;
        }

        public ThreadTask() {
        }

        @Override
        public void run() {
            boiler.run();
        }
    }
}
