/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;
import becker.robots.*;
import java.awt.Color;
import java.util.*;

/**
 *
 * @author JUANPABLO
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Parcela parcela = new Parcela("Parcela.txt");
        Granjero granjero = new Granjero(parcela.getParcela(),17,16, Direction.NORTH);
        TorredeInformación torre = new TorredeInformación();
        torre.vacasparcela1(parcela.getParcela());
        torre.vacasparcela2(parcela.getParcela());
        torre.vacasparcela3(parcela.getParcela());
        
        int contador = 0;
        for (int i = 0; i < 5; i++) {
            if(contador == 0){
                torre.cicloMovimiento1();
            }if(contador == 1){
                torre.cicloMovimiento2();
            }
            if(contador == 2){
                
                torre.cicloMovimiento3();
            }
            if(contador == 3){
                
                torre.cicloMovimiento2();
                contador = -1;
            }
            contador++;
            
            torre.nuevosDatos();
            
            
            for (int j = 0; j < 10; j++) {
                if((torre.getVacasparcela1().get(j).getPulso()<47.3&&torre.getVacasparcela1().get(i).getPulso()>56.5)||
                   (torre.getVacasparcela1().get(j).getRitmo()<42.8&&torre.getVacasparcela1().get(j).getRitmo()>58)||
                   (torre.getVacasparcela1().get(j).getTemperatura()<37.4&&torre.getVacasparcela1().get(j).getTemperatura()>38.6)){
                    torre.getVacasparcela1().get(j).getRobot().setColor(Color.RED);
            }
                if((torre.getVacasparcela2().get(j).getPulso()<47.3&&torre.getVacasparcela1().get(i).getPulso()>56.5)||
                   (torre.getVacasparcela2().get(j).getRitmo()<42.8&&torre.getVacasparcela1().get(j).getRitmo()>58)||
                   (torre.getVacasparcela2().get(j).getTemperatura()<37.4&&torre.getVacasparcela1().get(j).getTemperatura()>38.6)){
                    torre.getVacasparcela2().get(j).getRobot().setColor(Color.RED);
            }
                if((torre.getVacasparcela3().get(j).getPulso()<47.3&&torre.getVacasparcela1().get(i).getPulso()>56.5)||
                   (torre.getVacasparcela3().get(j).getRitmo()<42.8&&torre.getVacasparcela1().get(j).getRitmo()>58)||
                   (torre.getVacasparcela3().get(j).getTemperatura()<37.4&&torre.getVacasparcela1().get(j).getTemperatura()>38.6)){
                    torre.getVacasparcela3().get(j).getRobot().setColor(Color.RED);
            }
            }
            granjero.irAVacas1(torre.getVacasparcela1());
            granjero.irAVacas2(torre.getVacasparcela2());
            granjero.irAVacas3(torre.getVacasparcela3());
            
            System.out.println("Desea ordeñar lote?   para SI prima 1, para NO oprima 0");
            int o = s.nextInt();
            
            if (o == 1) {
                System.out.println("que lote desea ordeñar: 1, 2 o 3?");
                int l = s.nextInt();
                if(l==1){
                    torre.irAOrdeño1();
                }else if(l==2){
                    torre.irAOrdeño2();
                }else if(l==3){
                    torre.getVacasparcela3();
                }
            }
            
        }
        
    }
}
