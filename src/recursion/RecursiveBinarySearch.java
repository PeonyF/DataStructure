package recursion;

public class RecursiveBinarySearch {
    static int BSearchRecur(int ar[], int first, int last, int target){
        int mid;
        if(first>last) {
            return -1;
        }
            mid=(first+last)/2;

            if(ar[mid] == target)
                return mid;
            else if(target<ar[mid])
                return BSearchRecur(ar,first,mid-1,target);
            else
                return BSearchRecur(ar,mid+1,last,target);
    }

    public static void main(String[] args)
    {
        int arr[]={1,3,5,7,9};
        int idx;
        int n=arr.length;
        int target=7;
        idx =BSearchRecur(arr,0,n-1,target);
        if(idx== -1){
            System.out.println("탐색실패");
        }
        else
            System.out.println("저장 인덱스"+(idx+1));




    }
}
