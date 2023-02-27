package DCPServer.domain;

import org.springframework.data.repository.CrudRepository;

public interface EventRepo extends CrudRepository<Event, Long> {
	Event findByName(String name);
}
