package br.ufrpe.academico.exceptions;

import br.ufrpe.academico.models.Aluno;

public class AlunoMenorDeIdadeException extends Exception {
    private Aluno aluno;

    public AlunoMenorDeIdadeException(Aluno aluno) {
        super("Aluno " + aluno.getNome() + " é menor de idade");
        this.aluno = aluno;
    }
    
    public Aluno getAluno() {
        return this.aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
