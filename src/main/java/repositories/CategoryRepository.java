package repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import domain.Category;

public interface CategoryRepository extends ReactiveMongoRepository<Category, String> {
}
