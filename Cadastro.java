package animais;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Cadastro {
	ArrayList<Animal> lista = new ArrayList<Animal>();

	public static void main(String[] args) {
		int opcao = 0;
		Cadastro cadastro = new Cadastro();
		Cadastro c = new Cadastro();
		Animal a = new Animal();
		c.a = a;
		while (opcao != 4) {
			opcao = Integer
					.parseInt(JOptionPane
							.showInputDialog("-----------------------MENU----------------------\n 1-Adicionar Animal \n 2-Doar Animal \n 3-Listar Animais\n 4-SAIR"));
			if (opcao == 1) {
				String nome = JOptionPane
						.showInputDialog("Qual nome do bixinho?");
				String cor = JOptionPane
						.showInputDialog("Qual a cor do bixinho?");
				String especie = JOptionPane
						.showInputDialog("Qual especie do bixinho?");

				cadastro.adicionarAnimal(nome, cor, especie);

			} else {
				if (opcao == 2) {
					String nome = JOptionPane
							.showInputDialog("Qual nome do bixinho?");
					cadastro.removerAnimal(nome);
				} else {
					if (opcao == 3) {
						cadastro.listarAnimal();
					}
				}
			}

		}
	}
private Animal a;
	public void adicionarAnimal(String nome, String cor, String especie) {

		if (especie.equalsIgnoreCase("macaco")) {
			Macaco macaco = new Macaco();
			Animal animal = macaco;
			animal.setNome(nome);
			animal.setCor(cor);
			animal.setEspecie(especie);
			lista.add(animal);
		}
		if (especie.equalsIgnoreCase("passarinho")) {
			Passarinho passarinho = new Passarinho();
			Animal animal = passarinho;
			animal.setNome(nome);
			animal.setCor(cor);
			animal.setEspecie(especie);
			lista.add(animal);
		}

	}

	public void removerAnimal(String nome) {
		boolean profFoiLocalizado = false;
		if (this.lista.isEmpty()) {
			JOptionPane.showMessageDialog(null,
					"Erro na busca: Nenhuma moto estacionada.");
		}// senão... procurar moto
		else {
		for (int i = 0; i < lista.size(); i++) {
			Animal anim = (Animal) lista.get(i);
			
			String name = anim.getNome();
			
			if (nome.equalsIgnoreCase(name)) {
				
				JOptionPane.showMessageDialog(null, anim.getNome()
						+ " removido");
				lista.remove(i);
				
				profFoiLocalizado = true;
			}
		}
		}	
		if (!profFoiLocalizado) {
			JOptionPane.showMessageDialog(null,
					"Impossível concluir ação, Não tem animal com esse nome");

		}
	}

	public void listarAnimal() {
		String listaAnimal = "";
		for (int i = 0; i < lista.size(); i++) {
			Animal anim = (Animal) lista.get(i);
			listaAnimal = listaAnimal + anim.getNome() +" da cor "+anim.getCor()+ "\n";
			JOptionPane.showMessageDialog(null,
					"Os animais que tem aqui são: \n" + listaAnimal);
		}
	}
}
