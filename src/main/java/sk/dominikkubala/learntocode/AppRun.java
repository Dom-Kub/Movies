package sk.dominikkubala.learntocode;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sk.dominikkubala.learntocode.tretiservices.MovieService;

@Component
public class AppRun {


    MovieService movieService;

//    @Autowired
//    public AppRun(MovieService movieService) {
//        this.movieService = movieService;
//    }

    public void run(){
        movieService.createAndAddMovie();
    }

    @Autowired
    public void setMovieService(MovieService movieService) {
        this.movieService = movieService;
    }

}
