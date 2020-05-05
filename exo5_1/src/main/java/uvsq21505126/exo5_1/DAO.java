package uvsq21505126.exo5_1;

import java.awt.List;

public interface DAO<T>{
	   public List getAllStudents();
	   public T getPersonel(int p);
	   public void updatePersonel(T p);
	   public void deletePersonel(T p);
}
