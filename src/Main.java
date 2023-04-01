import br.com.desafio.dio.dominio.Bootcamp;
import br.com.desafio.dio.dominio.Curso;
import br.com.desafio.dio.dominio.Dev;
import br.com.desafio.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Mentoria mentoria1 = new Mentoria();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao do java");
        curso1.setCargaHoraria(144);

        mentoria1.setTitulo("Ensinando Java");
        mentoria1.setDescricao("Vem aqui ver o java");
        mentoria1.setData(LocalDate.now());



        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp");
        bootcamp.setDescricao("Descricao");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLuiz = new Dev();

        devLuiz.setNome("Luiz");
        devLuiz.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devLuiz.getConteudoInscritos());
        devLuiz.progredir();
        System.out.println("Conteudos Inscritos" + devLuiz.getConteudoInscritos());
        System.out.println("Conteudos Concluidos" + devLuiz.getConteudoConcluidos());
        devLuiz.progredir();
        System.out.println("XP" + devLuiz.calcularTotalXp());




        Dev devGabriel = new Dev();

        devGabriel.setNome("gabriel");
        devGabriel.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devGabriel.getConteudoInscritos());
        devGabriel.progredir();
        System.out.println("Conteudos Inscritos" + devLuiz.getConteudoInscritos());
        System.out.println("Conteudos Concluidos" + devGabriel.getConteudoConcluidos());
        devGabriel.calcularTotalXp();
        System.out.println("XP" + devGabriel.calcularTotalXp());



    }
}