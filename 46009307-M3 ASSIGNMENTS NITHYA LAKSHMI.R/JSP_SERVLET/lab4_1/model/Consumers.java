package com.model;

public class Consumers {

	private int consumerNum;
	private String consumerName;
	private String address;

	public Consumers() {
	}

	public Consumers(int consumerNum, String consumerName, String address) {
		this.consumerNum = consumerNum;
		this.consumerName = consumerName;
		this.address = address;
	}

	public int getConsumerNum() {
		return consumerNum;
	}

	public void setConsumerNum(int consumerNum) {
		this.consumerNum = consumerNum;
	}

	public String getConsumerName() {
		return consumerName;
	}

	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Consumers [consumerNum=" + consumerNum + ", consumerName=" + consumerName + ", address=" + address
				+ "]";
	}
}
