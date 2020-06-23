package konovalovdnd.model;

import javax.persistence.*;

@Entity
@Table(name = "pounches")
public class Pounch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;
    @Column(name = "pm")
    private Integer pm;
    @Column(name = "em")
    private Integer em;
    @Column(name = "gm")
    private Integer gm;
    @Column(name = "sm")
    private Integer sm;
    @Column(name = "km")
    private Integer km;

    public Pounch() {
    }

    public Pounch(Integer pm, Integer em, Integer gm, Integer sm, Integer km) {
        this.pm = pm;
        this.em = em;
        this.gm = gm;
        this.sm = sm;
        this.km = km;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPm() {
        return pm;
    }

    public void setPm(Integer pm) {
        this.pm = pm;
    }

    public Integer getEm() {
        return em;
    }

    public void setEm(Integer em) {
        this.em = em;
    }

    public Integer getGm() {
        return gm;
    }

    public void setGm(Integer gm) {
        this.gm = gm;
    }

    public Integer getSm() {
        return sm;
    }

    public void setSm(Integer sm) {
        this.sm = sm;
    }

    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }
}
