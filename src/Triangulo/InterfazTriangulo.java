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
import Pantalla.Punto;
import Pantalla.Triangulo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.geom.Line2D;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InterfazTriangulo extends JFrame {
    private Triangulo triangulo;

    /**
     * Panel de los botones
     */
    private PanelBotones panelBotones;

    /**
     * Panel de visualización del triángulo
     */
    private PanelTriangulo panelTriangulo;

    /**
     * Panel de extensiones
     */
    private PanelOpciones panelOpciones;

    /**
     * Panel con el encabezado
     */
    private PanelImagen panelImagen;

    /**
     * Diálogo de cambio de puntos
     */
    private DialogoPuntos dialogoPuntos;
    /**
     * Constructor de la interfaz
     */
    public InterfazTriangulo( )
    {
        //Crea el triángulo POR DEFECTO
        triangulo = new Triangulo( );

        //Crea el punto 1
        Punto punto1 = new Punto( );
        punto1.inicializar( 0, 0 );

        //Crea el punto 2
        Punto punto2 = new Punto( );
        punto2.inicializar( 0, 50 );

        //Crea el punto 1
        Punto punto3 = new Punto( );
        punto3.inicializar( 50, 50 );

        //Inicializa el color del relleno en Azul
     
        Pantalla.Color colorRelleno = new Pantalla.Color( );
        colorRelleno.inicializar( 0, 0, 170 );

        //Inicializa el color de las líneas en negro
        
        Pantalla.Color colorLineas = new Pantalla.Color( );
        colorLineas.inicializar( 0, 0, 0 );

        //Inicializa el triángulo
        triangulo.inicializar( punto1, punto2, punto3, colorRelleno, colorLineas );

        //Crea la interfaz
        //setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("TRABAJO FIGURAS");
        getContentPane().setLayout(new BorderLayout());

        panelBotones = new PanelBotones( this );
        getContentPane( ).add( panelBotones, BorderLayout.WEST );
        panelTriangulo = new PanelTriangulo( triangulo );
        getContentPane( ).add( panelTriangulo, BorderLayout.CENTER );

        panelOpciones = new PanelOpciones( this );
        getContentPane( ).add( panelOpciones, BorderLayout.SOUTH );

        panelImagen = new PanelImagen( );
        getContentPane( ).add( panelImagen, BorderLayout.NORTH );

        pack( );
        repintar( );
    }
    /**
     * Muestra el diálogo para cambiar los puntos del triángulo
     */
    public void cambiarPuntos( )
    {
        dialogoPuntos = new DialogoPuntos( this );
        dialogoPuntos.setVisible( true );
        setEnabled( false );
    }

    /**
     * Cambia el color del fondo
     *  
     */
    public void cambiarColorFondo( )
    {
        Color colorActual = new Color( triangulo.darColorRelleno( ).darRojo( ), triangulo.darColorRelleno( ).darVerde( ), triangulo.darColorRelleno( ).darAzul( ) );
        Color nuevoColor = JColorChooser.showDialog( this, "Color Fondo", colorActual );
        if( nuevoColor != null )
        {
            //Cambia los valores
            triangulo.darColorRelleno( ).cambiarRojo( nuevoColor.getRed( ) );
            triangulo.darColorRelleno( ).cambiarVerde( nuevoColor.getGreen( ) );
            triangulo.darColorRelleno( ).cambiarAzul( nuevoColor.getBlue( ) );
        }
        repintar( );
    }
    /**
     * Cambia el color de las líneas
     *  
     */
    public void cambiarColorLineas( )
    {
        Color colorActual = new Color( triangulo.darColorLineas( ).darRojo( ), triangulo.darColorLineas( ).darVerde( ), triangulo.darColorLineas( ).darAzul( ) );
        Color nuevoColor = JColorChooser.showDialog( this, "Color Líneas", colorActual );
        if( nuevoColor != null )
        {
            //Cambia los valores
            triangulo.darColorLineas( ).cambiarRojo( nuevoColor.getRed( ) );
            triangulo.darColorLineas( ).cambiarVerde( nuevoColor.getGreen( ) );
            triangulo.darColorLineas( ).cambiarAzul( nuevoColor.getBlue( ) );
        }
        repintar( );
    }

    /**
     * Repinta el triángulo y los valores
     *  
     */
    public void repintar( )
    {
        panelTriangulo.repaint( );
        panelBotones.cambiarInformacion( triangulo.darPerimetro( ), triangulo.darArea( ), triangulo.darAltura( ) );
    }

    /**
     * Devuelve el triángulo actual
     */
    public Triangulo darTriangulo( )
    {
        return triangulo;
    }

    /**
     * Verifica si 3 puntos son colineales
     */
    public boolean colineales( double p1x, double p1y, double p2x, double p2y, double p3x, double p3y )
    {
        //Verifica usando un Line2D
        Line2D linea = new Line2D.Double( p1x, p1y, p2x, p2y );
        return ( linea.ptLineDist( p3x, p3y ) == 0 );

    }

    /**
     * Ejecuta el punto de extensión 1
     */
    public void reqFuncOpcion1( )
    {
        String resultado = triangulo.metodo1( );
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

    /**
     * Ejecuta el punto de extensión 2
     */
    public void reqFuncOpcion2( )
    {
        String resultado = triangulo.metodo2( );
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

    
}
