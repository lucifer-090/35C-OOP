
import java.util.Scanner;
public class Week3task {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        /* Qno.1 Write a JAVA program to find the maximum between three numbers. */
        int a=10 , b=20 , c=18;
        if (a>b && a>c){
            System.out.println("a is maximum number.");
        }else if (b>a && b>c){
            System.out.println("b is maximum number.");
        }else if (c>a && c>b){
            System.out.println("c is maximum number.");
        }else{}


        /* Qno.2 Write a JAVA program to check whether a number is negative, positive, or zero. */
        int num = 9;
        if (num >0){
            System.out.println("It is a positive number.");
        }else if (num <0){
            System.out.println("It is a negative number.");
        }else{
            System.out.println("It is a zero.");
        }



        /* Qno.3 Write a JAVA program to check whether a number is divisible by 5 and 11 or not. */
        System.out.println("Enter a number:");
        double nm = info.nextDouble();
        if (nm % 5 ==0){
            System.out.println("The number is divisible by 5");
        }else if (nm % 11 ==0){
            System.out.println("The number is divisible by 11");
        }else{
            System.out.println("The number is not divisible by 5 and 11");
        }



        /* Qno.4 Write a JAVA program to check whether a number is even or odd. */
        System.out.println("Enter a number:");
        double m = info.nextDouble();
        if (m % 2 ==0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }


        /* Qno.5 Write a JAVA program to check whether a year is a leap year or not. 
                 Hint: if year%4==0; if year%100!==0 ; year%400==0 */
        System.out.println("Enter a year");
        int y = info.nextInt();
        if ((y % 4==0 && y % 100 !=0) || y % 400 ==0){
            System.out.println(y+ " is a leap year.");
        }else{
            System.out.println(y+ " is not a leap year. ");
        }


        /* Qno. 6 Write a JAVA program to input any alphabet and check whether it is vowel or consonant. */
        System.out.println("Enter an alphabet:");
        char alpha = info.next().toLowerCase().charAt(0);
        if ((alpha=='a' || alpha=='e' || alpha=='i' || alpha=='o' || alpha=='u')){
            System.out.println(alpha+ " is a vowel letter.");
        }else{
            System.out.println(alpha+ " is consonant.");
        }




        //Some switch case Statements Questions.
        /* Qno.1 Write a Java program that takes a student's grade as input (A, B, C, D, or F) 
           and converts it to the corresponding GPA value. Use a switch case statement to handle different grades. */
        
        System.out.println("Enter student's grade:");
        char grade = info.next().toUpperCase().charAt(0);
        
        switch (grade) {
            case 'A':
                System.out.println("4.0 gpa");
                break;
            case 'B':
                System.out.println("3.0 gpa");
                break;
            case 'C':
                System.out.println("2.0 gpa");
                break;
            case 'D':
                System.out.println("1.0 gpa");
                break;
            case 'F':
                System.out.println("0.0 gpa");
            default:
                System.out.println("Invalid grade");
                break;
        }



        /* Qno.2 Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs 
                 and performs the corresponding arithmetic operation using a switch case statement. */
        System.out.println("Enter the first number:");
        double num1 = info.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = info.nextDouble();
        System.out.println("Enter operator(+,-,*,/)");
        char operator = info.next().charAt(0);

        switch (operator) {
            case '+':
                double result = num1+num2;
                System.err.println("Addition:" +result);
                break;
            case '-':
                double result1 = num1-num2;
                System.out.println("Subtraction:" +result1);
                break;
            case '*':
                double result2 = num1*num2;
                System.out.println("Multiplication:" +result2);
                break;
            case '/':
                double result3 = num1/num2;
                System.out.println("Division:" +result3);
                break;
            default:
                System.out.println("Invalid operator.");                
                break;
        }
        
        
        
        /* Qno.3 Write a Java program that takes an integer input (1 to 12) representing a month and prints the corresponding season.
           (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case. */
        
        System.out.println("Enter a month (1 to 12):");
        int month = info.nextInt();

        switch (month) {
            case 1,2,3:
                System.out.println("Winter Season.");
                break;
            case 4,5,6:
                System.out.println("Spring Season");
                break;
            case 7,8,9:
                System.out.println("Summer Season");
                break;
            case 10,11,12:
                System.out.println("Fall Season");
                break;
            default:
                System.out.println("Invalid Month");
                break;
        }


        /* Qno.4 Implement a Java program that calculates the area of different shapes 
           (circle, rectangle, square, triangle) based on the user's choice using a switch case.*/
        
        System.out.println("Different Shapes:");
        System.out.println("1. Circle\n2. Rectangle\n3. Square\n4. Triangle ");
        System.out.println("Enter your choice(1-4):");
        int choose = info.nextInt();

        switch (choose) {
            case 1:
                System.out.println("Enter radius of circle:");
                double r = info.nextDouble();
                double A1 = Math.PI * r * r;
                System.out.println("The area of circle is" +A1);
                break;
            case 2:
                System.out.println("Enter length of rectangle:");
                double l = info.nextDouble();
                System.out.println("Enter width of rectangle:");
                double w = info.nextDouble();
                double A2 = l * w;
                System.out.println("The area of rectangle is" +A2);
                break;
            case 3:
                System.out.println("Enter side length of square:");
                double side = info.nextDouble();
                double A3 = side * side;
                System.out.println("The area of square is" +A3);
                break;
            case 4:
                System.out.println("Enter base of triangle:");
                double bs = info.nextDouble();
                System.out.println("Enter height of triangle:");
                double h = info.nextDouble();
                double A4 = (0.5)*bs*h;
                System.out.println("The area of triangle is" +A4);
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }

        info.close();
            
        
        
    }
}
