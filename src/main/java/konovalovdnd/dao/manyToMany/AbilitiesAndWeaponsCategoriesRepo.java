package konovalovdnd.dao.manyToMany;

import konovalovdnd.model.manyToMany.AbilitiesAndWeaponsCategories;
import org.springframework.data.repository.CrudRepository;

public interface AbilitiesAndWeaponsCategoriesRepo extends CrudRepository<AbilitiesAndWeaponsCategories, Integer> {
}
