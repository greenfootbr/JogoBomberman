import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MaisVelocidade here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MaisVelocidade extends ItemEspecial
{
    /**
     * Act - do whatever the MaisVelocidade wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        getImage().scale( 20 , 20 );
        
        if( isTouching(Bomberman.class) ){
            getWorld().removeObject(this);
        }
    }
}
