public class Arrayinsertion {
    
public static int[] InsertPosition(int[] arr,int index,int value){
    System.out.println("function called");
    int n =arr.length;
    int[] newarr=new int[n+1];

    for(int i=0;i<=index;i++){
        newarr[i]=arr[i];
    }
    newarr[index]=value;

    for(int i=index;i<=arr.length-1;i++){
        newarr[i+1]=arr[i];
    }




    return newarr;

}
public static void main(String[] args){
    System.out.println("Hello world");

    int[] numbers=new int[5];
    numbers[0]=10;
    numbers[1]=20;
    numbers[2]=30;
    numbers[3]=40;

    int[] newnum=InsertPosition(numbers, 1,15 );

    for(int i=0;i<=newnum.length-1;i++){
        System.out.println(newnum[i]);
    }
}

}
