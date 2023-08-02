package com.example;

public class AppClasses {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.sexo = 'F';
        cliente.setRenda(-1);
        cliente.anoNascimento = 1970;
        
        System.out.println(cliente.sexo);

        
    }
    
}
