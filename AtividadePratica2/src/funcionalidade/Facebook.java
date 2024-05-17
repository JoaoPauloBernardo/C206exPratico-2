package funcionalidade;

import excecoes.RedeSocialCheckedException;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {

    public Facebook(String senha, int numAmigos) throws RedeSocialCheckedException {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no facebook");

    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no facebook");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no facebook");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou um post no facebook");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Live iniciada no facebook");
    }
}
