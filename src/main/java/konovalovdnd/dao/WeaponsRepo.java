package konovalovdnd.dao;

import konovalovdnd.model.Weapon;
import org.springframework.data.repository.CrudRepository;

public interface WeaponsRepo extends CrudRepository<Weapon, String> {
}
