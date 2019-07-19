package App;


import java.util.Arrays;
import java.util.List;

public class Run {

    private Read read = new Read();
    private Calculator calc = new Calculator();
    private LogicalOp logic = new LogicalOp();

    /**
     * Continua sa afiseze meniul cat timp este selectata o optiune
     */

    public void runTheProgram() {
        do {
            printMenu();

        } while (selectItem());
    }

    /**
     * Afiseaza meniul
     **/
    private void printMenu() {
        System.out.println("\n1. Basic Operations\n" +
                "2. Logical operations\n" +
                "3. Drawings\n" +
                "0. QUIT\n");

    }

    /**
     * Selecteaza o optiune din meniu
     */
    private boolean selectItem() {
        System.out.print("\nPlease select one menu number: ");
        int numberFromUser = read.getInt();
        switch (numberFromUser) {
            case 1:
                System.out.println("\nBasic operations are:");
                runBasicOperationsMenu();
                return true;

            case 2:
                System.out.println("\nLogical operations are:");
                runLogicalOpMenu();
                return true;
            case 3:
                System.out.println("\nChoose what to draw:");
                runDrawingsMenu();
                return true;
            case 0:
                System.out.println("Bye!");
                return false;
            default:
                System.out.println("Try again!");
                return true;
        }
    }

    /**
     * Continua sa afiseze meniul cat timp este selectata o optiune
     */
    private void runBasicOperationsMenu() {
        do {
            printBasicOpMenu();

        } while (selectItemFromBasicOpMenu());
    }

    /**
     * Afiseaza meniul
     **/
    private void printBasicOpMenu() {
        System.out.println("\n0. Return to main menu.\n" +
                "1. Sum\n" +
                "2. Difference\n" +
                "3. Multiply\n" +
                "4. Division\n" +
                "5. Modulo\n");

    }

    /**
     * Selecteaza o optiune din meniu
     */
    private boolean selectItemFromBasicOpMenu() {
        System.out.print("\nPlease select one menu number: ");
        int numberFromUser = read.getInt();
        switch (numberFromUser) {
            case 1:
                sum();
                logic.wait(2);
                return true;
            case 2:
                dif();
                logic.wait(2);
                return true;
            case 3:
                mult();
                logic.wait(2);
                return true;
            case 4:
                div();
                logic.wait(2);
                return true;
            case 5:
                modulo();
                logic.wait(2);
                return true;
            case 0:
                System.out.println("Return to main menu.");
                return false;
            default:
                System.out.println("Try again!");
                return true;
        }
    }

    /**
     * Citeste primul numar
     */
    private int getFirstNr() {
        System.out.print("Please enter one number: ");
        return read.getInt();
    }

    /**
     * Citeste al doilea numar
     */
    private int getSecondNr() {
        System.out.print("Please enter the second number: ");
        return read.getInt();
    }

    private void sum() {
        System.out.println("The sum is: " +
                calc.addNrs(getFirstNr(), getSecondNr()));
    }

    private void dif() {
        System.out.println("The difference is: " +
                calc.difNrs(getFirstNr(), getSecondNr()));
    }

    private void mult() {
        System.out.println("The result of the multiplication is: " +
                calc.multNrs(getFirstNr(), getSecondNr()));
    }

    private void div() {
        System.out.println("The result of the division is: " +
                calc.divNrs(getFirstNr(), getSecondNr()));
    }

    private void modulo() {
        System.out.println("The rest of the division is: " +
                calc.modulo(getFirstNr(), getSecondNr()));
    }

    /**
     * Afiseaza meniul pentru Logical Operations cat timp este selectata o optiune
     */

    private void runLogicalOpMenu() {
        do {
            printLogicalMenu();

        } while (selectItemMenu());
    }

    private void printLogicalMenu() {
        System.out.println("\n0. Return to main menu\n" +
                "1. Operations with IF\n" +
                "2. Operations with FOR\n" +
                "3. Operations with WHILE\n" +
                "4. Operations with ARRAY\n" +
                "5. Operations with LIST\n");
    }

