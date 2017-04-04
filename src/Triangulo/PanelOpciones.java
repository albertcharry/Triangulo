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
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;


public class PanelOpciones extends JPanel implements ActionListener {
     private static final String OPCION_1 = "OPCION_1";

    /**
     * Comando Opción 2
     */
    private static final String OPCION_2 = "OPCION_2";


    /**
     * Ventana principal de la aplicación
     */
    private InterfazTriangulo padre;

     /**
     * Botón Opción 1
     */
    private JButton btnOpcion1;

    /**
     * Botón Opción 2
     */
    private JButton btnOpcion2;

    /**
     * Constructor del panel
     
     * */
    public PanelOpciones( InterfazTriangulo elPadre )
    {
        padre = elPadre;

        setBorder( new TitledBorder( "Opciones" ) );
        setLayout( new GridLayout( 1, 2 ) );

        //Botón opción 1
        btnOpcion1 = new JButton( "Opción 1" );
        btnOpcion1.setActionCommand( OPCION_1 );
        btnOpcion1.addActionListener( this );
        add( btnOpcion1 );

        //Botón opción 2
        btnOpcion2 = new JButton( "Opción 2" );
        btnOpcion2.setActionCommand( OPCION_2 );
        btnOpcion2.addActionListener( this );
        add( btnOpcion2 );
    }

    /**
     * Manejo de los eventos de los botones
    */
    public void actionPerformed( ActionEvent e )
    {
       if(OPCION_1.equals(e.getActionCommand())){
            System.out.println("Imprime Boton 1");
        }
        else if (OPCION_2.equals(e.getActionCommand())){
            System.out.println("Imprime Boton 2");
    }

    

    }
}
