package temperatureConverter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FaranheitConverterTest {

    @Test
    void getConvertedValue() {
        //given
        Converter converter = new FaranheitConverter();
        //when
        double convertedValue = converter.getConvertedValue(20);
        //then
        Assertions.assertEquals(convertedValue,68);
    }
}