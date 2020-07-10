package myArray;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StopWatch;

import java.util.*;
import java.util.concurrent.*;

/**
 * 存在重复元素
 * <p>
 * <p>
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 */
public class Solution3 {

    public boolean containsDuplicate(int[] nums) {
//        int[] a = {1, 2, 3, 1};
//        int[] b = {1, 2, 3, 4};
//        int[] c = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
//        {3,4,5,6,7,8,9,2,3}
//        3,2,1,0
        Set<Integer> sets = new HashSet<>();
        for (int num : nums) {
            if (!sets.add(num)) {
                return true;
            }
        }
        return false;
    }

//    public void createArray(int length, ExecutorService executor) throws InterruptedException {
//        int[] d = new int[length];
//        final CountDownLatch latch = new CountDownLatch(length);
////        final ThreadLocalRandom current = ThreadLocalRandom.current();
//
//        class MyThread implements Runnable {
//            private final int index;
//
//            public MyThread(int index) {
//                this.index = index;
//            }
//
//            @Override
//            public void run() {
////                System.out.println("run "+index);
//                d[index] = ThreadLocalRandom.current().nextInt();
//                latch.countDown();
//            }
//        }
//
//        for (int i = 0; i < length; i++) {
//            executor.execute(new MyThread(i));
////            System.out.println("for "+i);
//        }
//
//        latch.await();
//    }

    public static void main(String[] args) throws InterruptedException {

        Logger logger = LoggerFactory.getLogger(Solution3.class);

        int[] a = {1, 2, 3, 1};
        int[] b = {1, 2, 3, 4};
        int[] c = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

//        Random random = new Random();
//        int length = random.nextInt();

//
//        StopWatch stopWatch = new StopWatch(UUID.randomUUID().toString());
//        ExecutorService executor = Executors.newSingleThreadExecutor();
//
//        stopWatch.start();
//        solution3.createArray(10000, executor);
//        stopWatch.stop();
//        System.out.println(stopWatch.getLastTaskTimeMillis());
//        for (int j : d) {
//            System.out.println("d[] for " + j);
//        }


//        cachedThreadPool.shutdown();

        Solution3 solution3 = new Solution3();
        System.out.println(solution3.containsDuplicate(a));
        System.out.println(solution3.containsDuplicate(b));
        System.out.println(solution3.containsDuplicate(c));


    }
}
