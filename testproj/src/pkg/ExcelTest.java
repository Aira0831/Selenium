package pkg;




//public class ExcelTest {
	//
	//String word=null;
//public static void main(String[] args) {
	//checksstring("*erstT12&");
	
	//Excelt();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\genuinecomputer\\Downloads\\chromedriver\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		


//public static void Excelt() {
	
	/*XSSFWorkbook workbook;
	try {
		workbook = new XSSFWorkbook("C:/Users/genuinecomputer/eclipse-workspace/testproj/src/pkg/Excel/test.xlsx");
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rowcount=sheet.getPhysicalNumberOfRows();
		System.out.println(rowcount);
		String cellData=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(cellData);
		
		
	} catch (IOException e) {
		e.printStackTrace();
		System.out.println(e.getCause());
		System.out.println(e.getMessage());
		
		
	}
	
*/
public class ExcelTest {
	
	String word=null;
public static void main(String[] args) {
	checksstring("*erstT12&");
	
}
	public static void checksstring(String word) {	
		
		 int upper = 0, lower = 0, number = 0, special = 0;
		    for (int i = 0; i < word.length(); i++)
		    {
		        char ch=word.charAt(i);
		        
		        if (ch >='A' && ch <='Z') {
		        	upper++;
		        }
		        	else if (ch >='a' && ch <='z') {
			        	lower++ ;
		        	}
			        	else if (ch >='0' && ch <='9') {
				        	number++;
			        	}
				        	else
				        		special ++;
		        	
		        	System.out.println(upper);
		        	System.out.println(lower);
		        	System.out.println(number);
		        	System.out.println(special);
		        	
		        
		    
				        	
				        	
		        	
		        }
		    
	
		    
	}
	}
	
