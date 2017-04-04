/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantalla;

/**
 *
 * @author Carlos
 */
public class Punto {
    /**
     * Valor X del punto
     */
    private double x;

    /**
     * Valor Y del punto
     */
    private double y;
    
    public void inicializar( double x1, double y1 )
    {
        x = x1;
        y = y1;
    }

    /**
     * Devuelve el valor X del punto
    
     */
    public double darX( )
    {
        return x;
    }

    /**
     * Cambia el valor X del punto
    */
    public void cambiarX( double x1 )
    {
        x = x1;
    }

    /**
     * Devuelve el valor Y del punto
    
     */
    public double darY( )
    {
        return y;
    }

    /**
     * Cambia el valor Y del punto
   
     */
    public void cambiarY( double y1 )
    {
        y = y1;
    }

}
