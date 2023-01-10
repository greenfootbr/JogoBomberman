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
    BarraVertical barra = new BarraVertical();
        
    BarraVertical barra1 = new BarraVertical();
    BarraHorizontal barra2 = new BarraHorizontal();
    BarraHorizontal barra3 = new BarraHorizontal();
         
    BlocoIndestrutivel BlocoIndestrutivel1 = new BlocoIndestrutivel();
    BlocoIndestrutivel BlocoIndestrutivel2 = new BlocoIndestrutivel();
    BlocoIndestrutivel BlocoIndestrutivel3 = new BlocoIndestrutivel();
    BlocoIndestrutivel BlocoIndestrutivel4 = new BlocoIndestrutivel();
    BlocoIndestrutivel BlocoIndestrutivel5 = new BlocoIndestrutivel();
    BlocoIndestrutivel BlocoIndestrutivel6 = new BlocoIndestrutivel();
    BlocoIndestrutivel BlocoIndestrutivel7 = new BlocoIndestrutivel();
    BlocoIndestrutivel BlocoIndestrutivel8 = new BlocoIndestrutivel();
    BlocoIndestrutivel BlocoIndestrutivel9 = new BlocoIndestrutivel();
    BlocoIndestrutivel BlocoIndestrutivel10 = new BlocoIndestrutivel();
    BlocoIndestrutivel BlocoIndestrutivel11 = new BlocoIndestrutivel();
    BlocoIndestrutivel BlocoIndestrutivel12 = new BlocoIndestrutivel();
    BlocoIndestrutivel BlocoIndestrutivel13 = new BlocoIndestrutivel();
    BlocoIndestrutivel BlocoIndestrutivel14 = new BlocoIndestrutivel();
    BlocoIndestrutivel BlocoIndestrutivel15 = new BlocoIndestrutivel();
    BlocoIndestrutivel BlocoIndestrutivel16 = new BlocoIndestrutivel();
    BlocoIndestrutivel BlocoIndestrutivel17 = new BlocoIndestrutivel();
    BlocoIndestrutivel BlocoIndestrutivel18 = new BlocoIndestrutivel();
    BlocoIndestrutivel BlocoIndestrutivel19 = new BlocoIndestrutivel();
    BlocoIndestrutivel BlocoIndestrutivel20 = new BlocoIndestrutivel();
    BlocoIndestrutivel BlocoIndestrutivel21 = new BlocoIndestrutivel();
    BlocoIndestrutivel BlocoIndestrutivel22 = new BlocoIndestrutivel();
    BlocoIndestrutivel BlocoIndestrutivel23 = new BlocoIndestrutivel();
    BlocoIndestrutivel BlocoIndestrutivel24 = new BlocoIndestrutivel();
    BlocoIndestrutivel BlocoIndestrutivel25 = new BlocoIndestrutivel();
    BlocoIndestrutivel BlocoIndestrutivel26 = new BlocoIndestrutivel();
    BlocoIndestrutivel BlocoIndestrutivel27 = new BlocoIndestrutivel();
    BlocoIndestrutivel BlocoIndestrutivel28 = new BlocoIndestrutivel();
    BlocoIndestrutivel BlocoIndestrutivel29 = new BlocoIndestrutivel();
    BlocoIndestrutivel BlocoIndestrutivel30 = new BlocoIndestrutivel();
 
    

     
    /**
     * Constructor for objects of class Terra.
     * 
     */
    public Mundo()
    {    

        super(590, 500, 1); 
        

        Greenfoot.start();
        Greenfoot.playSound("05-level-1.mp3");
       
        
        Cenario();
        CriarBlocoIndestrutivels();
        
        
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
    
    private void CriarBlocoIndestrutivels(){
        addObject(BlocoIndestrutivel1, 96, 90);
        addObject(BlocoIndestrutivel2, 176, 90);
        addObject(BlocoIndestrutivel3, 256, 90);
        addObject(BlocoIndestrutivel4, 336, 90);
        addObject(BlocoIndestrutivel5, 416, 90);
        addObject(BlocoIndestrutivel6, 496, 90);
        
        addObject(BlocoIndestrutivel7, 96, 170);
        addObject(BlocoIndestrutivel8, 176, 170);
        addObject(BlocoIndestrutivel9, 256, 170);
        addObject(BlocoIndestrutivel10, 336, 170);
        addObject(BlocoIndestrutivel11, 416, 170);
        addObject(BlocoIndestrutivel12, 496, 170);
        
        addObject(BlocoIndestrutivel13, 96, 250);
        addObject(BlocoIndestrutivel14, 176, 250);
        addObject(BlocoIndestrutivel15, 256, 250);
        addObject(BlocoIndestrutivel16, 336, 250);
        addObject(BlocoIndestrutivel17, 416, 250);
        addObject(BlocoIndestrutivel18, 496, 250);
        
        addObject(BlocoIndestrutivel19, 96, 330);
        addObject(BlocoIndestrutivel20, 176, 330);
        addObject(BlocoIndestrutivel21, 256, 330);
        addObject(BlocoIndestrutivel22, 336, 330);
        addObject(BlocoIndestrutivel23, 416, 330);
        addObject(BlocoIndestrutivel24, 496, 330);
        
        addObject(BlocoIndestrutivel25, 96, 410);
        addObject(BlocoIndestrutivel26, 176, 410);
        addObject(BlocoIndestrutivel27, 256, 410);
        addObject(BlocoIndestrutivel28, 336, 410);
        addObject(BlocoIndestrutivel29, 416, 410);
        addObject(BlocoIndestrutivel30, 496, 410);
    }
    private void Cenario(){
        BlocoDestrutivel BlocoDestrutivel = new BlocoDestrutivel();
        addObject(BlocoDestrutivel, 97, 54);
        BlocoDestrutivel.setLocation(98, 52);
        BlocoDestrutivel BlocoDestrutivel2 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel2, 63, 134);
        BlocoDestrutivel2.setLocation(58, 131);
        BlocoDestrutivel.setLocation(137, 52);
        BlocoDestrutivel BlocoDestrutivel3 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel3, 251, 189);
        BlocoDestrutivel BlocoDestrutivel4 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel4, 284, 280);
        BlocoDestrutivel BlocoDestrutivel5 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel5, 388, 281);
        BlocoDestrutivel BlocoDestrutivel6 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel6, 325, 359);
        BlocoDestrutivel BlocoDestrutivel7 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel7, 441, 402);
        BlocoDestrutivel BlocoDestrutivel8 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel8, 373, 201);
        BlocoDestrutivel BlocoDestrutivel9 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel9, 414, 127);
        BlocoDestrutivel BlocoDestrutivel10 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel10, 475, 193);
        BlocoDestrutivel BlocoDestrutivel11 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel11, 448, 286);
        BlocoDestrutivel BlocoDestrutivel12 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel12, 389, 354);
        BlocoDestrutivel BlocoDestrutivel13 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel13, 212, 340);
        BlocoDestrutivel BlocoDestrutivel14 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel14, 326, 420);
        BlocoDestrutivel BlocoDestrutivel15 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel15, 157, 416);
        BlocoDestrutivel BlocoDestrutivel16 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel16, 79, 358);
        BlocoDestrutivel BlocoDestrutivel17 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel17, 70, 321);
        BlocoDestrutivel3.setLocation(98, 131);
        BlocoDestrutivel8.setLocation(138, 131);
        BlocoDestrutivel9.setLocation(137, 92);
        BlocoDestrutivel10.setLocation(179, 132);
        BlocoDestrutivel4.setLocation(177, 52);
        BlocoDestrutivel10.setLocation(176, 131);
        BlocoDestrutivel17.setLocation(57, 171);
        BlocoDestrutivel16.setLocation(137, 172);
        BlocoDestrutivel5.setLocation(217, 52);
        BlocoDestrutivel6.setLocation(216, 130);
        BlocoDestrutivel13.setLocation(216, 171);
        BlocoDestrutivel6.setLocation(216, 131);
        BlocoDestrutivel6.getX();
        BlocoDestrutivel6.getY();
        BlocoDestrutivel11.setLocation(257, 132);
        BlocoDestrutivel12.setLocation(295, 132);
        BlocoDestrutivel11.setLocation(255, 132);
        BlocoDestrutivel14.setLocation(296, 171);
        BlocoDestrutivel15.setLocation(216, 210);
        BlocoDestrutivel7.setLocation(137, 213);
        BlocoDestrutivel BlocoDestrutivel18 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel18, 183, 216);
        BlocoDestrutivel18.setLocation(176, 211);
        BlocoDestrutivel BlocoDestrutivel19 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel19, 399, 280);
        BlocoDestrutivel BlocoDestrutivel20 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel20, 486, 394);
        BlocoDestrutivel BlocoDestrutivel21 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel21, 310, 389);
        BlocoDestrutivel BlocoDestrutivel22 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel22, 452, 350);
        BlocoDestrutivel BlocoDestrutivel23 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel23, 366, 371);
        BlocoDestrutivel BlocoDestrutivel24 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel24, 456, 208);
        BlocoDestrutivel BlocoDestrutivel25 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel25, 240, 298);
        BlocoDestrutivel BlocoDestrutivel26 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel26, 368, 170);
        BlocoDestrutivel BlocoDestrutivel27 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel27, 436, 211);
        BlocoDestrutivel BlocoDestrutivel28 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel28, 344, 216);
        BlocoDestrutivel BlocoDestrutivel29 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel29, 329, 305);
        BlocoDestrutivel BlocoDestrutivel30 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel30, 476, 299);
        BlocoDestrutivel BlocoDestrutivel31 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel31, 374, 346);
        BlocoDestrutivel30.setLocation(296, 210);
        BlocoDestrutivel28.setLocation(256, 209);
        BlocoDestrutivel27.setLocation(337, 209);
        BlocoDestrutivel19.setLocation(397, 223);
        BlocoDestrutivel7.setLocation(137, 212);
        BlocoDestrutivel18.setLocation(176, 212);
        BlocoDestrutivel15.setLocation(217, 211);
        BlocoDestrutivel28.setLocation(256, 211);
        BlocoDestrutivel30.setLocation(300, 211);
        BlocoDestrutivel19.setLocation(376, 210);
        BlocoDestrutivel30.setLocation(296, 210);
        BlocoDestrutivel15.setLocation(214, 211);
        BlocoDestrutivel27.setLocation(335, 209);
        BlocoDestrutivel26.setLocation(377, 170);
        BlocoDestrutivel24.setLocation(375, 128);
        BlocoDestrutivel29.setLocation(296, 252);
        BlocoDestrutivel25.setLocation(215, 252);
        BlocoDestrutivel31.setLocation(295, 289);
        BlocoDestrutivel23.setLocation(336, 291);
        BlocoDestrutivel22.setLocation(377, 292);
        BlocoDestrutivel20.setLocation(255, 289);
        BlocoDestrutivel21.setLocation(295, 369);
        BlocoDestrutivel BlocoDestrutivel32 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel32, 377, 370);
        BlocoDestrutivel BlocoDestrutivel33 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel33, 338, 368);
        BlocoDestrutivel BlocoDestrutivel34 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel34, 377, 413);
        BlocoDestrutivel BlocoDestrutivel35 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel35, 419, 369);
        BlocoDestrutivel BlocoDestrutivel36 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel36, 459, 291);
        BlocoDestrutivel BlocoDestrutivel37 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel37, 457, 329);
        BlocoDestrutivel BlocoDestrutivel38 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel38, 459, 373);
        BlocoDestrutivel BlocoDestrutivel39 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel39, 461, 413);
        BlocoDestrutivel BlocoDestrutivel40 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel40, 456, 243);
        BlocoDestrutivel BlocoDestrutivel41 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel41, 457, 209);
        BlocoDestrutivel BlocoDestrutivel42 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel42, 459, 131);
        BlocoDestrutivel BlocoDestrutivel43 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel43, 458, 171);
        BlocoDestrutivel BlocoDestrutivel44 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel44, 459, 54);
        BlocoDestrutivel BlocoDestrutivel45 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel45, 458, 87);
        BlocoDestrutivel BlocoDestrutivel46 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel46, 420, 47);
        BlocoDestrutivel BlocoDestrutivel47 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel47, 388, 49);
        BlocoDestrutivel BlocoDestrutivel48 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel48, 353, 49);
        BlocoDestrutivel BlocoDestrutivel49 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel49, 321, 50);
        BlocoDestrutivel BlocoDestrutivel50 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel50, 286, 50);
        BlocoDestrutivel BlocoDestrutivel51 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel51, 297, 86);
        BlocoDestrutivel BlocoDestrutivel52 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel52, 137, 286);
        BlocoDestrutivel BlocoDestrutivel53 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel53, 141, 333);
        BlocoDestrutivel BlocoDestrutivel54 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel54, 134, 368);
        BlocoDestrutivel BlocoDestrutivel55 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel55, 142, 411);
        BlocoDestrutivel BlocoDestrutivel56 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel56, 175, 370);
        BlocoDestrutivel BlocoDestrutivel57 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel57, 216, 370);
        BlocoDestrutivel BlocoDestrutivel58 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel58, 219, 335);
        BlocoDestrutivel BlocoDestrutivel59 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel59, 218, 292);
        BlocoDestrutivel BlocoDestrutivel60 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel60, 179, 291);
        BlocoDestrutivel BlocoDestrutivel61 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel61, 304, 449);
        BlocoDestrutivel BlocoDestrutivel62 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel62, 263, 448);
        BlocoDestrutivel BlocoDestrutivel63 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel63, 219, 453);
        BlocoDestrutivel BlocoDestrutivel64 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel64, 176, 452);
        BlocoDestrutivel BlocoDestrutivel65 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel65, 128, 453);
        BlocoDestrutivel BlocoDestrutivel66 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel66, 339, 450);
        BlocoDestrutivel BlocoDestrutivel67 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel67, 377, 450);
        
        BlocoDestrutivel BlocoDestrutivel69 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel69, 532, 408);
        BlocoDestrutivel BlocoDestrutivel70 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel70, 533, 368);
        BlocoDestrutivel BlocoDestrutivel71 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel71, 494, 365);
        BlocoDestrutivel BlocoDestrutivel72 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel72, 537, 322);
        BlocoDestrutivel BlocoDestrutivel73 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel73, 537, 290);
        BlocoDestrutivel BlocoDestrutivel74 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel74, 536, 246);
        BlocoDestrutivel BlocoDestrutivel75 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel75, 536, 210);
        BlocoDestrutivel BlocoDestrutivel76 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel76, 537, 166);
        BlocoDestrutivel BlocoDestrutivel77 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel77, 535, 130);
        BlocoDestrutivel BlocoDestrutivel78 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel78, 534, 86);
        BlocoDestrutivel BlocoDestrutivel79 = new BlocoDestrutivel();
        addObject(BlocoDestrutivel79, 495, 125);
        BlocoDestrutivel46.setLocation(421, 53);
        BlocoDestrutivel47.setLocation(377, 52);
        BlocoDestrutivel48.setLocation(334, 49);
        BlocoDestrutivel50.setLocation(257, 53);
        BlocoDestrutivel49.setLocation(297, 53);
        BlocoDestrutivel51.setLocation(297, 92);
        BlocoDestrutivel48.setLocation(338, 52);
        BlocoDestrutivel47.setLocation(379, 52);
        BlocoDestrutivel79.setLocation(497, 131);
        BlocoDestrutivel42.setLocation(456, 129);
        BlocoDestrutivel45.setLocation(454, 90);
        BlocoDestrutivel78.setLocation(536, 92);
        BlocoDestrutivel43.setLocation(454, 169);
        BlocoDestrutivel40.setLocation(456, 248);
        BlocoDestrutivel36.setLocation(454, 289);
        BlocoDestrutivel37.setLocation(453, 329);
        BlocoDestrutivel38.setLocation(451, 366);
        BlocoDestrutivel35.setLocation(414, 369);
        BlocoDestrutivel38.setLocation(453, 368);
        BlocoDestrutivel71.setLocation(492, 370);
        BlocoDestrutivel39.setLocation(455, 408);
        BlocoDestrutivel21.setLocation(296, 371);
        BlocoDestrutivel33.setLocation(335, 371);
        BlocoDestrutivel32.setLocation(375, 371);
        BlocoDestrutivel62.setLocation(259, 450);
        BlocoDestrutivel61.setLocation(298, 449);
        BlocoDestrutivel63.setLocation(221, 451);
        BlocoDestrutivel63.setLocation(217, 450);
        BlocoDestrutivel62.setLocation(257, 450);
        BlocoDestrutivel64.setLocation(178, 450);
        BlocoDestrutivel65.setLocation(139, 451);
        BlocoDestrutivel55.setLocation(137, 408);
        BlocoDestrutivel54.setLocation(136, 371);
        BlocoDestrutivel56.setLocation(179, 370);
        BlocoDestrutivel53.setLocation(137, 327);
        BlocoDestrutivel54.setLocation(137, 369);
        BlocoDestrutivel55.setLocation(138, 410);
        BlocoDestrutivel15.setLocation(216, 212);
        BlocoDestrutivel52.setLocation(137, 292);
        BlocoDestrutivel53.setLocation(137, 332);
        BlocoDestrutivel56.setLocation(177, 370);
        BlocoDestrutivel58.setLocation(216, 330);
        BlocoDestrutivel60.setLocation(177, 291);
        BlocoDestrutivel73.setLocation(534, 289);
        BlocoDestrutivel75.setLocation(535, 216);
        BlocoDestrutivel76.setLocation(534, 173);
        BlocoDestrutivel77.setLocation(535, 131);
        BlocoDestrutivel79.setLocation(495, 131);
        BlocoDestrutivel74.setLocation(536, 256);
        BlocoDestrutivel75.setLocation(533, 211);
        BlocoDestrutivel76.setLocation(534, 172);
        BlocoDestrutivel75.setLocation(533, 212);
        BlocoDestrutivel74.setLocation(535, 252);
        BlocoDestrutivel75.setLocation(535, 212);
        BlocoDestrutivel73.setLocation(535, 291);
        BlocoDestrutivel72.setLocation(536, 330);
        BlocoDestrutivel70.setLocation(534, 370);
        BlocoDestrutivel69.setLocation(533, 409);
        BlocoDestrutivel70.setLocation(533, 370);    
    }
   
    
    
}


