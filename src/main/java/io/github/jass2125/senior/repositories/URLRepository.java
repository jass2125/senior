package io.github.jass2125.senior.repositories;

import io.github.jass2125.senior.domain.model.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface URLRepository extends JpaRepository<Url, Long> {

    Optional<Url> findByUrl(String url);

    Optional<Url> findByShortUrl(String shortURL);

}
