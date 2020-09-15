import java.util.Scanner;
/**
 * a program to calculate cost of pizza
 * @author Darian Pajic
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  // ask the user what size pizza they want
  System.out.println("What is the size of the pizza (in cm):");
  double size = input.nextDouble();

  // assign variables
  double diameter = size * 0.50;
  double labour = 0.75;
  double power = 0.99;

  // find the price of the pizza
  double sum = diameter + labour + power;
  System.out.println("Subtotal: $" + sum);

  // find the price of the tax
  double tax = sum * 0.13;
  System.out.println("Taxes: $" + tax);

  // find total price of pizza
  double total = sum + tax;
  System.out.println("Total: $" + total);

  // print a message to the customer
  if (size >= 1 && size <= 20){
    System.out.println("We are going to make you a cute little pizza!");
  }else if (size > 20 && size <= 40){
    System.out.println("This will be delicious!");
  }else if (size > 40){
    System.out.println("Whoa, big pizza! You might need a truck to get this home!");
  }



    
  }
}
