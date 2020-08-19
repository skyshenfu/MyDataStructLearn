package com.zty.datastructlearn.struct.queue;

import java.util.Queue;

public class CircleQueue<T> implements QueueInterface<T> {


    private Object[] dataHolder;
    public int front = 0;//队首元素的位置
    public int rear = 0;//队尾元素的位置
    public int capacity;//数组的实际长度

    //初始值为队列最大容量
    public CircleQueue(int maxSize) {

        capacity = maxSize;

        this.dataHolder = new Object[capacity];
    }

    @Override
    public int getSize() {
        //就是尾巴减去头部再对容器大小取余
        //+capacity是为了防止尾巴索引<头部索引
        return (rear - front + capacity) % capacity;
    }

    @Override
    public boolean isEmpty() {
        //这就是为空
        return (front == rear);
    }

    @Override
    public boolean enqueue(T data) {
        //正经大小就是容量-1
        if (getSize() == capacity - 1) {
            System.out.println("队满");
            return false;
        }
        dataHolder[rear] = data;
        //移动到下一位
        rear = (rear + 1) % capacity;
        return true;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("队为空");
            return null;
        }

        T elem = (T) dataHolder[front];

        //出栈置为空
        dataHolder[front] = null;
        //移动到下一位
        front = (front + 1) % capacity;
        return elem;
    }

    @Override
    public void ergodic() {
        if (isEmpty()) {
            System.out.println("队为空");
            return;
        }

        for (int i = front; i != rear; i = (i + 1) % capacity) {
            System.out.println(dataHolder[i]+String.valueOf(i));
        }


    }


}
