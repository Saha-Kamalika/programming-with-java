import java.util.Scanner;

public class findMovie {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Movies[] movies=new Movies[4];
        for(int i=0;i<4;i++){
            movies[i]=new Movies(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt());
        }
        String director=sc.next();
        int budget=sc.nextInt();
        int rating=sc.nextInt();
        float ans=findAvgBudgetByDirector(movies, director);
        if(ans>0) System.out.println(ans);
        else System.out.println("Sorry - The given director has not yet directed any movie");

        Movies res=getMovieByRatingBudget(movies, rating, budget);
        if(res!=null) System.out.println(res.getMovieId());
        else System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
    }
    public static float findAvgBudgetByDirector(Movies[] movies, String director){
        float avg=0;
        int count=0;
        for(int i=0;i<movies.length;i++){
            if(movies[i].getDirector().equalsIgnoreCase(director)){
                avg+=movies[i].getBudget();
                count++;
            }
        }
        if(count==0) return 0;
        else return (avg/count);
    }
    public static Movies getMovieByRatingBudget(Movies[] movies, int rating, int budget){
        Movies temp=null;
        for(int i=0;i< movies.length;i++){
            if((movies[i].getBudget()==budget) && (movies[i].getRating()==rating) && (movies[i].getBudget() % movies[i].getRating()==0)){
                temp=movies[i];
                return temp;
            }
        }
        return null;
    }
}
class Movies{
    private int movieId;
    private String director;
    private int rating;
    private int budget;

    public int getMovieId(){
        return movieId;
    }
    public void setMovieId(int movieId){
        this.movieId=movieId;
    }
    public String getDirector(){
        return director;
    }
    public void setDirector(String director){
        this.director=director;
    }
    public int getRating(){
        return rating;
    }
    public void setRating(int rating){
        this.rating=rating;
    }
    public int getBudget(){
        return budget;
    }
    public void setBudget(int budget){
        this.budget=budget;
    }
    public Movies(int movieId, String director, int rating, int budget){
        this.movieId=movieId;
        this.director=director;
        this.rating=rating;
        this.budget=budget;
    }
}
