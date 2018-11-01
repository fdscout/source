import java.io.FileReader;
import java.io.IOException;

import org.json.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fdscout.core.model.bean.FoodRecallBean;

public class JsonImport {

	public static void main(String[] args) {
		JSONParser parser = new JSONParser();
		try {
			Object sa = parser.parse(new FileReader("/Users/presphere/Documents/FDScout/sampleFood.json"));

			JSONArray array = new JSONArray();
			array.put(sa);
			org.json.simple.JSONArray jsonArray = (org.json.simple.JSONArray) array.get(0);
			for (Object object : jsonArray) {
				org.json.simple.JSONObject jsonObject = (org.json.simple.JSONObject) object;
				FoodRecallBean foodRecall = new FoodRecallBean();
				foodRecall.getRecall().setClassification((String)jsonObject.get("classification"));
				
				System.out.println(jsonObject.get("classification"));
				System.out.println(jsonObject.get("country"));
				System.out.println(jsonObject.get("city"));
				System.out.println(jsonObject.get("reason_for_recall"));
				System.out.println(jsonObject.get("address_1"));
				System.out.println(jsonObject.get("address_2"));
				System.out.println(jsonObject.get("code_info"));
				System.out.println(jsonObject.get("product_quantity"));
				System.out.println(jsonObject.get("center_classification_date"));
				System.out.println(jsonObject.get("distribution_pattern"));
				System.out.println(jsonObject.get("state"));
				System.out.println(jsonObject.get("product_description"));
				System.out.println(jsonObject.get("report_date"));
				System.out.println(jsonObject.get("classification"));
				System.out.println(jsonObject.get("openfda"));
				System.out.println(jsonObject.get("recall_number"));
				System.out.println(jsonObject.get("recalling_firm"));
				System.out.println(jsonObject.get("initial_firm_notification"));
				System.out.println(jsonObject.get("event_id"));
				System.out.println(jsonObject.get("product_type"));
				System.out.println(jsonObject.get("termination_date"));
				System.out.println(jsonObject.get("more_code_info"));
				System.out.println(jsonObject.get("recall_initiation_date"));
				System.out.println(jsonObject.get("postal_code"));
				System.out.println(jsonObject.get("voluntary_mandated"));
				System.out.println(jsonObject.get("status"));
				System.out.println("---------------------------------------------");
			}
			System.out.println(sa);

		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		}

}
