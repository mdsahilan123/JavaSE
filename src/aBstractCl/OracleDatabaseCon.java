  package aBstractCl;

public class OracleDatabaseCon extends DatabaseCon {
  //Defining the constructor
	public OracleDatabaseCon() {
		System.out.println("Non -param constructor");
	}
	public OracleDatabaseCon(String databaseName,String dbversion) {
		//passing the databaseName & db version from subclass constructor to superclass constructor
		super(databaseName,dbversion);
	}
	@Override
	public String ConnectToDatabase() {
		return "Database connection got Estabileshed from java application....";
	}

}
