package animais;

public class Animal {
	protected String especie;
	protected String nome;
	protected String cor;
	
	Cadastro c;
	Animal a;
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getEspecie(){
		return especie;
		
	}
	public void setEspecie(String especie){
		this.especie=especie;
	}
	public String getCor(){
		return cor;
	}
	public void setCor(String cor){
		this.cor = cor;
	}
	
}
