package com.xworkz.dto.app;

import java.io.Serializable;

public class AadharDTO implements Serializable{
	
		private long number;
		private String holderName;
		private String addrs;


		public AadharDTO(long number, String holderName, String addrs) {
			super();
			this.number = number;
			this.holderName = holderName;
			this.addrs = addrs;
		}


		@Override
		public String toString() {
			return "AadharDTO [number=" + number + ", holderName=" + holderName + ", addrs=" + addrs + "]";
		}


		public long getNumber() {
			return number;
		}


		public void setNumber(long number) {
			this.number = number;
		}


		public String getHolderName() {
			return holderName;
		}


		public void setHolderName(String holderName) {
			this.holderName = holderName;
		}


		public String getAddrs() {
			return addrs;
		}


		public void setAddrs(String addrs) {
			this.addrs = addrs;
		}

}
