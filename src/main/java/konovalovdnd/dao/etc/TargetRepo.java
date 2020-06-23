package konovalovdnd.dao.etc;

import konovalovdnd.model.etc.Targets;
import org.springframework.data.repository.CrudRepository;

public interface TargetRepo extends CrudRepository<Targets, String> {
}
