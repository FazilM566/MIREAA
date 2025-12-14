package ПР9;

public class SortVstavk {
    Students[] iDNumber;

    public SortVstavk(Students[] iDNumber) {
        this.iDNumber = iDNumber;
    }

    public static void sort(Students[] iDNumber) {
        int n = iDNumber.length;
        for (int i = 1; i < n; ++i) {
            Students key = iDNumber[i];
            int j = i - 1;
            while (j >= 0 && iDNumber[j].getiD() > key.getiD()) {
                iDNumber[j + 1] = iDNumber[j];
                j --;
            }
            iDNumber[j + 1] = key;
        }

    }
}
