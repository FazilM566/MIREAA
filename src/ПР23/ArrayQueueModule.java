package ПР23;

import java.util.Arrays;

//Модуль для работы с одной глобальной очередью на массиве.
//Инвариант: элементы хранятся в items от front до rear по модулю capacity.

public class ArrayQueueModule {
    private static final int DEFAULT_CAPACITY = 10;
    private static int[] items;
    private static int front;
    private static int rear;
    private static int size;

    static {
        items = new int[DEFAULT_CAPACITY];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Предусловие: очередь не переполнена
    // Постусловие: элемент добавлен в конец
    public static void enqueue(int element) {
        ensureCapacity();
        rear = (rear + 1) % items.length;
        items[rear] = element;
        size++;
    }

    // Предусловие: очередь не пуста
    // Постусловие: возвращен первый элемент
    public static int element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return items[front];
    }

    // Предусловие: очередь не пуста
    // Постусловие: первый элемент удален и возвращен
    public static int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        int result = items[front];
        front = (front + 1) % items.length;
        size--;
        return result;
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        front = 0;
        rear = -1;
        size = 0;
    }

    private static void ensureCapacity() {
        if (size == items.length) {
            items = Arrays.copyOf(items, items.length * 2);
            if (rear < front) {
                System.arraycopy(items, 0, items, items.length / 2, rear + 1);
                rear += items.length / 2;
            }
        }
    }
}