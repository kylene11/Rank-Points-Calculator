import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> listOfGrades = new ArrayList<String>();
    listOfGrades.add("A");
    listOfGrades.add("a");
    listOfGrades.add("B");
    listOfGrades.add("b");
    listOfGrades.add("C");
    listOfGrades.add("c");
    listOfGrades.add("D");
    listOfGrades.add("d");
    listOfGrades.add("E");
    listOfGrades.add("e");
    listOfGrades.add("S");
    listOfGrades.add("s");
    listOfGrades.add("U");
    listOfGrades.add("u");

        double firsth2 = 0;
        double secondh2 = 0;
        double thirdh2 = 0;
        double weakesth2orh1 = 0;
        double gp = 0;
        double pw = 0;
        Scanner scanner = new Scanner(System.in);


        System.out.println("What did you get for your highest scoring H2 subject?");
        String firstgrade = scanner.next();
        while (!(listOfGrades.contains(firstgrade))){

                System.out.println("Please enter a real grade");
            scanner.reset();
            firstgrade= scanner.next();
        }

        switch (firstgrade) {
            case "A", "a" -> firsth2 = 20;
            case "B", "b" -> firsth2 = 17.5;
            case "C", "c" -> firsth2 = 15;
            case "D", "d" -> firsth2 = 12.5;
            case "E", "e" -> firsth2 = 10;
            case "S", "s" -> firsth2 = 5;
            case "U", "u" -> firsth2 = 0;
        }

        System.out.println("What did you get for your second highest scoring H2 subject?");
        String secondgrade = scanner.next();
        while (!(listOfGrades.contains(secondgrade))){

            System.out.println("Please enter a real grade");
            scanner.reset();
            secondgrade= scanner.next();
        }

        switch (secondgrade) {
                    case "A", "a" -> secondh2 = 20;
                    case "B", "b" -> secondh2 = 17.5;
                    case "C", "c" -> secondh2 = 15;
                    case "D", "d" -> secondh2 = 12.5;
                    case "E", "e" -> secondh2 = 10;
                    case "S", "s" -> secondh2 = 5;
                    case "U", "u" -> secondh2 = 0;
                }

        System.out.println("What did you get for your third highest scoring H2 subject?");
        String thirdgrade = scanner.next();
        while (!(listOfGrades.contains(thirdgrade))){

            System.out.println("Please enter a real grade");
            scanner.reset();
            thirdgrade= scanner.next();
        }


        switch (thirdgrade) {
                    case "A", "a" -> thirdh2 = 20;
                    case "B", "b" -> thirdh2 = 17.5;
                    case "C", "c" -> thirdh2 = 15;
                    case "D", "d" -> thirdh2 = 12.5;
                    case "E", "e" -> thirdh2 = 10;
                    case "S", "s" -> thirdh2 = 5;
                    case "U", "u" -> thirdh2 = 0;
                }

                System.out.println("What did you get for your H1/ weakest fourth H2 subject?");
        String fourthgrade = scanner.next();
        while (!(listOfGrades.contains(fourthgrade))){

            System.out.println("Please enter a real grade");
            scanner.reset();
            fourthgrade= scanner.next();
        }

        switch (fourthgrade) {
                    case "A", "a" -> weakesth2orh1 = 10;
                    case "B", "b" -> weakesth2orh1 = 8.75;
                    case "C", "c" -> weakesth2orh1 = 7.5;
                    case "D", "d" -> weakesth2orh1 = 6.25;
                    case "E", "e" -> weakesth2orh1 = 5;
                    case "S", "s" -> weakesth2orh1 = 2.5;
                    case "U", "u" -> weakesth2orh1 = 0;
                }

         System.out.println("What did you get for GP?");
        String gpgrade = scanner.next();
        while (!(listOfGrades.contains(gpgrade))){

            System.out.println("Please enter a real grade");
            scanner.reset();
            gpgrade= scanner.next();
        }

        switch (gpgrade) {
                    case "A", "a" -> gp = 10;
                    case "B", "b" -> gp = 8.75;
                    case "C", "c" -> gp = 7.5;
                    case "D", "d" -> gp = 6.25;
                    case "E", "e" -> gp = 5;
                    case "S", "s" -> gp = 2.5;
                }

                System.out.println("What did you get for PW?");
        String pwgrade = scanner.next();
        while (!(listOfGrades.contains(pwgrade))){

            System.out.println("Please enter a real grade");
            scanner.reset();
           pwgrade= scanner.next();
        }

        switch (pwgrade) {
                    case "A", "a" -> pw = 10;
                    case "B", "b" -> pw = 8.75;
                    case "C", "c" -> pw = 7.5;
                    case "D", "d" -> pw = 6.25;
                    case "E", "e" -> pw = 5;
                    case "S", "s" -> pw = 2.5;
                    case "U", "u" -> pw = 0;
                }

                System.out.println("Your rp is " + (firsth2 + secondh2 + thirdh2 + weakesth2orh1 + gp + pw));

            }
        }