    private boolean selectItemMenu() {
        System.out.print("\rSelect the logical operation: ");
        int numberFromUser = read.getInt();
        switch (numberFromUser) {
            case 1:
                runLogicalOpIFMenu();
                return true;
            case 2:
                runLogicalOpFORMenu();
                return true;
            case 3:
                runLogicalOpWHILEMenu();
                return true;
            case 4:
                runLogicalOpARRAYMenu();
                return true;
            case 5:
                runLogicalOpLISTMenu();
                return true;
            case 0:
                System.out.println("Return to main menu.");
                return false;
            default:
                System.out.println("Try again!");
                return true;
        }
    }


    /**
     * Afiseaza meniul pentru Logical Operations pentru IF cat timp este selectata o optiune
     */
    private void runLogicalOpIFMenu() {
        do {
            printLogicalIfMenu();

        } while (selectItemIfMenu());
    }

    /**
     * Meniul Logical Operations IF
     */
    private void printLogicalIfMenu() {
        System.out.println("\n0. Return to Logical Operations menu.\n" +
                "1. Find bigger number between 2 numbers\n" +
                "2. Find bigger number between 3 numbers\n" +
                "3. Compare string\n" +
                "4. Compare text and string\n" +
                "5. Amount of snow\n" +
                "6. Compare numbers\n" +
                "7. Check if the number is odd or even\n" +
                "8. Check if the person can vote\n");
    }

    /**
     * Selecteaza o optiune din meniul Logical Operations IF
     */
    private boolean selectItemIfMenu() {
        System.out.print("\rSelect the logical operation: ");
        int numberFromUser = read.getInt();
        switch (numberFromUser) {
            case 1:
                checkBiggerNr();
                logic.wait(2);
                return true;
            case 2:
                checkBigger3Nr();
                logic.wait(2);
                return true;
            case 3:
                compareString();
                logic.wait(2);
                return true;
            case 4:
                compareTextAndString();
                logic.wait(2);
                return true;
            case 5:
                amountOfSnow();
                logic.wait(2);
                return true;
            case 6:
                compareNrTo3();
                logic.wait(2);
                return true;
            case 7:
                checkIfNumberIsEven();
                logic.wait(2);
                return true;
            case 8:
                checkIfSomeCanVote();
                logic.wait(2);
                return true;
            case 0:
                System.out.println("Return to Logical Operations menu.");
                return false;
            default:
                System.out.println("Try again!");
                return true;
        }
    }

    private void checkBiggerNr() {
        System.out.println("The bigger number is: " +
                logic.checkBiggerNumber(getFirstNr(), getSecondNr()));
    }

    private void checkBigger3Nr() {
        System.out.println("Introdu trei numere:");
        int a = getFirstNr();
        int b = getSecondNr();
        System.out.print("Please enter the third number: ");
        int c = read.getInt();
        System.out.println("Cel mai mare numar este: " + logic.biggestNr(a, b, c));
    }

    /**
     * Citeste un string
     */
    private String getStr() {
        System.out.print("Introdu textul: ");
        return read.getString();
    }

    private void compareString() {
        System.out.println(logic.compareText(getStr()));
    }

    private void compareTextAndString() {
        System.out.println(logic.compTextAndNr(getStr(), getFirstNr()));
    }

    private void amountOfSnow() {
        System.out.println(logic.snow(getFirstNr()));
    }

    private void compareNrTo3() {
        System.out.println(logic.compareNr(getFirstNr()));
    }

    private void checkIfNumberIsEven() {
        if (logic.isNumberEven(getFirstNr())) {
            System.out.println("Numarul introdus este par.");
        } else {
            System.out.println("Numarul introdus este impar.");
        }
    }

    private void checkIfSomeCanVote() {
        System.out.print("Introdu varsta persoanei: ");
        int x = read.getInt();
        if (logic.isEligibleToVote(x)) {
            System.out.println("Persoana poate vota.");
        } else {
            System.out.println("Persoana nu are drept de vot.");
        }
    }

    /**
     * Afiseaza meniul pentru Logical Operations pentru FOR cat timp este selectata o optiune
     */
    private void runLogicalOpFORMenu() {
        do {
            printLogicalFORMenu();

        } while (selectItemFORMenu());
    }

