package ada.tech;

import ada.tech.dto.ProductDTO;

public class Main {

    public static void main(String[] args) {
        ProductClient productClient = new ProductClient();
        //productClient.getAll().getProducts().forEach(productDTO -> System.out.println(productDTO.getTitle()));
        System.out.println(productClient.getById(2L).getTitle());

        ProductDTO productDTO = ProductDTO.builder()
                                            .id(1L)
                                            .title("Title")
                                            .description("description")
                                            .build();

        ProductDTO productDTO1 = new ProductDTO(1L, "Title", "description");
    }


}