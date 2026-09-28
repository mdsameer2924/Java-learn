/*
Question 1 (Easy): The Movie Rating
Create a class Movie with two private attributes: title (String) and rating (double).
Write a constructor to initialize the title.
Write getter and setter methods for both attributes.
In main, create a Movie object, use the setters to assign a title and a rating of 8.5, and 
then use the getters to print them out.
*/

package practice;

class Movie{
    // class's attributes
    private String title;
    private double rating;

    //constructor
    Movie(String title){
        this.title=title;
    }

    // getter 
    public void getMovieTitle(){
        System.out.println(this.title);

    }

    public  void getMovieRating(){
        System.out.printf("%.1f\n",this.rating);
    }

    //Setter 
    public void setMovieRating(double rating){
    this.rating=rating;
    }

}
public class FirstQuestion{
    public static void main(String[] args){
        // code here 
        Movie f=new Movie("ROcky");  
        f.setMovieRating(9.9);
        f.getMovieRating();
        f.getMovieTitle();
    }
}
