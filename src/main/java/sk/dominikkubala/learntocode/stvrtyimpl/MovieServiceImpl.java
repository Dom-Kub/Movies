package sk.dominikkubala.learntocode.stvrtyimpl;

import org.springframework.stereotype.Service;
import sk.dominikkubala.learntocode.druhyrepository.MovieRepositroy;
import sk.dominikkubala.learntocode.prvymodel.Movie;
import sk.dominikkubala.learntocode.tretiservices.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

    MovieRepositroy movieRepositroy;

    public MovieServiceImpl(MovieRepositroy movieRepositroy) {
        this.movieRepositroy = movieRepositroy;
    }

    @Override
    public Movie createAndAddMovie() {
        Movie movie = new Movie();
        movie.setName("Spiderman");



        return movieRepositroy.save(movie);
    }
}
