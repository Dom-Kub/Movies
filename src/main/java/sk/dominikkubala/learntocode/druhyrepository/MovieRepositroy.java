package sk.dominikkubala.learntocode.druhyrepository;

import org.springframework.data.repository.CrudRepository;
import sk.dominikkubala.learntocode.prvymodel.Movie;

public interface MovieRepositroy extends CrudRepository<Movie,Long> {
 

}
