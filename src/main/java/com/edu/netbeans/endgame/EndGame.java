/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.edu.netbeans.endgame;

/**
 *
 * @author brian
 */
public class EndGame{
    
    public static void main(String[] args) {
        Heroe blackPanther = new Heroe("Black Panter grr", "Ser el rey de todo Wakanda", "Garras de Vibranium");
        Villano galactus = new Villano("Galactus el devorador de mundos", "Devorar mundos", "usa de chalan a Silver Surfer");
        Avenger ironMan = new Avenger("Tony Stark", "Genio" , "Mark 42", "Prime");
        Thanos thanos = new Thanos("Thanos", "El Titan loco", "ejercito Chitaury", "Gemas del infinito");
        
        //Aplicando Polimorfismo
        
        Personaje[]personajes = {blackPanther,galactus,ironMan,thanos};
        for(Personaje personaje : personajes){
            personaje.atacar();
        }
        
        //Método especifico de Avenger
        
        ((Avenger)ironMan).reunirse();
        
        //Ejemplo metodo especifico de Thanos
        thanos.chasquearDedos();
    }
}
