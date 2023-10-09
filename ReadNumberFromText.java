import java.util.Scanner;

public class ReadNumberFromText {
    public static void main(String[] args) {
        /*
            input: 2 , 23 , 17
            output: two, twenty three, seventeen
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        String number = scanner.nextLine();

        int n = number.length();
        switch (n) {
            case 1:
                System.out.println(readOne(number));
                break;
            case 2:
                System.out.println(readTwo(number));
                break;

        }
    }

    public static String readOne(String number) {
        String message = "";
        switch (number) {
            case "0":
                message = "Zero";
                break;
            case "1":
                message = "One";
                break;
            case "2":
                message = "Two";
                break;
            case "3":
                message = "three";
                break;
            case "4":
                message = "Four";
                break;
            case "5":
                message = "Five";
                break;

        }
        return message;
    }

    public static String readTwo(String number) {
        String message = "";
        int valueNumber = Integer.parseInt(number);
        if (valueNumber < 20) {
            switch (valueNumber) {
                case 10:
                    message = "Ten";
                    break;
                case 11:
                    message = "Eleven";
                    break;
                case 12:
                    message = "Twelve";
                    break;
                case 19:
                    message = "Nineteen";
                    break;
            }
        } else {
            int numberDozens = valueNumber / 10;
            int numberOneDigit = valueNumber % 10;
            switch(numberDozens) {
                case 2:
                    message = "Twenty " + readOne(Integer.toString(numberOneDigit) );
                    break;
                case 3:
                    message = "Thirty " + readOne(Integer.toString(numberOneDigit));
                    break;
                case 4:
                    message = "Forty " + readOne(Integer.toString(numberOneDigit));
                    break;
            }
        }
        return message;
    }
}
