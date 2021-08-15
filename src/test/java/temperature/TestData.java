package temperature;

import temperature.model.Temperature;

import java.util.ArrayList;

/**
 * Created  08/2021
 * Project  Testing
 * Author   echikuni
 **/


public class TestData {

    public static ArrayList<Temperature> getOddNumberList(){
        ArrayList<Temperature> temperatureList = new ArrayList<>();
        temperatureList.add(new Temperature(14.0));
        temperatureList.add(new Temperature(14.0));
        temperatureList.add(new Temperature(14.0));
        return temperatureList;
    }

    public static ArrayList <Temperature> getEvenNumberList(){
        ArrayList<Temperature> temperatureList = new ArrayList<Temperature>();

        temperatureList.add(new Temperature(16.3));
        temperatureList.add(new Temperature(17.0));
        temperatureList.add(new Temperature(23.3));
        temperatureList.add(new Temperature(15.0));
        temperatureList.add(new Temperature(21.0));
        temperatureList.add(new Temperature(21.0));
        return temperatureList;
    }

    public static ArrayList <Temperature> emptyTemperatureList(){
        ArrayList<Temperature> temperatureList = new ArrayList<Temperature>();
        return temperatureList;
    }
}
