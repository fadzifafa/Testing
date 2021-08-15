package temperature.businesslogic;

import org.springframework.stereotype.Service;
import temperature.model.Temperature;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created  08/2021
 * Project  Testing
 * Author   echikuni
 **/

@Service
public class TemperatureServiceImpl implements TemperatureService{

    @Override
    public Double calculateMedian(List<Temperature> temperatureList)  {

       return temperatureList.stream()
                .map(Temperature::getCelsiusTemp)
                .sorted()
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        temps -> {
                            int count = temps.size();
                            if (count % 2 == 0) { // even number
                                return (temps.get(count / 2 - 1) + temps.get(count / 2)) / 2;
                            } else { // odd number
                                return temps.get(count / 2);
                            }
                        }));
    }
}
