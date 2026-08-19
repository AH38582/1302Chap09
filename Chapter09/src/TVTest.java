
public class TVTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new TV(4, 4, true);
		
		tv.channelUp();
		tv.volumeDown();
		tv.turnOn();
		System.out.println("Channel: " + tv.getChannel());
		System.out.println("Volume: " + tv.getVolumeLevel());

	}

}
