/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author SCD
 */
public class pessoa {
    Scanner entrada = new Scanner (System.in);
    String nome;
    String endereco;
    String telefone;
    

    public void imprimir(){
        System.out.println("Nome: "+ nome + "\nEndereço: " + endereco +"\nTelefone: "+telefone);    
}

    public void contrutor() {
        System.out.println("Informe o nome");
        nome = entrada.next();
        System.out.println("Informe o endereço");
        endereco = entrada.next();
        System.out.println("Informe o telefone");
        telefone = entrada.next();
    }
}



