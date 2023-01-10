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
    int movimento = 0;
    int i = 0;
    int a = 0;
    Bomba bomba = new Bomba();
    boolean controle = false;
    
    String down, left, up, right, space;        
    
    LinkedList lista = new LinkedList();
    
    GreenfootImage stand = new GreenfootImage("standDown.gif");
            
    GreenfootImage []cima = new GreenfootImage[7];    
    GreenfootImage []baixo = new GreenfootImage[7]; 
    GreenfootImage []esquerda = new GreenfootImage[7]; 
    GreenfootImage []direita = new GreenfootImage[7];     
    
    GreenfootImage []bombas = new GreenfootImage[4];   
    
    Explosao []explosoes= new Explosao[4]; 
    
    public void instanciarAnimacaoExplosoes(){                
        for(int i=0; i<4; i++){ 
            explosoes[i] = new Explosao();
        }
    }
    
    public void instanciarAnimacaoBombaPrestesExplodir(){                
        for(int i=0; i<3; i++){ 
            bombas[i] = new GreenfootImage( String.format("Bomb%d.gif", i+1) );
        }
        bombas[3] = new GreenfootImage("Explosion0.gif");
    }
    
    public void instanciarAnimacoes4Direcoes(){   
        cima[0] = new GreenfootImage( "standUp.gif" );
        baixo[0] = new GreenfootImage( "standDown.gif" );
        esquerda[0] = new GreenfootImage( "standSideLeft.gif" );
        direita[0] = new GreenfootImage( "standSideRight.gif" );
        for(int i=1; i<7; i++){    
            cima[i] = new GreenfootImage( String.format("walkUp%d.gif", i) );
            baixo[i] = new GreenfootImage( String.format("walkDown%d.gif", i) );
            esquerda[i] = new GreenfootImage( String.format("walkSideLeft%d.gif", i) );
            direita[i] = new GreenfootImage( String.format("walkSideRight%d.gif", i) );            
        }
    }
    
    public Bomberman(String right, String left, String down, String up, String space){
       this.right = right;
       this.left = left;
       this.down = down;
       this.up = up;
       this.space = space;   
       
       instanciarAnimacoes4Direcoes();
       instanciarAnimacaoExplosoes();
       instanciarAnimacaoBombaPrestesExplodir();
    }
    
    int velocidade = 3;
    public void act() {              
    if(Greenfoot.isKeyDown(right)){ 
        stand = direita[0];
        setLocation(getX()+velocidade, getY());
        if(movimento ==0){
           setImage(direita[1]);
        }
        if(movimento==4){
           setImage(direita[2]);
        }
        if(movimento==16){
           setImage(direita[3]);
        }
        if(movimento==24){
           setImage(direita[4]);
        }
        if(movimento==32){
           setImage(direita[5]);
        }
        if(movimento==40){
           setImage(direita[6]);
           movimento = 0;
        }
        movimento++;    
    } else if(Greenfoot.isKeyDown(left)){ 
        stand = esquerda[0];
        setLocation(getX()-velocidade, getY());
        if(movimento==0){
           setImage(esquerda[1]);
        }
        if(movimento==8){
           setImage(esquerda[2]);
        }
        if(movimento==16){
           setImage(esquerda[3]);
        }
        if(movimento==24){
           setImage(esquerda[4]);
        }
        if(movimento==32){
           setImage(esquerda[5]);
        }
        if(movimento==40){
           setImage(esquerda[6]);
           movimento = 0;
        }
        movimento++;        
    } else if(Greenfoot.isKeyDown(up)){ 
            stand = cima[0];
            setLocation(getX(), getY() - 3); 
            if(movimento==0){
                setImage(cima[1]);
            }
            if(movimento==8){
                setImage(cima[2]);
            }
            if(movimento==16){
                setImage(cima[3]);
            }
            if(movimento==24){
                setImage(cima[4]);
            }
            if(movimento==32){
                setImage(cima[5]);
            }
            if(movimento==40){
                setImage(cima[6]);
                movimento = 0;
            }
            movimento++;
    }
     
    else if(Greenfoot.isKeyDown(down)){ 
            stand = baixo[0];
            setLocation(getX(), getY()+velocidade);
            if(movimento==1){
                setImage(baixo[1]);
            }
            if(movimento==8){
                setImage(baixo[2]);
            }
            if(movimento==16){
                setImage(baixo[3]);
            }
            if(movimento==24){
                setImage(baixo[4]);
            }
            if(movimento==32){
                setImage(baixo[5]);
            }
            if(movimento==40){
                setImage(baixo[6]);
                movimento = 0;
            }
            if(movimento == 0) {
                setImage(baixo[0]);
            }
            movimento++;
        } else{
            setImage(stand);
        }
    
    if(isTouching(MaisVelocidade.class)){        
        velocidade = 5;            
    }
 
    if(isTouching(Explosao.class)){        
        controle = true;            
    }
    
    if(isTouching(Bomba.class)){
        if(bomba.getImage().toString().equals(bombas[3].toString())){            
            controle = true;
        }        
    }
   
    if(controle == true){
        World w = getWorld();
        w.removeObject(bomba);
        w.removeObject(explosoes[0]);
        w.removeObject(explosoes[1]);
        w.removeObject(explosoes[2]);
        w.removeObject(explosoes[3]);        
                
        Greenfoot.stop();
        getWorld().showText("Fim de Jogo", getWorld().getWidth()/2, getWorld().getHeight()/2);  
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
                    bomba.setImage(bombas[0]);
            }
            if(a == 15){
                    bomba.setImage(bombas[1]);
            }
            if(a == 30){
                    bomba.setImage(bombas[2]);
            }
            if(a == 45){
                    bomba.setImage(bombas[1]);
            }
            if(a == 60){
                    bomba.setImage(bombas[1]);
            }  
            if(a == 75){
                    checkup();
            }
            if(a == 90){
               getWorld().removeObjects(lista);
               getWorld().removeObject(bomba);
               bomba.setImage(bombas[0]);
               i = 0;
               a = 0;
            }           
            a++;
        }
        checarBlocoIndestrutivel();
        checarBlocoDestrutivel();
        checarParede();
        checarBomba();
}

