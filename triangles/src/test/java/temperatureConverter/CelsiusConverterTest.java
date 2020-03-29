package temperatureConverter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CelsiusConverterTest {

    @Test
    void getConvertedValue() {
        //given
        Converter converter = new CelsiusConverter();
        //when
        double convertedValue = converter.getConvertedValue(10);
        //then
        Assertions.assertEquals(convertedValue,10);
    }
}