package ПР171;

public class Group {
    private Student head;  // первый студент в списке
    private Student tail;  // последний студент в списке
    private int size;      // количество студентов

    // a. функция создания пустого списка
    public Group() {
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
    public void add(Student st) {
        // Убедимся, что новый элемент не ссылается ни на что
        st.next = null;

        if (head == null) {
            // список пустой
            head = st;
            tail = st;
        } else {
            // добавляем в конец
            tail.next = st;
            tail = st;
        }
        size++;
    }

    // c. функция удаления элемента
    public void delete(Student st) {
        if (head == null) {
            System.out.println("Студента нет в группе!");
            return;
        }

        // Если удаляем первый элемент
        if (head.equals(st)) {
            Student toRemove = head;
            head = head.next;

            // очищаем ссылку у удаляемого элемента
            toRemove.next = null;

            if (head == null) {
                tail = null;  // список стал пустым
            }
            size--;
            return;
        }

        // Ищем элемент для удаления
        Student current = head;
        while (current.next != null && !current.next.equals(st)) {
            current = current.next;
        }

        if (current.next != null) {
            // Нашли элемент для удаления
            Student toRemove = current.next;
            current.next = current.next.next;

            // очищаем ссылку у удаляемого элемента
            toRemove.next = null;

            // Если удалили последний элемент
            if (current.next == null) {
                tail = current;
            }
            size--;
        } else {
            System.out.println("Студента нет в группе!");
        }
    }

    // d. функция вывода элемента
    public void get(Student st) {
        Student current = head;
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
        // Очищаем все ссылки next
        Student current = head;
        while (current != null) {
            Student nextStudent = current.next;
            current.next = null;
            current = nextStudent;
        }

        head = null;
        tail = null;
        size = 0;
    }

    // f. функция проверки списка на пустоту
    public boolean isEmpty() {
        return head == null;
    }

    // Метод для отображения состояния
    public void empty() {
        if (isEmpty()) {
            System.out.println("Группа пуста");
        } else {
            System.out.println("В группе " + size + " студент(ов)");
        }
    }


}