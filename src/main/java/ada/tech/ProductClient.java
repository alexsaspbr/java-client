package ada.tech;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ProductClient {

    public void getAll() {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://dummyjson.com/products/1"))
                .GET()
                .build();

        HttpClient client = HttpClient.newHttpClient();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response);
            System.out.println(response.statusCode());
            ProductDTO productDTO = new ObjectMapper().readValue(response.body(), ProductDTO.class);
            System.out.println(productDTO.getId());
            System.out.println(productDTO.getTitle());
            System.out.println(productDTO.getDescription());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


}
