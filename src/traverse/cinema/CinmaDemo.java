package traverse.cinema;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @author li'zi'yao
 */
public class CinmaDemo {
    public static void main(String[] args) {
        Collection<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie("泰坦尼克号", 9.9, "小李子"));
        movies.add(new Movie("阿凡达   ", 8.0, "unkonw"));
        movies.add(new Movie("风声", 7.9, "realunkonw"));
        System.out.println(movies);
        for (Movie zz : movies) {
            System.out.println(zz.getName() + " " + zz.getActor() + " " + zz.getScore());
        }
        System.out.println();
        movies.forEach(new Consumer<Movie>() {
            @Override
            public void accept(Movie movie) {
                System.out.println(movie.getName() + " " + movie.getActor() + " " + movie.getScore());
            }
        });
        System.out.println();
        Iterator<Movie> it =movies.iterator();
        while (it.hasNext()) {
            Movie z = it.next();
            System.out.println(z.getName()+" "+z.getActor()+" "+z.getScore());
        }


    }
}
