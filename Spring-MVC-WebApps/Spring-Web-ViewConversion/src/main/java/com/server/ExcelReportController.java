package com.server;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class ExcelReportController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		String view =
			ServletRequestUtils.getStringParameter(request, "format");
		
		//dummy data
		Map<String,String> revenueData = new HashMap<String,String>();
		revenueData.put("Jan-2010", "$103,000,000");
		revenueData.put("Feb-2010", "$112,000,000");
		revenueData.put("Mar-2010", "$130,000,000");
		revenueData.put("Apr-2010", "$121,000,000");
		revenueData.put("May-2010", "$211,000,000");
		revenueData.put("June-2010", "$101,000,000");
		revenueData.put("July-2010", "$92,000,000");
		revenueData.put("August-2010", "$86,000,000");
		revenueData.put("September-2010", "$87,090,000");
		revenueData.put("October-2010", "$1000,000");
		revenueData.put("November-2010", "$200,000");
		revenueData.put("December-2010", "$512,643,127");
		
		System.out.println("The view requested is  "+view);
		
		/*//if view not specified
		if(view ==null || "".equals(view)){
			//return normal view
			return new ModelAndView("report","YearData",revenueData);
			
		}else if("EXCEL".equals(view.toUpperCase())){*/
		    //Directly directly produce the excel report
		
			//override the default output file name to be generated
			response.setContentType("application/vnd.ms-excel"); 
            response.setHeader("Content-disposition", "attachment;filename=RevenueReport.xls"); 
			//return excel view
			return new ModelAndView("ExcelReport","YearData",revenueData);
			
		/*}else{
			//return normal view
			return new ModelAndView("report","YearData",revenueData);
			
		}*/
		
	}
	
}