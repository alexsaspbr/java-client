package ada.tech;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PageProductsDTO {

    private List<ProductDTO> products;
    private Long total;
    private Integer skip;
    private Integer limit;

    public PageProductsDTO(){}

    public PageProductsDTO(List<ProductDTO> products, Long total, Integer skip, Integer limit) {
        this.products = products;
        this.total = total;
        this.skip = skip;
        this.limit = limit;
    }

    public List<ProductDTO> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDTO> products) {
        this.products = products;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Integer getSkip() {
        return skip;
    }

    public void setSkip(Integer skip) {
        this.skip = skip;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
