/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaspr;

/**
 *
 * @author lenovo
 */
public class ColasPrioridad {
    Arbol arbol;
    int numOp;
    
    public ColasPrioridad(){
        arbol = new Arbol();
    }

    public int getnumOp() {
        return numOp;
    }
    
    
    void creaP(int dato){
        int i,j;
        arbol.cont++;
        i = arbol.cont;
        j = i/2;
        while(arbol.a[j]<dato){
            arbol.a[i] = arbol.a[j];
            i = j;
            j = i/2;
        }
        arbol.a[i] = dato;
    }
    int retirarP(){
        numOp = 0;
        int i,j,elemento,temp;
        elemento = arbol.a[1];
        numOp++; //---------OPERACION-------
        temp = arbol.a[arbol.cont];
        numOp++; //---------OPERACION-------
        arbol.cont = arbol.cont - 1;
        numOp++; //---------OPERACION-------
        i = 1;
        numOp++; //---------OPERACION-------
        j = 2;
        numOp++; //---------OPERACION-------
        while(j <= arbol.cont){
            numOp++; //---------OPERACION-------
            if(j <= arbol.cont){
                numOp++; //---------OPERACION-------
                if(arbol.a[j] < arbol.a[j+1]){
                    numOp++; //---------OPERACION-------
                    j++;
                    numOp++; //---------OPERACION-------
                }
            }
            if(temp >= arbol.a[j]){
                numOp++; //---------OPERACION-------
                break;
            }
            arbol.a[i] = arbol.a[j];
            i = j;
            j = 2 * i;
            numOp++; //---------OPERACION-------
            numOp++; //---------OPERACION-------
            numOp++; //---------OPERACION-------
        }
        arbol.a[i] = temp;
        numOp++; //---------OPERACION-------
        return elemento;
    }
}
