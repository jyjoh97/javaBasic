package ch8;

public class DaoExample {

	public static void dbWork(DataAccessObject dao) {
		
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	
	public static void main(String[] agrs) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}