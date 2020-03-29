package temperatureConverter;

public class FaranheitConverter implements  Converter {
    @Override
    public double getConvertedValue(double basedValue) {
        return basedValue*9/5+32;
    }
}
