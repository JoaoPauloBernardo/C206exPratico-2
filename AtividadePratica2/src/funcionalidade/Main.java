package funcionalidade;

import excecoes.RedeSocialCheckedException;
import excecoes.RedeSocialUncheckedException;

public class Main {
    public static void main(String[] args) {

        try {
            RedeSocial[] redes = {
                    new Facebook("senhaFB", 150),
                    new Twitter("senhaTW", 200),
                    new Instagram("senhaJPG", 1050),
                    new GooglePlus("senhaGL", 13)
            };
            // Criação de um usuário com nome, email e as redes sociais criadas
            System.out.println("Ações do usuário 1, que usa facebook: \n");
            Facebook usuario1 = new Facebook("joao", 207);
            usuario1.fazStreaming();
            usuario1.compartilhar();
            System.out.println("\nAções do usuário 2, que usa facebook, Twitter, Instragram e GooglePlus: \n");

            Usuario usuario2 = new Usuario(redes);
            // Chamada do método para usar as redes sociais do usuário
            usuario2.usarRedesSociais();


        } catch (RedeSocialUncheckedException e) {
            System.out.println("Erro não verificado: " + e.getMessage());
        } catch (RedeSocialCheckedException e) {
            System.out.println("Erro verificado: " + e.getMessage());
        }


    }
}