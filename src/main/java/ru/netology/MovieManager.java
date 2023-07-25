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
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
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
        MovieManager[] result = new MovieManager[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}

