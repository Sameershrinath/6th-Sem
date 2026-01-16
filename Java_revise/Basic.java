public class Basic {
   public double addition(double a, double b){
    double sum=a+b;
    return sum;
}

    public static void main (String[] args){
        System.out.println("Hello world\n");

        //Checking for the method calling
        // Basic addi= new Basic();
        // double result=addi.addition(45.2,63.2);
        // System.out.println(result);

        //Increment and decrement
        // int a=45;
        // System.out.println("Increasing " + a);
        // a++;
        // System.out.println("Increasing " + a);

        //Checking for the if else
        // int age=152;
        // if (age>=18 && age<110){
        //     System.out.println("You are eligible to vote");
        // }
        // else if (age>110){
        //     System.out.println("Enter the valid age");
        // }
        // else{
        //     System.out.println("You can vote..");
        // }

        //Checking the Switch statement
        // int num=1;
        // switch (num){
        //     case 1:
        //         System.out.println("ONE");
        //         break;
        //     case 2:
        //         System.out.println("TWO");
        //         break;
        //     default:
        //         System.out.println("Not in the rank.");
        // }

        //Checking the loop 
        //1. While
        // int a=10;
        // while (a>0){
        //     System.out.println(a);
        //     a--;
        // }

        // 2.for loop 
        // for(int a=0;a<10;a++){
        //     if (a==4){
        //         continue;
        //     }
        //     System.out.println(a);
        // }

        //what is the println, printf , print
        // String name="sameer shrinath";
        // System.out.printf("Hello %s",name);
        
        //Type casting
        // //double to int
        // double num =4.5;
        // System.out.println(num);
        // int num1=(int)num;
        // System.out.println(num +"<-old changed-> " +num1);

        // //string to the int
        // String age="45";
        // int nage=Integer.parseInt(age);
        // System.out.println(nage);

    //     //int to string
    //     int std=10;
    //     String newstd=String.valueOf(std);
    //     System.out.println(newstd.getClass());

    // //concatination
    // String fname="sameer ";
    // String lname="Shrinth";
    // String fullname=fname+lname;

    // System.out.println(fullname);

    //defining the array
    // int[] marks=new int[10];

    // for(int i=0;i<=marks.length-1;i++){
    // System.out.println(marks[i]);}

    //storing strings in the array
    // String[] names=new String[5];
    // names[0]="sameer shrinth";
    // names[1]="sumit";
    // names[2]="Pritam";
    // names[3]="Amit";

    // //displaying the value in the list
    // for(int i=0;i<=names.length-1;i++){
    //     System.out.println(names[i]);
    // }

    //reversing the values in the list
    // for(int i = 0; i < names.length / 2; i++){
    //     String temp = names[i];
    //     names[i] = names[names.length - 1 - i];
    //     names[names.length - 1 - i] = temp;
    // }   

    // for(int i=0;i<=names.length-1;i++){
    //     System.out.println(names[i]);
    // }

    //adding the element at the middle index
    int num=10;
    int index=0;
    int[] numbers=new int[4];

    numbers[0]=11;
    numbers[1]=22;
    numbers[2]=33;

    int temp=numbers[index];
    numbers[index]=num;
    for(int i=index;i<=numbers.length-1;i++){
        numbers[i+1]=numbers[i];
    }






}
    
}
