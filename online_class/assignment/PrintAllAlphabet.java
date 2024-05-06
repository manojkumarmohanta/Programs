public class PrintAllAlphabet {
    public static void main(String[] args) {
        System.out.println("Printing all alphabets");
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nPrinting all lowercase letters");
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
    }
}
