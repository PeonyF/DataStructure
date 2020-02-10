package sort;

class QuickSort {
    private int i = 0;
    private int partition(int a[], int begin, int end){
        int pivot, temp, L,R,t;

        L = begin;
        R = end;
        pivot = (begin+end)/2;
        System.out.printf("\n [퀵정렬%d 단계: pivot=%d] \n",++i, a[pivot]);

        while (L<R){
            while (comparePivotAndLeft(L,R,pivot,a)){
                L++;
            }
            while (comparePivotAndRight(L,R,pivot,a)){
                R--;
            }
            if(L<R){
                swap(a,L,R);
                if(L == pivot){
                    pivot = R;
                }
            }
        }

        swap(a,pivot,R);
        for(t=0; t<a.length; t++){
            System.out.printf("%3d",a[t]);
        }
        System.out.println();
        return R;
    }

    private boolean comparePivotAndLeft(int left, int right, int pivot, int[] quickSortArr){
        return (left < right) && (quickSortArr[pivot] > quickSortArr[left]);
    }

    private boolean comparePivotAndRight(int left, int right, int pivot, int[] quickSortArr){
        return (left < right) && (quickSortArr[pivot] <= quickSortArr[right]);
    }

    private void swap(int[] a, int idx1, int idx2){
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    void quickSort(int[] a, int begin, int end){
        if(begin < end){
            int p;
            p = partition(a,begin,end);
            quickSort(a,begin,p-1);
            quickSort(a, p+1, end);
        }
    }
}

class QuickMain{
    public static void main(String[] args){
        int[] a ={69, 10, 30, 2, 16, 8, 31, 22};
        int size = a.length-1;
        QuickSort quickSort = new QuickSort();
        System.out.print("정렬할 원소 : ");
        for (int i=0; i<size; i++) {
            System.out.printf("%3d", a[i]);
        }
        System.out.println();
        quickSort.quickSort(a,0,size);
    }
}


