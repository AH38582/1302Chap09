
public class TVTest {

	public static void main(String[] args) {
		TV tv = new TV(4, 4, true);

		tv.channelUp();
		tv.volumeDown();
		tv.turnOn();

		System.out.println("Channel: " + tv.getChannel());
		System.out.println("Volume: " + tv.getVolumeLvl());

	}

}
