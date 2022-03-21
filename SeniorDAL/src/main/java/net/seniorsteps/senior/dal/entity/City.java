package net.seniorsteps.senior.dal.entity;
// Generated Dec 20, 2021 11:18:33 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

/**
 * City generated by hbm2java
 */
@Entity
@Table(name = "city",
         catalog = "senior_app",
         uniqueConstraints = {
            @UniqueConstraint(columnNames = "name_ar")
            , @UniqueConstraint(columnNames = "name_en")}
)
public class City implements java.io.Serializable {

    private Integer id;
    private String nameAr;
    private String nameEn;
    private Set<Area> areas = new HashSet<Area>(0);

    public City() {
    }

    public City(String nameAr, String nameEn) {
        this.nameAr = nameAr;
        this.nameEn = nameEn;
    }

    public City(String nameAr, String nameEn, Set<Area> areas) {
        this.nameAr = nameAr;
        this.nameEn = nameEn;
        this.areas = areas;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "name_ar", unique = true, nullable = false, length = 100)
    public String getNameAr() {
        return this.nameAr;
    }

    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }

    @Column(name = "name_en", unique = true, nullable = false, length = 100)
    public String getNameEn() {
        return this.nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    @OneToMany( mappedBy = "city")
    @LazyCollection(LazyCollectionOption.TRUE)
    public Set<Area> getAreas() {
        return this.areas;
    }

    public void setAreas(Set<Area> areas) {
        this.areas = areas;
    }

}