    /**
     * Meniul Logical Operations FOR
     */
    private void printLogicalFORMenu() {
        System.out.println("\n0. Return to Logical Operations menu.\n" +
                "1. Print to 100 from a given number\n" +
                "2. Print to -100 from a given number\n" +
                "3. Print count between 2 given numbers\n" +
                "4. Print ascending count between 2 given numbers\n" +
                "5. Print even numbers from 1 to 100\n" +
                "6. Print odd numbers from 1 to 100\n" +
                "7. Sum of numbers between a given numbers and 100\n" +
                "8. Mean of numbers between a given numbers and 100\n");
    }

    /**
     * Selecteaza o optiune din meniul Logical Operations FOR
     */
    private boolean selectItemFORMenu() {
        System.out.print("\rSelect the logical operation: ");
        int numberFromUser = read.getInt();
        switch (numberFromUser) {
            case 1:
                printTo100FromNr();
                logic.wait(2);
                return true;
            case 2:
                printToMinus100FromNr();
                logic.wait(2);
                return true;
            case 3:
                printCountBetweenNr();
                logic.wait(2);
                return true;
            case 4:
                printCountToHighest();
                logic.wait(2);
                return true;
            case 5:
                printEvenNrsTo100();
                logic.wait(2);
                return true;
            case 6:
                printOddNrsTo100();
                logic.wait(2);
                return true;
            case 7:
                sumTo100();
                logic.wait(2);
                return true;
            case 8:
                meanTo100();
                logic.wait(2);
                return true;
            case 0:
                System.out.println("Return to Logical Operations menu.");
                return false;
            default:
                System.out.println("Try again!");
                return true;
        }
    }

    private void printTo100FromNr() {
        logic.printTo100(getFirstNr());
    }

    private void printToMinus100FromNr() {
        logic.printToMinus100(getFirstNr());
    }

    private void printCountBetweenNr() {
        logic.printCountBetweenNumbers(getFirstNr(), getSecondNr());
    }

    private void printCountToHighest() {
        logic.printCountToHighest(getFirstNr(), getSecondNr());
    }

    private void printEvenNrsTo100() {
        logic.printCountEvenNr();
    }

    private void printOddNrsTo100() {
        logic.printCountOddNr();
    }

    private void sumTo100() {
        int x = getFirstNr();
        System.out.print("Suma numerelor pornind de la numarul " + x + " pana la 100 este: " +
                logic.sumTo100(x) + ".");
    }

    private void meanTo100() {
        int x = getFirstNr();
        System.out.print("Media numerelor pornind de la numarul " + x + " pana la 100 este: " +
                logic.sumTo100AndAverage(x) + ".");
    }

    /**
     * Afiseaza meniul pentru Logical Operations pentru WHILE cat timp este selectata o optiune
     */
    private void runLogicalOpWHILEMenu() {
        do {
            printLogicalWHILEMenu();

        } while (selectItemWHILEMenu());
    }

    /**
     * Meniul Logical Operations WHILE
     */
    private void printLogicalWHILEMenu() {
        System.out.println("\n0. Return to Logical Operations menu.\n" +
                "1. Print to 100 from a given number\n" +
                "2. Print to -100 from a given number\n" +
                "3. Print count between 2 given numbers\n" +
                "4. Print ascending count between 2 given numbers\n" +
                "5. Print even numbers from 1 to 100\n" +
                "6. Print odd numbers from 1 to 100\n" +
                "7. Print the mean of numbers divisible with 7 in an interval\n" +
                "8. Mean of numbers between a given numbers and 100\n" +
                "9. Print first X numbers from Fibonacci Sequence\n" +
                "10. Metoda CozaLozaWoza\n" +
                "11. Multiplication Table");
    }

