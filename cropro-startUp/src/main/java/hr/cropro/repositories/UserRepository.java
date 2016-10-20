package hr.cropro.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hr.cropro.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	List<User> findByName(String name);
}
