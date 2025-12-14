package ПР171;

public class Group3 {
    private Student3 head;  // первый элемент (любой в кольце)
    private Student3 tail;  // последний элемент (перед head)
    private int size;

    // a. функция создания пустого списка
    public Group3() {
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
    public void add(Student3 st) {
        if (head == null) {
            // Первый элемент - создаем кольцо из одного элемента
            head = st;
            st.next = st;  // ссылается сам на себя
            tail = st;
        } else {
            // Добавляем после tail, перед head
            st.next = head;     // новый указывает на первый
            tail.next = st;     // старый последний указывает на новый
            tail = st;          // новый становится последним
        }
        size++;
    }

    // c. функция удаления элемента
    public void delete(Student3 st) {
        if (head == null) {
            System.out.println("Студента нет в группе!");
            return;
        }

        // Если удаляем единственный элемент
        if (head == tail && head.equals(st)) {
            head.next = null;  // разрываем кольцо
            head = null;
            tail = null;
            size = 0;
            return;
        }

        // Ищем элемент для удаления и его предыдущий
        Student3 current = head;
        Student3 prev = tail;  // в кольце tail предшествует head

        do {
            if (current.equals(st)) {
                // Нашли элемент для удаления
                if (current == head) {
                    head = head.next;      // новый первый
                    tail.next = head;      // tail должен указывать на новый head
                } else if (current == tail) {
                    tail = prev;           // новый последний
                    tail.next = head;      // должен указывать на head
                } else {
                    prev.next = current.next;  // обычное удаление из середины
                }

                current.next = null;  // изолируем удаляемый элемент
                size--;
                return;
            }

            prev = current;
            current = current.next;
        } while (current != head);  // прошли полный круг

        System.out.println("Студента нет в группе!");
    }

    // d. функция вывода элемента
    public void get(Student3 st) {
        if (head == null) {
            System.out.println("Студента нет в группе!");
            return;
        }

        Student3 current = head;
        do {
            if (current.equals(st)) {
                System.out.println(current);
                return;
            }
            current = current.next;
        } while (current != head);  // пока не вернемся к началу

        System.out.println("Студента нет в группе!");
    }

    // e. функция очистки списка
    public void zero() {
        if (head == null) return;

        // Разрываем кольцо
        tail.next = null;

        // Очищаем ссылки всех элементов
        Student3 current = head;
        while (current != null) {
            Student3 next = current.next;
            current.next = null;
            current = next;
        }

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
            System.out.println("Список не пуст, элементов: " + size);
        }
    }
}