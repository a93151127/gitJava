package application;

import model.Television;

public class TestTelevision {

	public static void main(String[] args) {
		Television tv1 = new Television();
		
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(5);
		
		System.out.println("tv1 is on:"+tv1.isOn+
				"\tchannel:"+tv1.getChannel()+
				"\tvolumn:"+tv1.getVolumeLevel());
		System.out.println("=============");
		//tv1.turnOff();
		tv1.setChannel(100);
		tv1.setVolume(6);
		System.out.println("tv1 is on:"+tv1.isOn+
				"\tchannel:"+tv1.getChannel()+
				"\tvolumn:"+tv1.getVolumeLevel());
		System.out.println("=============");
		//tv1.turnOff();
		tv1.channelUp();
		tv1.volumnDown();
		System.out.println("tv1 is on:"+tv1.isOn+
				"\tchannel:"+tv1.getChannel()+
				"\tvolumn:"+tv1.getVolumeLevel());
	}

}
