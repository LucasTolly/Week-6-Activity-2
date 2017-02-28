package example;/**
 * Created by tolly on 2/28/2017.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
      com.daehosting.temperatureconversions.TemperatureConversionsSoapType service = new TemperatureConversions().getPort();
      //invoke business method
      service.celsiusToFahrenheit();  
  }
}
