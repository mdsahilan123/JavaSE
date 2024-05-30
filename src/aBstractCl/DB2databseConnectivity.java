package aBstractCl;

public class DB2databseConnectivity extends DatabaseCon {
	// Defining the constructor
	public DB2databseConnectivity() {
		System.out.println("DB2databseConnectivity deinie Non -param constructor");
	}

	public DB2databseConnectivity(String databaseName, String dbversion) {
		// passing the databaseName & dbversion from subclass constructor to superclass
		// constructor
		super(databaseName, dbversion);
	}

	@Override
	public String ConnectToDatabase() {
		return String.format("database connectod %s and the version is %s",
				super.databaseName,super.dbversion);
	}



	


}
