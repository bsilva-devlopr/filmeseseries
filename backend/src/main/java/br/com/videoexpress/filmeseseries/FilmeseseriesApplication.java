package br.com.videoexpress.filmeseseries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FilmeseseriesApplication {

    private static String title;

    public static void main(String[] args) {
        SpringApplication.run(FilmeseseriesApplication.class, args);
        textExecution();
    }

    public static String textExecution() {

        title = System.out.printf("### Ambiente Filmes e Séries no ar ###").toString();

        return title;
    }

}
