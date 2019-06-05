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
public class TorredeInformación {
    private ArrayList<Vaca> vacasparcela1;
    private ArrayList<Vaca> vacasparcela2;
    private ArrayList<Vaca> vacasparcela3;
    private int lecheDisponible;

    public TorredeInformación() {
        this.vacasparcela1 = new ArrayList<Vaca>();
        this.vacasparcela2 = new ArrayList<Vaca>();
        this.vacasparcela3 = new ArrayList<Vaca>();
    }
    
    public void vacasparcela1(City city){
        for (int i = 0; i < 5; i++) {
            Vaca vaca = new Vaca(city,i,0,Direction.SOUTH,50.4,38.0,48.1);
            this.vacasparcela1.add(vaca);
            Vaca vaca1 = new Vaca(city,i,1,Direction.SOUTH,50.4,38.0,48.1);
            this.vacasparcela1.add(vaca1);
        }
    }
    
    public void vacasparcela2(City city){
        for (int i = 0; i < 5; i++) {
            Vaca vaca = new Vaca(city,i+10,0,Direction.SOUTH,50.4,38.0,48.1);
            this.vacasparcela2.add(vaca);
            Vaca vaca1 = new Vaca(city,i+10,1,Direction.SOUTH,50.4,38.0,48.1);
            this.vacasparcela2.add(vaca1);
        }
    }
    
    public void vacasparcela3(City city){
        for (int i = 0; i < 5; i++) {
            Vaca vaca = new Vaca(city,i,15,Direction.SOUTH,50.4,38.0,48.1);
            this.vacasparcela3.add(vaca);
            Vaca vaca1 = new Vaca(city,i,16,Direction.SOUTH,50.4,38.0,48.1);
            this.vacasparcela3.add(vaca1);
        }
    }
    
