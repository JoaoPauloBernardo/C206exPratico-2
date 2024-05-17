package funcionalidade;

import excecoes.RedeSocialCheckedException;

public class Twitter extends RedeSocial implements Compartilhamento {

    public Twitter(String senha, int numAmigos) throws RedeSocialCheckedException {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no twitter");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no twitter");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentario no twitter");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou um post no twitter");
    }
}
