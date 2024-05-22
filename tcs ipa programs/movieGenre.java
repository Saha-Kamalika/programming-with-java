package xplore;

import java.util.Arrays;
import java.util.Scanner;
public class movieGenre {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Movie[] movies=new Movie[4];
        for(int i=0;i<4;i++){
            movies[i]=new Movie(sc.next(), sc.next(), sc.next(), sc.nextInt());
        }
        String searchGenre= sc.next();
        Movie[] result = getMovieByGenre(movies, searchGenre);
        for(int i=0;i< result.length;i++){
            if(result[i].getBudget()>80000000)
                System.out.println("High Budget xplore.Movie");
            else
                System.out.println("Low Budget xplore.Movie");
        }
    }
    public static Movie[] getMovieByGenre(Movie[] movies,String searchGenre){
        Movie[] refined = new Movie[0];
        for(int i=0;i<4;i++){
            if(movies[i].getGenre().equalsIgnoreCase(searchGenre)){
                refined=Arrays.copyOf(refined, refined.length+1);
                refined[refined.length-1] = movies[i];
            }
        }
        return refined;
    }
}
class Movie{
    private String movieName;
    private String company;
    private String genre;
    private int budget;
    public String getMovieName(){
        return movieName;
    }
    public void setMovieName(String movieName){
        this.movieName=movieName;
    }
    public String getCompany(){
        return company;
    }
    public void setCompany(String company){
        this.company=company;
    }
    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre){
        this.genre=genre;
    }
    public int getBudget(){
        return budget;
    }
    public void setBudget(int budget){
        this.budget=budget;
    }
    public Movie(String movieName, String company, String genre, int budget){
        this.movieName=movieName;
        this.company=company;
        this.genre=genre;
        this.budget=budget;
    }
}
/*
Create class xplore.Movie with below attributes: movieName - String company - String genre - String budget - int

Create class Solution and implement static method "getMovieByGenre" in the Solution class. This method will take array of xplore.Movie objects and a searchGenre String as parameters. And will return another array of xplore.Movie objects where the searchGenre String matches with the original array of xplore.Movie object's genre attribute (case insensitive search).

Write necessary getters and setters.

Before calling "getMovieByGenre" method in the main method, read values for four xplore.Movie objects referring the attributes in above sequence along with a String searchGenre. Then call the "getMovieByGenre" method and write logic in main method to print "High Budget xplore.Movie",if the movie budget attribute is greater than 80000000 else print "Low Budget xplore.Movie".*/