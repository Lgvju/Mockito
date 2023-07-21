package ru.netology;

public class MovieManager {
    private MovieManager[] movies;
    private int limitMovie;
    private int resultLength;

    public MovieManager() {
        limitMovie = 5;
        this.movies = new MovieManager[0];
    }

    public MovieManager(int size) {
        limitMovie = size;
        this.movies = new MovieManager[0];
    }

    public int getLimitMovie() {
        return limitMovie;
    }


    //Добавление нового фильма

    public void addFilms(MovieManager item) {
        MovieManager[] tmp = new MovieManager[movies.length + 1];
        for (int y = 0; y < movies.length; y++) {
            tmp[y] = movies[y];
        }
        tmp[tmp.length - 1] = item;
        movies = tmp;
    }
    // вывод всех фильмов в порядке добавления
    public MovieManager[] findAll() {

        return movies;
    }


    //вывод последних добавленных в обратном порядке
    public MovieManager[] findLast() {
        if (limitMovie > movies.length) {
            resultLength = movies.length;
        } else {
            resultLength = limitMovie;
        }
        MovieManager[] rezult = new MovieManager[resultLength];
        for (int y = 0; y < resultLength; y++) {
            rezult[y] = movies[movies.length - 1 - y];
        }
        return rezult;
    }
}

