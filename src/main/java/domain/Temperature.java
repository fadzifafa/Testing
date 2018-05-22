package domain;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement
public class Temperature {

	@XmlValue
	private double celsiusTemp;

	public Temperature() {
	}
	
	public Temperature(double celsiusTemp) {
		this.celsiusTemp = celsiusTemp;
	}

	public double getCelsiusTemp() {
		return celsiusTemp;
	}

	public void setCelsiusTemp(int celsiusTemp) {
		this.celsiusTemp = celsiusTemp;
	}

}
