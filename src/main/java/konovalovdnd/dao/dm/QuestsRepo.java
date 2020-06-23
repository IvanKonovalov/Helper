package konovalovdnd.dao.dm;

import konovalovdnd.model.dm.Quest;
import org.springframework.data.repository.CrudRepository;

public interface QuestsRepo extends CrudRepository<Quest, Integer> {
}
