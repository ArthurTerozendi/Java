import java.awt.Color;
import java.util.Random;
/**
 * Escreva a descri‹o da classe BoxBall aqui.
 * 
 * @author (seu nome) 
 * @version (nœmero de vers‹o ou data)
 */
public class BoxBall
{
    // vari‡veis de inst‰ncia - substitua o exemplo abaixo pelo seu pr—prio
    private Color color;
    private Random rng;
    private int diameter;
    private int xPosition;
    private int yPosition;
    private final int x1Box;
    private final int y1Box;
    private final int x2Box;
    private final int y2Box;
    
    // y position of ground
    private Canvas canvas;
    private int ySpeed = 1;
    private int xSpeed = 1;

    /**
     * @param xPos cordenada horizontal da bola
     * @param yPos cordenada vertical da bola
     * @param cor Cor da bola
     * @param ballDiametro diametro da bola(em pixel)
     * @param xCaixa posicao horizontal inical da caixa
     * @param yCaixa posicao vertical inical da caixa
     * @param larg largura da caixa
     * @param alt altura da caixa
     * @param drawingCanvas desenhar a bola
     */
    public BoxBall(int xPos, int yPos, Color cor, int ballDiametro, 
                    int x1Caixa, int y1Caixa, int x2Caixa, 
                    int y2Caixa, Canvas drawingCanvas)
    {
        rng = new Random();
        xPosition = xPos;
        yPosition = yPos;
        color = cor;
        diameter = ballDiametro;
        x1Box = x1Caixa;
        y1Box = y1Caixa;
        x2Box = x2Caixa;
        y2Box = y2Caixa;
        canvas = drawingCanvas;
        xSpeed = rng.nextInt(3) + 2;
        ySpeed = rng.nextInt(3) + 2;
    }

    /**
     * Exemplo de mŽtodo - substitua este coment‡rio pelo seu pr—prio
     * 
     * @param  y   exemplo de um par‰metro de mŽtodo
     * @return     a soma de x com y 
     */
    public void draw()
    {
        canvas.setForegroundColor(color);
        canvas.fillCircle(xPosition, yPosition, diameter);
    }
    public void erase()
    {
        canvas.eraseCircle(xPosition, yPosition, diameter);
    }
    public void move()
    {
        erase();
        
        xPosition += xSpeed;
        yPosition += ySpeed;
        // olha se a bola encostou no ch‹o ou no teto
        if (yPosition >= (y2Box - diameter - 1)) {
            yPosition = y2Box - diameter - 1;
            ySpeed = -ySpeed;
        }else if (yPosition <= (y1Box + 1)) {
            yPosition = y1Box  + 1;
            ySpeed = -ySpeed;
        }
        
        // olha se a bola encostou nas laterais
        if (xPosition <= (x1Box + 1)) {
            xPosition = x1Box + 1;
            xSpeed = -xSpeed;
        }else if (xPosition >= (x2Box - diameter - 1)) {
            xPosition = x2Box - diameter - 1;
            xSpeed = -xSpeed;
        }
        
        
        draw();
    }
}
