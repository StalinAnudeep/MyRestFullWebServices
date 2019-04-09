package com.ws.response;

import javax.xml.bind.annotation.XmlElement;
public class JSONAddDetailResponse {
	private String status;
	private String statusdescription;
	private DetailData _data=new DetailData();

	public static class DetailData{
		private int empid;

		public int getempid()
		{
			return this.empid;
		}

		public void setempid(int empid)
		{
			this.empid=empid;
		}
	}

	public String getStatus() {
		return status;
	}
	@XmlElement
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusdescription() {
		return statusdescription;
	}
	@XmlElement
	public void setStatusdescription(String statusdescription) {
		this.statusdescription = statusdescription;
	}
	public DetailData getData() {
		return _data;
	}
	@XmlElement
	public void setData(DetailData data) {
		this._data = data;
	}


}
