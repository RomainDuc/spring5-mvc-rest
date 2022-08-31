package guru.springfamework.repositories;

import guru.springfamework.domain.v1.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
