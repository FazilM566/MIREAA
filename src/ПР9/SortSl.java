package ПР9;

public class SortSl {
    public static Students[] sort(Students[] arrayA){
        if (arrayA.length <= 1) {
            return arrayA;
        }

        Students[] arrayB = new Students[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);
        Students[] arrayC = new Students[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);

        arrayB = sort(arrayB);
        arrayC = sort(arrayC);

        return merge(arrayB, arrayC);
    }

    public static Students[] merge(Students[] arrayA, Students[] arrayB) {
        Students[] arrayC = new Students[arrayA.length + arrayB.length];
        int positionA = 0;
        int positionB = 0;
        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == arrayA.length){
                arrayC[i] = arrayB[positionB];
                positionB++;
            } else if (positionB == arrayB.length) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            } else if (arrayA[positionA].getiD() < arrayB[positionB].getiD()) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            } else {
                arrayC[i] = arrayB[positionB];
                positionB++;
            }
        }
        return arrayC;
    }

    public static Students[] in_one(Students[] st1,Students[] st2){
        return merge(sort(st1),sort(st2));
    }
}
