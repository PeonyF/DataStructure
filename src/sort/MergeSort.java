package sort;

class MergeSort {
    private int[] sorted = new int [30];
    private void mergeTwoArea(int[] unSortedArr, int left, int middle, int right){
        int size = unSortedArr.length;
        int moveFromLeft,moveFromRight,sortedIdx,i;
        moveFromLeft=left;
        moveFromRight = middle+1;
        sortedIdx = left;

        while (moveFromLeft<=middle && moveFromRight<=right){
            if(unSortedArr[moveFromLeft] <= unSortedArr[moveFromRight]){
              sorted[sortedIdx] = unSortedArr[moveFromLeft++];
            }
            else {
                sorted[sortedIdx] = unSortedArr[moveFromRight++];
            }
            sortedIdx++;
        }

        if(moveFromLeft>middle){
            for(i=moveFromRight; i<=right;i++,sortedIdx++){
                sorted[sortedIdx] = unSortedArr[i];
            }
        }
        else{
            for(i=moveFromLeft; i<=middle; i++,sortedIdx++){
                sorted[sortedIdx] = unSortedArr[i];
            }
        }

        for(i=left; i<=right; i++){
            unSortedArr[i] = sorted[i];
        }
        System.out.print("\n 병합 정렬 >> ");
        for(i=0; i<size; i++){
            System.out.printf("%3d",unSortedArr[i]);
        }
    }

    void mergeSort(int[] a, int left, int right){
        int middle;
        if(left<right){
            middle = (left+right)/2;
            mergeSort(a,left,middle);
            mergeSort(a,middle+1,right);
            mergeTwoArea(a,left,middle,right);
        }
    }
}

class MergeMain{
    public static void main(String[] args){
        int[] arr = {69,10,30,2,16,8,31,22};
        int size = arr.length;
        MergeSort ms = new MergeSort();
        System.out.print("\n 정렬할 원소 : ");
        for (int value : arr) {
            System.out.printf(" %d", value);
        }
        System.out.println();
        ms.mergeSort(arr,0,size-1);
    }

}
