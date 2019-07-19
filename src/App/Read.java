package App;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Read {
    //1. In clasa Read, din programul vostru, creati o metoda tratat, care sa returneze un numar de la tastatura.

    public int getInt() {

        boolean repeat;
        int x = 0;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                x = scan.nextInt();
                repeat = false;
            } catch (InputMismatchException error) {
                repeat = true;
                System.out.println("Not a number, try again!");
            }
        } while (repeat);
        return x;
    }

    //2. In clasa Read, duplicati metoda de la punctul 1, astfel incat sa aveti mai multe metode,
    // care sa citeasca si sa returneze si alte tipuri de numere (float, int, double, long, etc)

    public float getFloat() {

        boolean repeat;
        float x = 0;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                x = scan.nextFloat();
                repeat = false;
            } catch (InputMismatchException error) {
                repeat = true;
                System.out.println("Not a number, try again!");
            }
        } while (repeat);
        return x;
    }

    public double getDouble() {

        boolean repeat;
        double x = 0;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                x = scan.nextDouble();
                repeat = false;
            } catch (InputMismatchException error) {
                repeat = true;
                System.out.println("Not a number, try again!");
            }
        } while (repeat);
        return x;
    }

    public double getLong() {

        boolean repeat;
        long x = 0;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                x = scan.nextLong();
                repeat = false;
            } catch (InputMismatchException error) {
                repeat = true;
                System.out.println("Not a number, try again!");
            }
        } while (repeat);
        return x;
    }

    public String getString() {

        boolean repeat;
        String x = "";
        do {
            try {
                Scanner scan = new Scanner(System.in);
                x = scan.next();
                repeat = false;
            } catch (InputMismatchException error) {
                repeat = true;
                System.out.println("Not a String, try again!");
            }
        } while (repeat);
        return x;
    }


    //3. In clasa Read, creati o metoda care sa returneze un array de numere populat de la tastatura.
    // Metoda sa primeasca ca si parametru un numar, care reprezinta cate pozitii are.

    public int[] getArray(int length) {

        int[] myArray = new int[length];
        boolean repeat;

        System.out.println("Introduceti " + length + " numere: ");

        for (int i = 0; i < length; i++)
            do {
                try {
                    Scanner scan = new Scanner(System.in);
                    myArray[i] = scan.nextInt();
                    repeat = false;
                } catch (InputMismatchException error) {
                    repeat = true;
                    System.out.println("Not a number, try again!");
                }
            }
            while (repeat);

        return myArray;

    }

    //4. In clasa Read, creati o metoda care sa returneze o lista de numere populate de la tastatura.
    // Metoda nu va primi parametru lungimea. In rezolvarea ei trebuie folosit try-catch.
    // (Hint: a se citi de la tastatura atata timp cat valoarea primita e numar, cand nu mai e numar, sa se intrerupa citirea)

    public List<Integer> getList() {

        List<Integer> myList = new ArrayList<>();
        boolean repeat;

        System.out.println("Introduceti numerele care sa faca parte din lista: \n" +
                "(Daca vreti sa va opriti, tastati alt caracter)");

        do {
            try {
                Scanner scan = new Scanner(System.in);
                int j = scan.nextInt();
                myList.add(j);
                repeat = true;
            } catch (InputMismatchException error) {
                repeat = false;
                System.out.print("Lista introdusa este: ");
                return myList;
            }
        }
        while (repeat);
        return myList;
    }

    public List<String> getStringList() {

        List<String> myList = new ArrayList<>();


        System.out.println("Introduceti textele care sa faca parte din lista: \n" +
                "(Daca vreti sa va opriti, tastati Enter de 2 ori.)");
        boolean repeat;
        do {
            Scanner scan = new Scanner(System.in);
            String j = scan.nextLine();
            if (j.isEmpty()) {
                repeat = false;
                System.out.print("Lista introdusa este: ");
                return myList;
            } else {
                myList.add(j);
                repeat = true;
            }
        } while (repeat);
        return myList;
    }


}
