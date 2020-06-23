package konovalovdnd.dao;

import konovalovdnd.model.Skill;
import org.springframework.data.repository.CrudRepository;

public interface SkillsRepo extends CrudRepository<Skill, String> {
    Skill findByName(String name);
}
