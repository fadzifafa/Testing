package temperature.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import temperature.TemperatureRunner;
import temperature.businesslogic.TemperatureService;
import temperature.businesslogic.TemperatureServiceImpl;

@Configuration
public class TemperatureAppConfig {

//    @Bean
//    public TemperatureRunner temperatureRunner(TemperatureService temperatureService) {
//        return new TemperatureRunner(temperatureService);
//    }

//    @Bean
//    public Temp temperatureRunner() {
//        return new TemperatureRunner();
//    }

}
