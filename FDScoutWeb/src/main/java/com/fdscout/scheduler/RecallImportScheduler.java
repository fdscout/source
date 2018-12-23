package com.fdscout.scheduler;

import com.fdscout.web.parser.FoodRecallDataParser;
import com.fdscout.web.util.tool.PropertyReader;

public class RecallImportScheduler extends AbstractScheduler{

	protected void run() {
		String filePath  = PropertyReader.get("path.download.zip_file");
		String jsonFilename  = PropertyReader.get("name.jsonfile.food_recall");

		new FoodRecallDataParser().parse(filePath + jsonFilename);

		
//        List<String>fileNameList = UnzipFile.unzipFiles(filePath, zipFilename);
//        
//        for (String fileName : fileNameList) {
//            // .json file
//        	System.out.println(fileName.toLowerCase().indexOf(".json"));
//            if (fileName.toLowerCase().indexOf(".json") == fileName.length() - 7) {
//            	try {
//					BufferedReader bis = new BufferedReader(new InputStreamReader(new FileInputStream(filePath + fileName)));
//				} catch (FileNotFoundException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//                String line = null;
//                while ((line = bis.readLine()) != null) {
//                    if (line != null && !"".equals(line)) {    // is not empty line
//          //              String record = line.replaceAll("\",\"", "|");
                        
//                        String [] shipmentAuth = (line + "\"").split("\"\\|\"", 98);
//                        ((OpsumitShipmentAuthService)LavenderContext.getBean("opsumitShipmentAuthService")).createShipmentAuth(shipmentAuth);
//                    }    
//                }
//                bis.close();      
 //           }
 //       }
            
            
	}

}
