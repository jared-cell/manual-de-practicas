package modelo;

public class JComboBox {


	private int id;
	private String descc;
	private String tipos;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescc() {
		return descc;
	}
	public void setDescc(String descc) {
		this.descc = descc;
	}
	public String getTipos() {
		return tipos;
	}
	public void setTipos(String tipos) {
		this.tipos = tipos;
	}
	public JComboBox(int id, String descc, String tipos) {
		super();
		this.id = id;
		this.descc = descc;
		this.tipos = tipos;
	}

}
