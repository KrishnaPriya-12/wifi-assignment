package ass.a;

public class MainClass1 {
	public static void main(String[] args) {
		Device wifi1 = new Device();
		wifi1.doCall();
		String wifiNotification = wifi1.shareNet("newNet", "hp", new Vpn());
		
		System.out.println(wifiNotification);
	}

}
