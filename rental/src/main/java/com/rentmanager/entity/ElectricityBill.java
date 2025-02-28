package com.rentmanager.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "electricity_bill", schema = "subject1")
public class ElectricityBill {
	
	@Id
	@Column(name = "bill_id")
	private int bill_id;
	
	@Column(name = "pg_id")
	private int pg_id;
	
	@Column(name = "month")
	private String month;
	
	@Column(name = "prev_reading")
	private int prev_reading;
	
	@Column(name = "curr_reading")
	private int curr_reading;
	
	@Column(name = "units_used")
	private int units_used;
	
	@Column(name = "unit_price")
	private int unit_price;
	
	@Column(name = "amount")
	private int amount;

	public int getBill_id() {
		return bill_id;
	}

	public void setBill_id(int bill_id) {
		this.bill_id = bill_id;
	}

	public int getPg_id() {
		return pg_id;
	}

	public void setPg_id(int pg_id) {
		this.pg_id = pg_id;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getPrev_reading() {
		return prev_reading;
	}

	public void setPrev_reading(int prev_reading) {
		this.prev_reading = prev_reading;
	}

	public int getCurr_reading() {
		return curr_reading;
	}

	public void setCurr_reading(int curr_reading) {
		this.curr_reading = curr_reading;
	}

	public int getUnits_used() {
		return units_used;
	}

	public void setUnits_used(int units_used) {
		this.units_used = units_used;
	}

	public int getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(int unit_price) {
		this.unit_price = unit_price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public ElectricityBill(int bill_id, int pg_id, String month, int prev_reading, int curr_reading, int units_used,
			int unit_price, int amount) {
		super();
		this.bill_id = bill_id;
		this.pg_id = pg_id;
		this.month = month;
		this.prev_reading = prev_reading;
		this.curr_reading = curr_reading;
		this.units_used = units_used;
		this.unit_price = unit_price;
		this.amount = amount;
	}

	public ElectricityBill() {
		super();
	}
	
	   
	
}
