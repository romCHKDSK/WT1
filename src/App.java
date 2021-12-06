import java.awt.Color;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import assignment.Z1;
import assignment.Z2;
import assignment.Z3;
import assignment.Z4;
import assignment.Z5;
import assignment.Z6;
import assignment.Z7;
import assignment.Z8;
import assignment.z9.Ball;
import assignment.z9.Basket;
import assignment.z12_15.Book;
import assignment.z12_15.ProgrammerBook;
import assignment.z12_15.comparators.BookAuthorComparator;
import assignment.z12_15.comparators.BookAuthorTitleComparator;
import assignment.z12_15.comparators.BookTitleAuthorComparator;
import assignment.z12_15.comparators.BookTitleComparator;
import assignment.z12_15.comparators.BookTitlePriceComparator;

public class App {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Select assignment (1-9, 12, 0 - Exit):");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    z1(scanner);
                    break;
                case 2:
                    z2(scanner);
                    break;
                case 3:
                    z3(scanner);
                    break;
                case 4:
                    z4(scanner);
                    break;
                case 5:
                    z5(scanner);
                    break;
                case 6:
                    z6(scanner);
                    break;
                case 7:
                    z7(scanner);
                    break;
                case 8:
                    z8(scanner);
                    break;
                case 9:
                    z9(scanner);
                    break;

                case 12:
                    z12();
                    break;
            
