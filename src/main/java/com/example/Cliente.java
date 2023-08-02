package com.example;

 public class Cliente{
    double renda;
    char sexo;
    int anoNascimento;

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        if (renda >= 0){
            this.renda = renda;
        }else{
           System.out.println("A renda deve ser maior que zero");
        }
        
    }
    
}