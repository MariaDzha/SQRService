package SQRServiceTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(
            value = {
                    "0,10,0",
                    "100,100,1",
                    "100,9800,89",
                    "9800,9802,1"

            },
            delimiter = ','
    )
    void shouldCalculateSQR(int lowBorder, int topBorder, int expected) {
        SQRService service = new SQRService();
        int actual = service.calculateSQR(lowBorder, topBorder);
        assertEquals(expected, actual);
    }
}