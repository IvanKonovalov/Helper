package konovalovdnd.dao;

import konovalovdnd.model.Backstory;
import org.springframework.data.repository.CrudRepository;

public interface BackstoriesRepo extends CrudRepository<Backstory, String> {
}
