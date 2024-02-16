/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_labp2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Tommy Lee Pon
 */
public final class Comment {
    int postId;
    String autor;
    String contenido;
    Calendar fecha;

    public Comment(String autor, String contenido) {
        postId++;
        this.autor = autor;
        this.contenido = contenido;
        fecha = Calendar.getInstance();
    }
    
    public String print(){
        return "   " + autor + " - " + new SimpleDateFormat("dd/MM/yy").format(fecha.getTime()) + "\n  " + contenido;
    }

    public int getPostId() {
        return postId;
    }

    public String getAutor() {
        return autor;
    }

    public String getContenido() {
        return contenido;
    }

    public Calendar getFecha() {
        return fecha;
    }
    
    
}

