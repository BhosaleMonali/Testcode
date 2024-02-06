package movie_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import movie_api.entity.Movie;



public interface Movierepository extends JpaRepository<Movie, Integer> {

}
