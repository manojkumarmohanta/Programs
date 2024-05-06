public class lab_2ndsem_2 {

    public static void main(String[] args) {
        // Write a program to compare two objects. Create two objects representing two
        // complex number and find the larger one?
        ComplexNumber c1 = new ComplexNumber(6, 8);
        ComplexNumber c2 = new ComplexNumber(5, 9);

        if (c1.magnitude() > c2.magnitude()) {
            System.out.println(c1.toString() + " is larger");
        } else {
            System.out.println(c2.toString() + " is larger");
        }

    }

}
class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double magnitude() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public String toString() {
        return "(" + real + " + " + imaginary + "i)";
    }
}
