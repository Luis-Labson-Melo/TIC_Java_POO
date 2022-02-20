package ao.com.bio.bootcamp.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private  String nome;
    private Set<Conteudo> conteudosInseridos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void  inscreverBootcamp(Bootcamp bootcamp){

        this.conteudosInseridos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){

        Optional<Conteudo> conteudos = this.conteudosInseridos.stream().findFirst();
        if(conteudos.isPresent()){
            this.conteudosConcluidos.add(conteudos.get());
            this.conteudosInseridos.remove(conteudos.get());
        }else {
            System.out.println("Você não está matriculado em nenhum conteúdo ");
        }

    }

    public double calcular_Totalxp(){

       return this.conteudosConcluidos
               .stream()
               .mapToDouble(conteudo -> conteudo.calcularxp())
               .sum();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInseridos() {
        return conteudosInseridos;
    }

    public void setConteudosInseridos(Set<Conteudo> conteudosInseridos) {
        this.conteudosInseridos = conteudosInseridos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInseridos, dev.conteudosInseridos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInseridos, conteudosConcluidos);
    }
}
