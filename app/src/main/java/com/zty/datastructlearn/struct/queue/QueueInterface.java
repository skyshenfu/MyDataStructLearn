package com.zty.datastructlearn.struct.queue;

public interface QueueInterface <T>{
    public int getSize();
    public boolean isEmpty();
    public boolean enqueue(T data);
    public T dequeue();
    public  void ergodic();
}
