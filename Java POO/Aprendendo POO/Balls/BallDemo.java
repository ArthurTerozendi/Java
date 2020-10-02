import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;


/**
 * Class BallDemo - provides two short demonstrations showing how to use the 
 * Canvas class. 
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */

public class BallDemo   
{
    private Canvas myCanvas;

    /**
     * Create a BallDemo object. Creates a fresh canvas and makes it visible.
     */
    public BallDemo()
    {
        myCanvas = new Canvas("Ball Demo", 600, 500);
        myCanvas.setVisible(true);
    }
 
    /**
     * Demonstrate some of the drawing operations that are
     * available on a Canvas object.
     */
    public void drawDemo()
    {
        myCanvas.setFont(new Font("helvetica", Font.BOLD, 14));
        myCanvas.setForegroundColor(Color.red);

        myCanvas.drawString("We can draw text, ...", 20, 30);
        myCanvas.wait(1000);

        myCanvas.setForegroundColor(Color.black);
        myCanvas.drawString("...draw lines...", 60, 60);
        myCanvas.wait(500);
        myCanvas.setForegroundColor(Color.gray);
        myCanvas.drawLine(200, 20, 300, 50);
        myCanvas.wait(500);
        myCanvas.setForegroundColor(Color.blue);
        myCanvas.drawLine(220, 100, 370, 40);
        myCanvas.wait(500);
        myCanvas.setForegroundColor(Color.green);
        myCanvas.drawLine(290, 10, 320, 120);
        myCanvas.wait(1000);

        myCanvas.setForegroundColor(Color.gray);
        myCanvas.drawString("...and shapes!", 110, 90);

        myCanvas.setForegroundColor(Color.red);

        // the shape to draw and move
        int xPos = 10;
        Rectangle rect = new Rectangle(xPos, 150, 30, 20);

        // move the rectangle across the screen
        for(int i = 0; i < 200; i ++) {
            myCanvas.fill(rect);
            myCanvas.wait(10);
            myCanvas.erase(rect);
            xPos++;
            rect.setLocation(xPos, 150);
        }
        // at the end of the move, draw once more so that it remains visible
        myCanvas.fill(rect);
    }

    /**
     * Simulate two bouncing balls
     */
    public void bounce(int quantidadeBolas)
    {
        int ground = 400;   // position of the ground line
        ArrayList<BouncingBall> balls = new ArrayList();
        myCanvas.setVisible(true);
        Random rng = new Random();

        // draw the ground
        myCanvas.drawLine(50, ground, 550, ground);

        // crate and show the balls
        for (int i = 0; i < quantidadeBolas; i++){
            balls.add(new BouncingBall(50 + (rng.nextInt(50)), 
                                       50 + (rng.nextInt(50)),
                                       16, Color.green, 
                                       ground, 
                                       myCanvas));
            balls.get(i).draw();
        }

        // make them bounce
        boolean finished =  false;
        while(!finished) {
            myCanvas.wait(50);           // small delay
            for (int i = 0; i < quantidadeBolas; i++){
                balls.get(i).move();
            
                // stop once ball has travelled a certain distance on x axis
                if(balls.get(1).getXPosition() >= 550 && balls.get(2).getXPosition() >= 550) {
                    finished = true;
                }
            }
        }
        
        for (int i = 0; i < quantidadeBolas; i++){
            balls.get(i).erase();
        }
    }
    
    public void drawFrame()
    {
        double height = myCanvas.getSize().getHeight() - 40;
        double width = myCanvas.getSize().getWidth() - 40;
        Point inicial = new Point(20, 20);
        Dimension dimencao = new Dimension();
        dimencao.setSize(width, height);
        
        myCanvas.draw(new Rectangle(inicial, dimencao));
    }
    public void boxBounce(int quantidadeDeBolas)
    {
        int x1 = 100;
        int x2 = 400;
        int y1 = 100;
        int y2 = 400;
        ArrayList<BoxBall> bolas = new ArrayList();
        myCanvas.setVisible(true);
        Random rng = new Random();

        // desenha a caixa
        myCanvas.drawLine(x1, y2, x2, y2); //ch‹o
        myCanvas.drawLine(x1, y1, x2, y1); //teto
        myCanvas.drawLine(x1, y1, x1, y2); //esquerda
        myCanvas.drawLine(x2, y1, x2, y2); //direita
        
        for (int i = 0; i < quantidadeDeBolas; i++) {
            bolas.add(new BoxBall((rng.nextInt(x2 - x1) + x1 + 1),
                                  (rng.nextInt(y2 - y1) + y1 + 1),
                                  colorGenerator(rng.nextInt(12)), 
                                  16,x1, y1, x2,y2, myCanvas));
            bolas.get(i).draw();
        }
        
        boolean finished =  false;
        int temporizador = 0;
        while(!finished) {
            myCanvas.wait(50);           // small delay
            
            for (int i = 0; i < quantidadeDeBolas; i++){
                bolas.get(i).move();            
            }
            // parar o programa
            if (temporizador >= 500){
                finished = true;
            }
            
            temporizador++;
        }
        //apaga todas as bolas
        for (int i = 0; i < quantidadeDeBolas; i++){
            bolas.get(i).erase();
        }
    }
    
    public Color colorGenerator(int indice)
    {
        ArrayList<Color> cores = new ArrayList();
        cores.add(Color.black);
        cores.add(Color.blue);
        cores.add(Color.cyan);
        cores.add(Color.darkGray);
        cores.add(Color.gray);
        cores.add(Color.lightGray);
        cores.add(Color.green);
        cores.add(Color.magenta);
        cores.add(Color.yellow);
        cores.add(Color.pink);
        cores.add(Color.orange);
        cores.add(Color.red);
        
        return cores.get(indice);
    }
}
