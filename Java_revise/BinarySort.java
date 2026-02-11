public class BinarySort{


public static int binarysearalgo(int[] arr,int key){

int low=0;
int high=arr.length - 1;


while(high>=low){
    int mid=(low+high)/2;
    if (arr[mid]==key){
        return mid;
    }
    else if(arr[mid]<key){
        low=mid+1;
    }
    else{
       high=mid-1;
    }

}

return -1;

}


public static void main(String[] args){

    int[] array={2,7,7,10,7,7,7,9};

    int ind=binarysearalgo(array, 7);
    System.out.println(ind);

}


}