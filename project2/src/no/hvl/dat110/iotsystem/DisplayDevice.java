package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.messages.Message;
import no.hvl.dat110.messages.PublishMsg;

public class DisplayDevice {
	
	private static final int COUNT = 10;
		
	public static void main (String[] args) {

		Client client = new Client("DisplayDevice", Common.BROKERHOST, Common.BROKERPORT);
		client.connect();
		client.createTopic(Common.TEMPTOPIC);
		client.subscribe(Common.TEMPTOPIC);

		System.out.println("Display starting ...");

		for (int i = 0; i < COUNT; i++) {
			PublishMsg message = (PublishMsg) client.receive();
			System.out.println("The temperature is " + message.getMessage());
		}
		client.disconnect();

		System.out.println("Display stopping ... ");

	}
}
