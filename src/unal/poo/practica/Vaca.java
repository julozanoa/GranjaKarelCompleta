/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;
import java.util.*;
import becker.robots.*;
import java.awt.Color;
/**
 *
 * @author JUANPABLO
 */
public class Vaca {
    private Robot vaca;
    private double ritmo;
    private double temperatura;
    private double pulso;
    private int leche;
    private int cicloDeGestación;
    
    
    public Vaca(City city,int x,int y,Direction drctn, double ritmo,double temperatura,double pulso) {
        this.vaca=new Robot(city,x,y,drctn);
        this.vaca.setColor(Color.black);
        this.pulso = pulso;
        this.temperatura = temperatura;
        this.ritmo = ritmo;
        this.cicloDeGestación = 0;
        
    }
    
    
    public Robot getRobot(){
        return vaca;
    }

    public double getRitmo() {
        return ritmo;
    }

    public void setRitmo(double ritmo) {
        this.ritmo = ritmo;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getPulso() {
        return pulso;
    }

    public void setPulso(double pulso) {
        this.pulso = pulso;
    }

    public void irAPunto(int st,int av){
    int z =Math.abs(this.vaca.getStreet()-st);
        int w =Math.abs(this.vaca.getAvenue()-av);
        if(this.vaca.getStreet()<st){
            if(this.vaca.getDirection().equals(Direction.EAST)){
                for (int i = 0; i < 3; i++) {
                    this.vaca.turnLeft();
                }
            }else if(this.vaca.getDirection().equals(Direction.NORTH)){
                for (int i = 0; i < 2; i++) {
                    this.vaca.turnLeft();
                }
            }else if(this.vaca.getDirection().equals(Direction.WEST)){
                this.vaca.turnLeft();
            }
        }else if(this.vaca.getStreet()>st){
            if(this.vaca.getDirection().equals(Direction.EAST)){
                this.vaca.turnLeft();
            }else if(this.vaca.getDirection().equals(Direction.SOUTH)){
                for (int i = 0; i < 2; i++) {
                    this.vaca.turnLeft();
                }
            }else if(this.vaca.getDirection().equals(Direction.WEST)){
                for (int i = 0; i < 3; i++) {
                    this.vaca.turnLeft();
                }
            }
        }else if(this.vaca.getStreet()==st){
        }
        if (z==1) {
            this.vaca.move();
        }else{
            for (int i = 0; i < z; i++) {
                this.vaca.move();
            }
        }
    
            if(this.vaca.getAvenue()<av){
                if(this.vaca.getDirection().equals(Direction.NORTH)){
                    for (int i = 0; i < 3; i++) {
                        this.vaca.turnLeft();
                    }
                }else if(this.vaca.getDirection().equals(Direction.SOUTH)){
                    this.vaca.turnLeft();
                }else if(this.vaca.getDirection().equals(Direction.WEST)){
                    for (int i = 0; i < 2; i++) {
                        this.vaca.turnLeft();
                    }
                }
            }else if(this.vaca.getAvenue()>av){
                if(this.vaca.getDirection().equals(Direction.NORTH)){
                    this.vaca.turnLeft();
                }else if(this.vaca.getDirection().equals(Direction.SOUTH)){
                for (int i = 0; i < 3; i++) {
                    this.vaca.turnLeft();
                }
        }else if (this.vaca.getDirection().equals(Direction.EAST)) {
                    for (int i = 0; i < 2; i++) {
                        this.vaca.turnLeft();
                    }
                }
        }else if(this.vaca.getAvenue()==av){
            
        }
            if (w==1) {
            this.vaca.move();
        }else{
                for (int i = 0; i < w; i++) {
            this.vaca.move();
        }
            }
    }
    
    

    public int getLeche() {
        return leche;
    }

    public void setLeche(int leche) {
        this.leche = leche;
    }

    public int getCicloDeGestación() {
        return cicloDeGestación;
    }

    public void setCicloDeGestación(int cicloDeGestación) {
        this.cicloDeGestación = cicloDeGestación;
    }
    
    
    
    
}
