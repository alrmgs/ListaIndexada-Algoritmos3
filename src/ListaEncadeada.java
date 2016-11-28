/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aléxia Gomes
 */
public class ListaEncadeada<T> implements Iterable<T> {

    private No head;
    private No tail;

    public No getHead() {
        return head;
    }

    public No getTail() {
        return tail;
    }

    void acrescentar(T valor) {
        No novo = new No(valor);

        if (tail != null) {
            novo.anterior = tail;
            tail.proximo = novo;
        } else {
            head = novo;
        }

        tail = novo;
    }

    void empurrarParaFrente(T valor) {
        No novo = new No(valor);

        if (head == null) {
            tail = novo;
        } else {
            head.anterior = novo;
            head = novo;
        }
    }

    public Iterador<T> iterator() {
        return new listaIterator();
    }

    void acrescentar(T valor, No paraTras) {
        No novo = new No(valor);
        
        if(tail != null){
            novo.anterior = tail;
            tail.proximo = novo;
        }else{
            head = novo;
        }
        
        novo.paraTras = paraTras;
        tail = novo;
    }

    protected class No {

        private T data;
        private No anterior;
        private No proximo;
        private No paraTras = null;

        public No(T valor) {
            data = valor;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public No getAnterior() {
            return anterior;
        }

        public void setAnterior(No anterior) {
            this.anterior = anterior;
        }

        public No getProximo() {
            return proximo;
        }

        public void setProximo(No proximo) {
            this.proximo = proximo;
        }

        public No(T data, No anterior, No proximo) {
            this.data = data;
            this.anterior = anterior;
            this.proximo = proximo;
        }

    }

    private class listaIterator implements Iterador<T> {

        private No atual = null;
        private No anterior = null;
        

        public No getAtual() {
            return atual;
        }

        public void setAtual(No atual) {
            this.atual = atual;
        }

        public No getAnterior() {
            return anterior;
        }

        public void setAnterior(No anterior) {
            this.anterior = anterior;
        }

        public boolean existeProximo() {
            if (atual == null) {
                return head != null;
            }
            return atual.proximo != null;
        }

        public T proximo() {
            if (!existeProximo()) {
                throw new IllegalStateException("Não existe proximo");
            }

            if (atual == null) {
                atual = head;
            } else {
                anterior = atual;
                atual = atual.proximo;
            }

            return atual.data;
        }

    }//fecha listaIterador

}//fecha classe principal
