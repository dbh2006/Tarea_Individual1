/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareapoo;

/**
 *
 * @author PC
 */
public class ejercicio5 {
       public static void main(String[] args) {
        String[][] companeros = {
            {"Carlos", "Portillo", "Ingenieria Computacional", "Empresa Tecnicom"},
            {"Keysi", "Fuentes", "Ingeniería Computacional", "Negocio Propio"},
            {"Arnold", "Aguilar", "Ingenieria Electronica", "Empresa Energia Renovable"},
            {"Diana", "Selva", "Ingeniería Computacional", "Ingenieria Civil"},
            {"Mirna", "Chirinos", "Ingeniería en Producción Industrial", "Negocio online"}
        };
        
           for (String[] companero : companeros) {
               System.out.println(companero[0] + " " + companero[1] + " " + companero[2] + " " + companero[3]);
           }
    }
}
