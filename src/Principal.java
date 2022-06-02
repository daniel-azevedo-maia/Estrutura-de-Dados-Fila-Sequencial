
public class Principal {

	public static void main(String[] args) {

		FilaSequencial filaseq = new FilaSequencial();

		filaseq.inserir("Ana");
		filaseq.inserir("Bruno");
		filaseq.inserir("Carla");
		filaseq.inserir("Daniel");
		filaseq.inserir("Eduardo");

		filaseq.exibir();

		filaseq.remover();
		filaseq.remover();
		filaseq.remover();
		filaseq.exibir();

		filaseq.inserir("Fábio");
		filaseq.inserir("Gustavo");
		filaseq.exibir();

		filaseq.esvaziar();
		filaseq.exibir();

	}

}
