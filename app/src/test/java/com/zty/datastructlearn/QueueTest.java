package com.zty.datastructlearn;

import com.zty.datastructlearn.struct.queue.CircleQueue;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class QueueTest {

    //测试循环队列
    @Test
    public void testCircleQueue() {
        CircleQueue<String> queue=new CircleQueue<>(5);
        queue.enqueue("3");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.dequeue();
        queue.dequeue();
        queue.enqueue("D");
        queue.enqueue("E");
        queue.enqueue("F");
        queue.ergodic();

    }
}