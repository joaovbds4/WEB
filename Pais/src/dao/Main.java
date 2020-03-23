package dao;
import model.Pais;

public class Main {

	public static void main(String[] args) {
		PaisDAO dao = new PaisDAO(ConnectionBD.conectar());
		Pais pais = new Pais(0, "American Samoa", 1231231, 12.000);
		
		System.out.println(dao.selectPais(80));
		//dao.delete("American Samoa");
		//dao.insert(pais);
		//dao.upDateNomePais("America", 80);
		
	}
}
