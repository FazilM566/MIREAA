public class i13 {
    public static void main(String[] args) {
        int sum = 0;
        int[] ms = {4,3,1};
        for (int i = 0;i < ms.length;i++) {
            sum += ms[i];
        }
        System.out.println("Сумма элементов массива равна " + sum);
        System.out.println("Среднее арифметическое элементов массива равно " + sum/3.0);
    }
}
