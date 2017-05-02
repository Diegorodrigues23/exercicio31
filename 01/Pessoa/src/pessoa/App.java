/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

/**
 *
 * @author SCD
 */
public class App {
    
    public static void main(String[] args) {
        Pessoa pe = new Pessoa();
        pe.nome = "Diego";
        pe.endereco = "Rua Benedito Marques Costa";
        pe.telefone = "3059-2000";
        
        
        pe.imprimir();
         
    }
    
    
    
    
    
}
