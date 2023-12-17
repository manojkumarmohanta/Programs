public class lab_2ndsem_15 {

    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero exception occurred");
        }

        try {
            int[] array = new int[5];
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound exception occurred");
        }
    }
}