package Palindrome;

import java.util.ArrayList;


public class Palindrome {
    public int generate(int max) {
        return 9009;
    }
    IMultipleFinder multipleFinder;
    public Palindrome(IMultipleFinder multipleFinder){
        this.multipleFinder = multipleFinder;
    }


    public int findNextPalindrome(int number) {
        boolean found = false;
        while (!found){
        if( isPalindrome(number)){
          return number;
        }
            number--;
        }
        throw new IllegalArgumentException("No Palindrome found!");
    }

    public boolean isPalindrome(int number) {
       ArrayList<Integer> digits = extractingDigits(number);

      boolean isPalindrome = true;
      int length = digits.size();
      for (int i = 0; i<length;i++) {
          if(digits.get(i) != digits.get(length-1 -i))  {
              isPalindrome = false;
          }
      }
       return isPalindrome;
    }

    public ArrayList<Integer> extractingDigits(int number) {
        int value = number;
        int numberOfDigits =  (int)Math.log10(number) + 1;

        ArrayList<Integer> digitsOfNumber = new ArrayList<Integer>();

        for (int i = numberOfDigits -1; i >= 0; i--){

            int divisor = (int)  Math.pow(10,i);
            int digit = value/divisor;
             digitsOfNumber.add(digit);
             value = value - digit*divisor;
        }
        return digitsOfNumber;
    }



    public int getProductOfMultiplesUntilDelimiter(int number, int delimiter) {
     ArrayList<Integer> multiples = multipleFinder.getAllMultiplesOfFirstNumberUntilSecondNumber(number,delimiter);
     int firstNumber = 1;
     for (int multiple: multiples){
        firstNumber *= multiple;
     }
        return firstNumber;
    }


}

