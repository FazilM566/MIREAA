package ПР23;

import java.util.Arrays;

//АТД очередь на массиве.
//Инвариант: элементы хранятся в items от front до rear по модулю capacity.

public class ArrayQueueADT {
    private int[] items;
    private int front;
    private int rear;
    private int size;

    public ArrayQueueADT() {
        items = new int[10];
        front = 0;
        rear = -1;
        size = 0;
    }

    public static void enqueue(ArrayQueueADT queue, int element) {
        ensureCapacity(queue);
        queue.rear = (queue.rear + 1) % queue.items.length;
        queue.items[queue.rear] = element;
        queue.size++;
    }

    public static int element(ArrayQueueADT queue) {
        if (isEmpty(queue)) {
            throw new IllegalStateException("Очередь пуста");
        }
        return queue.items[queue.front];
    }

    public static int dequeue(ArrayQueueADT queue) {
        if (isEmpty(queue)) {
            throw new IllegalStateException("Очередь пуста");
        }
        int result = queue.items[queue.front];
        queue.front = (queue.front + 1) % queue.items.length;
        queue.size--;
        return result;
    }

    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    public static void clear(ArrayQueueADT queue) {
        queue.front = 0;
        queue.rear = -1;
        queue.size = 0;
    }

    private static void ensureCapacity(ArrayQueueADT queue) {
        if (queue.size == queue.items.length) {
            queue.items = Arrays.copyOf(queue.items, queue.items.length * 2);
            if (queue.rear < queue.front) {
                System.arraycopy(queue.items, 0, queue.items, queue.items.length / 2, queue.rear + 1);
                queue.rear += queue.items.length / 2;
            }
        }
    }
}