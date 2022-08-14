package model;

public class Television {
	public int channel=1;
	
	public int volumeLevel=1;
	
	public boolean isOn=false;
	
	
	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		this.volumeLevel = volumeLevel;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public int getChannel() {
		return channel;
	}

	public void turnOn() {
		isOn=true;
	}
	
	public void turnOff() {
		isOn=false;
	}
	public void setVolume(int newVolume) {
		if(isOn &&newVolume>=1 && newVolume <=7) {
			volumeLevel = newVolume;
		}
	}
	public void setChannel(int channel) {
		if(isOn &&channel>=1 && channel <=120) {
			this.channel = channel;
		}
	}
	public void channelUp() {
		if(isOn && channel <120) {
			channel++;
		}else{
			channel =1;
		}
	}
	public void channelDown() {
		if(isOn && channel >1) {
			channel--;
		}else{
			channel =120;
		}
	}
	public void volumnUp() {
		if(isOn && volumeLevel <7) {
			volumeLevel++;
		}
	}
	public void volumnDown() {
		if(isOn && volumeLevel >1) {
			volumeLevel--;
		}
	}
}