    /**
     * Selecteaza o optiune din meniul Logical Operations WHILE
     */
    private boolean selectItemWHILEMenu() {
        System.out.print("\rSelect the logical operation: ");
        int numberFromUser = read.getInt();
        switch (numberFromUser) {
            case 1:
                printWhileTo100FromNr();
                logic.wait(2);
                return true;
            case 2:
                printWhileToMinus100FromNr();
                logic.wait(2);
                return true;
            case 3:
                printWhileCountBetweenNr();
                logic.wait(2);
                return true;
            case 4:
                printWhileCountToHighest();
                logic.wait(2);
                return true;
            case 5:
                printWhileEvenNrsTo100();
                logic.wait(2);
                return true;
            case 6:
                printWhileOddNrsTo100();
                logic.wait(2);
                return true;
            case 7:
                meanBySeven();
                logic.wait(2);
                return true;
            case 8:
                meanTo100();
                logic.wait(2);
                return true;
            case 9:
                Fibonacci();
                logic.wait(2);
                return true;
            case 10:
                CozaLozaWoza();
                logic.wait(2);
                return true;
            case 11:
                multiplicationTable();
                logic.wait(2);
                return true;
            case 0:
                System.out.println("Return to Logical Operations menu.");
                return false;
            default:
                System.out.println("Try again!");
                return true;
        }
    }

    private void printWhileTo100FromNr() {
        logic.printTo100While(getFirstNr());
    }

    private void printWhileToMinus100FromNr() {
        logic.printToMinus100While(getFirstNr());
    }

    private void printWhileCountBetweenNr() {
        logic.printCountBetweenNumbersWhile(getFirstNr(), getSecondNr());
    }

    private void printWhileCountToHighest() {
        logic.printCountToHighestWhile(getFirstNr(), getSecondNr());
    }

    private void printWhileEvenNrsTo100() {
        logic.printCountEvenNrWhile();
    }

    private void printWhileOddNrsTo100() {
        logic.printCountOddNrWhile();
    }

    private void meanBySeven() {
        int x = getFirstNr();
        int y = getSecondNr();
        System.out.println("Media numerelor divizibile cu 7 din intervalul " + x + " - " + y +
                " este: " + logic.meanBy7(x, y));
    }

    private void Fibonacci() {
        int x = getFirstNr();
        System.out.println("Primele " + x + " numere din sirul lui Fibonacci sunt: ");
        logic.first20NrOfFibonacci(x);
    }

    private void CozaLozaWoza() {
        logic.cozaLozaWoza();
    }

    private void multiplicationTable() {
        logic.tablaInmultirii();
    }

    /**
     * Afiseaza meniul pentru Logical Operations pentru ARRAY cat timp este selectata o optiune
     */
    private void runLogicalOpARRAYMenu() {
        do {
            printLogicalArrayMenu();

        } while (selectItemArrayMenu());
    }

    /**
     * Meniul Logical Operations ARRAY
     */
    private void printLogicalArrayMenu() {
        System.out.println("\n0. Return to Logical Operations menu.\n" +
                "1. Create one Array with numbers from 1 to 100\n" +
                "2. Print even numbers from 1 to 100\n" +
                "3. Find the average from an Array\n" +
                "4. Find if a String belongs to a given String Array\n" +
                "5. Get position of a number in an Array\n" +
                "6. Return an array without a given number\n" +
                "7. Find the second smallest number in an Array\n" +
                "8. Insert a number to a given index\n" +
                "9. Find Min and Max in a given Array\n" +
                "10. Invert values in an Array\n" +
                "11. Print duplicate values in an Array\n" +
                "12. Sort ascending an unsorted Array");
    }

    /**
     * Selecteaza o optiune din meniul Logical Operations ARRAY
     */
    private boolean selectItemArrayMenu() {
        System.out.print("\rSelect the logical operation: ");
        int numberFromUser = read.getInt();
        switch (numberFromUser) {
            case 1:
                getArrayTo100();
                logic.wait(2);
                return true;
            case 2:
                getEvenArray();
                logic.wait(2);
                return true;
            case 3:
                getAverageInArray();
                logic.wait(2);
                return true;
            case 4:
                checkStringInArray();
                logic.wait(2);
                return true;
            case 5:
                getIndex();
                logic.wait(2);
                return true;
            case 6:
                removeNrFromArray();
                logic.wait(2);
                return true;
            case 7:
                getSecondSmallestInArray();
                logic.wait(2);
                return true;
            case 8:
                insertNrInArray();
                logic.wait(2);
                return true;
            case 9:
                getMinMaxInArray();
                logic.wait(2);
                return true;
            case 10:
                invertArray();
                logic.wait(2);
                return true;
            case 11:
                findDuplicateInArray();
                logic.wait(2);
                return true;
            case 12:
                sortUpArray();
                logic.wait(2);
                return true;
            case 0:
                System.out.println("Return to Logical Operations menu.");
                return false;
            default:
                System.out.println("Try again!");
                return true;
        }
    }

