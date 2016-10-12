package example;/**
 * Created by student on 10/12/16.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
      com.daehosting.temperatureconversions.TemperatureConversionsSoapType service = new TemperatureConversions().getPort();
      //invoke business method
      service.celsiusToFahrenheit();  
  }
}
