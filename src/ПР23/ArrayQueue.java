package ПР23;

import java.util.Arrays;

//Очередь на массиве в виде класса.
//Инвариант: элементы хранятся в items от front до rear по модулю capacity.

public class ArrayQueue {
    private int[] items;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue() {
        items = new int[10];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Предусловие: очередь не переполнена
    // Постусловие: элемент добавлен в конец
    public void enqueue(int element) {
        ensureCapacity();
        rear = (rear + 1) % items.length;
        items[rear] = element;
        size++;
    }

    // Предусловие: очередь не пуста
    // Постусловие: возвращен первый элемент
    public int element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return items[front];
    }

    // Предусловие: очередь не пуста
    // Постусловие: первый элемент удален и возвращен
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        int result = items[front];
        front = (front + 1) % items.length;
        size--;
        return result;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
    }

    private void ensureCapacity() {
        if (size == items.length) {
            items = Arrays.copyOf(items, items.length * 2);
            if (rear < front) {
                System.arraycopy(items, 0, items, items.length / 2, rear + 1);
                rear += items.length / 2;
            }
        }
    }
}