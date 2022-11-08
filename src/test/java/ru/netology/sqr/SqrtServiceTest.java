package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqrtServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/list.csv")

    public void SqrtAmountService(int rangeFrom, int rangeTo, int expected) {
        SqrtService service = new SqrtService();

        int count = service.SqrtAmountService(rangeFrom, rangeTo);

        assertEquals(expected, count);
    }
}
