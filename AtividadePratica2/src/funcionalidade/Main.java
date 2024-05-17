package funcionalidade;

import excecoes.RedeSocialCheckedException;
import excecoes.RedeSocialUncheckedException;

public class Main {
    public static void main(String[] args) {

        try {
            RedeSocial[] redes = {
                    new Facebook("senhaFB", 150),
                    new GooglePlus("senhaGP", 13)
            };
            // Criação de um usuário com nome, email e as redes sociais criadas
            Usuario usuario = new Usuario("João", "joaopaulo.jp@ges.inatel.br", redes);
            System.out.println("\nNome do usuário: " + usuario.getNome());
            System.out.println("Email do usuário: " + usuario.getEmail());
            System.out.println("\nAções do usuário, que usa facebook e googlePlus: \n" );
            // Chamada do método para usar as redes sociais do usuário
            usuario.usarRedesSociais();
            usuario.streamaGooglePlus();
            usuario.compartilhaGooglePlus();


        } catch (RedeSocialUncheckedException e) {
            System.out.println("Erro não verificado: " + e.getMessage());
        } catch (RedeSocialCheckedException e) {
            System.out.println("Erro verificado: " + e.getMessage());
        }


    }
}