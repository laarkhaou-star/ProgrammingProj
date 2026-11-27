import java.util.HashMap;

/**
 * Write a description of class Ingredients here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ingredients
{
    private String nameOfIngredient;
    private double quantity;
    private Unit unit;

    public Ingredients() // we dont know how to use hashmap so i am proposing this code after the hashmap code. i still saved the hashmap code
    {
        //HashMap<String, Double> ingredient = new HashMap<>();
        public Ingredients(String name, double quantity, Unit unit) {
        this.nameOfIngredient = name;
        this.quantity = quantity;
        this.unit = unit;
    }
    
    public int sampleMethod(int y)
    {
       y=0;
       return y;
    }
}