import greenfoot.*;

/**
 * Write a description of class Destroer here.
 * 
 * @author (Allen Hichard) 
 * @version (a version number or a date)
 */
public class BlocoDestrutivel extends Actor
{
    /**
     * Act - do whatever the Destroer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (isTouching(Explosao.class)){
         getWorld().removeObject(this);   
         }
    }    
}
