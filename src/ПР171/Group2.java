package ПР171;

public class Group2 {
    private Student2 head;
    private Student2 tail;
    private int size;

    // a. функция создания пустого списка
    public Group2() {
        head = null;
        tail = null;
        size = 0;
    }

    public void create() {
        head = null;
        tail = null;
        size = 0;
    }

    // b. функция добавления элемента
    public void add(Student2 st) {
        st.next = null;
        st.prev = null;

        if (head == null) {
            head = st;
            tail = st;
        } else {
            st.prev = tail;
            tail.next = st;
            tail = st;
        }
        size++;
    }

    // c. функция удаления элемента
    public void delete(Student2 st) {
        if (head == null) {
            System.out.println("Студента нет в группе!");
            return;
        }

        Student2 current = head;
        while (current != null && !current.equals(st)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Студента нет в группе!");
            return;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev;
        }

        current.next = null;
        current.prev = null;

        size--;
    }

    // d. функция вывода элемента
    public void get(Student2 st) {
        Student2 current = head;
        while (current != null) {
            if (current.equals(st)) {
                System.out.println(current);
                return;
            }
            current = current.next;
        }
        System.out.println("Студента нет в группе!");
    }

    // e. функция очистки списка
    public void zero() {
        head = null;
        tail = null;
        size = 0;
    }

    // f. функция проверки списка на пустоту
    public boolean isEmpty() {
        return head == null;
    }

    public void empty() {
        if (isEmpty()) {
            System.out.println("Список пуст");
        } else {
            System.out.println("Список не пуст");
        }
    }
}