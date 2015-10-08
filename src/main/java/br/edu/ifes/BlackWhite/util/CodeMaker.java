/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.BlackWhite.util;

/**
 *
 * @author Bruno Dell'Orto
 */
public enum CodeMaker {
    
    segunda, terca, quarta, quinta, sexta, sabado, domingo;
    
    private int dia;
    
    public synchronized int getDiaSemana(){
        dia = dia + 1;
        return dia;
    }
}
