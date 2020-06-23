package konovalovdnd.dao;

import konovalovdnd.model.MagicSkill;
import org.springframework.data.repository.CrudRepository;

public interface MagicSkillsRepo extends CrudRepository<MagicSkill, String> {
    MagicSkill findByName(String name);
}
