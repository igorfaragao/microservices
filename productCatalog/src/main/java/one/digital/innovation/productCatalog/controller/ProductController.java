
package one.digital.innovation.productCatalog.controller;


import one.digital.innovation.productCatalog.model.Product;
import one.digital.innovation.productCatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product){
        return productRepository.save(product);

    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional <Product> findById(@PathVariable Integer id){
        return productRepository.findById(id);

    }

}
