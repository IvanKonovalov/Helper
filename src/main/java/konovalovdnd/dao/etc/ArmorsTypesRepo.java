package konovalovdnd.dao.etc;

import konovalovdnd.model.etc.ArmorTypes;
import org.springframework.data.repository.CrudRepository;

public interface ArmorsTypesRepo extends CrudRepository<ArmorTypes, String> {
    ArmorTypes findByName(String name);
}
