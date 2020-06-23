package konovalovdnd.dao.manyToMany;

import konovalovdnd.model.manyToMany.WeaponsAndProperties;
import org.springframework.data.repository.CrudRepository;

public interface WeaponsAndPropertiesRepo extends CrudRepository<WeaponsAndProperties, Integer> {
}
