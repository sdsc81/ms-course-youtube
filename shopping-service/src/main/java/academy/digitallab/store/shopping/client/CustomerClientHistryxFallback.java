package academy.digitallab.store.shopping.client;

import academy.digitallab.store.shopping.model.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class CustomerClientHistryxFallback implements CustomerClient {

    @Override
    public ResponseEntity<Customer> getCustomer(@PathVariable("id") long id) {
        Customer customer = Customer.builder()
                .firstName("none")
                .lastName("none")
                .email("none")
                .photoUrl("none")
                .build();
        
        return ResponseEntity.ok(customer);
    }

}
