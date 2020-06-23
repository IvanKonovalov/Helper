package konovalovdnd.dao;

import konovalovdnd.model.Armor;
import org.springframework.data.repository.CrudRepository;

public interface ArmorsRepo extends CrudRepository<Armor, String> {
}
