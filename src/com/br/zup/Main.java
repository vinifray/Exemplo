package com.br.zup;

public class Main {

    public static void main(String[] args) throws Exception {
        Dev fun = new Dev("André", "508.890.540-88","andre.xablau@zup.com" );

        try{
            fun.apresentarFuncionario();
        }catch (Exception erro){

        }finally {
            System.out.println("Vai de qualquer jeito");
        }

    }
}
