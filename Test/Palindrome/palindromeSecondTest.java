package Palindrome;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: ewonou
 * Date: 19/9/12
 * Time: 2:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class palindromeSecondTest {

    @Test
    public void shouldFindNumberForPalindrome(){
        PalindromeSecond palindromeSecond = new PalindromeSecond();
       int result = palindromeSecond.findFactor(9009);
        assertThat(result, is(99));

    }

    @Test
    public void shouldFindCorrectPalindrome(){

        PalindromeSecond palindromeSecond = new PalindromeSecond();
        int result = palindromeSecond.findPalindrome(10000);
        assertThat(result, is(9009));

    }

    @Test
    public void shouldNotFindCorrectPalindrome(){

        PalindromeSecond palindromeSecond = new PalindromeSecond();
        int result = palindromeSecond.findPalindrome(98);
        assertThat(result, is(0));

    }

}