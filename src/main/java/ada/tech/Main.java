package ada.tech;
public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        //client.getAddress();
        //client.getProduct();
        ProductClient productClient = new ProductClient();
        productClient.getAll();
    }


}