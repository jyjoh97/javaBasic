package ch8;

public class DaoEx {

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