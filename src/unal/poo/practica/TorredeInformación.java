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
    
    public void vacasparcela1(City city, int x){
        if (x%2==0) {
            for (int i = 0; i < x/2; i++) {
               Vaca vaca = new Vaca(city,i,0,Direction.SOUTH,50.4,38.0,48.1);
               this.vacasparcela1.add(vaca);
               Vaca vaca1 = new Vaca(city,i,1,Direction.SOUTH,50.4,38.0,48.1);
               this.vacasparcela1.add(vaca1);
            }
        }else if(x%2!=0){
            for (int i = 0; i < (x-1)/2; i++) {
               Vaca vaca = new Vaca(city,i,0,Direction.SOUTH,50.4,38.0,48.1);
               this.vacasparcela1.add(vaca);
               Vaca vaca1 = new Vaca(city,i,1,Direction.SOUTH,50.4,38.0,48.1);
               this.vacasparcela1.add(vaca1);
            }
               Vaca vaca = new Vaca(city,((x-1)/2),0,Direction.SOUTH,50.4,38.0,48.1);
               this.vacasparcela1.add(vaca);
        }else if(x==1){
            Vaca vaca = new Vaca(city,0,0,Direction.SOUTH,50.4,38.0,48.1);
               this.vacasparcela1.add(vaca);
        }
    }    
    public void vacasparcela2(City city, int x){
        if (x%2==0) {
            for (int i = 0; i < x/2; i++) {
               Vaca vaca = new Vaca(city,i+10,0,Direction.SOUTH,50.4,38.0,48.1);
               this.vacasparcela2.add(vaca);
               Vaca vaca1 = new Vaca(city,i+10,1,Direction.SOUTH,50.4,38.0,48.1);
               this.vacasparcela2.add(vaca1);
            }
        }else if(x%2!=0){
            for (int i = 0; i < (x-1)/2; i++) {
               Vaca vaca = new Vaca(city,i+10,0,Direction.SOUTH,50.4,38.0,48.1);
               this.vacasparcela2.add(vaca);
               Vaca vaca1 = new Vaca(city,i+10,1,Direction.SOUTH,50.4,38.0,48.1);
               this.vacasparcela2.add(vaca1);
            }
               Vaca vaca = new Vaca(city,((x-1)/2)+10,0,Direction.SOUTH,50.4,38.0,48.1);
               this.vacasparcela2.add(vaca);
        }else if(x==1){
            Vaca vaca = new Vaca(city,10,0,Direction.SOUTH,50.4,38.0,48.1);
               this.vacasparcela2.add(vaca);
        }
    }
    public void vacasparcela3(City city, int x){
        if (x%2==0) {
            for (int i = 0; i < x/2; i++) {
               Vaca vaca = new Vaca(city,i,15,Direction.SOUTH,50.4,38.0,48.1);
               this.vacasparcela3.add(vaca);
               Vaca vaca1 = new Vaca(city,i,16,Direction.SOUTH,50.4,38.0,48.1);
               this.vacasparcela3.add(vaca1);
            }
        }else if(x%2!=0){
            for (int i = 0; i < (x-1)/2; i++) {
               Vaca vaca = new Vaca(city,i,15,Direction.SOUTH,50.4,38.0,48.1);
               this.vacasparcela3.add(vaca);
               Vaca vaca1 = new Vaca(city,i,16,Direction.SOUTH,50.4,38.0,48.1);
               this.vacasparcela3.add(vaca1);
            }
               Vaca vaca = new Vaca(city,((x-1)/2),15,Direction.SOUTH,50.4,38.0,48.1);
               this.vacasparcela3.add(vaca);
        }else if(x==1){
            Vaca vaca = new Vaca(city,0,15,Direction.SOUTH,50.4,38.0,48.1);
               this.vacasparcela1.add(vaca);
        }
    }
    
    public void cicloMovimiento1(){ 
        for (int i = this.vacasparcela1.size()-1; i >= 0; i--) {
            this.vacasparcela1.get(i).getRobot().move();            
        }
        for (int i = this.vacasparcela2.size()-1; i >= 0; i--) {
            this.vacasparcela2.get(i).getRobot().move();
        }
        for (int i = this.vacasparcela3.size()-1; i >= 0; i--) {
            this.vacasparcela3.get(i).getRobot().move();
        }    
    }
    public void cicloMovimiento2(){
        for (int i = this.vacasparcela1.size()-1; i >= 0; i--) {  
            for (int j = 0; j < 2; j++) {
                this.vacasparcela1.get(i).getRobot().turnLeft();
            }
        }
        for (int i = this.vacasparcela2.size()-1; i >= 0; i--) {
            for (int j = 0; j < 2; j++) {
                this.vacasparcela2.get(i).getRobot().turnLeft();
            }
        }
        for (int i = this.vacasparcela3.size()-1; i >= 0; i--) {
            for (int j = 0; j < 2; j++) {
                this.vacasparcela3.get(i).getRobot().turnLeft();
            }
        }  
    }
    public void cicloMovimiento3(){
        for (int i = 0; i < this.vacasparcela1.size(); i++) {  
            this.vacasparcela1.get(i).getRobot().move();
        }
        for (int i = 0; i < this.vacasparcela2.size(); i++) {
            this.vacasparcela2.get(i).getRobot().move();
        }
        for (int i = 0; i < this.vacasparcela3.size(); i++) {
            this.vacasparcela3.get(i).getRobot().move();
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
                this.vacasparcela1.get(i).setRitmo(randomDouble(58.5,42.3));
                this.vacasparcela1.get(i).setPulso(randomDouble(57,39.2));
                this.vacasparcela1.get(i).setTemperatura(randomDouble(38.9,37.));
        }
        for (int i = 0; i < this.vacasparcela2.size(); i++) {
                this.vacasparcela2.get(i).setRitmo(randomDouble(58.5,42.3));
                this.vacasparcela2.get(i).setPulso(randomDouble(57,39.2));
                this.vacasparcela2.get(i).setTemperatura(randomDouble(38.9,37.7));
        }
        for (int i = 0; i < this.vacasparcela3.size(); i++) {
                this.vacasparcela3.get(i).setRitmo(randomDouble(58.5,42.3));
                this.vacasparcela3.get(i).setPulso(randomDouble(57,39.2));
                this.vacasparcela3.get(i).setTemperatura(randomDouble(38.9,37.7));
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
                this.setLecheDisponible(this.getLecheDisponible()+1);
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
                this.setLecheDisponible(this.getLecheDisponible()+1);
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
                this.setLecheDisponible(this.getLecheDisponible()+1);
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
    
    public int random(int max,int min){
        Random r = new Random();
        return ((r.nextInt((max-min)+1))+min);
    }
    public double randomDouble(double max,double min){
        Random r = new Random();
        return min + (max-min)*r.nextDouble();
    }
    
    public void embarazarVacas(){
        for (int i = 0; i < this.vacasparcela1.size(); i++) {
            if(this.vacasparcela1.get(i).getRobot().getColor().equals(Color.BLACK) || this.vacasparcela1.get(i).getRobot().getColor().equals(Color.RED)){
                if (random(100,0)<3) {
                    if (this.vacasparcela1.get(i).getRobot().getColor().equals(Color.BLACK)) {
                        this.vacasparcela1.get(i).getRobot().setColor(Color.BLUE);
                    }else if(this.vacasparcela1.get(i).getRobot().getColor().equals(Color.RED)){
                        this.vacasparcela1.get(i).getRobot().setColor(Color.MAGENTA);
                    }
                }
            }
        }
        for (int i = 0; i < this.vacasparcela2.size(); i++) {
            if(this.vacasparcela2.get(i).getRobot().getColor().equals(Color.BLACK) || this.vacasparcela2.get(i).getRobot().getColor().equals(Color.RED)){
                if (random(100,0)<3) {
                    if (this.vacasparcela2.get(i).getRobot().getColor().equals(Color.BLACK)) {
                        this.vacasparcela2.get(i).getRobot().setColor(Color.BLUE);
                    }else if(this.vacasparcela2.get(i).getRobot().getColor().equals(Color.RED)){
                        this.vacasparcela2.get(i).getRobot().setColor(Color.MAGENTA);
                    }
                }
            }
        }
        for (int i = 0; i < this.vacasparcela3.size(); i++) {
            if(this.vacasparcela3.get(i).getRobot().getColor().equals(Color.BLACK) || this.vacasparcela3.get(i).getRobot().getColor().equals(Color.RED)){
                if (random(100,0)<3) {
                    if (this.vacasparcela3.get(i).getRobot().getColor().equals(Color.BLACK)) {
                        this.vacasparcela3.get(i).getRobot().setColor(Color.BLUE);
                    }else if(this.vacasparcela3.get(i).getRobot().getColor().equals(Color.RED)){
                        this.vacasparcela3.get(i).getRobot().setColor(Color.MAGENTA);
                    }
                }
            }
        }
    }
    public void enfermarVacas(){
        for (int j = 0; j < this.vacasparcela1.size(); j++) {
            if (this.vacasparcela1.get(j).getRobot().getColor().equals(Color.BLACK)) {
                if((this.vacasparcela1.get(j).getPulso()<39.7||this.vacasparcela1.get(j).getPulso()>56.5)||
                   (this.vacasparcela1.get(j).getRitmo()<42.8||this.vacasparcela1.get(j).getRitmo()>58)||
                   (this.vacasparcela1.get(j).getTemperatura()<37.4||this.vacasparcela1.get(j).getTemperatura()>38.6)){
                    this.vacasparcela1.get(j).getRobot().setColor(Color.RED);
                }
            }else if (this.vacasparcela1.get(j).getRobot().getColor().equals(Color.BLUE)) {
                if((this.vacasparcela1.get(j).getPulso()<39.7||this.vacasparcela1.get(j).getPulso()>56.5)||
                   (this.vacasparcela1.get(j).getRitmo()<42.8||this.vacasparcela1.get(j).getRitmo()>58)||
                   (this.vacasparcela1.get(j).getTemperatura()<37.4||this.vacasparcela1.get(j).getTemperatura()>38.6)){
                    this.vacasparcela1.get(j).getRobot().setColor(Color.MAGENTA);
                }
            }
        }
        for (int j = 0; j < this.vacasparcela2.size(); j++) {
            if (this.vacasparcela2.get(j).getRobot().getColor().equals(Color.BLACK)) {
                if((this.vacasparcela2.get(j).getPulso()<39.7||this.vacasparcela2.get(j).getPulso()>56.5)||
                   (this.vacasparcela2.get(j).getRitmo()<42.8||this.vacasparcela2.get(j).getRitmo()>58)||
                   (this.vacasparcela2.get(j).getTemperatura()<37.4||this.vacasparcela2.get(j).getTemperatura()>38.6)){
                    this.vacasparcela2.get(j).getRobot().setColor(Color.RED);
                }
            }else if (this.vacasparcela2.get(j).getRobot().getColor().equals(Color.BLUE)) {
                if((this.vacasparcela2.get(j).getPulso()<39.7||this.vacasparcela2.get(j).getPulso()>56.5)||
                   (this.vacasparcela2.get(j).getRitmo()<42.8||this.vacasparcela2.get(j).getRitmo()>58)||
                   (this.vacasparcela2.get(j).getTemperatura()<37.4||this.vacasparcela2.get(j).getTemperatura()>38.6)){
                    this.vacasparcela2.get(j).getRobot().setColor(Color.MAGENTA);
                }
            }
        }
        for (int j = 0; j < this.vacasparcela3.size(); j++) {
            if (this.vacasparcela3.get(j).getRobot().getColor().equals(Color.BLACK)) {
                if((this.vacasparcela3.get(j).getPulso()<39.7||this.vacasparcela3.get(j).getPulso()>56.5)||
                   (this.vacasparcela3.get(j).getRitmo()<42.8||this.vacasparcela3.get(j).getRitmo()>58)||
                   (this.vacasparcela3.get(j).getTemperatura()<37.4||this.vacasparcela3.get(j).getTemperatura()>38.6)){
                    this.vacasparcela3.get(j).getRobot().setColor(Color.RED);
                }
            }else if (this.vacasparcela3.get(j).getRobot().getColor().equals(Color.BLUE)) {
                if((this.vacasparcela3.get(j).getPulso()<39.7||this.vacasparcela3.get(j).getPulso()>56.5)||
                   (this.vacasparcela3.get(j).getRitmo()<42.8||this.vacasparcela3.get(j).getRitmo()>58)||
                   (this.vacasparcela3.get(j).getTemperatura()<37.4||this.vacasparcela3.get(j).getTemperatura()>38.6)){
                    this.vacasparcela3.get(j).getRobot().setColor(Color.MAGENTA);
                }
            }
        }
        
    }
    public void sumarCiclos(City city){
        int a = this.vacasparcela1.get(this.vacasparcela1.size()-1).getRobot().getAvenue();
        int b = this.vacasparcela1.get(this.vacasparcela1.size()-1).getRobot().getStreet();
        Direction c = this.vacasparcela1.get(this.vacasparcela1.size()-1).getRobot().getDirection();
        int d = this.vacasparcela2.get(this.vacasparcela2.size()-1).getRobot().getAvenue();
        int e = this.vacasparcela2.get(this.vacasparcela2.size()-1).getRobot().getStreet();
        Direction f = this.vacasparcela2.get(this.vacasparcela2.size()-1).getRobot().getDirection();
        int g = this.vacasparcela3.get(this.vacasparcela3.size()-1).getRobot().getAvenue();
        int h = this.vacasparcela3.get(this.vacasparcela3.size()-1).getRobot().getStreet();
        Direction k = this.vacasparcela3.get(this.vacasparcela3.size()-1).getRobot().getDirection();
        
        for (int i = 0; i < this.vacasparcela1.size(); i++) {
            if (this.vacasparcela1.get(i).getRobot().getColor().equals(Color.BLUE)||this.vacasparcela1.get(i).getRobot().getColor().equals(Color.MAGENTA)) {
                if (this.vacasparcela1.get(i).getCicloDeGestación()<2) {
                    this.vacasparcela1.get(i).setCicloDeGestación(this.vacasparcela1.get(i).getCicloDeGestación()+1);
                }
                if (this.vacasparcela1.get(i).getCicloDeGestación()==2) {
                    if (this.vacasparcela1.get(this.vacasparcela1.size()-1).getRobot().getAvenue()==0) {
                        Vaca vaca = new Vaca(city,b,1,c,50.4,38.0,48.1);
                        this.vacasparcela1.add(vaca);
                        this.vacasparcela1.get(i).setCicloDeGestación(0);
                        if (this.vacasparcela1.get(i).getRobot().getColor().equals(Color.BLUE)) {
                            this.vacasparcela1.get(i).getRobot().setColor(Color.BLACK);
                        }else{
                            this.vacasparcela1.get(i).getRobot().setColor(Color.RED);
                        }
                    }else if(this.vacasparcela1.get(this.vacasparcela1.size()-1).getRobot().getAvenue()==1){
                        Vaca vaca = new Vaca(city,b+1,0,c,50.4,38.0,48.1);
                        this.vacasparcela1.add(vaca);
                        this.vacasparcela1.get(i).setCicloDeGestación(0);
                        if (this.vacasparcela1.get(i).getRobot().getColor().equals(Color.BLUE)) {
                            this.vacasparcela1.get(i).getRobot().setColor(Color.BLUE);
                        }else{
                            this.vacasparcela1.get(i).getRobot().setColor(Color.RED);
                        }
                    }
                }
            }
        }
    }
    
    public void impValores(ArrayList<Vaca> vacas,int x){
        System.out.println("PARCELA "+x);
        for (int j = 0; j < this.vacasparcela1.size(); j++) {
                System.out.println("----------------------------------------------");
                System.out.println("Vaca "+j+1);
                System.out.println("Pulso: "+vacas.get(j).getPulso());
                System.out.println("Ritmo Cardiaco: "+ vacas.get(j).getRitmo());
                System.out.println("Temperatura °C: "+ vacas.get(j).getTemperatura());
                if (vacas.get(j).getRobot().getColor().equals(Color.BLUE)) {
                    System.out.println("Estado: En Gestación");
                    System.out.println("Ciclo de gestación: "+ vacas.get(j).getCicloDeGestación());
                }else if (vacas.get(j).getRobot().getColor().equals(Color.RED)) {
                    System.out.println("Estado: Enferma");
                }else if (vacas.get(j).getRobot().getColor().equals(Color.MAGENTA)){
                    System.out.println("Estado: En Gestación y Enferma");
                    System.out.println("Ciclo de gestación: "+ vacas.get(j).getCicloDeGestación());
                }else{
                    System.out.println("Estado: Normal");
                }
                System.out.println("Leche producida hasta ahora: "+vacas.get(j).getLeche()+" Litros");
                System.out.println("----------------------------------------------");
            }
    }
    public void lecheALaVenta(){
        System.out.println("El total de leche disponible para la venta es: "+this.lecheDisponible+"Litros");
    }
    
}
