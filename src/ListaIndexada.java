/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aléxia Gomes
 */
public class ListaIndexada {

    private static ListaEncadeada<Object> lista = new ListaEncadeada<>();
    private static ListaEncadeada<Object> indice = new ListaEncadeada<>();

    public static void main(String[] args) {
        for (int i = 1; i <= 3000; i++) {
            lista.acrescentar(i);
        }

        Iterador<Object> iterator = lista.iterator();

        int i = 1;

        while (iterator.existeProximo()) {
            iterator.proximo();

            if (iterator.getAtual().getData() == lista.getHead().getData() || iterator.getAtual().getData() == lista.getTail().getData() || i % 10 == 0) {
                indice.acrescentar(iterator.getAtual().getData(), iterator.getAtual());
            }

            i++;
        }

        iterator = lista.iterator();

        while (iterator.hasNext()) {
            iterator.next();
        }

        ListaEncadeada<Object>.No s = null;

        System.out.println(s.getData());
        System.out.println(s.getProximo() != null ? s.getProximo().getData() : "");
    }
}//Fecha classe principal
