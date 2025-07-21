package day2.assignment;

public class AllInOneDemo {
    public static void main(String[] args) {
        System.out.println("=== If-Else Demo ===");
        ifElseDemo(10);

        System.out.println("\n=== Nested If-Else Demo ===");
        nestedIfElseDemo(85);

        System.out.println("\n=== Operators Demo ===");
        operatorsDemo();

        System.out.println("\n=== Switch Demo ===");
        switchDemo(2);

        System.out.println("\n=== While Loop Demo ===");
        whileDemo();

        System.out.println("\n=== Nested For Loop Demo ===");
        nestedForLoopDemo();
    }

    // If-Else Demo
    public static void ifElseDemo(int num) {
        if (num > 0) {
            System.out.println(num + " is positive");
        } else {
            System.out.println(num + " is not positive");
        }
    }

    // Nested If-Else Demo
    public static void nestedIfElseDemo(int marks) {
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }

    // Operators Demo
    public static void operatorsDemo() {
        int a = 5, b = 2;
        System.out.println("Addition: " + (a + b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Is a > b? " + (a > b));
    }

    // Switch Demo
    public static void switchDemo(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }
    }

    // While Loop Demo
    public static void whileDemo() {
        int i = 0;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }
    }

    // Nested For Loop Demo
    public static void nestedForLoopDemo() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

