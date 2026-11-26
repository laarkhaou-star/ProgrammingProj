
/**
 * Write a description of class Recipes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recipe
{
    protected String nameOfRecipe;
    // private String typeOfRecipe;  --> we added types of recipes as separate subclasses of the recipe class, so we dont need this one anymore
    // private String ingredients;   --> ingredients wont be a field, it will be its own class, smt abt hashmap or idk
    protected String tag;
    protected int rating;
    protected int numberOfServings;
    protected String steps;

    /**
     * Constructor for objects of class Recipes
     */
    public Recipe()
    {   

    }

    public void rateRecipe()
    {

    }

    public void printRecipeDetails()
    {

    }
}