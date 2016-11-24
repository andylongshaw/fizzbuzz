import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFizzbuzz
{
    @Test
    public void numbers_without_special_meaning_return_as_numbers()
    {
        assertEquals("1", fizzbuzz(1));
        assertEquals("2", fizzbuzz(2));
        assertEquals("4", fizzbuzz(4));
        assertEquals("7", fizzbuzz(7));
        assertEquals("8", fizzbuzz(8));
        assertEquals("11", fizzbuzz(11));
        assertEquals("13", fizzbuzz(13));
        assertEquals("14", fizzbuzz(14));
    }

    @Test
    public void multiples_of_three_that_are_not_also_multiples_of_five_give_fizz()
    {
        assertEquals("fizz", fizzbuzz(3));
        assertEquals("fizz", fizzbuzz(6));
        assertEquals("fizz", fizzbuzz(9));
        assertEquals("fizz", fizzbuzz(12));
    }

    @Test
    public void multiples_of_five_that_are_not_also_multiples_of_three_give_buzz()
    {
        assertEquals("buzz", fizzbuzz(5));
        assertEquals("buzz", fizzbuzz(10));
    }

    @Test
    public void numbers_that_are_a_multiple_of_both_three_and_five_give_fizzbuzz()
    {
        assertEquals("fizzbuzz", fizzbuzz(15));
    }

    private String fizzbuzz(int number)
    {
        String stringToReturn = "";
        if (numberIsMultipleOfFive(number) || numberIsMultipleOfThree(number))
        {
            if (numberIsMultipleOfThree(number))
                stringToReturn += "fizz";
            if (numberIsMultipleOfFive(number))
                stringToReturn += "buzz";
        }
        else
        {
            stringToReturn += number;
        }
        return stringToReturn;
    }

    private boolean numberIsMultipleOfThree(int number)
    {
        return number % 3 == 0;
    }

    private boolean numberIsMultipleOfFive(int number)
    {
        return number % 5 == 0;
    }
}
