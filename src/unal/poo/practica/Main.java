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
        System.out.println("Ingrese cantidad de vacas de la parcela 1");
        int p1 = s.nextInt();
        System.out.println("Ingrese cantidad de vacas de la parcela 2");
        int p2 = s.nextInt();
        System.out.println("Ingrese cantidad de vacas de la parcela 3");
        int p3 = s.nextInt();
        torre.vacasparcela1(parcela.getParcela(),p1);
        torre.vacasparcela2(parcela.getParcela(),p2);
        torre.vacasparcela3(parcela.getParcela(),p3);
        
        int contador = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("CICLO DE SIMULACIÓN NÚMERO "+(i+1));
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
            torre.enfermarVacas();
            torre.embarazarVacas();
            
            granjero.irAVacas1(torre.getVacasparcela1());
            granjero.irAVacas2(torre.getVacasparcela2());
            granjero.irAVacas3(torre.getVacasparcela3());
            torre.sumarCiclos(parcela.getParcela());
            
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
            
            torre.impValores(torre.getVacasparcela1(),1);
            torre.impValores(torre.getVacasparcela2(),2);
            torre.impValores(torre.getVacasparcela3(),3);
            
            torre.lecheALaVenta();
            System.out.println("DESEA CONTINUAR CON LA SIMULACIÓN?");
            System.out.println("oprima 1 para SI ó 0 para NO");
            int ds = s.nextInt();
            if (ds==0) {
                System.exit(0);
            }
        }
        
    }
}
