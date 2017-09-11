import javax.swing.JApplet;
import java.awt.Graphics;
public class TicTacToe extends JApplet {
    public void paint(Graphics canvas){
        canvas.drawLine(0,0,150,150);
        canvas.drawLine(150,0,150,150);
        canvas.drawLine(150,150,0,150);
        canvas.drawLine(150,0,0,0);
        canvas.drawLine(0,150,0,0);
        canvas.drawLine(100,0,100,150);
        canvas.drawLine(150,100,0,100);
        canvas.drawLine(0,50,150,50);
        canvas.drawLine(50,0,50,150);
        canvas.fillOval(50,50,50,50);
        canvas.fillOval(100,100,50,50);
        canvas.fillOval(0,0,50,50);
    }
}
