package Activity1;
import java.util.Scanner;

public class mainShape {
    
    public static void main(String[] args)
    {
    try {
        Shape shape = new Shape();
        int counter = 0;
        Square newSquare = new Square();
        Rectangle newRect = new Rectangle();
        Circle newCircle = new Circle();
        Scanner scanner = new Scanner(System.in);
        
        int inputNumber1, inputNumber2;
        

        
        do
        {

            System.out.println("Calculate the area:");
            System.out.println("-------------------");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            counter = scanner.nextInt();
            
            switch (counter) {
                case 1:
                    System.out.print("Enter the length of the square: ");
                    inputNumber1 = scanner.nextInt();
                    shape.setinput1(inputNumber1);
                    newSquare.getresults();
                    break;
                case 2:
                    System.out.print("Enter the length of the rectangle: ");
                    inputNumber1 = scanner.nextInt();
                    System.out.print("Enter the Width of the rectangle: ");
                    inputNumber2 = scanner.nextInt();
                    
                    shape.setinput1(inputNumber1);
                    shape.setinput2(inputNumber2);
                    newRect.getresults();
                    break;

                case 3:
                    System.out.print("Enter the radius of the circle: ");
                    inputNumber1 = scanner.nextInt();
                    shape.setinput1(inputNumber1);
                    newCircle.getresults();
                    break;

                case 4:
                    System.out.println("Exiting the program");
                    break;

                default:
                    System.out.println("You have entered a wrong number");
                    break;
            }
            


        } while (counter != 4);
       
    } finally {
        scanner.close();
    }
    
        
    }

}
   

