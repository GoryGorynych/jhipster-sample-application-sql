package ru.gor.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gor.library.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
