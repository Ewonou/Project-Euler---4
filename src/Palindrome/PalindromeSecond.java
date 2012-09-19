package Palindrome;

import java.util.ArrayList;


public class PalindromeSecond {

    public int findFactor(int palindrome) {

        int limit = (int)(Math.sqrt(palindrome));
        for (int i = 99; i >= limit; i--){
            if (palindrome% i==0 && palindrome/i <100){
                return i;
            }
        }

        return -1;
    }

    public int findPalindrome(int maxNumber) {

        boolean foundPalindrome = true;

       while (foundPalindrome){

           if (isPalindrome(maxNumber)){
               if (findFactor(maxNumber) >0){
                   return maxNumber;
               }
           }
           maxNumber--;
       }


        return 0;
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

}
