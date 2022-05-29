package br.ufrpe.academico.exceptions;

import br.ufrpe.academico.models.Aluno;
import br.ufrpe.academico.models.Turma;

public class AlunoJaMatriculadoNaTurmaException extends Exception {
    private Aluno aluno;
    private Turma turma;

    public AlunoJaMatriculadoNaTurmaException(Aluno aluno, Turma turma) {
        super("Aluno " + aluno.getNome() + " já matriculado na turma da disciplina " + turma.getDisciplina() + " e professor " + turma.getProfessorResponsavel());
        this.aluno = aluno;
        this.turma = turma;
    }
    
    public Aluno getAluno() {
        return this.aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return this.turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

}
