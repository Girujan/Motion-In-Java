/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstgame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author girujan
 */
public class FirstGame extends JPanel {

    int x = 0;
    int y = 0;
    
    int border = 30;
    boolean balldown = true;
    boolean ballright = true;
    
    private void moveBall(){
        
        if(balldown==true){
            y++;
        }
        if(balldown==false){
            y--;
        }
        if(ballright==true){
            x++;
        }
        if(ballright==false){
            x--;
        }
        
        if(y==getHeight()-border){
            balldown = false;
        }
        if(y==0){
            balldown = true;
        }
        if(x==getWidth()-border){
            ballright = false;
        }
        if(x==0){
            ballright = true;
        }
    }
    @Override
    public void paint(Graphics g){
       super.paint(g);
       g.fillOval(x, y, 24, 24);
    }
    
    public static void main(String[] args) throws InterruptedException{
        // TODO code application logic here
        JFrame ge = new JFrame();
        ge.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ge.setSize(500, 300);
        ge.setVisible(true);
        
        FirstGame game = new FirstGame();
        ge.add(game);
        
        while(true){
          
                game.moveBall();
                game.repaint();
            Thread.sleep(10);
        }
    }
    
}
