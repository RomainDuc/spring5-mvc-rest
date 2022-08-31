package guru.springfamework.bootstrap;

import guru.springfamework.domain.v1.Category;
import guru.springfamework.domain.v1.Customer;
import guru.springfamework.domain.v1.Vendor;
import guru.springfamework.repositories.CategoryRepository;
import guru.springfamework.repositories.CustomerRepository;
import guru.springfamework.repositories.VendorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Boostrap implements CommandLineRunner {

    private final CategoryRepository categoryRepository;
    private final CustomerRepository customerRepository;
    private final VendorRepository vendorRepository;

    public Boostrap(CategoryRepository categoryRepository, CustomerRepository customerRepository, VendorRepository vendorRepository) {
        this.categoryRepository = categoryRepository;
        this.customerRepository = customerRepository;
        this.vendorRepository = vendorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        populateCategories();
        populateCustomers();
        populateVendors();
    }

    private void populateCategories() {
        Category fruits = new Category();
        fruits.setName("Fruits");

        Category dried = new Category();
        dried.setName("Dried");

        Category fresh = new Category();
        fresh.setName("Fresh");

        Category exotic = new Category();
        exotic.setName("Exotic");

        Category nuts = new Category();
        nuts.setName("Nuts");

        categoryRepository.save(fruits);
        categoryRepository.save(dried);
        categoryRepository.save(fresh);
        categoryRepository.save(exotic);
        categoryRepository.save(nuts);


        System.out.println("Categories Loaded = " + categoryRepository.count() );
    }

    private void populateCustomers() {
        Customer c1 = new Customer();
        c1.setFirstName("Michael");
        c1.setLastName("Lachappele");

        Customer c2 = new Customer();
        c2.setFirstName("David");
        c2.setLastName("Winter");

        Customer c3 = new Customer();
        c3.setFirstName("Anne");
        c3.setLastName("Hine");

        Customer c4 = new Customer();
        c4.setFirstName("Alice");
        c4.setLastName("Eastman");

        Customer c5 = new Customer();
        c5.setFirstName("Sam");
        c5.setLastName("Axe");

        customerRepository.save(c1);
        customerRepository.save(c2);
        customerRepository.save(c3);
        customerRepository.save(c4);
        customerRepository.save(c5);

        System.out.println("Customers Loaded = " + customerRepository.count() );
    }

    private void populateVendors() {
        Vendor v1 = new Vendor();
        v1.setName("Western Tasty Fruits Ltd.");

        Vendor v2 = new Vendor();
        v2.setName("Exotic Fruits Company");

        Vendor v3 = new Vendor();
        v3.setName("Home Fruits");

        Vendor v4 = new Vendor();
        v4.setName("Fun Fresh Fruits Ltd.");

        Vendor v5 = new Vendor();
        v5.setName("Nuts for Nuts Company");

        vendorRepository.save(v1);
        vendorRepository.save(v2);
        vendorRepository.save(v3);
        vendorRepository.save(v4);
        vendorRepository.save(v5);

        System.out.println("Vendors Loaded = " + vendorRepository.count() );

    }


}
