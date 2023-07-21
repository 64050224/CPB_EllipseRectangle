/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpb_ellipserectangle;

import java.util.Scanner;

/**
 *
 * @author AreYouG
 */
public class Foot {
    private FootShape footShape;
    public Foot(){
        footShape = new FootShape();
    }
    public void draw(int type){
        switch(type){
            case 1 -> System.out.println(footShape.drawAsEllipse());
            case 2 -> System.out.println(footShape.drawAsRectangle());
            default -> System.out.println("wrong input");
        }
    }
    public static void main(String args[]){
        Foot foot = new Foot();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("What to draw? 1. Ellipse, 2. Rectangle ");
        int type = sc.nextInt();
        foot.draw(type);
        
    }
}


