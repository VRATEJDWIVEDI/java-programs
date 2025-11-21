public class MultipleCatchDemo2 {

    public static void main(String[] args) {

        try {
            int arr[] = new int[5];
            arr[10] = 20;           // ArrayIndexOutOfBoundsException

            String s = null;
            System.out.println(s.length());  // NullPointerException

            int x = 20 / 0;         // ArithmeticException

            int n = Integer.parseInt("abc"); // NumberFormatException

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException 
                 | NullPointerException | NumberFormatException e) {

            System.out.println("Exception caught: " + e.getClass().getSimpleName());
        }

        System.out.println("Rest of the code continues...");
    }
}
