package funcionalidade;

import excecoes.RedeSocialCheckedException;

public class Instagram extends RedeSocial {

    public Instagram(String senha, int numAmigos) throws RedeSocialCheckedException {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no instagram");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no instagram");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentario no instragram");
    }
}
