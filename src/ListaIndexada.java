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

       
        while (iterator.hasNext()) {
            iterator.next();

            if (iterator.getAtual().getData() == lista.getHead().getData() || iterator.getAtual().getData() == lista.getTail().getData() || i % 10 == 0) {
                indice.acrescentar(iterator.getAtual().getData(), iterator.getAtual());
            }

            i++;
        }

        iterator = lista.iterator();

        while (iterator.hasNext()) {
            iterator.next();
        }

        ListaEncadeada<Object>.No s = procurar(2599);

        System.out.println(s.getData());
        System.out.println(s.getProximo() != null ? s.getProximo().getData() : "");
    }

    public static ListaEncadeada<Object>.No procurar(int index) {
        int numInteraçao = 0;

        Iterador<Object> indexIterador = indice.iterator();
        ListaEncadeada<Object>.No e = null;

        while (indexIterator.existeProximo()) {
            indexIterator.proximo();

            numInteraçao++;

            if (index <= (int) indexIterator.getAtual().getData()) {
                if (index == (int) indexIterator.getAtual().getData()) {
                    System.out.println("O número de interação foi de: " + numInteraçao);

                    return indexIterator.getAtual().getParaTras();
                }

                if (indexIterator.getAtual().getAnterior() != null) {
                    e = indexIterador.getAtual().getAnterior().getParaTras();
                } else {
                    e = indexIterador.getAtual().getParaTras();
                }

                while (index > (int) e.getData()) {
                    e = e.getNext();
                    numInteraçao++;
                }
                break;
            }
        }

        if (e == null) {
            System.out.println("Não encontrado! ");
            System.out.println("O número de interação foi de: " + numInteraçao);
            return e;
        }
        return null;
    }

}//Fecha classe principal
