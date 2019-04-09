package com.ws.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.ws.request.JSONAddDetailRequest;
import com.ws.response.JSONAddDetailResponse;
import com.ws.object.*;

@Path("/addemployeedetail")
public class AddEmployeeDetailService {
	Logger log = Logger.getLogger(AddEmployeeDetailService.class);
	public static List<Employee> list = new ArrayList<Employee>();

	@Path("/test")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String test() {
		log.info("Successfully executed the test WS");
		return "In test service of Web Services.";
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public JSONAddDetailResponse test(JSONAddDetailRequest req) {
		JSONAddDetailResponse res = new JSONAddDetailResponse();
		int empid;
		String empname;
		String empaddress;
		String empphoneno;
		empid = req.getEmpid();
		empname = req.getEmpname();
		empaddress = req.getEmpaddress();
		empphoneno = req.getEmpphoneno();

		/* Here JBDC Code */
		list.add(new Employee(empid, empname, empaddress, empphoneno));
		res.setStatus("1");
		res.setStatusdescription("SUCCESS");
		res.getData().setempid(empid);
		return res;

	}
	/*
	 * URL : http://localhost:8080/MyRestFullWebServices/addemployeedetail
	 * Request: { "empid":4, "empname":"Stalin Anudeep", "empaddress":"Gudur","empphoneno":"9768986104" }
	 * Response: {
    				"status": "1",
    				"statusdescription": "SUCCESS",
    				"data": {
        			"empid": 5
    			}
}
	 */

}
