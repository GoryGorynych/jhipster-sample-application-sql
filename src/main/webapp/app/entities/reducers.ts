import author from 'app/entities/author/author.reducer';
import genre from 'app/entities/genre/genre.reducer';
import book from 'app/entities/book/book.reducer';
import comment from 'app/entities/comment/comment.reducer';
/* jhipster-needle-add-reducer-import - JHipster will add reducer here */

const entitiesReducers = {
  author,
  genre,
  book,
  comment,
  /* jhipster-needle-add-reducer-combine - JHipster will add reducer here */
};

export default entitiesReducers;
