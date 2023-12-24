package org.ggk.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DecimalToBinaryTest {

    @Test
    @DisplayName("Test to convert decimal to binary string")
    public void testToConvertDecimalToBinaryString(){
        int n = 10;
        String binaryRep = "1010";
        DecimalToBinary obj = new DecimalToBinary();
        Assertions.assertEquals(binaryRep,obj.decimalToBinaryString(n));
    }

    @Test
    @DisplayName("Test to convert decimal to binary number")
    public void testToConvertDecimalToBinaryNumber(){
        int n = 10;
        long binaryRep = 1010;
        DecimalToBinary obj = new DecimalToBinary();
        Assertions.assertEquals(binaryRep,obj.decimalToBinaryNumber(n));
    }
}
