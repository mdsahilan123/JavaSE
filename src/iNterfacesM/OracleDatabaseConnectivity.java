package iNterfacesM;

public class OracleDatabaseConnectivity implements DatabaseConnectivity {
	@Override
	public String connectToDatabase(String databaseName, String databaseVersio) {
		return String.format("Database Connectivity got Completed with Database Name %s with Database Version %s",databaseName,databaseVersio);
	}

}
