import greenfoot.*;
import java.util.*;

/**
 * Write a description of class Formiga here.
 * 
 * @author (Allen Hichard) 
 * @version (a version number or a date)
 */
public class Bomberman extends Actor
{
    /**
     * Act - do whatever the Formiga wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int movimento = 0;
    int i = 0;
    int a = 0;
    Bomba bomba = new Bomba();
    boolean controle = false;
    
    String down, left, up, right, space;
    
    GreenfootImage stand = new GreenfootImage("standDown.gif");
    GreenfootImage bomba1 = new GreenfootImage("Bomb1.gif");
    GreenfootImage bomba2 = new GreenfootImage("Bomb2.gif");
    GreenfootImage bomba3 = new GreenfootImage("Bomb3.gif");
    GreenfootImage bomba4 = new GreenfootImage("Explosion0.gif");
    
    Explosao explosao00 = new Explosao();
    Explosao explosao11 = new Explosao();
    Explosao explosao22 = new Explosao();
    Explosao explosao33 = new Explosao();
    LinkedList lista = new LinkedList();
    
   
   

    GreenfootImage frente0 = new GreenfootImage("standSideRight.gif");
    GreenfootImage frente1 = new GreenfootImage("walkSideRight1.gif");
    GreenfootImage frente2 = new GreenfootImage("walkSideRight2.gif");
    GreenfootImage frente3 = new GreenfootImage("walkSideRight3.gif");
    GreenfootImage frente4 = new GreenfootImage("walkSideRight4.gif");
    GreenfootImage frente5 = new GreenfootImage("walkSideRight5.gif");
    GreenfootImage frente6 = new GreenfootImage("walkSideRight6.gif");
    
    GreenfootImage atras0 = new GreenfootImage("standSideLeft.gif");
    GreenfootImage atras1 = new GreenfootImage("walkSideLeft1.gif");
    GreenfootImage atras2 = new GreenfootImage("walkSideLeft2.gif");
    GreenfootImage atras3 = new GreenfootImage("walkSideLeft3.gif");
    GreenfootImage atras4 = new GreenfootImage("walkSideLeft4.gif");
    GreenfootImage atras5 = new GreenfootImage("walkSideLeft5.gif");
    GreenfootImage atras6 = new GreenfootImage("walkSideLeft6.gif");
    
    GreenfootImage cima0 = new GreenfootImage("standUp.gif");
    GreenfootImage cima1 = new GreenfootImage("walkUp1.gif");
    GreenfootImage cima2 = new GreenfootImage("walkUp2.gif");
    GreenfootImage cima3 = new GreenfootImage("walkUp3.gif");
    GreenfootImage cima4 = new GreenfootImage("walkUp4.gif");
    GreenfootImage cima5 = new GreenfootImage("walkUp5.gif");
    GreenfootImage cima6 = new GreenfootImage("walkUp6.gif");
    
    GreenfootImage baixo0 = new GreenfootImage("standDown.gif");
    GreenfootImage baixo1 = new GreenfootImage("walkDown1.gif");
    GreenfootImage baixo2 = new GreenfootImage("walkDown2.gif");
    GreenfootImage baixo3 = new GreenfootImage("walkDown3.gif");
    GreenfootImage baixo4 = new GreenfootImage("walkDown4.gif");
    GreenfootImage baixo5 = new GreenfootImage("walkDown5.gif");
    GreenfootImage baixo6 = new GreenfootImage("walkDown6.gif");
    
    public Bomberman(String right, String left, String down, String up, String space){
       this.right = right;
       this.left = left;
       this.down = down;
       this.up = up;
       this. space = space;
    }
    
    public boolean getControle(){
        return controle;
    }
    public void act() 
    {
        
    if(Greenfoot.isKeyDown(right)){ 
        stand = frente0;
        setLocation(getX()+3, getY());
        if(movimento ==0){
           setImage(frente1);}
        if(movimento==8){
           setImage(frente2);}
        if(movimento==16){
           setImage(frente3);}
        if(movimento==24){
           setImage(frente4);}
        if(movimento==32){
           setImage(frente5);}
        if(movimento==40){
           setImage(frente6);
           movimento = 0;
        }
        movimento++;
        
    }
     else if(Greenfoot.isKeyDown(left)){ 
        stand = atras0;
        setLocation(getX()-3, getY());
        if(movimento ==0){
           setImage(atras1);}
        if(movimento==8){
           setImage(atras2);}
        if(movimento==16){
           setImage(atras3);}
        if(movimento==24){
           setImage(atras4);}
        if(movimento==32){
           setImage(atras5);}
        if(movimento==40){
           setImage(atras6);
           movimento = 0;
        }
        movimento++;
           
    } 
    
    
    
        
     else if(Greenfoot.isKeyDown(up)){ 
            stand = cima0;
            setLocation(getX(), getY() - 3); 
            if(movimento == 0){
                setImage(cima1);
            }
            if(movimento == 8){
                setImage(cima2);
            }
            if(movimento == 16){
                setImage(cima3);
            }
            if(movimento == 24){
                setImage(cima4);
            }
            if(movimento == 32){
                setImage(cima5);
            }
            if(movimento == 40){
                setImage(cima6);
                movimento = 0;
            }
            movimento++;
    }
    
    
    
     
    else if(Greenfoot.isKeyDown(down)){ 
            stand = baixo0;
            setLocation(getX(), getY()+3);
            if(movimento == 1){
                setImage(baixo1);
            }
            if(movimento == 8){
                setImage(baixo2);
            }
            if(movimento == 16){
                setImage(baixo3);
            }
            if(movimento == 24){
                setImage(baixo4);
            }
            if(movimento == 32){
                setImage(baixo5);
            }
            if(movimento == 40){
                setImage(baixo6);
                movimento = 0;
            }
            if(movimento == 0) {
                setImage(baixo0);
            }
            movimento++;
        }
    

    
    
    
    
   
    else{setImage(stand);}
    
    
    
   
    if(isTouching(Explosao.class)){
        
        controle = true;
        
      
    }
    if(isTouching(Bomba.class)){
        if(bomba.getImage().toString().equals(bomba4.toString())){
            
        controle = true;
    }
        
      
    }
    
    
     
    
    
    
    if(controle == true){
        World w = getWorld();
        w.removeObject(bomba);
        w.removeObject(explosao00);
        w.removeObject(explosao11);
        w.removeObject(explosao22);
        w.removeObject(explosao33);
        getWorld().removeObject(this);
    }
    
    
    
  
    
    if(Greenfoot.isKeyDown(space)){
        if(i == 0){
        getWorld().addObject(bomba, getX(), getY());
        i++;
    }
   }
   
   if(i == 1){
            if(a == 0){
                    bomba.setImage(bomba1);
            }
            if(a == 20){
                    bomba.setImage(bomba2);
                }
            if(a == 40){
                    bomba.setImage(bomba3);
                }
            if(a == 60){
                    bomba.setImage(bomba2);
                }
            if(a == 80){
                    bomba.setImage(bomba2);
                }  
            if(a == 100){
                    checkup();



            }
            if(a == 120){
               getWorld().removeObjects(lista);
               getWorld().removeObject(bomba);
               bomba.setImage(bomba1);
               i = 0;
               a = 0;
            }
            
            a++;
        }
        chegarBloco();
        checar();
        chegarParede();
        chegarBomba();
}

public void checkup(){
    

    bomba.setImage(bomba4);
    World w = getWorld();
    List top = w.getObjectsAt(bomba.getX(),bomba.getY()-40, BlocoIndestrutivel.class);
    List bot = w.getObjectsAt(bomba.getX(),bomba.getY()+40, BlocoIndestrutivel.class);
    List left = w.getObjectsAt(bomba.getX()-40,bomba.getY(), BlocoIndestrutivel.class);
    List right = w.getObjectsAt(bomba.getX()+40,bomba.getY(), BlocoIndestrutivel.class);
    
    
    List top2 = w.getObjectsAt(bomba.getX(),bomba.getY()-40, LimiteCenario.class);
    List bot2 = w.getObjectsAt(bomba.getX(),bomba.getY()+40, LimiteCenario.class);
    List left2 = w.getObjectsAt(bomba.getX()-30,bomba.getY(), LimiteCenario.class);
    List right2 = w.getObjectsAt(bomba.getX()+30,bomba.getY(), LimiteCenario.class);
  
    
    if(top.isEmpty()){
    w.addObject(explosao00,bomba.getX(),bomba.getY()-40);
    lista.add(explosao00);
    }
    if(right.isEmpty()){
    w.addObject(explosao11,bomba.getX()+40,bomba.getY());
    lista.add(explosao11);
    }
    if(left.isEmpty()){
    w.addObject(explosao22,bomba.getX()-40,bomba.getY());
    lista.add(explosao22);
    }
    if(bot.isEmpty()){
    w.addObject(explosao33,bomba.getX(),bomba.getY()+40);
    lista.add(explosao33);
    }

    
    
    if(!right2.isEmpty()){
        w.removeObject(explosao11);
    }
    if(!left2.isEmpty()){
        w.removeObject(explosao22);
    }
    
    if(!top2.isEmpty()){
        w.removeObject(explosao00);  
    }
    if(!bot2.isEmpty()){
        w.removeObject(explosao33);
    }
    
    
   
    
}

public void checar(){
    
    if(!controle){
    World w = getWorld();
    List top = w.getObjectsAt(getX(),getY()-15, BlocoDestrutivel.class);
    List bot = w.getObjectsAt(getX(),getY()+20, BlocoDestrutivel.class);
    List left = w.getObjectsAt(getX()-20,getY(), BlocoDestrutivel.class);
    List right = w.getObjectsAt(getX()+20,getY(), BlocoDestrutivel.class);
    if(right.isEmpty()){
        setLocation(getX()+3, getY());
    }
    if(left.isEmpty()){
        setLocation(getX()-3, getY());
    }
    
    if(top.isEmpty()){
        setLocation(getX(), getY()-3);
    }
    if(bot.isEmpty()){
        setLocation(getX(), getY()+3);
    }
}

}



public void chegarBloco(){
  if(!controle){
    World w = getWorld();
    List top = w.getObjectsAt(getX(),getY()-15, BlocoIndestrutivel.class);
    List bot = w.getObjectsAt(getX(),getY()+15, BlocoIndestrutivel.class);
    List left = w.getObjectsAt(getX()-15,getY(), BlocoIndestrutivel.class);
    List right = w.getObjectsAt(getX()+15,getY(), BlocoIndestrutivel.class);
    if(right.isEmpty()){
        setLocation(getX()+3, getY());
    }
    if(left.isEmpty()){
        setLocation(getX()-3, getY());
    }
    
    if(top.isEmpty()){
        setLocation(getX(), getY()-3);
    }
    if(bot.isEmpty()){
        setLocation(getX(), getY()+3);
    }
}

}

public void chegarParede(){
  if(!controle){
    World w = getWorld();
    List top = w.getObjectsAt(getX(),getY()-15, LimiteCenario.class);
    List bot = w.getObjectsAt(getX(),getY()+20, LimiteCenario.class);
    List left = w.getObjectsAt(getX()-20,getY(), LimiteCenario.class);
    List right = w.getObjectsAt(getX()+20,getY(), LimiteCenario.class);
    if(right.isEmpty()){
        setLocation(getX()+3, getY());
    }
    if(left.isEmpty()){
        setLocation(getX()-3, getY());
    }
    
    if(top.isEmpty()){
        setLocation(getX(), getY()-3);
    }
    if(bot.isEmpty()){
        setLocation(getX(), getY()+3);
    }
}

}

public void chegarBomba(){
  if(!controle){
    World w = getWorld();
    List top = w.getObjectsAt(getX(),getY()-15, Bomba.class);
    List bot = w.getObjectsAt(getX(),getY()+20, Bomba.class);
    List left = w.getObjectsAt(getX()-20,getY(), Bomba.class);
    List right = w.getObjectsAt(getX()+20,getY(), Bomba.class);
    if(right.isEmpty()){
        setLocation(getX()+3, getY());
    }
    if(left.isEmpty()){
        setLocation(getX()-3, getY());
    }
    
    if(top.isEmpty()){
        setLocation(getX(), getY()-3);
    }
    if(bot.isEmpty()){
        setLocation(getX(), getY()+3);
    }
}

}
}