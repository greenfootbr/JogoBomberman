    import greenfoot.*;

/**
 * Write a description of class Terra here.
 * 
 * @author (Allen Hichard) 
 * @version (a version number or a date)
 */
public class Mundo extends World
{
    
    Bomberman marlos = new Bomberman("right", "left", "down", "up", "space");
    Bomberman douglas = new Bomberman("d", "a", "s", "w", "r");
    Barra_Lateral barra = new Barra_Lateral();
    
   
    
    //C:\Users\allen\Documents\Engenharia\Allen - Bomberman\sounds\05-level-1.mp3
    Barra_Lateral barra1 = new Barra_Lateral();
    Barra_H barra2 = new Barra_H();
    Barra_H barra3 = new Barra_H();
    
    /*Destroer destroer1 = new Destroer();
    Destroer destroer2 = new Destroer();
    Destroer destroer3 = new Destroer();
    Destroer destroer4 = new Destroer();
    Destroer destroer5 = new Destroer();
    Destroer destroer6 = new Destroer();
    Destroer destroer7 = new Destroer();
    Destroer destroer8 = new Destroer();
    Destroer destroer9 = new Destroer();
    Destroer destroer10 = new Destroer();
    Destroer destroer11 = new Destroer();
    Destroer destroer12 = new Destroer();
    Destroer destroer13 = new Destroer();
    Destroer destroer14 = new Destroer();
    Destroer destroer15 = new Destroer();
    Destroer destroer16 = new Destroer();
    Destroer destroer17 = new Destroer();
    Destroer destroer18 = new Destroer();
    Destroer destroer19 = new Destroer();
    Destroer destroer20 = new Destroer();
    Destroer destroer21 = new Destroer();
    Destroer destroer22= new Destroer();
    Destroer destroer23= new Destroer();
    Destroer destroer24= new Destroer();
    Destroer destroer25 = new Destroer();
    */
    
    
    
  
    Bloco bloco1 = new Bloco();
    Bloco bloco2 = new Bloco();
    Bloco bloco3 = new Bloco();
    Bloco bloco4 = new Bloco();
    Bloco bloco5 = new Bloco();
    Bloco bloco6 = new Bloco();
    Bloco bloco7 = new Bloco();
    Bloco bloco8 = new Bloco();
    Bloco bloco9 = new Bloco();
    Bloco bloco10 = new Bloco();
    Bloco bloco11 = new Bloco();
    Bloco bloco12 = new Bloco();
    Bloco bloco13 = new Bloco();
    Bloco bloco14 = new Bloco();
    Bloco bloco15 = new Bloco();
    Bloco bloco16 = new Bloco();
    Bloco bloco17 = new Bloco();
    Bloco bloco18 = new Bloco();
    Bloco bloco19 = new Bloco();
    Bloco bloco20 = new Bloco();
    Bloco bloco21 = new Bloco();
    Bloco bloco22 = new Bloco();
    Bloco bloco23 = new Bloco();
    Bloco bloco24 = new Bloco();
    Bloco bloco25 = new Bloco();
    Bloco bloco26 = new Bloco();
    Bloco bloco27 = new Bloco();
    Bloco bloco28 = new Bloco();
    Bloco bloco29 = new Bloco();
    Bloco bloco30 = new Bloco();
 
    

     
    /**
     * Constructor for objects of class Terra.
     * 
     */
    public Mundo()
    {    

        super(590, 500, 1); 
        

        Greenfoot.start();
        Greenfoot.playSound("05-level-1.mp3");
       
        
        /*addObject(destroer1, 215,207);
        addObject(destroer2, 98,130);
        addObject(destroer3, 136,91);
        addObject(destroer4, 136,130);
        addObject(destroer5, 215,91);
        addObject(destroer6, 294,91);
        addObject(destroer7, 373,91);
        addObject(destroer8, 452,91);
        addObject(destroer9, 531,91);
        
        addObject(destroer10, 176,130);
        addObject(destroer11, 216,130);
        addObject(destroer12, 256,130);
        addObject(destroer13, 296,130);
        addObject(destroer14, 336,130);
        addObject(destroer15, 375,130);
        addObject(destroer16, 415,130);
        addObject(destroer17, 531,130);
        */

        
        Cenario();
        CriarBlocos();
        
        
        addObject(douglas,55,45);
        addObject(marlos,534,435);
        addObject(barra, 584, 252);
        addObject(barra1,7,252);
        addObject(barra2, 297,4);
        addObject(barra3, 297, 494);
       
      


        
    }
    
    
    public void act(){
      
       if(marlos.getControle()){
           
        }
       if(douglas.getControle()){
           
        }
      
    }
    
