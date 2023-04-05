import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso Java");
        curso1.setCargaHoraria(8);

        System.out.println(curso1);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descricao curso Js");
        curso2.setCargaHoraria(8);

        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Menteoria Java");
        mentoria.setDescricao("Descriçãp menteoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descricao bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJorge = new Dev();
        devJorge.setNome("Jorge");
        devJorge.inscreverBootcampo(bootcamp);
        System.out.println("Conteudos inscritos Jorge ->" + devJorge.getConteudosInscritos());
        devJorge.progredir();
        devJorge.progredir();
        devJorge.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Jorge ->" + devJorge.getConteudosInscritos());
        System.out.println("Conteudos conculuidos Jorge ->" + devJorge.getConteudosConcluidos());
        System.out.println("XP -> " + devJorge.calcularTotalXp());

        System.out.println("-----------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcampo(bootcamp);
        System.out.println("Conteudos inscritos Joao->" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Joao->" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos Joao->" + devJoao.getConteudosConcluidos());
        System.out.println("XP -> " +devJoao.calcularTotalXp());
    }
}