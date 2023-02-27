import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

//pusedo code of my current project
//1. create do while loop
//2. create a menu that will allow the user to choose which method they want to run
//3. create a method for each option


public class Main { //Main class
    public static void main(String[] args) { //Main method
        do { //Do while loop

            //todo: create a menu that will allow the user to choose which method they want to run


            //Main menu//
            System.out.println("1. Greeting");
            System.out.println("2. Greeting with name");
            System.out.println("3. Age");
            System.out.println("4. Add two numbers");
            System.out.println("5. Even or odd");
            System.out.println("6. Return even or odd");
            System.out.println("7. Celsius to Fahrenheit");
            System.out.println("8. Square area");
            System.out.println("9. Right angle triangle");
            System.out.println("10. Circle circumference and area");
            System.out.println("11. Dice rolls");
            System.out.println("12. Returns lowest number");
            System.out.println("13. Returns highest number");
            System.out.println("14. Is prime");
            System.out.println("15. Exponent");
            System.out.println("16. Price with tax/moms");
            System.out.println("17. Exit");
            //End of main menu//

            //options//
            Scanner scanner1 = new Scanner(System.in);
            int choice = scanner1.nextInt();

            switch (choice) {
                case 1 -> greeting();
                case 2 -> greetingWithName();
                case 3 -> age();
                case 4 -> addtwoNumbers();
                case 5 -> evenOrOdd();
                case 6 -> ReturnEvenOrOdd();
                case 7 -> CelsiusToFahrenheit();
                case 8 -> SquareArea();
                case 9 -> RightAngleTriangle();
                case 10 -> CircleCircumArea();
                case 11 -> DiceRolls();
                case 12 -> ReturnsLowestNumber();
                case 13 -> ReturnsHighestNumber();
                case 14 -> IsPrime();
                case 15 -> Exponent();
                case 16 -> PriceMoms();
                case 17 -> System.exit(0);

                default -> System.out.println("Invalid choice");
            }

            //End of options//

            System.out.println("Do you want to continue? (Y/N)"); //Asks if you want to continue
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (answer.equals("Y")) { //If "y" continue
                continue;
            } else { //If "N" break
                break;
            }
        } while (true); //Loop until break is called
    }
    private static void greeting() { //Greeting method
        System.out.println("Hello!");
    }
    private static void greetingWithName() { //Greeting with name method
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
    }
    private static void age() { //Age method
        System.out.println("How old are you?");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You are over 18");
        } else {
            System.out.println("You are under 18");
        }
    }
    private static void addtwoNumbers() { //Add two numbers method
        System.out.println("Enter two numbers");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int sum = number1 + number2;
        System.out.println("The sum of the two numbers is " + sum);
    }
    private static void evenOrOdd() { //Even or odd method
        System.out.println("Please Enter a number to see if it's even or odd");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) { // % is the modulus operator
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
     private static void ReturnEvenOrOdd() { //Even or odd method
        System.out.println("Please Enter a number to see if it's even or odd");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) { // % is the modulus operator
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
    private static void CelsiusToFahrenheit() { //Celsius to Fahrenheit method
        //Fahrenheit = (Celsius / 5.0) * 9 + 32
        //celcius = (fahrenheit - 32) * 5.0 / 9
        System.out.println("Please enter a temperature in Celsius");
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius / 5.0) * 9 + 32;
        System.out.println("The temperature in Fahrenheit is " + fahrenheit);

        }
    private static void SquareArea() { //Square to area method
        System.out.println("Please enter the length of the square");
        Scanner scanner = new Scanner(System.in);

        double length = scanner.nextDouble();
        double base = scanner.nextDouble();
        double area = length * base;
        System.out.println("The area of the square is " + area);
    }
    private static void RightAngleTriangle() { //Right angle triangle to area method

        System.out.println("Please enter the length of the Triangle");
        Scanner scanner = new Scanner(System.in);

        //A = (½)×b×h square units
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        double area = (0.5) * base * height;
        System.out.println("The area of the triangle is " + area);
    }
    private static void CircleCircumArea() { //Circle to circumference and area method
        System.out.println("Please enter the radius of the circle");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("The circumference of the circle is " + circumference);
        System.out.println("The area of the circle is " + area);
    }
    public static void DiceRolls() { //returns a random number between 1 and 6
        System.out.println("Enter two numbers");
        Scanner scanner = new Scanner(System.in);
        int NumberOfRolls = scanner.nextInt();
        int random = (int) (Math.random() * 6) + NumberOfRolls;
        System.out.println("you rolled a " + random);
    }
    public static void ReturnsLowestNumber() { //returns the lowest number
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
       //enter two numbers
        System.out.println("Enter two numbers");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        numbers.add(number1);
        numbers.add(number2);
    }

    public static void ReturnsHighestNumber() { //returns the highest number
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();


        System.out.println("Enter two numbers");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        numbers.add(number1);
        numbers.add(number2);

        int highestNumber = Collections.max(numbers);
        System.out.println("The highest number is " + highestNumber);
}
    public static void IsPrime() { //returns true if the number is prime
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                break;
            }
        }
    }
    public static void Exponent() { //returns the result of the exponent
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        System.out.println("Enter an exponent");
        int exponent = input.nextInt();
        int result = (int) Math.pow(number, exponent);
        System.out.println("The result is " + result);

    }

    public static void PriceMoms() { //returns the price with moms
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a price");
        double price = input.nextDouble();
        System.out.println("Enter country code");
        String countryCode = input.next();
        double moms = 0;

        switch (countryCode) {
            case "DK" -> moms = 0.25;
            case "SE" -> moms = 30;
            case "NO" -> moms = 0.24;
            case "DE" -> moms = 0.19;

            default -> System.out.println("Invalid country code");

        }
        double PriceWithMoms = price * moms;
        System.out.println("The price with moms is " + PriceWithMoms);
    }
}








