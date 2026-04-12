package com.neha.designPatterns.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BuilderRequest {
	
	public String HDD;
	public String RAM;
	public boolean isGraphicsCardEnabled;
	public boolean isBluetoothEnabled;

	public String getHDD() {
		return HDD;
	}
	public void setHDD(String HDD) {
		this.HDD = HDD;
	}
	public String getRAM() {
		return RAM;
	}
	public void setRAM(String RAM) {
		this.RAM = RAM;
	}
	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}
	public void setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
		this.isGraphicsCardEnabled = isGraphicsCardEnabled;
	}
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	public void setBluetoothEnabled(boolean isBluetoothEnabled) {
		this.isBluetoothEnabled = isBluetoothEnabled;
	}

}
