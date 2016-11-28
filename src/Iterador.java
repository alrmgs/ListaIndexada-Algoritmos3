import java.util.Iterator;
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
public interface Iterador<T> extends Iterator<T> {
    void acrescentar(T dado);
    ListaEncadeada<T>.No getAtual();
}
