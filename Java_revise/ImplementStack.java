public class ImplementStack{

int top=-1;
int maxlen=5;
int[] stackarr= new int[maxlen];


public void checkmaxlen(){
    return maxlen;
}

public void pushelement(int num){
     
    if(top==maxlen-1){
        System.out.println("Stack is over flow");
    }
    else{
        top+=1;
        stackarr[top]=num;
    }

}

public void popelement(){
    if(top==-1){
        System.out.println("Stack is already empty");
    }
    else{
        System.out.println("element popped is "+ stackarr[top]);
        top-=1;
    }
}
public void peekelement(){
    if(top==-1){
        System.out.println("stack is empty");
    }
    else{
        System.out.println(stackarr[top]);
    }
}


    static void main(String[] args) {

        ImplementStack stk = new ImplementStack();

        stk.pushelement(45);
        stk.pushelement(50);
        stk.pushelement(51);
        stk.peekelement();

        stk.pushelement(52);

        stk.peekelement();
        stk.pushelement(85);
        stk.peekelement();

        stk.pushelement(95);
        stk.peekelement();
        stk.pushelement(69);
        stk.popelement();
        stk.popelement();
        stk.popelement();
        stk.popelement();
        stk.popelement();
        stk.popelement();

    }}
