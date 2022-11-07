
package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {
            "200,300,3",
            "100,120,1",
            "110,121,1",
            "0,99,0",
            "10000,12000,0"
    })
    public void shouldSquareService(int rangeFrom, int rangeTo, int expected) {
        SqrtService service = new SqrtService();

        int actual = service.squareNamberService(rangeFrom, rangeTo);

        assertEquals(expected, actual);
    }
}