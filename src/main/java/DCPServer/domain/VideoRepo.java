package DCPServer.domain;

import org.springframework.data.repository.CrudRepository;

public interface VideoRepo extends CrudRepository<Video, Long> {
	Video findByTitle(String title);
}
