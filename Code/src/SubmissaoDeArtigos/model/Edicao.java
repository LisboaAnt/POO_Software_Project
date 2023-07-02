
package SubmissaoDeArtigos.model;
import java.util.*;

public class Edicao {
    private String titulo;
    private String numero;
    private String trilha;
    // Outros atributos e métodos
    
    // Construtores
    public Edicao(String titulo, String numero,String trilha) {
        this.titulo = titulo;
        this.numero = numero;
        this.trilha = trilha;
    }
    
    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTrilha() {
        return trilha;
    }

    public void setTrilha(String trilha) {
        this.trilha = trilha;
    }
    
    // Outros métodos
    
    // ...
}
