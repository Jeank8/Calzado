package com.example.android.calzado;

/**
 * Created by android on 03/10/2017.
 */

public class Metodos {
    public static int total(int cant, boolean masculino, boolean femenino, boolean zapatilla, boolean clasico, boolean adidas, boolean nike, boolean puma){
        int total = 0;
        if(masculino && zapatilla && nike){
            total = 120000;
        }
        if(masculino && zapatilla &&adidas){
            total = 140000;
        }
        if(masculino &&zapatilla && puma){
            total = 130000;
        }
        if(masculino &&clasico && nike){
            total = 50000;
        }
        if(masculino && clasico &&adidas){
            total = 80000;
        }
        if(masculino && clasico && puma){
            total = 100000;
        }
        if(femenino && zapatilla && nike){
            total = 100000;
        }
        if(femenino && zapatilla && adidas){
            total = 130000;
        }
        if(femenino && zapatilla && puma){
            total = 110000;
        }
        if(femenino && clasico && nike){
            total = 60000;
        }
        if(femenino && clasico && adidas){
            total = 70000;
        }
        if(femenino && clasico && puma){
            total = 120000;
        }
        total = total * cant;
        return total;
    }
}
