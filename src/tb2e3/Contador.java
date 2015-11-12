/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tb2e3;

public class Contador {

    static int cont = 0;

    static void adicionaCont() {
        cont++;
    }

    static void adicionaCont(int num) {
        cont += num;
    }
    
    static int dischargeCounter(){
        int aux = cont;
        cont = 0;
        return aux;
    }
}
