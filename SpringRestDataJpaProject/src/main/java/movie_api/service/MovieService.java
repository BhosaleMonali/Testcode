package movie_api.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import movie_api.entity.Movie;

import movie_api.repository.Movierepository;
//import movie_api.store.MovieStore;


@Service  //marks this class as Service implementation class
public class MovieService {//class meant for handling Bussiness logic if any
	@Autowired
	private Movierepository movieRepositoryRef;
	public Collection<Movie> getAllMovies(){
		//MovieRepository obj=new MovieRepository();
Collection<Movie> allMovies= movieRepositoryRef.findAll();
		
		return allMovies;
	}

	
	public Movie getMovieById(Integer movieId) {
		Optional<Movie> optionalRef = movieRepositoryRef.findById(movieId);
//		Movie foundMovie=movieRepositoryRef.getMovieById(movieId);
		Movie foundMovie=null;
		if(!optionalRef.isEmpty())
		 foundMovie = optionalRef.get();
		return  foundMovie;
	}
	public  void addNewMovie(Movie newMovie) {
		movieRepositoryRef.save(newMovie);
	}
	
}
