package com.cg.entities;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class MyWallet {

   private Integer accId;
   private Long accNumber;
   private String accName;
   private Double iniBal;
public MyWallet() {
	super();
	// TODO Auto-generated constructor stub
}
public MyWallet(Integer accId, Long accNumber, String accName, Double iniBal) {
	super();
	this.accId = accId;
	this.accNumber = accNumber;
	this.accName = accName;
	this.iniBal = iniBal;
}
public Integer getAccId() {
	return accId;
}
public void setAccId(Integer accId) {
	this.accId = accId;
}
public Long getAccNumber() {
	return accNumber;
}
public void setAccNumber(Long accNumber) {
	this.accNumber = accNumber;
}
public String getAccName() {
	return accName;
}
public void setAccName(String accName) {
	this.accName = accName;
}
public Double getIniBal() {
	return iniBal;
}
public void setIniBal(Double iniBal) {
	this.iniBal = iniBal;
}

       
}