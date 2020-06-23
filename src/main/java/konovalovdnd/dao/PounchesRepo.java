package konovalovdnd.dao;

import konovalovdnd.model.Pounch;
import org.springframework.data.repository.CrudRepository;

public interface PounchesRepo extends CrudRepository<Pounch, Integer> {
}
