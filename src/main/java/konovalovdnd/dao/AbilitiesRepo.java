package konovalovdnd.dao;

import konovalovdnd.model.Ability;
import org.springframework.data.repository.CrudRepository;

public interface AbilitiesRepo extends CrudRepository<Ability, String> {
    Ability findByName(String name);
}
