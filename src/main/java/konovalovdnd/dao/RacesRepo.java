package konovalovdnd.dao;

import konovalovdnd.model.Race;
import org.springframework.data.repository.CrudRepository;

public interface RacesRepo extends CrudRepository<Race, String> {
}
