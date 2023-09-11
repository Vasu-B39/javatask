package com.xworkz.dto.app;

import java.io.Serializable;

public class PrinterDTO implements Serializable{
	
	private boolean option;
	private String size;
	
	public PrinterDTO(boolean option, String size) {
		super();
		this.option=option;
		this.size=size;
	}
	
	public boolean isOption() {
		return option;
	}

	public void setOption(boolean option) {
		this.option = option;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "PrinterDTO [option=" + option + ", size=" + size + "]";
	}
	

}