                default:
                    break;
            }
        } while (choice != 0);
        scanner.close();
    }

    private static Random rand = new Random();

    private static String[] strConsts = {
        "Invalid input",
        "Array cannot be of negative size",
        "x=",
        "y="
    };

    private static void z1(Scanner scanner) {
        double x = 0;
        double y = 0;
        
        boolean success = false;
        while (!success) {
            try {
                System.out.println("Input x and y:");
                System.out.print(strConsts[2]);
                x = scanner.nextDouble();
                System.out.print(strConsts[3]);
                y = scanner.nextDouble();
                success = true;
            } catch (NumberFormatException ex) {
                System.err.println(strConsts[0]);
            }
        }

        double result = Z1.calculate(x, y);
        System.out.println(strConsts[2] + x);
        System.out.println(strConsts[3] + y);
        System.out.println("result: " + result);
    }

    private static void z2(Scanner scanner) {
        double x = 0;
        double y = 0;
        
        boolean success = false;
        while (!success) {
            try {
                System.out.println("Input point coordinates:");
                System.out.print(strConsts[2]);
                x = scanner.nextDouble();
                System.out.print(strConsts[3]);
                y = scanner.nextDouble();
                success = true;
            } catch (NumberFormatException ex) {
                System.err.println(strConsts[0]);
            }
        }
        

        System.out.println(Z2.pointInBounds(x, y));
    }

    private static void z3(Scanner scanner) {
        double a = 0;
        double b = 0;
        double h = 0;

        boolean success = false;
        while (!success) {
            try {
                System.out.println("Input point sequence bounds:");
                System.out.print("a=");
                a = scanner.nextDouble();
                System.out.print("b=");
                b = scanner.nextDouble();
                System.out.println("Input point sequence step:");
                System.out.print("h=");
                h = scanner.nextDouble();
                success = true;
            } catch (NumberFormatException ex) {
                System.err.println(strConsts[0]);
            }
        }
        

        System.out.println("Resulting table:");
        DecimalFormat df = new DecimalFormat("0.000");
        df.setPositivePrefix(" ");
        StringBuilder sb = new StringBuilder();
        for (var e : Z3.getFxTable(a, b, h).entrySet()) {
            var k = e.getKey();
            var v = e.getValue();
            sb.append(df.format(k));
            sb.append("|");
            sb.append(df.format(v));
            sb.append('\n');
        }
        System.out.print(sb);
    }

    private static void z4(Scanner scanner) {
        int[] arr = null;

        boolean success = false;
        while (!success) {
            try {
                System.out.println("Array size:");
                System.out.print("N=");
                int n = scanner.nextInt();
                scanner.nextLine();
                arr = new int[n];
                success = true;
            } catch (NumberFormatException ex) {
                System.err.println(strConsts[0]);
            } catch (NegativeArraySizeException ex) {
                System.err.println(strConsts[1]);
            }
        }
        

        StringBuilder sb;
        sb = new StringBuilder();
        
        System.out.println("Generated array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
            sb.append(arr[i]);
            sb.append(" ");
        }
        System.out.println(sb);
        
        List<Integer> primePositions = Z4.getPrimePositions(arr);
        
        if (primePositions.isEmpty())
            System.out.println("No prime numbers were found");
        else {
            sb = new StringBuilder();
            System.out.println("Found prime numbers' positions:");
            for (Integer p : primePositions) {
                sb.append(p);
                sb.append("("+arr[p]+")");
                sb.append(" ");
            }
            System.out.println(sb);
        }
    }

    private static void z5(Scanner scanner) {
        int[] arr = null;

        boolean success = false;
        while (!success) {
            try {
                System.out.println("Table size:");
                System.out.print("n=");
                int n = scanner.nextInt();
                scanner.nextLine();
                arr = new int[n];
                success = true;
            } catch (NumberFormatException ex) {
                System.err.println(strConsts[0]);
            } catch (NegativeArraySizeException ex) {
                System.err.println(strConsts[1]);
            }
        }
        

        StringBuilder sb;
        sb = new StringBuilder();
        
        System.out.println("Generated array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
            sb.append(arr[i]);
            sb.append(" ");
        }
        System.out.println(sb);

        System.out.println("The amount of elements that can be removed:");
        System.out.print("K=");
        System.out.println(Z5.removableNumAmount(arr));
    }

    private static void z6(Scanner scanner) {
        double[] arr = null;

        boolean success = false;
        while (!success) {
            try {
                System.out.println("Array size:");
                System.out.print("n=");
                int n = scanner.nextInt();
                scanner.nextLine();
                arr = new double[n];
                success = true;
            } catch (NumberFormatException ex) {
                System.err.println(strConsts[0]);
            } catch (NegativeArraySizeException ex) {
                System.err.println(strConsts[1]);
            }
        }
        

        StringBuilder sb;
        sb = new StringBuilder();
        
        System.out.println("Generated array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextDouble() * 10;
            sb.append(arr[i]);
            sb.append(" ");
        }
        System.out.println(sb);

        DecimalFormat df = new DecimalFormat("0.0");
        sb = new StringBuilder();
        System.out.println("Generated matrix:");
        double[][] matrix = Z6.getMatrix(arr);
        for (double[] i : matrix) {
            for (double j : i) {
                sb.append(df.format(j));
                sb.append(" ");
            }
            sb.replace(sb.length() - 1, sb.length(), "\n");
        }
        System.out.print(sb);
    }

    private static void z7(Scanner scanner) {
        double[] arr = null;

        boolean success = false;
        while (!success) {
            try {
                System.out.println("Array size:");
                System.out.print("n=");
                int n = scanner.nextInt();
                scanner.nextLine();
                arr = new double[n];
                success = true;
            } catch (NumberFormatException ex) {
                System.err.println(strConsts[0]);
            } catch (NegativeArraySizeException ex) {
                System.err.println(strConsts[1]);
            }
        }
        

        StringBuilder sb;
        DecimalFormat df = new DecimalFormat("0.0");
        
        sb = new StringBuilder();
        System.out.println("Generated array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextDouble() * 10;
            sb.append(df.format(arr[i]));
            sb.append(" ");
        }
        System.out.println(sb);

        sb = new StringBuilder();
        System.out.println("Shell-sorted array:");
        for (double i : Z7.shellSort(arr)) {
            sb.append(df.format(i));
            sb.append(" ");
        }
        System.out.println(sb);
    }

    private static void z8(Scanner scanner) {
        double[] a = null;
        double[] b = null;

        boolean success = false;
        while (!success) {
            try {
                System.out.println("Sequence 1 size:");
                System.out.print("n=");
                int n = scanner.nextInt();
                scanner.nextLine();
                a = new double[n];
                System.out.println("Sequence 2 size:");
                System.out.print("m=");
                int m = scanner.nextInt();
                scanner.nextLine();
                b = new double[m];
                success = true;
            } catch (NumberFormatException ex) {
                System.err.println(strConsts[0]);
            } catch (NegativeArraySizeException ex) {
                System.err.println(strConsts[1]);
            }
        }
        

        StringBuilder sb;
        DecimalFormat df = new DecimalFormat("0.000");
        
        System.out.println("Generated arrays:");
        double d;

        sb = new StringBuilder();
        d = 0;
        for (int i = 0; i < a.length; i++) {
            d += rand.nextDouble() * rand.nextInt(5);
            a[i] = d;
            sb.append(df.format(a[i]));
            sb.append(" ");
        }
        System.out.println(sb);
        sb = new StringBuilder();
        d = 0;
        for (int i = 0; i < b.length; i++) {
            d += rand.nextDouble() * rand.nextInt(5);
            b[i] = d;
            sb.append(df.format(b[i]));
            sb.append(" ");
        }
        System.out.println(sb);

        sb = new StringBuilder();
        System.out.println("a <= b Insertion points:");
        for (int i : Z8.getInsertionPositions(a, b)) {
            sb.append(i);
            sb.append(" ");
        }
        System.out.println(sb);
    }

    private static void z9(Scanner scanner) {
        int n = 0;
        boolean useAnsi = false;
        Basket basket = new Basket();

        boolean success = false;
        while (!success) {
            try {
                System.out.println("Does your terminal support color mode ANSI escape sequences? (y/n)");
                switch (scanner.next().charAt(0)) {
                    case 'Y', 'y':
                        useAnsi = true;
                        break;
                    case 'N', 'n':
                        useAnsi = false;
                        break;
                    default:
                        success = false;
                        continue;
                }
                System.out.println("How many balls do you want to add?");
                n = scanner.nextInt();
                scanner.nextLine();
                success = true;
            } catch (NumberFormatException ex) {
                System.err.println(strConsts[0]);
            } catch (NegativeArraySizeException ex) {
                System.err.println(strConsts[1]);
            }
        }
        

        for (int i = 0; i < n; i++) {
            double weight = rand.nextDouble();
            Color color;
            switch (rand.nextInt(3)) {
                case 0:
                color = Color.BLUE;
                    break;
                case 1:
                color = Color.RED;
                    break;
                case 2:
                color = Color.GREEN;
                    break;
                default:
                color = null;
                    break;
            }
            basket.addBall(new Ball(weight, color));
        }

        StringBuilder sb = new StringBuilder();
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Balls in the basket:");
        for (Ball ball : basket.getBalls()) {
            String ansiEscapeSeq = "";
            String colorName = "";
            if (ball.getColor() == Color.BLUE) {
                colorName = "blue";
                ansiEscapeSeq = "\u001B[44m";
            } else if (ball.getColor() == Color.RED) {
                colorName = "red";
                ansiEscapeSeq = "\u001B[41m";
            } else if (ball.getColor() == Color.GREEN) {
                colorName = "green";
                ansiEscapeSeq = "\u001B[42m";
            } else {
                ansiEscapeSeq = "\u001B[40m";
                colorName = "black";
            }
            
            sb.append("A ");
            if (useAnsi)
                sb.append(ansiEscapeSeq);
            sb.append(colorName);
            if (useAnsi)
                sb.append("\u001B[0m");
            sb.append(" ");
            sb.append(df.format(ball.getWeight()));
            sb.append(" kg. ball\n");
        }
        System.out.println(sb);
        System.out.println("Total ball weight: " + df.format(basket.getTotalWeight()));
        System.out.println("Total blue balls: " + basket.getBallCountByColor(Color.BLUE));
    }

    private static void z12() {
        ArrayList<Book> Books = new ArrayList<>();
        Books.add(new Book("666-77-38-a", "Book3", "Me", 22, 2));
        Books.add(new Book("a66-77-38-a", "Book1", "Vasyan", 66, 2));
        Books.add(new Book("66c-77-38-a", "Book2", "Petya", 44, 2));
        Books.add((Book)Books.get(0).clone());
        Books.add(new ProgrammerBook("657-68-46", "Java for dummies", "Unknown", 31, 2, "Python", 87));

        for (Book book : Books) {
            System.out.println(book.toString());
            System.out.println("Hash code: " + book.hashCode());
            for (Book bookCompared : Books) {
                int compareResult = book.compareTo(bookCompared);
                if (compareResult == 0) {
                    System.out.print(" = ");
                } else if (compareResult < 0) {
                    System.out.print(" < ");
                } else if (compareResult > 0) {
                    System.out.print(" > ");
                } else {
                    System.out.print(" ? ");
                }
                System.out.println(bookCompared.toString());
            }
        }

        System.out.println("By title");
        Books.sort(new BookTitleComparator());
        for (Book book : Books) {
            System.out.println(book.toString());
        }

        System.out.println("By title and author");
        Books.sort(new BookTitleAuthorComparator());
        for (Book book : Books) {
            System.out.println(book.toString());
        }

        System.out.println("By author");
        Books.sort(new BookAuthorComparator());
        for (Book book : Books) {
            System.out.println(book.toString());
        }

        System.out.println("By author and title");
        Books.sort(new BookAuthorTitleComparator());
        for (Book book : Books) {
            System.out.println(book.toString());
        }

        System.out.println("By title and price");
        Books.sort(new BookTitlePriceComparator());
        for (Book book : Books) {
            System.out.println(book.toString());
        }
    }
}