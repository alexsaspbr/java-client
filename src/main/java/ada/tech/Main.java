package ada.tech;
public class Main {

    public static void main(String[] args) {
        ProductClient productClient = new ProductClient();
        //productClient.getAll().getProducts().forEach(productDTO -> System.out.println(productDTO.getTitle()));
        System.out.println(productClient.getById(2L).getTitle());
    }


}