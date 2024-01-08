package ru.gor.library.domain;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * A Author.
 */
@Entity
@Table(name = "author")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Author implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "birth_year")
    private Integer birthYear;

    @Column(name = "deathyear")
    private Integer deathyear;

    @Column(name = "birthcountry")
    private String birthcountry;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Author id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public Author fullName(String fullName) {
        this.setFullName(fullName);
        return this;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getBirthYear() {
        return this.birthYear;
    }

    public Author birthYear(Integer birthYear) {
        this.setBirthYear(birthYear);
        return this;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Integer getDeathyear() {
        return this.deathyear;
    }

    public Author deathyear(Integer deathyear) {
        this.setDeathyear(deathyear);
        return this;
    }

    public void setDeathyear(Integer deathyear) {
        this.deathyear = deathyear;
    }

    public String getBirthcountry() {
        return this.birthcountry;
    }

    public Author birthcountry(String birthcountry) {
        this.setBirthcountry(birthcountry);
        return this;
    }

    public void setBirthcountry(String birthcountry) {
        this.birthcountry = birthcountry;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Author)) {
            return false;
        }
        return getId() != null && getId().equals(((Author) o).getId());
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Author{" +
            "id=" + getId() +
            ", fullName='" + getFullName() + "'" +
            ", birthYear=" + getBirthYear() +
            ", deathyear=" + getDeathyear() +
            ", birthcountry='" + getBirthcountry() + "'" +
            "}";
    }
}
