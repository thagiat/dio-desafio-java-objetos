import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setDescricao("Longo");
        curso.setTitulo("Santander Code");
        curso.setCargaHoraria(90);

        Curso curso2 = new Curso();
        curso2.setDescricao("Longossssss");
        curso2.setTitulo("try again");
        curso2.setCargaHoraria(20);

        Mentoria mentoria = new Mentoria();
        mentoria.setData(LocalDate.now());
        mentoria.setDescricao("Viva la vida");
        mentoria.setTitulo("Coldplay");

        /*System.out.println(curso);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setDescricao("existe");
        bootcamp.setNome("Poke");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Camila:"+ devCamila.getConteudosInscritos());

        Dev devJoy = new Dev();
        devJoy.setNome("Joy");
        devJoy.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Joy:"+ devJoy.getConteudosInscritos());

        devJoy.progredir();
        System.out.println("Conteudos concluidos Joy:"+ devJoy.getConteudosConcluidos());

        devJoy.progredir();

        System.out.println("Conteudos concluidos Joy:"+ devJoy.getConteudosConcluidos());
        System.out.println("Conteudos concluidos Camila:"+ devCamila.getConteudosConcluidos());

        System.out.println("Xp Joy:" + devJoy.calcularXp());
        System.out.println("Xp Camila:" + devCamila.calcularXp());

    }
}
