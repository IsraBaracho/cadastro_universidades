import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		try (Scanner leia = new Scanner(System.in)) {
			int tamanho;

			System.out.println("CADASTRE NO PORTAL DO MEC UMA UNIVERSIDADE");
			System.out.println("Indique a quantidade de Universidades a serem cadastradas: ");
			tamanho = leia.nextInt();

			Universidade[] universidades = new Universidade[tamanho];

			int opcao, qunatAlunos, quantProfessores;
			String nome, estado, cidade;
			estado = null;

			double valorMensalidade;
			valorMensalidade = 0;

			for (int i = 0; i < universidades.length; i++) {

				System.out.println("Selecione a opcao de instituicao que deseja cadastrar: ");
				System.out.println("Digite 1 - Publica");
				System.out.println("Digite 2 - Privada");
				opcao = leia.nextInt();
				leia.nextLine();
				System.out.println("Digite o nome da instituicao: ");
				nome = leia.nextLine();

				System.out.println("Digite a quantidade de alunos que a instituicao possui: ");
				qunatAlunos = leia.nextInt();
				leia.nextLine();
				System.out.println("Digite quantos professores a instituicao possui: ");
				quantProfessores = leia.nextInt();
				leia.nextLine();

				switch (opcao) {

				case 1:
					System.out.println("Digite o UF da Instituicao");
					estado = leia.nextLine();
					System.out.println("Digite a cidade da Instituicao: ");
					cidade = leia.nextLine();
					universidades[i] = new Publica(nome, qunatAlunos, quantProfessores, estado, cidade);
					break;

				case 2:
					System.out.println("Digite o valor da mensalidade: R$ ");
					valorMensalidade = leia.nextDouble();
					universidades[i] = new Privada(nome, qunatAlunos, quantProfessores, valorMensalidade);
					break;

				default:
					System.out.println("Opcao invalida");

				}
			}

			MEC obj = new MEC();
			System.out.println("-- UNIVERSIDADES REGISTRADAS --");
			obj.imprimeUniversidades(universidades);
			System.out.println("");

			System.out.println("--UNIVERSIDADE MAIS CARA REGISTRADA--");
			obj.maisCara(universidades);
			System.out.println("");

			System.out.println("--UNIVERSIDADE DO SUL DO BRASIL--");
			obj.universidadesDoSul(universidades);
		}

		System.out.println("");
	}

}
