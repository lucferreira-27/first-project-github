package Workout.number6.application;

public class Quartos {
	private String nome;
	private String email;
	
	private int Nquarto;

	private  int  Nquartos;
	

	
	public Quartos(String nome, String email) {
		
		this.nome = nome;
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNquartos() {
		return Nquartos;
	}
	public void setNquartos(int nquartos) {
		
		Nquartos = nquartos;
	}
	public int getNquarto() {
		return Nquarto;
	}
	public void setNquarto(int nquarto) {
		Nquarto = nquarto;
	}
	@Override
	public String toString() {
		return "Quartos [nome=" + nome + ", email=" + email + ", Nquarto=" + Nquarto + "]";
	}

	
}
