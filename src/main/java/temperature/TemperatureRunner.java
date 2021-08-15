package temperature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import temperature.businesslogic.TemperatureService;
import temperature.businesslogic.TemperatureServiceImpl;
import temperature.model.Temperature;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

@Service
public class TemperatureRunner implements CommandLineRunner {


    @Autowired
    private TemperatureService temperatureService;

    @Override
    public void run(String... args) {
        List<Temperature> items = new ArrayList<>();
//        items.add(new Temperature(16.3));
//        items.add(new Temperature(17.0));
//        items.add(new Temperature(23.3));
//        items.add(new Temperature(15.0));
//        items.add(new Temperature(21.0));
//        items.add(new Temperature(21.0));

        items.forEach(temperature -> System.out.println(temperature.getCelsiusTemp()));

        System.out.println(temperatureService.calculateMedian(items));

} 
  
    
    
   
}

