package Palindrome;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {
    Palindrome palindrome;
    
    @Before
    public void setUp(){
        palindrome = new Palindrome(new MultiplesFinder());
    }
    
    @Test
    public void shouldReturn9009AsPalindromeOfTwoDigits(){
    int result = palindrome.generate(100);
    assertEquals(result, 9009);
    }

    @Test
    public void shouldLocateNextPalindrome(){
    
      int result = palindrome.findNextPalindrome(10000);
      assertEquals(9999, result);
    }

    @Test
    public void shouldDetermineIfPalindrome(){
        
        boolean result = palindrome.isPalindrome(999999);
        assertEquals(true, result);
    }

    @Test
    public void shouldExtractDigits(){
        
      ArrayList<Integer> result =   palindrome.extractingDigits(999);
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(9);
        expected.add(9);
        expected.add(9);

      assertEquals(result, expected);
    }

    @Test
    public void shouldFindTheCompositionOfANumberSuchThatOneNumberIsGreaterThanGivenValue(){

        
//     int result =  palindrome.getProductOfMultiplesUntilDelimiter(10000,100);

        int x = 9009;
        assertThat(Math.sqrt(x) , is(0.0));




    }


}
