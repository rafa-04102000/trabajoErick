/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erick;

import java.io.Serializable;
import java.util.LinkedList;

public class Profesor extends Usuario{
    
    public LinkedList<Curso> cursos = new LinkedList();

    public Profesor(String nombreUsuario, String contrasenia) {
        super(nombreUsuario, contrasenia);
    }
    
    
    public void agregarCurso(String nombre, int creditos) {
        Curso curso = new Curso(nombre, creditos, this);
        this.cursos.push(curso);
    }
    
}
