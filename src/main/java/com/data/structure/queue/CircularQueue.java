package com.data.structure.queue;

public class CircularQueue {

    // 数组：items，数组大小：n
    private String[] items;
    private int n = 0;
    // head表示队头下标，tail表示队尾下标
    private int head = 0;
    private int tail = 0;

    // 申请一个大小为capacity的数组
    public CircularQueue(int capacity) {
        items = new String[capacity];
        n = capacity;
    }

    // 入队
    public boolean enqueue(String item) {
        // 队列满了
        if ((tail + 1) % n == head) return false;
        items[tail] = item;
        tail = (tail + 1) % n;
        return true;
    }

    // 出队
    public String dequeue() {
        // 如果head == tail 表示队列为空
        if (head == tail) return null;
        String ret = items[head];
        head = (head + 1) % n;
        return ret;
    }

    public void printAll() {
        if (0 == n) return;
        for (int i = head; i % n != tail; i = (i + 1) % n) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a = 0 % 3;
        System.out.println(a);
        CircularQueue queue = new CircularQueue(3);
        for (int i = 0; i < 5; i++) {
            boolean enqueue = queue.enqueue("" + i);
            if (enqueue){
                System.out.println(i + "-->入队成功");
                continue;
            }
            System.out.println(i + "-->入队失败");
        }
        queue.printAll();

        System.out.println("--------------------------");

        String dequeue = queue.dequeue();
        System.out.println("出列:" + dequeue);

        for (int i = 8; i < 12; i++) {
            boolean enqueue = queue.enqueue("" + i);
            if (enqueue){
                System.out.println(i + "-->入队成功");
                continue;
            }
            System.out.println(i + "-->入队失败");
        }
    }
}