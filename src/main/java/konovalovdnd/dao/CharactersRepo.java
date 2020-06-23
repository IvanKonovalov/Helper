package konovalovdnd.dao;


import konovalovdnd.model.HCharacter;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CharactersRepo extends CrudRepository<HCharacter, Integer> {

    Optional<HCharacter> findById(Integer id);
}