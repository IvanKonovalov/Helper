package konovalovdnd.dao.manyToMany;

import konovalovdnd.model.manyToMany.AbilitiesAndArmorsTypes;
import org.springframework.data.repository.CrudRepository;

public interface AbilitiesAndArmorTypesRepo extends CrudRepository<AbilitiesAndArmorsTypes, Integer> {
}
