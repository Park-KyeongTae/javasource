package inter;

public class DaoEx {
	public static void main(String[] args) {
		//OracleDao oracle = new OracleDao();
		DataAccessObject oracle = new OracleDao();
		dbWork(oracle);
		
		//Mysql mysql = new Mysql();		
		DataAccessObject mysql = new Mysql();		
		dbWork(mysql);
//		dbWork2(oracle);
	}
	
	static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();	
	}
//	static void dbWork2(OracleDao oracle) {		
//		oracle.select();
//		oracle.insert();
//		oracle.update();
//		oracle.delete();
//	}
}
