package temperature;

import org.springframework.boot.CommandLineRunner;
import temperature.model.Temperature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class TemperatureRunner implements CommandLineRunner {

    @Override
    public void run(String... args) {
        List<Temperature> items = new ArrayList<>();
        items.add(new Temperature(16.3));
        items.add(new Temperature(17.0));
        items.add(new Temperature(23.3));
        items.add(new Temperature(15.0));
        items.add(new Temperature(21.0));

        items.forEach(temperature -> System.out.println(temperature.getCelsiusTemp()));
        
        


        
    //sorting list and calculating median
    
    double median = items.stream()
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
    
        System.out.println("The median is  " + median);
        
   
} 
  
    
    
   
}

