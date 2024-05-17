package funcionalidade;

import java.util.Collections;
import java.util.HashSet;

public class Usuario{
    private String nome;
    private String email;
    private final HashSet<RedeSocial> redesSociais;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        redesSociais = null;
    }

    public Usuario(RedeSocial[] redesSociais) {
        this.redesSociais = new HashSet<RedeSocial>();
        Collections.addAll(this.redesSociais, redesSociais);
    }

    public void usarRedesSociais(){
        int index = 0;
        for(RedeSocial redeSocial : redesSociais){
            //insere a primeira rede social com apenas os metodos comuns a todas
            //se necessario deve-se chamar a interface especifica de cada classe manualmente
            if(index == 0){
                redeSocial.postarFoto();
                redeSocial.curtirPublicacao();
                redeSocial.postarComentario();
                redeSocial.postarVideo();
            }
            else {//insere as proximas redes sociais
                redeSocial.postarFoto();
                redeSocial.curtirPublicacao();
                redeSocial.postarComentario();
                redeSocial.postarVideo();
            }
        }
    }
}
