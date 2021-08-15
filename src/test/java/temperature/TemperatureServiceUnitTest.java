package temperature;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import temperature.businesslogic.TemperatureServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static temperature.TestData.getEvenNumberList;
import static temperature.TestData.getOddNumberList;

/**
 * Created  08/2021
 * Project  Testing
 * Author   echikuni
 **/
public class TemperatureServiceUnitTest {

    private TemperatureServiceImpl  temperatureService;

    @BeforeEach
    public void setUp(){
        temperatureService = new TemperatureServiceImpl();
    }

    @Test
    @DisplayName("Test Odd Number List")
    public void givenOddNumberTemperatureList_shouldCalculateMedian(){

        assertEquals(14.0, temperatureService.calculateMedian(getOddNumberList()).doubleValue());
    }

    @Test
    @DisplayName("Test Even Number List")
    public void givenEvenNumberTemperatureList_shouldCalculateMedian(){
        assertEquals(19.0, temperatureService.calculateMedian(getEvenNumberList()).doubleValue());
    }

    @Test
    @DisplayName("Exception for Empty list")
    public void givenEmptyList_shouldThrowException(){
        assertEquals(19.0, temperatureService.calculateMedian(getEvenNumberList()).doubleValue());
    }
}
