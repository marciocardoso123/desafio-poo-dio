import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
