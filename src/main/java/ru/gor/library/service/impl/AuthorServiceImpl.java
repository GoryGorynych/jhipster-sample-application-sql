package ru.gor.library.service.impl;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.gor.library.domain.Author;
import ru.gor.library.repository.AuthorRepository;
import ru.gor.library.service.AuthorService;

/**
 * Service Implementation for managing {@link ru.gor.library.domain.Author}.
 */
@Service
@Transactional
public class AuthorServiceImpl implements AuthorService {

    private final Logger log = LoggerFactory.getLogger(AuthorServiceImpl.class);

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Author save(Author author) {
        log.debug("Request to save Author : {}", author);
        return authorRepository.save(author);
    }

    @Override
    public Author update(Author author) {
        log.debug("Request to update Author : {}", author);
        return authorRepository.save(author);
    }

    @Override
    public Optional<Author> partialUpdate(Author author) {
        log.debug("Request to partially update Author : {}", author);

        return authorRepository
            .findById(author.getId())
            .map(existingAuthor -> {
                if (author.getFullName() != null) {
                    existingAuthor.setFullName(author.getFullName());
                }
                if (author.getBirthYear() != null) {
                    existingAuthor.setBirthYear(author.getBirthYear());
                }
                if (author.getDeathyear() != null) {
                    existingAuthor.setDeathyear(author.getDeathyear());
                }
                if (author.getBirthcountry() != null) {
                    existingAuthor.setBirthcountry(author.getBirthcountry());
                }

                return existingAuthor;
            })
            .map(authorRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Author> findAll(Pageable pageable) {
        log.debug("Request to get all Authors");
        return authorRepository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Author> findOne(Long id) {
        log.debug("Request to get Author : {}", id);
        return authorRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Author : {}", id);
        authorRepository.deleteById(id);
    }
}
