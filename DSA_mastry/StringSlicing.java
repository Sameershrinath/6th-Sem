public class StringSlicing {
    public static void main(String[] args) {
        String str = "Hello World";
        
        // Slice from index 0 to 5 (excludes 5)
        String slice1 = str.substring(0, 5);
        System.out.println(slice1); // Output: Hello
        
        // Slice from index 6 to end
        String slice2 = str.substring(6);
        System.out.println(slice2); // Output: World
        
        // Slice with variables
        int start = 0;
        int end = 5;
        String slice3 = str.substring(start, end);
        System.out.println(slice3); // Output: Hello
    }
}