import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({"10,99,6", "10,10,0", "20,99,5", "81,99,1"})
    public void shouldCalcExact(int under, int over, int expected) {
        SQRService service = new SQRService();
        int actual = service.function(under, over);
        Assertions.assertEquals(expected, actual);
    }
}
