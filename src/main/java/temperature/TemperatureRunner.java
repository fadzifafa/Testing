package temperature;

import org.springframework.boot.CommandLineRunner;
import temperature.model.Temperature;

import java.util.ArrayList;
import java.util.List;

public class TemperatureRunner implements CommandLineRunner {

    @Override
    public void run(String... args) {
        List<Temperature> items = new ArrayList<>();
        items.add(new Temperature(16.3));
        items.add(new Temperature(17.0));
        items.add(new Temperature(23.3));
        items.add(new Temperature(15.0));

        items.forEach(temperature -> System.out.println(temperature.getCelsiusTemp()));

        //Task 1 Print the median temperature

        //Task 2 Re-factor your code so that you can read temperatures from an external service

    }

}
