package application;

import java.util.ArrayList;
import java.util.List;

import entities.Aluno;

public class Escola {
	
	public static List <Aluno> turma = new ArrayList<>();
	

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Leticia", 110410389, 23);
		Aluno aluno2 = new Aluno("Joao", 114560389, 23);
		Aluno aluno3 = new Aluno("Felipe", 110410373, 23);
				
		turma.add(aluno1);
		turma.add(aluno2);
		turma.add(aluno3);
		turma.add(new Aluno("Amanda", 110416669, 23));
		turma.add(new Aluno("Pedro", 110258389, 23));
		
		turma.forEach(System.out::println);
	}
	
	

}

