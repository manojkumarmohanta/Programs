import java.util.Scanner;

public class lab_2ndsem_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What type of shape do you want to find the area of?");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        int shapeType = input.nextInt();
        Shape shape = null;
        switch (shapeType) {
            case 1:
                shape = new Circle();
                break;
            case 2:
                shape = new Square();
                break;
            case 3:
                shape = new Rectangle();
                break;
        }

        System.out.println("What are the dimensions of the shape?");
        if (shape instanceof Circle) {
            System.out.println("Enter the radius:");
            float radius = input.nextFloat();
            ((Circle) shape).setRadius(radius);
        } else if (shape instanceof Square) {
            System.out.println("Enter the side length:");
            float sideLength = input.nextFloat();
            ((Square) shape).setSideLength(sideLength);
        } else if (shape instanceof Rectangle) {
            System.out.println("Enter the width:");
            float width = input.nextFloat();
            System.out.println("Enter the height:");
            float height = input.nextFloat();
            ((Rectangle) shape).setWidth(width);
            ((Rectangle) shape).setHeight(height);
        }

        float area = shape.getArea();
        System.out.println("The area of the shape is " + area);
        input.close();
    }
}

class Shape {
    public float getArea() {
        return 0;
    }
}

class Circle extends Shape {
    private float radius;

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }
}

class Square extends Shape {
    private float sideLength;

    public void setSideLength(float sideLength) {
        this.sideLength = sideLength;
    }

    public float getArea() {
        return sideLength * sideLength;
    }
}

class Rectangle extends Shape {
    private float width;
    private float height;

    public void setWidth(float width) {
        this.width = width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getArea() {
        return width * height;
    }
}