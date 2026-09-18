package model;

public class Registro {
	
	private String data;
	private String cidade;
	private String descr;
	
	public Registro(String data, String cidade, String descr) {
		this.data = data;
		this.cidade = cidade;
		this.descr = descr;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}
	
	
	
	

}
