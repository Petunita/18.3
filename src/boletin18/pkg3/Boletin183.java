/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18.pkg3;

/**
 *
 * @author Adrián
 */
public class Boletin183 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Notas obx = new Notas();
        obx.notas();
        System.out.println("\n");
        obx.ordenarNotaAlumnos();
        obx.visualizarNotaAlta();
    }

}
