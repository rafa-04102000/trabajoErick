/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erick;

import java.io.Serializable;
import java.util.LinkedList;


public class Curso {
    public String nombre;
    public int creditos;
    
    Profesor profesor;
    LinkedList<Estudiante> estudiantes = new LinkedList();
    
    public Curso(String nombre, int creditos, Profesor profesor) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.profesor = profesor;
    }
}
