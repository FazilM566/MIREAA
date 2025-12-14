package ПР23;

public class LinkedQueueTest {
    public static void main(String[] args) {
        System.out.println("=== Тестирование LinkedQueue ===");
        LinkedQueue queue = new LinkedQueue();

        // Тест isEmpty
        System.out.println("\n1. Тест isEmpty() для пустой очереди:");
        System.out.println("isEmpty() = " + queue.isEmpty()); // true

        // Тест enqueue и size
        System.out.println("\n2. Тест enqueue() и size():");
        queue.enqueue("A");
        queue.enqueue("B");
        System.out.println("enqueue(\"A\"), enqueue(\"B\")");
        System.out.println("size() = " + queue.size()); // 2

        // Тест element
        System.out.println("\n3. Тест element() (первый элемент без удаления):");
        System.out.println("element() = " + queue.element()); // A

        // Тест dequeue
        System.out.println("\n4. Тест dequeue() (удаление первого элемента):");
        System.out.println("dequeue() = " + queue.dequeue()); // A
        System.out.println("После dequeue, size() = " + queue.size()); // 1

        // Тест clear
        System.out.println("\n5. Тест clear():");
        queue.clear();
        System.out.println("После clear(), isEmpty() = " + queue.isEmpty()); // true




    }
}