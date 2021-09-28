package net.htlgkr.OberndorferF190097.hausuebung1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInputReader = new Scanner(System.in);
        boolean run = true;
        
        System.out.println("Select upper limit:");
        int o = userInputReader.nextInt();
        userInputReader.nextLine();
        
        EratosthenesPrimeSieve eps = new EratosthenesPrimeSieve(o);
        
        while(run){
            menue();
            int userInput = userInputReader.nextInt();
            userInputReader.nextLine();
            
            switch(userInput){
                case 1:
                    System.out.println("Select number to check:");
                    int n = userInputReader.nextInt();
                    userInputReader.nextLine();
                    
                    if(eps.isPrime(n)){
                        System.out.println("It is a Prime number!");
                    }
                    else{
                        System.out.println("It is not a Prime number!");
                    }
                    break;
                case 2:
                    eps.printPrimes();
                    break;
                case 3:
                    eps.ngPrimeCalculation();
                    break;
                case 4:
                    run = false;
                    break;    
                default:
                    System.out.println("Error!");
                    break;
            }
        }
    }
    
    public static void menue(){
        System.out.println("1 ... isPrime");
        System.out.println("2 ... printPrimes");
        System.out.println("3 ... ngPrimeCalculation");
        System.out.println("4 ... End ");
        
        System.out.println("Select:");
    }
}
