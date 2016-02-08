//import ArrayList of Java codebase so we can use ArrayLists in our method
import java.util.ArrayList;

//import console portion of Java codebase so we can collect user input and output to screen
import java.io.Console;


public class PingPong {
  public static void main(String[] args) {

    //create an empty ArrayList to store results of isPingPong method
    ArrayList<Object> array = new ArrayList<Object>();

    //create console variable
    Console myConsole = System.console();

    //ask user for a number
    System.out.println("Give me a number");

    //store user response in an Intger variable
    Integer userNumber = Integer.parseInt(myConsole.readLine());

    //for each number from 1 to the number entered by the user, run that number through the isPingPong method and insert the result into the ArrayList called array
    for (Integer index = 1; index <= userNumber ; index++ ) {
      array.add(isPingPong(index));
    }

    //print out contents of the ArrayList variable called array
    System.out.println(array);

  }
  public static String isPingPong(Integer number) {

    if (number % 15 == 0) {
      return "pingpong";
    } else if (number % 5 == 0) {
      return "pong";
    } else if(number % 3 == 0) {
    return "ping";
    } else {
    return number.toString();
    }
}
}
