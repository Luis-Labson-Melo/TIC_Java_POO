import ao.com.bio.bootcamp.dominio.*;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {

        Curso curso1 = new  Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescrição("Descrição Curso Java");
        curso1.setCarga_horaria(8);

        Curso curso2 = new  Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescrição("Descrição Curso Js");
        curso2.setCarga_horaria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescrição("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java Developer.");
        bootcamp.setDescricao("Descrição BootCamp Java Developer.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInseridos());

        devCamila.progredir();
        devCamila.progredir();
        System.out.println("--");

        System.out.println("Conteúdos Inscritos Ilisio:" + devCamila.getConteudosInseridos());
        System.out.println("Conteúdos Concluidos Ilisio:" + devCamila.getConteudosConcluidos());

        System.out.println("XP:" + devIlisio.calcular_Totalxp());

        System.out.println("-----------------");

        Dev devLungavi = new Dev();
        devLungavi.setNome("Lungavi");
        devLungavi.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Lungavi:" + devLungavi.getConteudosInseridos());

        devLungavi.progredir();
        devLungavi.progredir();
        devLungavi.progredir();
        System.out.println("--");

        System.out.println("Conteúdos Inscritos Lungavi:" + devLungavi.getConteudosInseridos());
        System.out.println("Conteúdos Concluidos Lungavi:" + devLungavi.getConteudosConcluidos());
        System.out.println("XP:" + devLungavi.calcular_Totalxp());

    }
}
