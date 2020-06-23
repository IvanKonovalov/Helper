package konovalovdnd.dao;

import konovalovdnd.model.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepo extends CrudRepository<Item, Integer> {
    Item findByName(String name);
}
