package konovalovdnd.model.etc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sizes")
public class Sizes {
    @Id
    @Column(name = "char", unique = true, nullable = false)
    private String character;

    @Column(name = "height")
    private int height;

    @Column(name = "width")
    private int width;

    public Sizes() {
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
