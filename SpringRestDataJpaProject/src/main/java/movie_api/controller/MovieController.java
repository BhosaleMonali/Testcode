package movie_api.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import movie_api.entity.Movie;
//import movie_api.exception.MovieNotFoundException;
import movie_api.service.MovieService;

@RestController
public class MovieController {
//GET,/movie_api-to get all the movies
	@Autowired//Injecting the refernce of Movieservice
	private MovieService movieServciceref;
	
	//@RequestMapping("/movie-api")
	@GetMapping("/movie-api")
	public Collection<Movie> getAllMovies(){
		
Collection<Movie> allMovies = movieServciceref.getAllMovies();
		
		return allMovies;	
	}
	
	
	//GET movie-api/{movie_id}-to get one movie against its ID
	//@RequestMapping("/movie-api/{movie_id}")
	@GetMapping("/movie-api/{movie_id}")
	public Movie getMovieById(@PathVariable("movie_id") Integer movieId) {
		Movie foundMovie=movieServciceref.getMovieById(movieId);
//		if(foundMovie == null) {
//			MovieNotFoundException ex=new MovieNotFoundException("unable to find movie",movieId);
//			throw ex;
//		}
		return foundMovie;
	}
	
	//Post /movie-api
	//@RequestMapping(value="/movie-api",method=RequestMethod.POST)
	@PostMapping("movie-api")
	public  void createNewMovie(@RequestBody Movie newMovie) {
		System.out.println("Object Receiver :" + newMovie);
		movieServciceref.addNewMovie( newMovie);
		
	}
}
