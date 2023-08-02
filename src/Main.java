//Caminho do arquivo ( Empresa )
package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Nome da classe ( Departamento )
public class Main {

    //Nome do método - recurso dentro da classe ( O que o departamento faz )
    public static void main (String[] args) {
        /*
            System.out.println(" 1: Olá Mundo!!!");
        System.out.println("  2: ESTE É MEU PRIMEIRO CÓDIGO EM JAVA.");

         //        1                       2                     3
        //Tipoda variável    |   Nome da variável   |   Valor da variável


//String = Texto
//Int = Valores flutuantes
//Boolean = Verdadeiro ou falso (true/false)
//Float = Ponto flutuante Ex:5.24
//Long = 123456L

        String olamundo = "3: Esta mensagem está dentro da variável ";

        System.out.println(olamundo);

         // *JUNTANDO NOME E SOBRENOME* //
        String nome1 = "Nathalia";
        String sobrenome = "Barrochello";

        System.out.println(nome1);
        System.out.println(sobrenome);
        //int idade + 10;

        //Juntar variáveis:
        System.out.println("O nome é:" + " " + nome1 + " " + sobrenome + ".");

        */

//        String retornoMetodo = buscarSobrenome();
//        System.out.println(retornoMetodo);
//
//        String retornoMetodo2 = inserirnome();
//        System.out.println(retornoMetodo2);
//
//        System.out.println();
//
//        double imc = calcularImc();

       // int idade = retornaIdadePorAno();

        List<String> retornoMensagem = resumoPessoa();
        System.out.println(retornoMensagem);

    }

    //      1        |          2          |           3          |        4
    // tipo acesso       tipo de retorno        nome do método          parâmetros

//    private static String buscarSobrenome(){
//        String sobrenome = "Barrochello bla bla bla ";
//        return sobrenome;
//        }

//       public static String inserirnome() {
//           Scanner ler = new Scanner(System.in);
//
//           System.out.printf("Digite seu nome: ");
//           String nome = ler.next();
//
//           System.out.printf("Digite seu sobrenome: ");
//           String sobrenome = ler.next();
//
//           System.out.println(nome + " " + sobrenome);
//
//           String nomeCompleto = nome + " " + sobrenome;
//
//           return nomeCompleto;
//       }
         //FIM DO CÓDIGO *JUNTANDO NOME E SOBRENOME* //

         // *CALCULANDO IMC* //
//       public static double calcularImc() {
//
//           Scanner ler = new Scanner(System.in);
//
//           System.out.printf("Digite sua altura: ");
//           double altura = ler.nextDouble();
//
//           System.out.printf("Digite seu peso: ");
//           double peso = ler.nextDouble();
//
//           double calculoIMC = peso / (altura * altura);
//
//           System.out.println("O seu IMC é: " + calculoIMC);
//
//           if (calculoIMC < 19.0){
//               System.out.println("Você está abaixo do peso!");
//           }else{
//               System.out.println("Você está acima do peso!");
//
//           }
//
//           return calculoIMC;

//       }
           // FIM DO CÓDIGO *CALCULANDO IMC* //

          //*MOSTRANDO SE A PESSOA É MAIOR OU MENOR DE 18 ANOS*//

    //criar um método que recebe o ano de nascimento
       //variáveis int
       //fazer o calculo da idade
       //imprimir na tela se a pessoa é maior ou menor do que 18 anos.

    public static int retornaIdadePorAno(){
       int idadeCalculada;

       Scanner ler = new Scanner(System.in);

       System.out.printf("Digite seu nome: ");
       String nome = ler.next();

       System.out.printf("Digite seu ano de nascimento, Ex:1990 :");
       int anoBase = ler.nextInt();

        idadeCalculada = 2023 - anoBase;

        String tipoDePessoa;

        String maiorDeDezoito = "Você é maior de 18 anos";
        String menorDeDezoito = "Você é menor de 18 anos, cai fora!!!";

        if (idadeCalculada <= 17){
            tipoDePessoa = menorDeDezoito;
        }else{
            tipoDePessoa = maiorDeDezoito;
        }

        System.out.println( nome + " Sua idade é: " + idadeCalculada + " anos e " + tipoDePessoa);

        return idadeCalculada;
    }
    // FIM DO CÓDIGO *MOSTRANDO SE A PESSOA É MAIOR OU MENOR DE 18 ANOS* //

    public static List<String> resumoPessoa(){

        Scanner ler = new Scanner(System.in);

        List <String> nomesResumo = new ArrayList<>();

        //        1        *     2      *     3
        for ( int indice = 1; indice < 4; indice ++ ){

            //Pergunta ao usuário o nome da pessoa
            System.out.printf("Digite seu nome: ");
            String nome = ler.next();

            //Pergunta ao usuário o sobrenome da pessoa
            System.out.printf("Digite seu sobrenome: ");
            String sobrenome = ler.next();

            //Pergunta ao usuário a idade da pessoa
            System.out.printf("Digite sua idade: ");
            int idade = ler.nextInt();

            //criar os nomes juntos nome + sobrenome
            String nomeCompleto = nome + " " + sobrenome;

            String tipoDePessoa = "";

            //verifica se idade é menor  ou igual a 17 anos.
            if (idade <= 17){
                //se for menor ou igual a 17 anos atribui menor de idade na mensagem
                tipoDePessoa = "menor de idade";
                //se for maior do que 17 anos atribui maior de idade na mensagem
            }else {
                tipoDePessoa = "maior de idade ";
            }

            String resumo = "O nome completo é: " + nomeCompleto + "ele tem " + idade + "anos, e ele é: " + tipoDePessoa ;

            nomesResumo.add(resumo);

        }

        return nomesResumo;
    }

}


