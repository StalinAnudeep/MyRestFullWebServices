package com.ws.response;

import java.util.ArrayList;
import java.util.List;

import com.ws.object.Employee;
public class JSONGetAllEmployeeResponse {
	private String status;
	private String statusdescription;
	private EmployeeData data = new EmployeeData();

	public String getStatus() {
		return this.status;
	}

	public String getStatusdescription() {
		return this.statusdescription;
	}

	public EmployeeData getData() {
		return this.data;
	}

	public static class EmployeeData {

		private List<Employee> getallemployee;

		public EmployeeData() {
			getallemployee = new ArrayList<Employee>();
		}

		public List<Employee> getGetallemployee() {
			return getallemployee;
		}

		public void setGetallemployee(List<Employee> getallemployee) {
			this.getallemployee = getallemployee;
		}

	

	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setStatusdescription(String statusdescription) {
		this.statusdescription = statusdescription;
	}

	public void setData(EmployeeData data) {
		this.data = data;
	}

}
