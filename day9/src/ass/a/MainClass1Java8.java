package ass.a;

public class MainClass1Java8 {
	public static void main(String[] args) {
		Device wifi1 = new Device();
		wifi1.doCall();
		
		Wifi w = (netToShare,destinationDevice)->{
			
			return "Net t/n via lambda expression" + netToShare+"to device"+ destinationDevice ;
			
		};
		
		String connectionNotification = wifi1.shareNet("newNet", "hp", w);
		
		System.out.println(connectionNotification);
	}

}
