package temperatureConverter;

public class CelvinConverter implements  Converter {
    @Override
    public double getConvertedValue(double basedValue) {
       return basedValue+273.15;
    }
}
