package ada.tech;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Client {

    public void getAddress() {
        get("https://viacep.com.br/ws/01001000/json/");
    }

    public void getProduct() {
        get("https://dummyjson.com/products");
    }

    private void get(String endpoint) {
        try {
            URL url = new URL(endpoint);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            Scanner scanner = new Scanner(url.openStream());
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
