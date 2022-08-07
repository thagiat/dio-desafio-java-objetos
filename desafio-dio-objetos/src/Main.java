import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setDescricao("Longo");
        curso.setTitulo("Santander Code");
        curso.setCargaHoraria(90);

        Mentoria mentoria = new Mentoria();
        mentoria.setData(LocalDate.now());
        mentoria.setDescricao("Viva la vida");
        mentoria.setTitulo("Coldplay");


        System.out.println(curso);
        System.out.println(mentoria);

    }
}
