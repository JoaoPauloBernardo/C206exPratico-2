package funcionalidade;

import excecoes.RedeSocialCheckedException;

import java.util.Collections;
import java.util.HashSet;

public class Usuario{
    private String nome;
    private String email;
    private final HashSet<RedeSocial> redesSociais;

    public Usuario(String nome, String email, RedeSocial[] redesSociais) {
        this.nome = nome;
        this.email = email;
        this.redesSociais = new HashSet<RedeSocial>();
        Collections.addAll(this.redesSociais, redesSociais);
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void streamaGooglePlus() throws RedeSocialCheckedException {
        GooglePlus googleplus = new GooglePlus();
        googleplus.fazStreaming();
    }
    public void compartilhaGooglePlus() throws RedeSocialCheckedException {
        GooglePlus googleplus = new GooglePlus();
        googleplus.compartilhar();
    }

    public void usarRedesSociais(){
        int count = 0;
        for(RedeSocial redeSocial : redesSociais){
            //insere a primeira rede social com apenas os metodos comuns a todas
            //se necessario deve-se chamar a interface especifica de cada classe manualmente
            if(count == 0){
                redeSocial.postarFoto();
                redeSocial.curtirPublicacao();
                redeSocial.postarComentario();
                count++;
                System.out.println("\n");
            }
            else{//insere as proximas redes sociais
                redeSocial.postarVideo();
            }
        }
    }
}
