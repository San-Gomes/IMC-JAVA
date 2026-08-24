package program;

import javax.swing.JOptionPane;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double peso = Double.parseDouble(JOptionPane.showInputDialog("entre com o peso do usuario"));


        double altura = Double.parseDouble(JOptionPane.showInputDialog("entre com a altura do usuario"));

        double imc = peso / (altura * altura);
        String formatado = String.format("%.2f", imc);



        if( imc <= 18.5 ) {
              JOptionPane.showMessageDialog(null, "O IMC do usuario é: " + formatado + " abaixo do peso ideal!" );


        } else if ( imc >= 18.6 && imc <= 24.9 ) {
            JOptionPane.showMessageDialog(null, "O IMC do usuario é: " + formatado + " Peso ideal!" );

            
        } else if (imc >= 25 && imc <= 29.9) {
            JOptionPane.showMessageDialog(null, "O IMC do usuario é: " + formatado + " levemente acima do peso" );

            
        } else if (imc >= 30 && imc <=34.9 ) {
            JOptionPane.showMessageDialog(null, "O IMC do usuario é: " + formatado + " obesidade grau 1" );



        } else if (imc >= 35 && imc <= 39.9) {
            JOptionPane.showMessageDialog(null, "O IMC do usuario é: " + formatado + " obesidade grau 2 (severa)" );
            System.out.println("obesidade grau 2 (severa) ");
            
        } else if (imc >= 40) {
            JOptionPane.showMessageDialog(null, "O IMC do usuario é: " + formatado + " obesidade morbida" );
            
        }
        sc.close();
    }
    }
