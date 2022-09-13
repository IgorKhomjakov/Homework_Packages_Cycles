package ru.netology.sqr.packages.cycles.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Squares.csv")
    public void testCalcQuantitySquares(int expected, int minRange, int maxRange) {
        SQRService service = new SQRService();
        int actual = service.calcSQR(minRange, maxRange);
        Assertions.assertEquals(expected, actual);
    }


}
