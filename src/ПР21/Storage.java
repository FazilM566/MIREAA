package ПР21;

class Storage<T> {
    private T[] array;

    public Storage(T[] array) {
        this.array = array;
    }

    // 3. Метод, возвращающий элемент массива по индексу
    public T getElement(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Индекс за пределами массива");
        }
        return array[index];
    }

    public int getSize() {
        return array.length;
    }


    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Storage<Integer> intStorage = new Storage<>(intArray);
        System.out.println("Элемент с индексом 2: " + intStorage.getElement(2));

        String[] strArray = {"A", "B", "C"};
        Storage<String> strStorage = new Storage<>(strArray);
        System.out.println("Элемент с индексом 1: " + strStorage.getElement(1));
    }
}