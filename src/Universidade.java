
public class Universidade {
	private String nome;
	private int quantAlunos, quantProfessores;

	public Universidade(String nome, int quantAlunos, int quantProfessores) {
		this.nome = nome;
		this.quantAlunos = quantAlunos;
		this.quantProfessores = quantProfessores;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantAlunos() {
		return quantAlunos;
	}

	public void setQuantAlunos(int quantAlunos) {
		this.quantAlunos = quantAlunos;
	}

	public int getQuantProfessores() {
		return quantProfessores;
	}

	public void setQuantProfessores(int quantProfessores) {
		this.quantProfessores = quantProfessores;
	}

	public void imprimeInfo() {
		System.out.println("");
		System.out.println("Nome: " + nome);
		System.out.println("Quantidade de alunos: " + quantAlunos);
		System.out.println("Quantidade de Professores: " + quantProfessores);
	}

}
