package guru.springfamework.repositories;

import guru.springfamework.domain.v1.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
