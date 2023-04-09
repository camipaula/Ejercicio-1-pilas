import java.util.Scanner;
import java.util.Stack;
public class pilaas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        int aux=0,e=0;
        int p=0,co=0,l=0;//pilas,corchetes y llaves abiertas
        int pc=0,cc=0,lc=0;//pilas,corchtes y llaves cerrados
        Stack <String> pila= new Stack();
        String c;
        System.out.println( "Ingrese los caracteres:");
        c=sc.nextLine();

        for (i=0; i<c.length();i++) {
            if (c.charAt(i) == '(' || c.charAt(i) == '[' || c.charAt(i) == '{' || c.charAt(i) == ')' || c.charAt(i) == ']' || c.charAt(i) == '}') {
                if (c.charAt(i) == '(') {
                    pila.push(String.valueOf(c.charAt(i)));
                    p++;
                } else if (c.charAt(i) == '[') {
                    pila.push(String.valueOf(c.charAt(i)));
                    co++;
                } else if (c.charAt(i) == '{') {
                    pila.push(String.valueOf(c.charAt(i)));
                    l++;
                } else {
                    aux++;
                }

            }
            else {
                System.out.println("Ingrese los caracteres solicitados");
                break;
            }
        }

        //VERIFICA SI TIENE EL TAMAÑO CORRECTO
        if (aux != pila.size()) {
            System.out.println("No balanceado el tamaño de caracteres no es par");
            System.out.println("Hay: " + pila.size() + " signos abieros y" + aux + " signos cerrados");

        } else {
            System.out.println("El tamano de caracteres es par");
            for (e= pila.size();e<c.length();e++) {
                if (c.charAt(e) == ')') {
                    pc++;
                } else if (c.charAt(e) == ']') {
                    cc++;
                } else if (c.charAt(e) == '}') {
                    lc++;
                }
            }

            if (p==pc && co==cc && l==lc){
                System.out.println("Esta balanceado hay:\n"+ p + " parentesis abiertos y "
                        + pc + " parentesis cerrados \n " + co + " corchetes abiertos y "
                        + cc + " corchetes cerrados \n " + l +" llaves abiertas y "
                        + lc + " llaves cerradas");
            } else {
                System.out.println("No esta balanceado hay:\n"+ p + " parentesis abiertos y "
                        + pc + " parentesis cerrados \n" + co + " corchetes abiertos y "
                        + cc + " corchetes cerrados \n" + l +" llaves abiertas y "
                        + lc + " llaves cerradas");
            }

        }
    }
}
