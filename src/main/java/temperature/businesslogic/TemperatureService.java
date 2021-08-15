package temperature.businesslogic;

import temperature.model.Temperature;

import java.util.List;

/**
 * Created  08/2021
 * Project  Testing
 * Author   echikuni
 **/
public interface TemperatureService {

    Double calculateMedian(List<Temperature> temperatureList);
}
