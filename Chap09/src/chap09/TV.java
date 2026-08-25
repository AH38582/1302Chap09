package chap09;

public class TV {
	private boolean on;
	private int channel, volumeLvl;

	public TV() {
		System.out.println("Created new TV.");
		channel = 1;
		volumeLvl = 100;
		on = true;
	}

	public TV(int channel, int volumeLevel, boolean on) {
		System.out.println("Created new TV.");
		this.channel = (on && channel >= 1 && channel <= 100) ? channel : 1;
		this.volumeLvl = (on && volumeLevel >= 0 && volumeLevel <= 100) ? volumeLevel : 1;
		this.on = on;

	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolumeLvl() {
		return volumeLvl;
	}

	public void setVolumeLvl(int volumeLvl) {
		this.volumeLvl = volumeLvl;
	}

	public void channelUp() {
		this.channel++;
	}

	public void channelDown() {
		this.channel--;
	}

	public void volumeUp() {
		this.volumeLvl++;
	}

	public void volumeDown() {
		this.volumeLvl--;
	}

	public void setVolumeLevel(int volumeLevel) {
		this.volumeLvl = volumeLevel;
		this.volumeLvl = (on && volumeLevel >= 0 && volumeLevel <= 100) ? volumeLevel : 1;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}
	
	public boolean turnOn() {
		return on = true;
	}

}