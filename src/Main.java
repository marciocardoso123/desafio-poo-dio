import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
// obj curso1
        curso1.setTitulo("curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);
//obj curso2
        Curso curso2 = new Curso();

        curso2.setTitulo("curso Eclipse");
        curso2.setDescricao("Descrição Produtividade");
        curso2.setCargaHoraria(15);
//obj mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Treinamento Java");
        mentoria.setData(LocalDate.now());

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteudos Inscritos" + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());
        System.out.println("___________________");
        System.out.println("___________________");


        Dev devMarcio = new Dev();
        devMarcio.setNome("Marcio");
        devMarcio.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devMarcio.getConteudosInscritos());
        devMarcio.progredir();
        devMarcio.progredir();
        devMarcio.progredir();
        System.out.println("Conteudos Inscritos" + devMarcio.getConteudosInscritos());
        System.out.println("Conteudos Inscritos" + devMarcio.getConteudosConcluidos());
        System.out.println("___________________");
        System.out.println("XP:" + devMarcio.calcularTotalXp());
        System.out.println("___________________");
    }
}
