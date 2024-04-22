import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class proyecto2ingenieria {

	public static void main(String[] args) {
try {
		
		URL url= new URL ("https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m&daily=temperature_2m_max,temperature_2m_min&timezone=GMT&start_date=2024-04-26&end_date=2024-04-26");	

		HttpURLConnection conn= (HttpURLConnection) url.openConnection();

		conn.setRequestMethod("GET");
		conn.connect();

		int responseCode = conn.getResponseCode();
		if (responseCode !=200) {//

		}
		else {
			
			String info="";
			Scanner scan= new Scanner (url.openStream());

		
		while (scan.hasNext()) {
			info=scan.nextLine();
		}
		
		scan.close();

		System.out.println(info);
}}

catch (Exception e) {
	e.printStackTrace();
}
	}

}


