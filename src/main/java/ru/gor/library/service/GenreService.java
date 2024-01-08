package ru.gor.library.service;

import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ru.gor.library.domain.Genre;

/**
 * Service Interface for managing {@link ru.gor.library.domain.Genre}.
 */
public interface GenreService {
    /**
     * Save a genre.
     *
     * @param genre the entity to save.
     * @return the persisted entity.
     */
    Genre save(Genre genre);

    /**
     * Updates a genre.
     *
     * @param genre the entity to update.
     * @return the persisted entity.
     */
    Genre update(Genre genre);

    /**
     * Partially updates a genre.
     *
     * @param genre the entity to update partially.
     * @return the persisted entity.
     */
    Optional<Genre> partialUpdate(Genre genre);

    /**
     * Get all the genres.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<Genre> findAll(Pageable pageable);

    /**
     * Get the "id" genre.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Genre> findOne(Long id);

    /**
     * Delete the "id" genre.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
