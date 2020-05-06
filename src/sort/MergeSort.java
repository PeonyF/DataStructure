package sort;

class MergeSort {
    private int[] sorted = new int [30];
    private void mergeTwoArea(int[] unSortedArr, int left, int middle, int right){
        int size = unSortedArr.length;
        int moveFromLeftArea,moveFromRightArea,sortedIdx,i;
        moveFromLeftArea=left;
        moveFromRightArea = middle+1;
        sortedIdx = left;

        while (moveFromLeftArea<=middle && moveFromRightArea<=right){
            if(unSortedArr[moveFromLeftArea] <= unSortedArr[moveFromRightArea]){
              sorted[sortedIdx] = unSortedArr[moveFromLeftArea++];
            }
            else {
                sorted[sortedIdx] = unSortedArr[moveFromRightArea++];
            }
            sortedIdx++;
        }

        if(moveFromLeftArea>middle){
            for(i=moveFromRightArea; i<=right;i++,sortedIdx++){
                sorted[sortedIdx] = unSortedArr[i];
            }
        }
        else{
            for(i=moveFromLeftArea; i<=middle; i++,sortedIdx++){
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

    void mergeSort(int[] unsortedArr, int left, int right){
        int middle;
        if(left<right){
            middle = (left+right)/2;
            mergeSort(unsortedArr,left,middle);
            mergeSort(unsortedArr,middle+1,right);
            mergeTwoArea(unsortedArr,left,middle,right);
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
