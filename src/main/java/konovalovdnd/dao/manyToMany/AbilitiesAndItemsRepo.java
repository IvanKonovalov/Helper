package konovalovdnd.dao.manyToMany;

import konovalovdnd.model.manyToMany.AbilitiesAndItems;
import org.springframework.data.repository.CrudRepository;

public interface AbilitiesAndItemsRepo extends CrudRepository<AbilitiesAndItems, String> {
}
