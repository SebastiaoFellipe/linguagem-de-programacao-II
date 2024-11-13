import java.util.ArrayList;
import java.util.List;

class Aula {
    private String materia;
    private String horario;

    public Aula(String materia, String horario) {
        this.materia = materia;
        this.horario = horario;
    }

    public void mostrarDetalhes() {
        System.out.println("Matéria: "+this.materia+" | Horário: "+this.horario);
    }
}

class Curso {
    private String nome;
    private List<Aula> aulas;
    private boolean terminado;

    public Curso(String nome) {
        this.nome = nome;
        this.aulas = new ArrayList<>();
        this.terminado = false;
    }

    public void adicionarAula(String materia, String horario) {
        Aula aula = new Aula(materia, horario);
        aulas.add(aula);
    }

    public void terminarCurso() {
        this.terminado = true;
        this.aulas.clear();
        System.out.println("Finalizando curso...");
    }

    public void mostrarCurso() {
        System.out.println("Curso: "+this.nome);
        if (aulas.isEmpty()) {
            System.out.println("Sem aulas adicionadas");
        } else {
            for (int i = 0; i < this.aulas.size(); i++) {
                System.out.println("Aula "+(i+1));
                aulas.get(i).mostrarDetalhes();
            }
        }
    }
}

public class SistemaGestaoCursos {
    public static void main(String[] args) {
        Curso curso = new Curso("Tecnologia da Informação");

        curso.adicionarAula("EDBII","35T56");
        curso.adicionarAula("LPII","35N12");

        curso.mostrarCurso();
        System.out.println();
        curso.terminarCurso();
        System.out.println();
        curso.mostrarCurso();

    }
}