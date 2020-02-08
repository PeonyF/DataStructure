package sort;

class InsertionSort {
    int[] insertArr;
    int size;
    int j, temp;

    InsertionSort(int[] insertArr, int size) {
        this.insertArr = insertArr;
        this.size = size;
    }

    void insertionSort() {
        for (int i = 1; i < size; i++) {
            temp = insertArr[i];
            j = i;

            swapInsertionSort();

            insertArr[j] = temp;
            System.out.printf("삽입정렬 %d 단계 : ", i);
            for (int t = 0; t < size; t++) {
                System.out.printf("%3d", insertArr[t]);
            }
            System.out.println();
        }
    }

    private void swapInsertionSort() {
        while (biggerThanZeroOrTemp()) {
            insertArr[j] = insertArr[j - 1];
            j--;
        }
    }


    private boolean biggerThanZeroOrTemp() {
        return j > 0 && temp < insertArr[j - 1];
    }
}

class InsertMain {
    public static void main(String[] args) {
        int[] insertArr = {69, 10, 30, 2, 16, 8, 31, 22};
        int size = insertArr.length;
        InsertionSort insertionSort = new InsertionSort(insertArr, size);
        System.out.print("\n정렬할 원소 : ");
        for (int value : insertArr) {
            System.out.printf(" %d", value);
        }
        System.out.println();
        insertionSort.insertionSort();
    }
}
