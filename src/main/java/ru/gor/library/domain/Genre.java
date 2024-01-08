package ru.gor.library.domain;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * A Genre.
 */
@Entity
@Table(name = "genre")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Genre implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "decription")
    private String decription;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Genre id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public Genre title(String title) {
        this.setTitle(title);
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDecription() {
        return this.decription;
    }

    public Genre decription(String decription) {
        this.setDecription(decription);
        return this;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Genre)) {
            return false;
        }
        return getId() != null && getId().equals(((Genre) o).getId());
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Genre{" +
            "id=" + getId() +
            ", title='" + getTitle() + "'" +
            ", decription='" + getDecription() + "'" +
            "}";
    }
}
