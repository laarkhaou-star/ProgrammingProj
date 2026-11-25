import java.util.ArrayList;

/**
 * Write a description of class RecipeBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RecipeBook 
{
    public ArrayList<String>recipes = new ArrayList<>();
    private int yearOfPublication;
    private String nameOfBook;
    private String nameOfAuthor;
   

    /**
     * Constructor for objects of class RecipeBook
     */
    public RecipeBook()
    {
        recipes.add("soup");
        recipes.add("cake");
        recipes.add("rice");
        recipes.add("pasta");

        yearOfPublication = 2026;
        nameOfBook = "Cooking";
        nameOfAuthor = "random name";
       

    }

    public void printDetails(){

        System.out.println(nameOfBook);
        System.out.println(nameOfAuthor);
        System.out.println(yearOfPublication );
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void rating()
    {
        

    }

        public void listRecipes()
    {

    }

    public void listByType()
    {
         
    }

    public void addRecipe()
    {
       
    }
    
    public void topRated()
    {

    }

    public void searchRecipes(String name)
    {
        
        
        

    }
}