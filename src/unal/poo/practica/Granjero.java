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
public class Granjero {
    private Robot granjero;

    public Granjero(City city, int x, int y, Direction drctn) {
        this.granjero = new Robot(city,x,y,drctn);
        this.granjero.setColor(Color.yellow);
    }
    
    public void irAPunto(int st, int av){
        int z =Math.abs(this.granjero.getStreet()-st);
        int w =Math.abs(this.granjero.getAvenue()-av);
        if(this.granjero.getStreet()<st){
            if(this.granjero.getDirection().equals(Direction.EAST)){
                for (int i = 0; i < 3; i++) {
                    this.granjero.turnLeft();
                }
            }else if(this.granjero.getDirection().equals(Direction.NORTH)){
                for (int i = 0; i < 2; i++) {
                    this.granjero.turnLeft();
                }
            }else if(this.granjero.getDirection().equals(Direction.WEST)){
                this.granjero.turnLeft();
            }
        }else if(this.granjero.getStreet()>st){
            if(this.granjero.getDirection().equals(Direction.EAST)){
                this.granjero.turnLeft();
            }else if(this.granjero.getDirection().equals(Direction.SOUTH)){
                for (int i = 0; i < 2; i++) {
                    this.granjero.turnLeft();
                }
            }else if(this.granjero.getDirection().equals(Direction.WEST)){
                for (int i = 0; i < 3; i++) {
                    this.granjero.turnLeft();
                }
            }
        }else if(this.granjero.getStreet()==st){
        }
        if (z==1) {
            this.granjero.move();
        }else{
            for (int i = 0; i < z; i++) {
                this.granjero.move();
            }
        }
    
            if(this.granjero.getAvenue()<av){
                if(this.granjero.getDirection().equals(Direction.NORTH)){
                    for (int i = 0; i < 3; i++) {
                        this.granjero.turnLeft();
                    }
                }else if(this.granjero.getDirection().equals(Direction.SOUTH)){
                    this.granjero.turnLeft();
                }else if(this.granjero.getDirection().equals(Direction.WEST)){
                    for (int i = 0; i < 2; i++) {
                        this.granjero.turnLeft();
                    }
                }
            }else if(this.granjero.getAvenue()>av){
                if(this.granjero.getDirection().equals(Direction.NORTH)){
                    this.granjero.turnLeft();
                }else if(this.granjero.getDirection().equals(Direction.SOUTH)){
                for (int i = 0; i < 3; i++) {
                    this.granjero.turnLeft();
                }
        }else if (this.granjero.getDirection().equals(Direction.EAST)) {
                    for (int i = 0; i < 2; i++) {
                        this.granjero.turnLeft();
                    }
                }
        }else if(this.granjero.getAvenue()==av){
            
        }
            if (w==1) {
            this.granjero.move();
        }else{
                for (int i = 0; i < w; i++) {
            this.granjero.move();
        }
            }
    }
    
