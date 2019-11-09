package com.model;

import java.time.LocalDate;

public class BillDetails {

	private int billNum;
	private Consumers consumersNos;
	private int currentReading;
	private int untillConsumed;
	private int netAmount;
	private LocalDate dt;

	public BillDetails() {
		dt = LocalDate.now();
	}

	public BillDetails(int billNum, Consumers consumersNos, int currentReading, int untillConsumed, int netAmount) {
		this();
		this.billNum = billNum;
		this.consumersNos = consumersNos;
		this.currentReading = currentReading;
		this.untillConsumed = untillConsumed;
		this.netAmount = netAmount;
	}

	public int getBillNum() {
		return billNum;
	}

	public void setBillNum(int billNum) {
		this.billNum = billNum;
	}

	public Consumers getConsumersNos() {
		return consumersNos;
	}

	public void setConsumersNos(Consumers consumersNos) {
		this.consumersNos = consumersNos;
	}

	public int getCurrentReading() {
		return currentReading;
	}

	public void setCurrentReading(int currentReading) {
		this.currentReading = currentReading;
	}

	public int getUntillConsumed() {
		return untillConsumed;
	}

	public void setUntillConsumed(int untillConsumed) {
		this.untillConsumed = untillConsumed;
	}

	public int getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(int netAmount) {
		this.netAmount = netAmount;
	}

	public LocalDate getDt() {
		return dt;
	}

//	public void setDt(LocalDate dt) {
//		this.dt = dt;
//	}

	@Override
	public String toString() {
		return "BillDetails [billNum=" + billNum + ", consumersNos=" + consumersNos + ", currentReading="
				+ currentReading + ", untillConsumed=" + untillConsumed + ", netAmount=" + netAmount + ", dt=" + dt
				+ "]";
	}
}
