package esercizio3;

public class Celsius {

	public double celsius;
	public double fahrenheit;


	public void calcoloCelsius(){
		celsius = (fahrenheit-32)*5/9;
		System.out.println(fahrenheit + " gradi Fahrenheit equivalgono a " + celsius + " gradi Celsius");
	}

}