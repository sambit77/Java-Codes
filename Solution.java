import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.net.*;
import org.json.simple.*;
import org.json.simple.parser.*;
import java.net.http.*;
import java.net.URI;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.google.gson.*;
class Result {
    /*
     * Complete the 'getDiscountedPrice' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER barcode as parameter.
     * API URL: https://jsonmock.hackerrank.com/api/inventory?barcode=<barcode>
     */
    public static int getDiscountedPrice(int barcode) {


        double discountedPrice = 0.0;
        Long price = 0l;
        Long discount = 0l;
        boolean status = false;
        Object[] arr = new Object[6];
        int counter = 0;
        String apiResponse = "";


        try{
        String urlString = "https://jsonmock.hackerrank.com/api/inventory?barcode=" + Integer.toString(barcode);
        URL url = new URL(urlString);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();

        // Processing the response
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            
            apiResponse = response.toString();
                //System.out.println("API Response: " + response.toString());
            }
            else {
                System.out.println("API Call Failed. Response Code: " + responseCode);
            }
        }
        catch(Exception e)
        {
            
        }


        try
        {
            Object obj = new JSONParser().parse(apiResponse); 
            JSONObject jo = (JSONObject) obj;
            JSONArray ja = (JSONArray) jo.get("data");
            Iterator<Map.Entry> itr1 = null;
            Iterator itr2 = ja.iterator();    
        
        while (itr2.hasNext())  
        { 
            
            itr1 = ((Map) itr2.next()).entrySet().iterator(); 
            while (itr1.hasNext()) { 
                status = true;
                
                System.out.println(counter);
                Map.Entry pair = itr1.next(); 
                
                arr[counter] = pair.getValue();
                counter++;
                
                System.out.println(pair.getKey().toString() + " : " + pair.getValue());          
            }                        
            
        }        
   
        }
        catch(Exception e)
        {

        }
              
        if(status)
        {             
        String d = arr[3].toString();
        String p = arr[1].toString();

        price =      Long.parseLong(p);
        discount =   Long.parseLong(d);
            double dis = discount/100.0;
            System.out.println("dis "+ dis);
            double reduce = (dis * price);
            System.out.println(reduce+ "reduuce");
            discountedPrice =  price - reduce;
            System.out.println(discountedPrice);
        }
        
        return  status ? (int) Math.round(discountedPrice) : -1;
    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int barcode = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.getDiscountedPrice(barcode);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
