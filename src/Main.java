import br.com.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Git");
        curso2.setDescricao("Descrição curso Git");
        curso2.setCargaHoraria(4);

        //Conteudo conteudo = new Curso(); // tudo q tem em Conteudo tem em curso mas nem tudo do curso tem em conteudo (classe)

        Mentoria mentoria =new Mentoria();
        mentoria.setTitulo("Mentoria JAVA");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome(" Bootcamp Code Girl ");
        bootcamp.setDescricao("Descrição");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLara = new Dev();
        System.out.println("Dev 1");
        devLara.setNome ("Lara Aragão");
        devLara.inscreverBootcamp(bootcamp);
        System.out.println(" Conteudos Inscritos de Lara" + devLara.getConteudosInscritos());
        devLara.progredir(); // os inscritos vao mudar já que houve progresso
        System.out.println("---");
        System.out.println(" Conteudos Inscritos de Lara" + devLara.getConteudosInscritos());
        System.out.println(" Conteudos Concluidos de Lara" + devLara.getConteudosConcluidos());
        System.out.println("XP= "+ devLara.calcularTotalXp());
        System.out.println("--------");

        Dev devJoao = new Dev();
        System.out.println("Dev 2");
        devJoao.setNome ("Joaozim");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println(" Conteudos Inscritos de Joao" + devJoao.getConteudosInscritos());
        System.out.println(" Conteudos Concluidos de Joao" + devJoao.getConteudosConcluidos());
        System.out.println("XP= "+ devJoao.calcularTotalXp());

    }
}
