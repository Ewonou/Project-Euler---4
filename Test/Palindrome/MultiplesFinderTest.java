package Palindrome;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class MultiplesFinderTest {

    @Test
    public void shouldFindTheMultiples(){
        MultiplesFinder multiplesFinder = new MultiplesFinder();
        ArrayList<Integer> multiples = multiplesFinder.getAllMultiplesOfFirstNumberUntilSecondNumber(18, 1);
        ArrayList<Integer> expectedMultiples = new ArrayList<Integer>();
        expectedMultiples.add(2);
        expectedMultiples.add(3);
        expectedMultiples.add(3);

        assertThat(multiples, is(expectedMultiples));
    }

    @Test
    public  void shouldFindMultiples(){
        MultiplesFinder multiplesFinder = new MultiplesFinder();
        ArrayList<Integer> multiples = multiplesFinder.getAllMultiplesOfFirstNumberUntilSecondNumber(1200, 100);
        ArrayList<Integer> expectedMultiples = new ArrayList<Integer>();
        expectedMultiples.add(2);
        expectedMultiples.add(2);
        expectedMultiples.add(2);
        expectedMultiples.add(2);
        assertThat(multiples, is(expectedMultiples));
    }
    @Test
    public  void shouldFindMultiples2(){
        MultiplesFinder multiplesFinder = new MultiplesFinder();
        ArrayList<Integer> multiples = multiplesFinder.getAllMultiplesOfFirstNumberUntilSecondNumber(10000, 100);
        ArrayList<Integer> expectedMultiples = new ArrayList<Integer>();
        expectedMultiples.add(2);
        expectedMultiples.add(2);
        expectedMultiples.add(2);
        expectedMultiples.add(2);
        expectedMultiples.add(5);
        expectedMultiples.add(5);

        assertThat(multiples, is(expectedMultiples));
    }

    @Test
    public void shouldFIndTheNextPrimeNumbers(){

        MultiplesFinder multiplesFinder = new MultiplesFinder();
        ArrayList<Integer> Primes = new ArrayList<Integer>();
        int firstPrime = multiplesFinder.findNextPrimeNumber(Primes);
        assertThat(firstPrime, is(2));

    }

    @Test
    public void shouldFIndTheSecondPrimeNumber(){
        MultiplesFinder multiplesFinder = new MultiplesFinder();
        ArrayList<Integer> Primes = new ArrayList<Integer>();
        Primes.add(2);
        int nextPrime = multiplesFinder.findNextPrimeNumber(Primes);
        assertThat(nextPrime,is(3));
    }

    @Test
    public void shouldFIndTheImmediatePrimeNumber(){
        MultiplesFinder multiplesFinder = new MultiplesFinder();
        ArrayList<Integer> Primes = new ArrayList<Integer>();
        Primes.add(2);
        Primes.add(3);
        Primes.add(5);
        int nextPrime = multiplesFinder.findNextPrimeNumber(Primes);
        assertThat(nextPrime,is(7));
    }



    }
