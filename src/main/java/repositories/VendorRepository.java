package repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import domain.Vendor;

public interface VendorRepository extends ReactiveMongoRepository<Vendor, String> {
}
