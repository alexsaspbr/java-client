package ada.tech;

import ada.tech.dto.PageProductsDTO;
import ada.tech.dto.ProductDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.java.Log;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Log
public class ProductClient {

    public ProductDTO getById(Long id) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://dummyjson.com/products/" + id))
                .GET()
                .build();

        HttpClient client = HttpClient.newHttpClient();

        try {
            log.info("passei por aqui");
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if(response.statusCode() == 200) {
                return new ObjectMapper().readValue(response.body(), ProductDTO.class);
            }
            return null;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public PageProductsDTO getAll() {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://dummyjson.com/products"))
                .GET()
                .build();

        HttpClient client = HttpClient.newHttpClient();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if(response.statusCode() == 200) {
                return new ObjectMapper().readValue(response.body(), PageProductsDTO.class);
            }
            return null;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


}
