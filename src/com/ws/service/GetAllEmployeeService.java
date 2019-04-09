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

import com.ws.object.Employee;
import com.ws.request.JSONGetAllEmployeeRequest;
import com.ws.response.JSONGetAllEmployeeResponse;

@Path("/getallemployees")
public class GetAllEmployeeService {
	Logger log = Logger.getLogger(GetAllEmployeeService.class);

	@Path("/test")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testBank(){
		log.info("Successfully executed the test WS");
		return "In test service of Get all Employee Detail Services.";
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public JSONGetAllEmployeeResponse test(JSONGetAllEmployeeRequest r){
		
		JSONGetAllEmployeeResponse res=new JSONGetAllEmployeeResponse();
			res.setStatus("1");	
			res.setStatusdescription("SUCCESS");
			res.getData().setGetallemployee(AddEmployeeDetailService.list);
		
		
		return res;
	}
/*
 * URL: http://localhost:8080/MyRestFullWebServices/getallemployees
 * Request : {}
 * Response:
 * {
    "status": "1",
    "statusdescription": "SUCCESS",
    "data": {
        "getallemployee": [
            {
                "empid": 5,
                "empname": "Stalin Anudeep",
                "empaddress": "Gudur",
                "empphoneno": "9768986104"
            },
            {
                "empid": 6,
                "empname": "Stalin Anudeep",
                "empaddress": "Gudur",
                "empphoneno": "9768986104"
            }
        ]
    }
}
 */

}
