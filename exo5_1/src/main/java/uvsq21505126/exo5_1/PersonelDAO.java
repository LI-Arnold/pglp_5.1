package uvsq21505126.exo5_1;

import java.awt.List;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class PersonelDAO implements DAO<Personel>{
	
	ArrayList<Personel> p;

	public List getAllStudents() {
		  p = new ArrayList<Personel>();
	      Personel p1 = new Personel("li","arnold","etudiant",LocalDate.of(2015, 12, 31));
	      p.add(p1);
	}

	public Personel getPersonel(int pe) {
		return p;
	}

	public void updatePersonel(Personel p) {
		
		
	}

	public void deletePersonel(Personel p) {
		p.remove
	}


}
