package model;

/**
 * @author Jamison Bice - jdbice
 * CIS175 - Fall 2021
 * Sep 23, 2021
 */
public class TempConverter {
	
	private double temp;
	private boolean isCelsius;//used for constructor 
	
	/**
	 * 
	 */
	public TempConverter() {
	}
	
	/**
	 * @param temp
	 * @param isCelsius
	 */
	public TempConverter(double temp, boolean isCelsius) {
		this.isCelsius = isCelsius;
		
		if (isCelsius) {
			this.temp = tempConvertToFah(temp);
		} else {
			this.temp = tempConvertToCel(temp);

		}
	}



	/**
	 * @return the temp
	 */
	public double getTemp() {
		return temp;
	}

	/**
	 * @param temp the temp to set
	 */
	public void setTemp(double temp) {
		this.temp = temp;
	}

	public double tempConvertToFah(double celsius) {
		double fahrenheit = (celsius * 9/5) +32;
		return fahrenheit;
	}
	
	public double tempConvertToCel(double fahrenheit) {
		double celsius = (fahrenheit - 32) * 5/9;
		return celsius;
	}



	@Override
	public String toString() {
		return "TempConverter [temp=" + temp + "]";
	}

}
