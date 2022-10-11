package com.springcore.objc_reference_injection;

public class Laptop {
	Usb usb;

	public void getLaptop() {
		System.out.println("in my laptop");
		usb.getUsb();
	}

	public void setUsb(Usb usb) {
		this.usb = usb;
	}
	

}
