
public class TV {
	private int channel;
	private int volumeLevel;
	private boolean on;

	public TV() {
		System.out.println("Created new TV.");
		channel = 1;
		volumeLevel = 100;
		on = true;
	}

	public TV(int channel, int volumeLevel, boolean on) {
		System.out.println("Created new TV.");
		this.channel = (on && channel >= 1 && channel <= 100) ? channel : 1;
		this.volumeLevel = (on && volumeLevel >= 0 && volumeLevel <= 100) ? volumeLevel : 1;
		this.on = on;

	}

	public void turnOn() {
		System.out.println("The tv is now on.");
		on = true;
	}

	public void turnOff() {
		System.out.println("The tv is now off.");
		on = false;
	}

	public void channelUp() {
		this.channel++;
	}

	public void channelDown() {
		this.channel--;
	}

	public void volumeUp() {
		this.volumeLevel++;
	}

	public void volumeDown() {
		this.volumeLevel--;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = (on && channel >= 1 && channel <= 100) ? channel : 1;

	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		this.volumeLevel = (on && volumeLevel >= 0 && volumeLevel <= 100) ? volumeLevel : 1;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

}
