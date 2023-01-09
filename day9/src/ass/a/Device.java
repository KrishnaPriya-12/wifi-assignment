package ass.a;


public class Device {
	
	public void doCall()
	{
		System.out.println("connecting.....");
	}
	public String shareNet(String connectionName, String deviceName, Wifi wifi)
	{
		String msg = wifi.shareNet(connectionName, deviceName);
		
		return "INFO LOGS :-"+msg;
	}

}
