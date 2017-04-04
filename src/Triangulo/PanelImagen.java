/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangulo;

/**
 *
 * @author Carlos
 */

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class PanelImagen extends JPanel{
    private JLabel etiquetaImagen;
   

//Se crea el contructo de la imagen
    public PanelImagen( )
    {
        FlowLayout layout = new FlowLayout( );// ubicacion de componenetes en forma horizontal
        layout.setHgap( 0 );// posicion 0
        layout.setVgap( 0 );//posiion 0
        setLayout( layout );//
        //
        //Carga la imagen
        ImageIcon icono = new ImageIcon( "imagenes/logo.JPG" );
        //
        //La agrega a la etiqueta
        etiquetaImagen = new JLabel( "Nombres Del Grupo:  Albert Charry  "+"Jorge Andres Duran" );
        etiquetaImagen.setIcon( icono );
       
        add(  etiquetaImagen );
        //
        //Color de fondo blanco
        setBackground( Color.GRAY );
        setBorder( new LineBorder( Color.WHITE ) );
    }

}
