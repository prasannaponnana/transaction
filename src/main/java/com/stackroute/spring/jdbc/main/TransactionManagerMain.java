package com.stackroute.spring.jdbc.main;



import com.stackroute.spring.jdbc.model.Actor;
import com.stackroute.spring.jdbc.model.Movie;
import com.stackroute.spring.jdbc.service.MovieManagerImpl;
import com.stackroute.spring.jdbc.service.MovieManager;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionManagerMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
                "spring.xml");

        MovieManager movieManager = ctx.getBean("movieManager",
                MovieManagerImpl.class);

        Movie movie = createDummyCustomer();
        movieManager.createMovie(movie);

        ctx.close();
    }

    private static Movie createDummyCustomer() {
        Movie movie = new Movie();
        movie.setMovieid(1);
        movie.setMoviename("Darling");
        Actor actor = new Actor();
        actor.setId(3);
        actor.setName("Prabhas");
        // setting value more than 20 chars, so that SQLException occurs
        actor.setAge(35);
        movie.setActor(actor);
        movie.setYear(2002);
        movie.setRating(4.9f);
        return movie;
    }

}