    private void CriarBlocos(){
        addObject(bloco1, 96, 90);
        addObject(bloco2, 176, 90);
        addObject(bloco3, 256, 90);
        addObject(bloco4, 336, 90);
        addObject(bloco5, 416, 90);
        addObject(bloco6, 496, 90);
        
        addObject(bloco7, 96, 170);
        addObject(bloco8, 176, 170);
        addObject(bloco9, 256, 170);
        addObject(bloco10, 336, 170);
        addObject(bloco11, 416, 170);
        addObject(bloco12, 496, 170);
        
        addObject(bloco13, 96, 250);
        addObject(bloco14, 176, 250);
        addObject(bloco15, 256, 250);
        addObject(bloco16, 336, 250);
        addObject(bloco17, 416, 250);
        addObject(bloco18, 496, 250);
        
        addObject(bloco19, 96, 330);
        addObject(bloco20, 176, 330);
        addObject(bloco21, 256, 330);
        addObject(bloco22, 336, 330);
        addObject(bloco23, 416, 330);
        addObject(bloco24, 496, 330);
        
        addObject(bloco25, 96, 410);
        addObject(bloco26, 176, 410);
        addObject(bloco27, 256, 410);
        addObject(bloco28, 336, 410);
        addObject(bloco29, 416, 410);
        addObject(bloco30, 496, 410);
    }
    private void Cenario(){
        Destroyer destroyer = new Destroyer();
        addObject(destroyer, 97, 54);
        destroyer.setLocation(98, 52);
        Destroyer destroyer2 = new Destroyer();
        addObject(destroyer2, 63, 134);
        destroyer2.setLocation(58, 131);
        destroyer.setLocation(137, 52);
        Destroyer destroyer3 = new Destroyer();
        addObject(destroyer3, 251, 189);
        Destroyer destroyer4 = new Destroyer();
        addObject(destroyer4, 284, 280);
        Destroyer destroyer5 = new Destroyer();
        addObject(destroyer5, 388, 281);
        Destroyer destroyer6 = new Destroyer();
        addObject(destroyer6, 325, 359);
        Destroyer destroyer7 = new Destroyer();
        addObject(destroyer7, 441, 402);
        Destroyer destroyer8 = new Destroyer();
        addObject(destroyer8, 373, 201);
        Destroyer destroyer9 = new Destroyer();
        addObject(destroyer9, 414, 127);
        Destroyer destroyer10 = new Destroyer();
        addObject(destroyer10, 475, 193);
        Destroyer destroyer11 = new Destroyer();
        addObject(destroyer11, 448, 286);
        Destroyer destroyer12 = new Destroyer();
        addObject(destroyer12, 389, 354);
        Destroyer destroyer13 = new Destroyer();
        addObject(destroyer13, 212, 340);
        Destroyer destroyer14 = new Destroyer();
        addObject(destroyer14, 326, 420);
        Destroyer destroyer15 = new Destroyer();
        addObject(destroyer15, 157, 416);
        Destroyer destroyer16 = new Destroyer();
        addObject(destroyer16, 79, 358);
        Destroyer destroyer17 = new Destroyer();
        addObject(destroyer17, 70, 321);
        destroyer3.setLocation(98, 131);
        destroyer8.setLocation(138, 131);
        destroyer9.setLocation(137, 92);
        destroyer10.setLocation(179, 132);
        destroyer4.setLocation(177, 52);
        destroyer10.setLocation(176, 131);
        destroyer17.setLocation(57, 171);
        destroyer16.setLocation(137, 172);
        destroyer5.setLocation(217, 52);
        destroyer6.setLocation(216, 130);
        destroyer13.setLocation(216, 171);
        destroyer6.setLocation(216, 131);
        destroyer6.getX();
        destroyer6.getY();
        destroyer11.setLocation(257, 132);
        destroyer12.setLocation(295, 132);
        destroyer11.setLocation(255, 132);
        destroyer14.setLocation(296, 171);
        destroyer15.setLocation(216, 210);
        destroyer7.setLocation(137, 213);
        Destroyer destroyer18 = new Destroyer();
        addObject(destroyer18, 183, 216);
        destroyer18.setLocation(176, 211);
        Destroyer destroyer19 = new Destroyer();
        addObject(destroyer19, 399, 280);
        Destroyer destroyer20 = new Destroyer();
        addObject(destroyer20, 486, 394);
        Destroyer destroyer21 = new Destroyer();
        addObject(destroyer21, 310, 389);
        Destroyer destroyer22 = new Destroyer();
        addObject(destroyer22, 452, 350);
        Destroyer destroyer23 = new Destroyer();
        addObject(destroyer23, 366, 371);
        Destroyer destroyer24 = new Destroyer();
        addObject(destroyer24, 456, 208);
        Destroyer destroyer25 = new Destroyer();
        addObject(destroyer25, 240, 298);
        Destroyer destroyer26 = new Destroyer();
        addObject(destroyer26, 368, 170);
        Destroyer destroyer27 = new Destroyer();
        addObject(destroyer27, 436, 211);
        Destroyer destroyer28 = new Destroyer();
        addObject(destroyer28, 344, 216);
        Destroyer destroyer29 = new Destroyer();
        addObject(destroyer29, 329, 305);
        Destroyer destroyer30 = new Destroyer();
        addObject(destroyer30, 476, 299);
        Destroyer destroyer31 = new Destroyer();
        addObject(destroyer31, 374, 346);
        destroyer30.setLocation(296, 210);
        destroyer28.setLocation(256, 209);
        destroyer27.setLocation(337, 209);
        destroyer19.setLocation(397, 223);
        destroyer7.setLocation(137, 212);
        destroyer18.setLocation(176, 212);
        destroyer15.setLocation(217, 211);
        destroyer28.setLocation(256, 211);
        destroyer30.setLocation(300, 211);
        destroyer19.setLocation(376, 210);
        destroyer30.setLocation(296, 210);
        destroyer15.setLocation(214, 211);
        destroyer27.setLocation(335, 209);
        destroyer26.setLocation(377, 170);
        destroyer24.setLocation(375, 128);
        destroyer29.setLocation(296, 252);
        destroyer25.setLocation(215, 252);
        destroyer31.setLocation(295, 289);
        destroyer23.setLocation(336, 291);
        destroyer22.setLocation(377, 292);
        destroyer20.setLocation(255, 289);
        destroyer21.setLocation(295, 369);
        Destroyer destroyer32 = new Destroyer();
        addObject(destroyer32, 377, 370);
        Destroyer destroyer33 = new Destroyer();
        addObject(destroyer33, 338, 368);
        Destroyer destroyer34 = new Destroyer();
        addObject(destroyer34, 377, 413);
        Destroyer destroyer35 = new Destroyer();
        addObject(destroyer35, 419, 369);
        Destroyer destroyer36 = new Destroyer();
        addObject(destroyer36, 459, 291);
        Destroyer destroyer37 = new Destroyer();
        addObject(destroyer37, 457, 329);
        Destroyer destroyer38 = new Destroyer();
        addObject(destroyer38, 459, 373);
        Destroyer destroyer39 = new Destroyer();
        addObject(destroyer39, 461, 413);
        Destroyer destroyer40 = new Destroyer();
        addObject(destroyer40, 456, 243);
        Destroyer destroyer41 = new Destroyer();
        addObject(destroyer41, 457, 209);
        Destroyer destroyer42 = new Destroyer();
        addObject(destroyer42, 459, 131);
        Destroyer destroyer43 = new Destroyer();
        addObject(destroyer43, 458, 171);
        Destroyer destroyer44 = new Destroyer();
        addObject(destroyer44, 459, 54);
        Destroyer destroyer45 = new Destroyer();
        addObject(destroyer45, 458, 87);
        Destroyer destroyer46 = new Destroyer();
        addObject(destroyer46, 420, 47);
        Destroyer destroyer47 = new Destroyer();
        addObject(destroyer47, 388, 49);
        Destroyer destroyer48 = new Destroyer();
        addObject(destroyer48, 353, 49);
        Destroyer destroyer49 = new Destroyer();
        addObject(destroyer49, 321, 50);
        Destroyer destroyer50 = new Destroyer();
        addObject(destroyer50, 286, 50);
        Destroyer destroyer51 = new Destroyer();
        addObject(destroyer51, 297, 86);
        Destroyer destroyer52 = new Destroyer();
        addObject(destroyer52, 137, 286);
        Destroyer destroyer53 = new Destroyer();
        addObject(destroyer53, 141, 333);
        Destroyer destroyer54 = new Destroyer();
        addObject(destroyer54, 134, 368);
        Destroyer destroyer55 = new Destroyer();
        addObject(destroyer55, 142, 411);
        Destroyer destroyer56 = new Destroyer();
        addObject(destroyer56, 175, 370);
        Destroyer destroyer57 = new Destroyer();
        addObject(destroyer57, 216, 370);
        Destroyer destroyer58 = new Destroyer();
        addObject(destroyer58, 219, 335);
        Destroyer destroyer59 = new Destroyer();
        addObject(destroyer59, 218, 292);
        Destroyer destroyer60 = new Destroyer();
        addObject(destroyer60, 179, 291);
        Destroyer destroyer61 = new Destroyer();
        addObject(destroyer61, 304, 449);
        Destroyer destroyer62 = new Destroyer();
        addObject(destroyer62, 263, 448);
        Destroyer destroyer63 = new Destroyer();
        addObject(destroyer63, 219, 453);
        Destroyer destroyer64 = new Destroyer();
        addObject(destroyer64, 176, 452);
        Destroyer destroyer65 = new Destroyer();
        addObject(destroyer65, 128, 453);
        Destroyer destroyer66 = new Destroyer();
        addObject(destroyer66, 339, 450);
        Destroyer destroyer67 = new Destroyer();
        addObject(destroyer67, 377, 450);
        
        Destroyer destroyer69 = new Destroyer();
        addObject(destroyer69, 532, 408);
        Destroyer destroyer70 = new Destroyer();
        addObject(destroyer70, 533, 368);
        Destroyer destroyer71 = new Destroyer();
        addObject(destroyer71, 494, 365);
        Destroyer destroyer72 = new Destroyer();
        addObject(destroyer72, 537, 322);
        Destroyer destroyer73 = new Destroyer();
        addObject(destroyer73, 537, 290);
        Destroyer destroyer74 = new Destroyer();
        addObject(destroyer74, 536, 246);
        Destroyer destroyer75 = new Destroyer();
        addObject(destroyer75, 536, 210);
        Destroyer destroyer76 = new Destroyer();
        addObject(destroyer76, 537, 166);
        Destroyer destroyer77 = new Destroyer();
        addObject(destroyer77, 535, 130);
        Destroyer destroyer78 = new Destroyer();
        addObject(destroyer78, 534, 86);
        Destroyer destroyer79 = new Destroyer();
        addObject(destroyer79, 495, 125);
        destroyer46.setLocation(421, 53);
        destroyer47.setLocation(377, 52);
        destroyer48.setLocation(334, 49);
        destroyer50.setLocation(257, 53);
        destroyer49.setLocation(297, 53);
        destroyer51.setLocation(297, 92);
        destroyer48.setLocation(338, 52);
        destroyer47.setLocation(379, 52);
        destroyer79.setLocation(497, 131);
        destroyer42.setLocation(456, 129);
        destroyer45.setLocation(454, 90);
        destroyer78.setLocation(536, 92);
        destroyer43.setLocation(454, 169);
        destroyer40.setLocation(456, 248);
        destroyer36.setLocation(454, 289);
        destroyer37.setLocation(453, 329);
        destroyer38.setLocation(451, 366);
        destroyer35.setLocation(414, 369);
        destroyer38.setLocation(453, 368);
        destroyer71.setLocation(492, 370);
        destroyer39.setLocation(455, 408);
        destroyer21.setLocation(296, 371);
        destroyer33.setLocation(335, 371);
        destroyer32.setLocation(375, 371);
        destroyer62.setLocation(259, 450);
        destroyer61.setLocation(298, 449);
        destroyer63.setLocation(221, 451);
        destroyer63.setLocation(217, 450);
        destroyer62.setLocation(257, 450);
        destroyer64.setLocation(178, 450);
        destroyer65.setLocation(139, 451);
        destroyer55.setLocation(137, 408);
        destroyer54.setLocation(136, 371);
        destroyer56.setLocation(179, 370);
        destroyer53.setLocation(137, 327);
        destroyer54.setLocation(137, 369);
        destroyer55.setLocation(138, 410);
        destroyer15.setLocation(216, 212);
        destroyer52.setLocation(137, 292);
        destroyer53.setLocation(137, 332);
        destroyer56.setLocation(177, 370);
        destroyer58.setLocation(216, 330);
        destroyer60.setLocation(177, 291);
        destroyer73.setLocation(534, 289);
        destroyer75.setLocation(535, 216);
        destroyer76.setLocation(534, 173);
        destroyer77.setLocation(535, 131);
        destroyer79.setLocation(495, 131);
        destroyer74.setLocation(536, 256);
        destroyer75.setLocation(533, 211);
        destroyer76.setLocation(534, 172);
        destroyer75.setLocation(533, 212);
        destroyer74.setLocation(535, 252);
        destroyer75.setLocation(535, 212);
        destroyer73.setLocation(535, 291);
        destroyer72.setLocation(536, 330);
        destroyer70.setLocation(534, 370);
        destroyer69.setLocation(533, 409);
        destroyer70.setLocation(533, 370);    
    }
   
    
    
}


