import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Which term in the Fibonacci sequence would you like to know?");


    int number =4;

    //do while loop (we use this when we always want the loop to run at least one time)

    do{
      number = input.nextInt();
      if(number < 2){
        System.out.println("Please choose a number 2 or greater.");
      }
    }while(number < 2);

  int currentNum = 1;
  int previousNum = 0;
  int nextNum = 0;


  System.out.println("0");
  System.out.println("1");
  
  for(int i =1; i < number; i++){
    nextNum = currentNum + previousNum;
    previousNum = currentNum;
    currentNum = nextNum;
    System.out.println(currentNum); 
    // This will print this out every time the loop runs
  }
  }
}