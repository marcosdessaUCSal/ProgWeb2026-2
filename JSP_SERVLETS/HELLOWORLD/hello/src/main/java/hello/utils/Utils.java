package hello.utils;

import java.util.ArrayList;

import hello.model.Aluno;

public class Utils {
	
	public static ArrayList<Aluno> getAlunos() {
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno("João", "20001234", 10.0));
		alunos.add(new Aluno("Maria", "20004321", 9.5));
		alunos.add(new Aluno("Ricardo", "20009876", 7.8));
		alunos.add(new Aluno("Viviane", "20006789", 6.3));
		alunos.add(new Aluno("Paulo", "20006756", 3.0));
		return alunos;
	}

}
