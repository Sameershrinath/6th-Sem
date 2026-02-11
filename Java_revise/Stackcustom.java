// class Stackcustom {

//     int top = -1;
//     int[] stackarr =new int[5];
//     int maxlen = 5;

//     public void pushelement(int number) {
//         if (top == maxlen - 1) {
//             System.out.println("stack is overflow now");

//         } else {
//             top += 1;
//             stackarr[top] = number;

//         }

//     }

//     public void popelement() {
//         if (top == -1) {
//             System.out.println("stack is empty");
//         } else {
//             System.out.println("element is popped" + stackarr[top]);
//             top = top - 1;
//         }
//     }

//     public void peekelement() {
//         if (top == -1) {
//             System.out.println("stack is empty");
//         } else {
//             System.out.println(stackarr[top]);
//         }
//     }
// }
