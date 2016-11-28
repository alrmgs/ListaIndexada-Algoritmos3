
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aléxia Gomes
 */
public class Teste {
    public static void main(String[] args)
    {
        Scanner e = new Scanner(System.in);
        ListaEncadeada lista = new ListaEncadeada();
        int opt = -1;

        while (opt != 0 || opt == -1)
        {
            System.out.println("Escolha uma opção da lista: \n");
            System.out.println("0 - Sair \n" +
                                "1 - Inserir novo registro\n" +
                                "2 - Exibir registros");
            opt = e.nextInt();

            if (opt < 0 || opt > 2)
            {
                System.out.println("Digite uma opção válida!");
                opt = -1;
            }

            switch (opt)
            {
                case 0:
                    break;
                case 1:
                    insereRegistroLista(lista);
                    break;
                case 2:
                    exibirRegistros(lista);
            }
        }
    }

    public static void insereRegistroLista(ListaEncadeada lista)
    {
        Scanner e = new Scanner(System.in);
        System.out.println("Informe um nome para adicionar na lista: ");
        String nome = e.next();
        lista.acrescentar(nome);
    }

    public static void exibirRegistros(ListaEncadeada lista)
    {
        for (Object s : lista) {
            System.out.println(s.toString());
        }
        System.out.println();
    }

}//Fecha classe principal

    
