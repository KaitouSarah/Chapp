package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;

public class TemperatureDevice {
	
	private static final int COUNT = 10;
	
	public static void main(String[] args) {
		
		TemperatureSensor sn = new TemperatureSensor();

		Client client = new Client("TemperatureDevice", Common.BROKERHOST, Common.BROKERPORT);

		client.connect();
		for (int i = 0; i < COUNT; i++) {
			int temperature = sn.read();
			client.publish(Common.TEMPTOPIC, "The temperature is " + temperature);
		}
		client.disconnect();
		System.out.println("Temperature device stopping ... ");
		
	}
}
