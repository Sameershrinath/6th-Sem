public class Bubblesort{

    public static int[] bubbleSort(int[] arr){
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

public static void main(String[] args) {
    int[] arr=new int[5];
    arr[0]=32;
    arr[1]=37;
    arr[2]=20;
    arr[3]=15;
    arr[4]=9;

    int[] newarr=bubbleSort(arr);

    for(int i=0;i<=newarr.length-1;i++){
        System.out.println(newarr[i]);
    }
}

}