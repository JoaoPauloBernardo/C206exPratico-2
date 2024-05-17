package funcionalidade;

import excecoes.RedeSocialCheckedException;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {

    public GooglePlus(String senha, int numAmigos) throws RedeSocialCheckedException {
        super(senha, numAmigos);
    }

    public GooglePlus() {
        super();
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no googlePlus");

    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no googlePlus");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no googlePlus");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou um post no googlePlus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Iniciou uma stream no googlePlus");
    }
}
