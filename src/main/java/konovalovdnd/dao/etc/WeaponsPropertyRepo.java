package konovalovdnd.dao.etc;

import konovalovdnd.model.etc.WeaponsProperties;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WeaponsPropertyRepo extends CrudRepository<WeaponsProperties, String> {
    WeaponsProperties findByName(String name);
}
