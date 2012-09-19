package Palindrome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MultiplesFinder implements IMultipleFinder {

    ArrayList<Integer> primeNumberList = new ArrayList<Integer>();
    public static final int BASEPRIME = 2;

    public MultiplesFinder(){
        primeNumberList.add(BASEPRIME);
    }


    public int findNextPrimeNumber(List<Integer> currentPrimeNumbers){
        if (currentPrimeNumbers.size() == 0) {

          return BASEPRIME;
        }

        else {
        int previousPrime = currentPrimeNumbers.get(currentPrimeNumbers.size()-1);
        int possiblePrime = previousPrime;
        boolean  foundNextPrime = false;

        while (!foundNextPrime) {
        possiblePrime ++;
        int count = 0;
        for (int primeNumber: currentPrimeNumbers){
            count++;
            if (possiblePrime % primeNumber == 0){
             break;
            }
            if (count == currentPrimeNumbers.size()){
                foundNextPrime = true;
            }
        }

        }

        return possiblePrime;
    }
    }

    public ArrayList<Integer> getAllMultiplesOfFirstNumberUntilSecondNumber(int number, int delimiter){
        ArrayList<Integer> primes = new ArrayList<Integer>();
        ArrayList<Integer> multiples = new ArrayList<Integer>();

        while (number>delimiter){
            int possibleMultiple = findNextPrimeNumber(primes);

            while (number % possibleMultiple == 0){

                if(number > delimiter){
                multiples.add(possibleMultiple);
                }
                number = number/ possibleMultiple;
            }
            primes.add(possibleMultiple);
        }
           return multiples;
    }


}