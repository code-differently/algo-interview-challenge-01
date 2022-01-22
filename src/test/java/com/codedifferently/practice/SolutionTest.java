package com.codedifferently.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void maxOccurringCharTest01(){
        String word = "hippopotamus";

        Character expected = 'p';
        Character actual = Solution.maxOccurringChar(word);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxOccurringCharTest02(){
        String word = "supercalifragilisticexpialidocious";

        Character expected = 'i';
        Character actual = Solution.maxOccurringChar(word);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxOccurringCharTest03(){
        String word = "Pneumonoultramicroscopicsilicovolcanoconiosis";

        Character expected = 'o';
        Character actual = Solution.maxOccurringChar(word);

        Assertions.assertEquals(expected, actual);
    }

}
