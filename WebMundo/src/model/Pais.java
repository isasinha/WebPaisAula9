package model;

public class Pais {

	int id;
	String nome;
	long populacao;
	double area;
	String continente;

	public Pais(int id, String nome, long populacao, double area, String continente) {
		this.id = id;
		this.nome = nome;
		this.populacao = populacao;
		this.area = area;
		this.continente = continente;
	}

	public Pais() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getPopulacao() {
		return populacao;
	}

	public void setPopulacao(long populacao) {
		this.populacao = populacao;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}
	
	@Override
	public String toString() {
		return "Pais [id=" + id + ", nome=" + nome + ", populacao=" + populacao
				+ ", area=" + area + ", continente=" + continente + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		if (area == 0.0) {
			if (other.area != 0.0)
				return false;
		} else if (area != other.area)
			return false;
		if (populacao == 0) {
			if (other.populacao != 0)
				return false;
		} else if (populacao != other.populacao)
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