    public boolean hayVacasEnfermas(ArrayList<Vaca> vacas){
        for (int i = 0; i < vacas.size(); i++) {
            if(vacas.get(i).getRobot().getColor().equals(Color.RED)||vacas.get(i).getRobot().getColor().equals(Color.MAGENTA)){
                return true;
            }
        }return false;
    }
    public int random(int max,int min){
        Random r = new Random();
        return ((r.nextInt((max-min)+1))+min);
    }
    public void irAVacas1(ArrayList<Vaca> vacas1){
        if (hayVacasEnfermas(vacas1)==true) {
            irAPunto(5,11);
            for (int i = 0; i < vacas1.size(); i++) {
                if (vacas1.get(i).getRobot().getColor().equals(Color.RED) ||vacas1.get(i).getRobot().getColor().equals(Color.MAGENTA)) {
                    irAPunto(vacas1.get(i).getRobot().getStreet(),vacas1.get(i).getRobot().getAvenue());
                    if(random(10,0)<=7 && vacas1.get(i).getRobot().getColor().equals(Color.RED)){
                        vacas1.get(i).setPulso(48.1);
                        vacas1.get(i).setRitmo(50.4);
                        vacas1.get(i).setTemperatura(38.0);
                        vacas1.get(i).getRobot().setColor(Color.BLACK);
                    }else if(random(10,0)<=7 && vacas1.get(i).getRobot().getColor().equals(Color.MAGENTA)){
                        vacas1.get(i).setPulso(48.1);
                        vacas1.get(i).setRitmo(50.4);
                        vacas1.get(i).setTemperatura(38.0);
                        vacas1.get(i).getRobot().setColor(Color.BLUE);
                    }
                }
            }
            irAPunto(5,12);
        }
    }
    public void irAVacas2(ArrayList<Vaca> vacas2){
        if (hayVacasEnfermas(vacas2)==true){
            irAPunto(12,12);
            if (this.granjero.getDirection().equals(Direction.SOUTH)) {
                for (int i = 0; i < 3; i++) {
                    this.granjero.turnLeft();
                }
            }
            this.granjero.move();
            for (int i = 0; i < vacas2.size(); i++) {
                if (vacas2.get(i).getRobot().getColor().equals(Color.RED) ||vacas2.get(i).getRobot().getColor().equals(Color.MAGENTA)) {
                    irAPunto(vacas2.get(i).getRobot().getStreet(),vacas2.get(i).getRobot().getAvenue());
                    if(random(10,0)<=7 && vacas2.get(i).getRobot().getColor().equals(Color.RED)){
                        vacas2.get(i).setPulso(48.1);
                        vacas2.get(i).setRitmo(50.4);
                        vacas2.get(i).setTemperatura(38.0);
                        vacas2.get(i).getRobot().setColor(Color.BLACK);
                    }else if(random(10,0)<=7 && vacas2.get(i).getRobot().getColor().equals(Color.MAGENTA)){
                        vacas2.get(i).setPulso(48.1);
                        vacas2.get(i).setRitmo(50.4);
                        vacas2.get(i).setTemperatura(38.0);
                        vacas2.get(i).getRobot().setColor(Color.BLUE);
                    }
                }
            }
            irAPunto(12,12);
        }
    }
    public void irAVacas3(ArrayList<Vaca> vacas3){
        if(hayVacasEnfermas(vacas3)==true){
            for (int i = 0; i < vacas3.size(); i++) {
                if (vacas3.get(i).getRobot().getColor().equals(Color.RED) ||vacas3.get(i).getRobot().getColor().equals(Color.MAGENTA)) {
                    irAPunto(vacas3.get(i).getRobot().getStreet(),vacas3.get(i).getRobot().getAvenue());
                    if(random(10,0)<=7 && vacas3.get(i).getRobot().getColor().equals(Color.RED)){
                        vacas3.get(i).setPulso(48.1);
                        vacas3.get(i).setRitmo(50.4);
                        vacas3.get(i).setTemperatura(38.0);
                        vacas3.get(i).getRobot().setColor(Color.BLACK);
                    }else if(random(10,0)<=7 && vacas3.get(i).getRobot().getColor().equals(Color.MAGENTA)){
                        vacas3.get(i).setPulso(48.1);
                        vacas3.get(i).setRitmo(50.4);
                        vacas3.get(i).setTemperatura(38.0);
                        vacas3.get(i).getRobot().setColor(Color.BLUE);
                    }
                }
            }
        }
        if(this.granjero.getStreet()!=17){
            irAPunto(10,16);
            if (this.granjero.getDirection().equals(Direction.EAST)) {
                for (int i = 0; i < 3; i++) {
                    this.granjero.turnLeft();
                }
            }else if(this.granjero.getDirection().equals(Direction.WEST)){
                this.granjero.turnLeft();
            }
        }
        irAPunto(17,16);
        for (int i = 0; i < 2; i++) {
            this.granjero.turnLeft();
        }
    }
    
    public Robot getGranjero(){
        return granjero;
    }
    
}
