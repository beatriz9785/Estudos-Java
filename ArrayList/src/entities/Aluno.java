package entities;

public class Aluno {

	private String nome;
	private int matricula;
	private int idade;

	private double nota1 = -1.0;
	private double nota2 = -1.0;
	private boolean rec = false;

	private double mediaFinal = -1.0;
	private String statusBoletim;

	public Aluno(String nome, int matricula, int idade) {
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
	}

	public Aluno(String nome, int matricula, int idade, double nota1, double nota2) {
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
		fazerProvas(nota1, nota2);

	}

	public String getNome() {
		return nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public int getIdade() {
		return idade;
	}

	public double getNota1() {
		return nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public double getMediaFinal() {
		return mediaFinal;
	}

	public String getStatusBoletim() {
		return statusBoletim;
	}

	public void fazerProvas(double nota1, double nota2) {

		if (nota1 > 10.0 || nota2 > 10.0) {
			System.out.println("nota fora do range");
		} else if (nota1 < 0.0 || nota2 < 0.0) {
			System.out.println("nota fora do range");
		} else {
			this.nota1 = nota1;
			this.nota2 = nota2;
			calculaMedia();
			System.out.println("Notas adicionadas");
		}

	}

	public double calculaMedia() {
		if (nota1 == -1 || nota2 == -1) {
			System.out.println(" Suas notas ainda não foram lançadas.");
			return mediaFinal = -1.0;
		} else {
			return mediaFinal = ((nota1 + nota2) / 2.0);
		}

	}

	public String resultadoBoletim() {
		if (mediaFinal < 4.0) {
			return statusBoletim = "Reprovado";
		} else if (mediaFinal < 7.0) {
			if(rec == true) {
				System.out.println("Voce não pode mais fazer a prova de recuperação.");
				return statusBoletim = "Reprovado";
			}else {
				fazerRecuperacao(9.0);
				rec = true;
				return resultadoBoletim();
			}
		} else {
			return statusBoletim = "Aprovado!";
		}
	}

	private double fazerRecuperacao(double notaRec) {
		mediaFinal += notaRec;
		mediaFinal /= 2.0;
		System.out.println(mediaFinal);
		return mediaFinal;
		
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", idade=" + idade + "]";
	}
	
	

}
