package konovalovdnd.dao;

import konovalovdnd.model.HeroClass;
import org.springframework.data.repository.CrudRepository;

public interface HeroClassRepo extends CrudRepository<HeroClass, String> {
}
