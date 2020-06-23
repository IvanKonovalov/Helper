package konovalovdnd.dao.etc;

import konovalovdnd.model.etc.WeaponsCategories;
import org.springframework.data.repository.CrudRepository;

public interface WeaponsCategoryRepo extends CrudRepository<WeaponsCategories, String> {
    WeaponsCategories findByName(String name);
}
