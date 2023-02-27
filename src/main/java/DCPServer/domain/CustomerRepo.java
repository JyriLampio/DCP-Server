package DCPServer.domain;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<Customer, Long> {
	Customer findByName(String name);
}