    private void getArrayTo100() {
        System.out.println("Array-ul de 100 de numere este:");
        int[] myArray = logic.getArrayToHundred();
        for (int i = 0; i < myArray.length; i++) {
            if (i % 25 == 0)
                System.out.println('\r');
            System.out.print(myArray[i] + " ");
        }
    }

    private void getEvenArray() {
        System.out.println("Numerele pare dintr-un array de 100 de numere sunt: ");
        int[] smallArray = new int[50];
        int[] evenArray = logic.getEvenArrayToHundred(smallArray);
        for (int i = 0; i < smallArray.length; i++) {
            if (i % 25 == 0)
                System.out.println('\r');
            System.out.print(evenArray[i] + " ");
        }
        System.out.println('\n');
    }

    private int[] readIntArray() {
        System.out.print("Introduceti dimensiunea array-ului: ");
        int arraySize = read.getInt();
        int[] customArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Introduceti valoarea de pe pozitia " + (i + 1) + ": ");
            customArray[i] = read.getInt();
        }
        System.out.println("Array-ul dat este: " + Arrays.toString(customArray));
        return customArray;
    }

    private String[] readStringArray() {
        System.out.print("Introduceti dimensiunea array-ului: ");
        int arraySize = read.getInt();
        String[] customStringArray = new String[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Introduceti textul de pe pozitia " + (i + 1) + ": ");
            customStringArray[i] = read.getString();
        }
        System.out.println("Array-ul introdus este: " + Arrays.toString(customStringArray));
        return customStringArray;
    }

    private void getAverageInArray() {
        int[] localArr = readIntArray();
        System.out.println("Media numerelor din array-ul dat este: " + logic.getAverageArray(localArr));
    }

    private void checkStringInArray() {
        String[] myArray = readStringArray();
        System.out.print("Introduceti textul cautat: ");
        String strFind = read.getString();

        if (logic.checkInArray(readStringArray(), strFind))
            System.out.println("Stringul cautat, " + strFind + ", " +
                    "se afla in array-ul " + Arrays.toString(myArray) + ".");
        else
            System.out.println("Stringul cautat, " + strFind + ", " +
                    "nu se afla in array-ul " + Arrays.toString(myArray) + ".");
    }

    private void getIndex() {
        int[] myInt = readIntArray();
        System.out.print("Introduceti numarul cautat: ");
        int j = read.getInt();
        int index = logic.getPositionInArray(myInt, j);
        if (index >= 0)
            System.out.println("Numarul " + j + " se afla in array pe pozitia " + (index + 1) + ".");
        else {
            System.out.println("Numarul " + j + " nu se afla in array.");
        }
    }

    private void removeNrFromArray() {
        int[] myArr = readIntArray();
        System.out.print("Introduceti numarul pe care il scoateti din array: ");
        int j = read.getInt();
        int[] newArray = logic.removeNrFromArray(myArr, j);
        System.out.print("Array-ul fara numarul " + j + " este: " + Arrays.toString(newArray));
        System.out.println('\n');
    }

    private void getSecondSmallestInArray() {
        int[] myArr = readIntArray();
        int smallestNr = logic.getSecondSmallestNrInArray(myArr);
        System.out.println("Al doilea cel mai mic numar din array-ul dat este: " + smallestNr + "." + '\n');
    }

    private void insertNrInArray() {
        int[] myArr = readIntArray();
        System.out.print("Introduceti numarul care sa fie adaugat in array: ");
        int nr = read.getInt();
        boolean repeat;
        do {
            System.out.print("Introduceti pozitia pe care sa fie inserat numarul: ");
            int ind = read.getInt();
            try {
                repeat = false;
                int[] finalArray = logic.insertElement(myArr, ind, nr);
                System.out.print("Array-ul final este: " + Arrays.toString(finalArray));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Numarul introdus depaseste marimea array-ului.");
                repeat = true;
            }

        } while (repeat);
        System.out.println('\n');
    }

    private void getMinMaxInArray() {
        int[] myArr = readIntArray();
        logic.getMinMaxFromArray(myArr);
    }

    private void invertArray() {
        int[] firstArr = readIntArray();
        int[] invertedArr = logic.invertArray(firstArr);
        System.out.println("Array-ul inversat este: " + Arrays.toString(invertedArr) + '\n');

    }

    private void findDuplicateInArray() {
        int[] myArr = readIntArray();
        int[] duplicateVal = logic.findDuplicate(myArr);
        System.out.print("Valorile duplicate din array-ul dat sunt: " + Arrays.toString(duplicateVal) + '\n');
    }

    private void sortUpArray() {
        int[] myArr = readIntArray();
        int[] sortedArr = logic.sortUpArray(myArr);
        System.out.print("Array-ul ordonat crescator este: " + Arrays.toString(sortedArr) + '\n');
    }

    /**
     * Afiseaza meniul pentru Logical Operations pentru LIST cat timp este selectata o optiune
     */
    private void runLogicalOpLISTMenu() {
        do {
            printLogicalListMenu();

        } while (selectItemListMenu());
    }

    /**
     * Meniul Logical Operations LIST
     */
    private void printLogicalListMenu() {
        System.out.println("\n0. Return to Logical Operations menu.\n" +
                "1. Print values inside a custom List\n" +
                "2. Add one number to a List\n" +
                "3. Print values inside a list starting from a value\n" +
                "4. Print a list in reverse order\n" +
                "5. Add a string to a List in a given position\n" +
                "6. Print values and their position inside a List\n" +
                "7. Find the greatest value in a List\n" +
                "8. Change the position of two elements in a List\n" +
                "9. Print even numbers from a given List\n" +
                "10. Sort ascending a random List\n");
    }

    /**
     * Selecteaza o optiune din meniul Logical Operations LIST
     */
    private boolean selectItemListMenu() {
        System.out.print("\rSelect the logical operation: ");
        int numberFromUser = read.getInt();
        switch (numberFromUser) {
            case 1:
                getValuesInList();
                logic.wait(2);
                return true;
            case 2:
                addNrToList();
                logic.wait(2);
                return true;
            case 3:
                getListFromNr();
                logic.wait(2);
                return true;
            case 4:
                reverseList();
                logic.wait(2);
                return true;
            case 5:
                addStringToIndexList();
                logic.wait(2);
                return true;
            case 6:
                printValuesAndIndexList();
                logic.wait(2);
                return true;
            case 7:
                getLargestNrInList();
                logic.wait(2);
                return true;
            case 8:
                changeIndexList();
                logic.wait(2);
                return true;
            case 9:
                printEvenList();
                logic.wait(2);
                return true;
            case 10:
                sortUpList();
                logic.wait(2);
                return true;
            case 0:
                System.out.println("Return to Logical Operations menu.");
                return false;
            default:
                System.out.println("Try again!");
                return true;
        }
    }

    private void getValuesInList() {
        List<Integer> myList = read.getList();
        System.out.println(myList.toString());
    }

    private void addNrToList() {
        List<Integer> myList = read.getList();
        System.out.println(myList.toString());
        System.out.print("Introduceti numarul care trebuie adaugat in lista: ");
        int n = read.getInt();
        logic.addNrToList(myList, n);
        System.out.print("Numarul " + n + " a fost adaugat la sfarsitul listei: " + myList.toString() + '\n');
    }

    private void getListFromNr() {
        List<Integer> myList = read.getList();
        System.out.println(myList.toString());
        boolean repeat;
        do {
            System.out.print("\nIntroduceti numarul de la care sa fie afisata lista: ");
            int n = read.getInt();
            if (myList.contains(n)) {
                System.out.println("Numerele din lista, incepand cu numarul " + n + " sunt: ");
                logic.printListFromNr(myList, n);
                System.out.println('\r');
                repeat = false;
            } else {
                System.out.println("Numarul introdus nu face parte din lista data.");
                repeat = true;
            }
        } while (repeat);
    }

    private void reverseList() {
        List<Integer> myList = read.getList();
        System.out.println(myList.toString());
        System.out.println("Lista in sens invers este:");
        logic.printListBackward(myList);
    }

    private void addStringToIndexList() {
        List<String> myList = read.getStringList();
        System.out.println(myList.toString());
        System.out.print("Introduceti textul pe care il adaugati in lista: ");
        String strNew = read.getString();
        boolean repeat;
        do {
            System.out.print("\nIntroduceti pozitia pe care sa fie pus textul in lista: ");
            int n = read.getInt();
            if (n <= myList.size()) {
                System.out.println("Lista finala este: " + logic.addStringToList(myList, n, strNew));
                System.out.println('\r');
                repeat = false;
            } else {
                System.out.println("Pozitia introdusa depaseste marimea listei.");
                repeat = true;
            }
        } while (repeat);

    }

    private void printValuesAndIndexList() {
        List<Integer> myList = read.getList();
        System.out.println(myList.toString());
        logic.printEachValueInList(myList);
    }

    private void getLargestNrInList() {
        List<Integer> myList = read.getList();
        System.out.println(myList.toString());
        System.out.println("Cel mai mare numar din lista introdusa este: " +
                logic.printBiggestMemberInList(myList) + ".");
    }

    private void changeIndexList() {
        List<Integer> myList = read.getList();
        System.out.println(myList.toString());
        boolean repeat;
        do {
            System.out.print("Introduceti primul numar a carui pozitie o schimbati: ");
            int a = read.getInt();
            System.out.print("Introduceti al doilea numar pe care il schimbati: ");
            int b = read.getInt();
            if (myList.contains(a) && myList.contains(b)) {
                List<Integer> changedList = logic.changePositionInList(myList, a, b);
                System.out.print("Lista cu ordinea schimbata este: " + changedList.toString() + ".\n");
                repeat = false;
            } else {
                System.out.println("\nNumerele introduse nu fac parte din lista data!\n");
                repeat = true;
            }
        } while (repeat);
    }

    private void printEvenList() {
        List<Integer> myList = read.getList();
        System.out.println(myList.toString());
        System.out.print("Numerele pare din lista data sunt: " + logic.returnEvenList(myList).toString() + ".\n");
    }

    private void sortUpList() {
        List<Integer> myList = read.getList();
        System.out.println(myList.toString());
        System.out.println("Lista sortata crescator este: " + logic.sortedList(myList).toString() + ".\n");
    }

    /**
     * Continua sa afiseze meniul DRAW cat timp este selectata o optiune
     */
    private void runDrawingsMenu() {
        do {
            printDrawingsMenu();

        } while (selectItemFromDrawingsMenu());
    }

    /**
     * Afiseaza meniul DRAW
     **/
    private void printDrawingsMenu() {
        System.out.println("\n0. Return to main menu.\n" +
                "1. Draw Stars\n" +
                "2. Draw Lines\n" +
                "3. Draw a Face\n" +
                "4. Draw JAVA\n");

    }

    /**
     * Selecteaza o optiune din meniu DRAW
     */
    private boolean selectItemFromDrawingsMenu() {
        System.out.print("\nPlease select one menu number: ");
        int numberFromUser = read.getInt();
        switch (numberFromUser) {
            case 1:
                drawStars();
                logic.wait(2);
                return true;
            case 2:
                drawLines();
                logic.wait(2);
                return true;
            case 3:
                drawFace();
                logic.wait(2);
                return true;
            case 4:
                drawJava();
                logic.wait(2);
                return true;
            case 0:
                System.out.println("Return to main menu.");
                return false;
            default:
                System.out.println("Try again!");
                return true;
        }
    }

    private void drawStars() {
        logic.drawStars();
    }

    private void drawLines() {
        logic.drawLines();
    }

    private void drawFace() {
        logic.drawFace();
    }

    private void drawJava() {
        logic.drawJava();
    }
}