public void checkup(){
    bomba.setImage(bombas[3]);
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
        w.addObject(explosoes[0],bomba.getX(),bomba.getY()-40);
        lista.add(explosoes[0]);
    }
    if(right.isEmpty()){
        w.addObject(explosoes[1],bomba.getX()+40,bomba.getY());
        lista.add(explosoes[1]);
    }
    if(left.isEmpty()){
        w.addObject(explosoes[2],bomba.getX()-40,bomba.getY());
        lista.add(explosoes[2]);
    }
    if(bot.isEmpty()){
        w.addObject(explosoes[3],bomba.getX(),bomba.getY()+40);
        lista.add(explosoes[3]);
    }
    
    if(!right2.isEmpty()){
        w.removeObject(explosoes[1]);
    }
    if(!left2.isEmpty()){
        w.removeObject(explosoes[2]);
    }
    
    if(!top2.isEmpty()){
        w.removeObject(explosoes[0]);  
    }
    if(!bot2.isEmpty()){
        w.removeObject(explosoes[3]);
    }  
}

public void checarBlocoDestrutivel(){
    if(!controle){
        World w = getWorld();
        List top = w.getObjectsAt(getX(),getY()-20, BlocoDestrutivel.class);
        List bot = w.getObjectsAt(getX(),getY()+20, BlocoDestrutivel.class);
        List left = w.getObjectsAt(getX()-14,getY(), BlocoDestrutivel.class);
        List right = w.getObjectsAt(getX()+14,getY(), BlocoDestrutivel.class);
        if(right.isEmpty()){
            setLocation(getX()+velocidade, getY());
        }
        if(left.isEmpty()){
            setLocation(getX()-velocidade, getY());
        }        
        if(top.isEmpty()){
            setLocation(getX(), getY()-velocidade);
        }
        if(bot.isEmpty()){
            setLocation(getX(), getY()+velocidade);
        }
    }
}

public void checarBlocoIndestrutivel(){
    if(!controle){
        World w = getWorld();
        List top = w.getObjectsAt(getX(),getY()-20, BlocoIndestrutivel.class);
        List bot = w.getObjectsAt(getX(),getY()+20, BlocoIndestrutivel.class);
        List left = w.getObjectsAt(getX()-10,getY(), BlocoIndestrutivel.class);
        List right = w.getObjectsAt(getX()+10,getY(), BlocoIndestrutivel.class);
        if(right.isEmpty()){
            setLocation(getX()+velocidade, getY());
        }
        if(left.isEmpty()){
            setLocation(getX()-velocidade, getY());
        }        
        if(top.isEmpty()){
            setLocation(getX(), getY()-velocidade);
        }
        if(bot.isEmpty()){
            setLocation(getX(), getY()+velocidade);
        }
    }
}

public void checarParede(){
    if(!controle){
        World w = getWorld();
        List top = w.getObjectsAt(getX(),getY()-20, LimiteCenario.class);
        List bot = w.getObjectsAt(getX(),getY()+20, LimiteCenario.class);
        List left = w.getObjectsAt(getX()-20,getY(), LimiteCenario.class);
        List right = w.getObjectsAt(getX()+20,getY(), LimiteCenario.class);
        if(right.isEmpty()){
            setLocation(getX()+velocidade, getY());
        }
        if(left.isEmpty()){
            setLocation(getX()-velocidade, getY());
        }    
        if(top.isEmpty()){
            setLocation(getX(), getY()-velocidade);
        }
        if(bot.isEmpty()){
            setLocation(getX(), getY()+velocidade);
        }
    }    
}

public void checarBomba(){
    if(!controle){
        World w = getWorld();
        List top = w.getObjectsAt(getX(),getY()-15, Bomba.class);
        List bot = w.getObjectsAt(getX(),getY()+20, Bomba.class);
        List left = w.getObjectsAt(getX()-20,getY(), Bomba.class);
        List right = w.getObjectsAt(getX()+20,getY(), Bomba.class);
        if(right.isEmpty()){
            setLocation(getX()+velocidade, getY());
        }
        if(left.isEmpty()){
            setLocation(getX()-velocidade, getY());
        }
        
        if(top.isEmpty()){
            setLocation(getX(), getY()-velocidade);
        }
        if(bot.isEmpty()){
            setLocation(getX(), getY()+velocidade);
        }
    }
}

}