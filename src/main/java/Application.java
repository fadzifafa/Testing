import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import domain.Temperature;

public class Application {

	public static void main(String args[]) throws Exception {
		List<Temperature> items = new ArrayList<Temperature>();
		items.add(new Temperature(16.3));
		items.add(new Temperature(17.0));
		items.add(new Temperature(23.3));
		items.add(new Temperature(15.0));

		//Print items
	    System.out.println(formatOutput(items));
	    
	    //Task 1 print the median temperature
	    
	    //Task 2 print the average mean temperature in Fahrenheit

	    //Task 3 print the output of values in JSON format
	    
	    //Task 4 Dockerize application
	}

	public double calculateAv(List<Temperature> values) {
		float total = 0;
		for (Temperature temperature : values) {
			total += temperature.getCelsiusTemp();
		}
		return total / values.size();
	}

	public static String formatOutput(List<Temperature> items) throws JAXBException {
		JAXBContext jc = JAXBContext.newInstance(Temperature[].class);
		JAXBElement<Temperature[]> root = new JAXBElement<Temperature[]>(new QName("items"), Temperature[].class,
				items.toArray(new Temperature[items.size()]));
		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		StringWriter writer = new StringWriter();
		marshaller.marshal(root, writer);
		String output = writer.toString();
		return output;
	}
}
