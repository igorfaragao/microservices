package one.digital.innovation.Repository;

import one.digital.innovation.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}
