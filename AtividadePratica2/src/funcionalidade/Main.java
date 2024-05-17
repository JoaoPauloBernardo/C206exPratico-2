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
            Usuario usuario1 = new Usuario("joao", "chinatown@gmail.com");
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