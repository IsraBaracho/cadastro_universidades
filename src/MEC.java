
public class MEC {
	public void imprimeUniversidades(Universidade[] arrayUniversidade) {
		for (int i = 0; i < arrayUniversidade.length; i++) {
			if (arrayUniversidade[i] instanceof Publica) {
				System.out.println("Informações Universidade Pública");
				arrayUniversidade[i].imprimeInfo();
			} else if (arrayUniversidade[i] instanceof Privada) {
				System.out.println("Informações Universidade Privada");
				arrayUniversidade[i].imprimeInfo();
			}
		}
	}

	public void maisCara(Universidade[] arrayCara) {
		double maiorMensalidade = 0;
		int colocacao = 0;
		for (int i = 0; i < arrayCara.length; i++) {
			if (arrayCara[i] instanceof Privada) {
				if (((Privada) arrayCara[i]).getValorMensalidade() > maiorMensalidade) {
					maiorMensalidade = ((Privada) arrayCara[i]).getValorMensalidade();
					colocacao = i;
				}
			}
		}
		System.out.println("Universidade Privada mais cara é: ");
		arrayCara[colocacao].imprimeInfo();
	}

	public void universidadesDoSul(Universidade[] arrayUniversidadesDoSul) {
		int flag = 0;
		for (int i = 0; i < arrayUniversidadesDoSul.length; i++) {
			if (arrayUniversidadesDoSul[i] instanceof Publica) {
				if ((((Publica) arrayUniversidadesDoSul[i]).getEstado()).equalsIgnoreCase("RS")
						|| (((Publica) arrayUniversidadesDoSul[i]).getEstado()).equalsIgnoreCase("SC")
						|| (((Publica) arrayUniversidadesDoSul[i]).getEstado()).equalsIgnoreCase("PR")) {
					arrayUniversidadesDoSul[i].imprimeInfo();
					flag = 1;
				}
			}

		}
		if (flag == 0) {
			System.out.println("Nenhuma Universidade encontrada na região sul do país ");
		}
	}
}
