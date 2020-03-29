package temperatureConverter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CelvinConverterTest {

    @Test
    void getConvertedValue() {
        //given
        Converter converter = new CelvinConverter();
        //when
        double convertedValue = converter.getConvertedValue(10);
        //then
        Assertions.assertEquals(convertedValue,283.15);
    }
}