/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_labp2;


import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Tommy Lee Pon
 */

public class UberSocial implements Serializable{
    
    private static final long serialVersionUID = 2824429602876360225L;
    public ArrayList<SocialClass> sociales;

    public UberSocial() {
        sociales = new ArrayList();
        cargarSer();
        guardarSer();
    }
    
    public SocialClass buscar(String Username){
        return buscar(Username, 0);
    }
    
    private SocialClass buscar(String Username, int posicion){
        if(posicion < sociales.size()){
            if(sociales.get(posicion).getUsername().equals(Username)){
                return sociales.get(posicion);
            }
            return buscar(Username, posicion +1);
        }
        return null;
    }
    
    public void agregarCuenta(String username, String tipo){
        if(buscar(username) ==  null){
            if(tipo.equalsIgnoreCase("FACEBOOK")){
                sociales.add(new Facebook(username));
                JOptionPane.showMessageDialog(new java.awt.Frame(), "Cuenta " + username + " agregada en Facebook.");
            }else{
                sociales.add(new Twitter(username));
                JOptionPane.showMessageDialog(new java.awt.Frame(), "Cuenta " + username + " agregada en Twitter.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Cuenta ya existe en una de las aplicaciones.");
        }
        guardarSer();
    }
    
    public void agregarPost(String user, String Post){
        SocialClass social = buscar(user);
        if(social != null){
            social.addPost(Post);
            JOptionPane.showMessageDialog(null, "Post agregado.");
        }else{
            JOptionPane.showMessageDialog(null, "No existe ese usuario.");
        }
        guardarSer();
    }
    
    public void agregarAmigo(String user1, String user2){
        SocialClass social1 = buscar(user1);
        SocialClass social2 = buscar(user2);
        System.out.println(sociales.indexOf(social1));
        System.out.println(sociales.indexOf(social2));
        if(social1 != null && social2 != null){
            if(social1 instanceof Facebook && social2 instanceof Facebook){
                sociales.get(sociales.indexOf(social1)).addFriend(user2);
                sociales.get(sociales.indexOf(social2)).addFriend(user1);
                JOptionPane.showMessageDialog(null, user1 + " y " + user2 + " ahora son amigos.");
            }else if(social1 instanceof Twitter && social2 instanceof Twitter){
                sociales.get(sociales.indexOf(social1)).addFriend(user2);
                JOptionPane.showMessageDialog(null, user1 + " sigue a " + user2 + ".");
            }else{
                JOptionPane.showMessageDialog(null, "Estos usuarios no son compatibles.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Uno de estos usuarios no existen.");
        }
        guardarSer();
    }
    
    public void agregarComment(String user, int postId, String autor, String comment){
        SocialClass social = buscar(user);
        
        if(social != null){
            if(social instanceof Facebook){
                if(((Facebook)social).addComent(new Comment(autor, comment))){
                    JOptionPane.showMessageDialog(null, "Comentario subido.");
                }else{
                     JOptionPane.showMessageDialog(null, "No existe ese espacio para subir el comentario.");
                }
            }else{
                JOptionPane.showMessageDialog(null, "No se puede agregar comentarios a este post.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "No existe ese usuario.");
        }
        guardarSer();
    }
    
    public String profileFrom(String user){
        if(buscar(user)!=null){
            return buscar(user).getUsername() + "\n" + buscar(user).timeline();
        } else {
            JOptionPane.showInputDialog(null, "Cuenta no existe!");
            return "";
        }
    }
    
    public void guardarSer(){
        try {
            FileOutputStream fileOut = new FileOutputStream("uberSocial.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(sociales);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void cargarSer(){
        try {
            File file = new File("uberSocial.ser");
            if (file.exists()) {
                FileInputStream fileIn = new FileInputStream(file);
                ObjectInputStream in = new ObjectInputStream(fileIn);
                sociales = (ArrayList<SocialClass>) in.readObject();
                System.out.println("Lista de usuarios:");
                for(SocialClass s : sociales){
                    System.out.println(s.getUsername());
                }
                in.close();
                fileIn.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


