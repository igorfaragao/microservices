package one.digital.innovation.productCatalog.repository;


import one.digital.innovation.productCatalog.model.Product;
import org.springframework.data.repository.CrudRepository;


import java.util.List;


public interface ProductRepository extends CrudRepository<Product, Integer> {

    List<Product> findByName(String name);

}
