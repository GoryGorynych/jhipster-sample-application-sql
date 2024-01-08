package ru.gor.library.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.gor.library.domain.BookTestSamples.*;
import static ru.gor.library.domain.CommentTestSamples.*;

import org.junit.jupiter.api.Test;
import ru.gor.library.web.rest.TestUtil;

class CommentTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Comment.class);
        Comment comment1 = getCommentSample1();
        Comment comment2 = new Comment();
        assertThat(comment1).isNotEqualTo(comment2);

        comment2.setId(comment1.getId());
        assertThat(comment1).isEqualTo(comment2);

        comment2 = getCommentSample2();
        assertThat(comment1).isNotEqualTo(comment2);
    }

    @Test
    void bookTest() throws Exception {
        Comment comment = getCommentRandomSampleGenerator();
        Book bookBack = getBookRandomSampleGenerator();

        comment.setBook(bookBack);
        assertThat(comment.getBook()).isEqualTo(bookBack);

        comment.book(null);
        assertThat(comment.getBook()).isNull();
    }
}
