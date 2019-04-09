package com.ws.request;

public class JSONAddDetailRequest {
private int empid;
private String empname;
private String empaddress;
private String empphoneno;
public JSONAddDetailRequest() {
	// TODO Auto-generated constructor stub
}

public JSONAddDetailRequest(int empid, String empname, String empaddress, String empphoneno) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.empaddress = empaddress;
	this.empphoneno = empphoneno;
}

public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getEmpaddress() {
	return empaddress;
}
public void setEmpaddress(String empaddress) {
	this.empaddress = empaddress;
}
public String getEmpphoneno() {
	return empphoneno;
}
public void setEmpphoneno(String empphoneno) {
	this.empphoneno = empphoneno;
}

}
