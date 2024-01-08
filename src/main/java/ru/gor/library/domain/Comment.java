package ru.gor.library.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.io.Serializable;

/**
 * A Comment.
 */
@Entity
@Table(name = "comment")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "nick_name")
    private String nickName;

    @Column(name = "comment_text")
    private String commentText;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties(value = { "comments", "author", "genre" }, allowSetters = true)
    private Book book;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Comment id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return this.nickName;
    }

    public Comment nickName(String nickName) {
        this.setNickName(nickName);
        return this;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getCommentText() {
        return this.commentText;
    }

    public Comment commentText(String commentText) {
        this.setCommentText(commentText);
        return this;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public Book getBook() {
        return this.book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Comment book(Book book) {
        this.setBook(book);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Comment)) {
            return false;
        }
        return getId() != null && getId().equals(((Comment) o).getId());
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Comment{" +
            "id=" + getId() +
            ", nickName='" + getNickName() + "'" +
            ", commentText='" + getCommentText() + "'" +
            "}";
    }
}
