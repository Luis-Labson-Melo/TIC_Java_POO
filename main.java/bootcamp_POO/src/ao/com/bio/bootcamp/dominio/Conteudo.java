package ao.com.bio.bootcamp.dominio;

import javax.swing.*;

public abstract class Conteudo {

    public void setDescrição(String descrição_mentoria_java) {
        this.descricao = descricao;
    }

    protected static final double XP_PADRAO = 100;

    private String titulo;
    private String descricao;

    public abstract double calcularxp();

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

}
