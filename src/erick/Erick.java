/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package erick;

import gui.LoginFrame;

public class Erick {


    public static void main(String[] args) {
       
        if (AppState.usuarios.isEmpty()) {
            Profesor profesorPrueba = new Profesor("jose", "123");
            AppState.usuarios.push(profesorPrueba);
            
            profesorPrueba.agregarCurso("mate", 5);
            
            Estudiante estudiantePrueba = new Estudiante("daniel", "123");
            AppState.usuarios.push(estudiantePrueba);
            
        }
        LoginFrame loginJframe = new LoginFrame();
        
        
    }
    
}