    public void cicloMovimiento1(){
        for (int i = 9; i >= 0; i--) {
            if(this.vacasparcela1.get(i).getRobot().getColor().equals(Color.WHITE)){
            }else{
                this.vacasparcela1.get(i).getRobot().move();
            }
        }
        for (int i = 9; i >= 0; i--) {
            if(this.vacasparcela2.get(i).getRobot().getColor().equals(Color.WHITE)){
            }else{
                this.vacasparcela2.get(i).getRobot().move();
            }
        }
        for (int i = 9; i >= 0; i--) {
            if(this.vacasparcela3.get(i).getRobot().getColor().equals(Color.WHITE)){
            }else{
                this.vacasparcela3.get(i).getRobot().move();
            }
        }    
    }
    public void cicloMovimiento2(){
        for (int i = 9; i >= 0; i--) {  
            for (int j = 0; j < 2; j++) {
                if(this.vacasparcela1.get(i).getRobot().getColor().equals(Color.WHITE)){
            }else{
                this.vacasparcela1.get(i).getRobot().turnLeft();
            }
            }
        }
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < 2; j++) {
                if(this.vacasparcela2.get(i).getRobot().getColor().equals(Color.WHITE)){
            }else{
                this.vacasparcela2.get(i).getRobot().turnLeft();
            }
            }
        }
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < 2; j++) {
                if(this.vacasparcela3.get(i).getRobot().getColor().equals(Color.WHITE)){
            }else{
                this.vacasparcela3.get(i).getRobot().turnLeft();
            }
            }
        }  
    }
    public void cicloMovimiento3(){
        for (int i = 0; i < 10; i++) {  
            if(this.vacasparcela1.get(i).getRobot().getColor().equals(Color.WHITE)){
            }else{
                this.vacasparcela1.get(i).getRobot().move();
            }
        }
        for (int i = 0; i < 10; i++) {
            if(this.vacasparcela2.get(i).getRobot().getColor().equals(Color.WHITE)){
            }else{
                this.vacasparcela2.get(i).getRobot().move();
            }
        }
        for (int i = 0; i < 10; i++) {
            if(this.vacasparcela3.get(i).getRobot().getColor().equals(Color.WHITE)){
            }else{
                this.vacasparcela3.get(i).getRobot().move();
            }
        } 
    }

    public ArrayList<Vaca> getVacasparcela1() {
        return vacasparcela1;
    }

    public ArrayList<Vaca> getVacasparcela2() {
        return vacasparcela2;
    }

    public ArrayList<Vaca> getVacasparcela3() {
        return vacasparcela3;
    }
    public void nuevosDatos(){
        for (int i = 0; i < this.vacasparcela1.size(); i++) {
                this.vacasparcela1.get(i).setRitmo(Math.random()*59+41);
                this.vacasparcela1.get(i).setPulso(Math.random()*57+39);
                this.vacasparcela1.get(i).setTemperatura(Math.random()*39+37);
        
                this.vacasparcela2.get(i).setRitmo(Math.random()*59+41);
                this.vacasparcela2.get(i).setPulso(Math.random()*57+39);
                this.vacasparcela2.get(i).setTemperatura(Math.random()*39+37);
         
                this.vacasparcela3.get(i).setRitmo(Math.random()*59+41);
                this.vacasparcela3.get(i).setPulso(Math.random()*57+39);
                this.vacasparcela3.get(i).setTemperatura(Math.random()*39+37);
        }
    }
    
    public void irAOrdeño1(){
        for (int i = 0; i < this.vacasparcela1.size(); i++) {
            if (this.vacasparcela1.get(i).getRobot().getColor().equals(Color.BLACK)){
                int x = this.vacasparcela1.get(i).getRobot().getStreet();
                int y = this.vacasparcela1.get(i).getRobot().getAvenue();
                Direction z = this.vacasparcela1.get(i).getRobot().getDirection();
                this.vacasparcela1.get(i).irAPunto(5,16);
                this.vacasparcela1.get(i).irAPunto(16,16);
                this.vacasparcela1.get(i).setLeche(this.vacasparcela1.get(i).getLeche()+1);
                this.vacasparcela1.get(i).irAPunto(5,11);
                this.vacasparcela1.get(i).irAPunto(x,y);
                if (z.equals(Direction.NORTH)) {
                    for (int j = 0; j < 3; j++) {
                        this.vacasparcela1.get(i).getRobot().turnLeft();
                    }
                }else if(z.equals(Direction.SOUTH)){
                        this.vacasparcela1.get(i).getRobot().turnLeft();
                }
            }
        }
        
    }
    
    public void irAOrdeño2(){
        for (int i = 0; i < this.vacasparcela2.size(); i++) {
            if (this.vacasparcela2.get(i).getRobot().getColor().equals(Color.BLACK)){
                int x = this.vacasparcela2.get(i).getRobot().getStreet();
                int y = this.vacasparcela2.get(i).getRobot().getAvenue();
                Direction z = this.vacasparcela2.get(i).getRobot().getDirection();
                this.vacasparcela2.get(i).irAPunto(12,16);
                this.vacasparcela2.get(i).irAPunto(16,16);
                this.vacasparcela2.get(i).setLeche(this.vacasparcela2.get(i).getLeche()+1);
                this.vacasparcela2.get(i).irAPunto(12,11);
                this.vacasparcela2.get(i).irAPunto(x,y);
                if (z.equals(Direction.NORTH)) {
                    for (int j = 0; j < 3; j++) {
                        this.vacasparcela2.get(i).getRobot().turnLeft();
                    }
                }else if(z.equals(Direction.SOUTH)){
                        this.vacasparcela2.get(i).getRobot().turnLeft();
                }
            }
        }
    }
    
    public void irAOrdeño3(){
        for (int i = 0; i < this.vacasparcela3.size(); i++) {
            if (this.vacasparcela3.get(i).getRobot().getColor().equals(Color.BLACK)){
                int x = this.vacasparcela2.get(i).getRobot().getStreet();
                int y = this.vacasparcela3.get(i).getRobot().getAvenue();
                Direction z = this.vacasparcela3.get(i).getRobot().getDirection();
                this.vacasparcela3.get(i).irAPunto(12,16);
                this.vacasparcela3.get(i).irAPunto(16,16);
                this.vacasparcela3.get(i).setLeche(this.vacasparcela3.get(i).getLeche()+1);
                this.vacasparcela3.get(i).irAPunto(11,16);
                this.vacasparcela3.get(i).irAPunto(x,y);
                if (z.equals(Direction.NORTH)) {
                    for (int j = 0; j < 3; j++) {
                        this.vacasparcela3.get(i).getRobot().turnLeft();
                    }
                }else if(z.equals(Direction.SOUTH)){
                        this.vacasparcela3.get(i).getRobot().turnLeft();
                }
            }
        }
    }

    public int getLecheDisponible() {
        return lecheDisponible;
    }

    public void setLecheDisponible(int lecheDisponible) {
        this.lecheDisponible = lecheDisponible;
    }
    
}
