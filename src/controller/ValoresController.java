package controller;

import model.Valores;

import java.util.Scanner;

public class ValoresController {

        Valores valor1 = new Valores();
        Valores valor2 = new Valores();
        int operação;
        int resultado;
        public void EntradaDeValores () {
            Scanner s = new Scanner(System.in);
            System.out.println("Insira o primeiro valor: ");

            valor1.setValor1(s.nextInt());

            Scanner s1 = new Scanner(System.in);
            System.out.println("Escolha a operação: ");
            System.out.println("1- Adição");
            System.out.println("2- Subtração");
            System.out.println("3- Multiplicação ");
            System.out.println("4- Divisão");

            operação = s.nextInt();

            Scanner s2 = new Scanner(System.in);
            System.out.println("Insira o segundo valor: ");

            valor2.setValor2(s.nextInt());



        }

        public void Operações () {

           switch (operação) {
               case 1:
                   Soma();
                   break;

               case 2:
                  subtração();
                   break;

               case 3:
                   multiplicação();
                   break;

               case 4:
                   divisão();
                   break;

               default:
                   System.out.println("Opção Inválida");
                   break;

           }


        }

        public void Soma () {
            resultado = valor1.getValor1() + valor2.getValor2();
            System.out.println("O resultado é "+resultado);

        }

        public void subtração () {
            resultado = valor1.getValor1() - valor2.getValor2();
            System.out.println("O resultado é "+resultado);
        }

        public void multiplicação () {
            resultado = valor1.getValor1() * valor2.getValor2();
            System.out.println("O resultado é "+resultado);

        }

        public void divisão () {
            resultado = valor1.getValor1() / valor2.getValor2();
            System.out.println("O resultado é "+resultado);

        }


    }


