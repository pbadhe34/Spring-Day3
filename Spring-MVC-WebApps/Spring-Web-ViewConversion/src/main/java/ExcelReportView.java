

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

public class ExcelReportView extends AbstractExcelView{
	
	@SuppressWarnings("deprecation")
	@Override
	protected void buildExcelDocument(Map model, HSSFWorkbook workbook,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		System.out.println("ExcelReportView.buildExcelDocument()");
		
		//workbook.createSheet("RevenueReport"); 
		
		 
		Map<String,String> revenueData = (Map<String,String>) model.get("YearData");
		System.out.println("The year model data is  "+revenueData);
		//create a worksheet
		HSSFSheet sheet = workbook.createSheet("Revenue Report for year 2010");
		
		String workBookname = workbook.getSheetName(0);
		System.out.println("The workBook name is  "+workBookname);
		//workbook.setSheetName(0, "MyReport");
		
		HSSFRow header = sheet.createRow(0);
		
		/*header.createCell(0).setCellValue("Month");
		header.createCell(1).setCellValue("Revenue");*/
		
		HSSFCell cell1 =  header.createCell((short)0, 0);
		cell1.setCellValue("Month");
		
		
		HSSFCell cell2 =  header.createCell((short)1, 0);
		cell2.setCellValue("RevenueCollection");
		
		 		
		int rowNum = 1;
		for (Map.Entry<String, String> entry : revenueData.entrySet()) {
			System.out.println("Rendering from model data");
			//create the row data
			HSSFRow row = sheet.createRow(rowNum++);
			System.out.println("The entry key in model is  "+entry.getKey());
			System.out.println("The entry value in model is  "+entry.getValue());
			row.createCell((short)0).setCellValue(entry.getKey());
			row.createCell((short)1).setCellValue(entry.getValue());			 
			
        }
	}
}