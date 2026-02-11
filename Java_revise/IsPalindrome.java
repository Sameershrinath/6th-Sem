public class IsPalindrome {

    public static boolean palidromecheck(String s) {

        int left=0;
        int right=s.length()-1;
        boolean isPalin=true;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                isPalin=false;
                break;
            }
            left+=1;
            right-=1;
        }
        return isPalin;
    }
    public static void main(String[] args){
        System.out.println(palidromecheck("aman"));
        System.out.println(palidromecheck("mam"));
        System.out.println(palidromecheck("rammar"));
    }
}
