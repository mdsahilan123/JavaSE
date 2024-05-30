package iNterfacesM;

public class DB2DatabaseConnectivity implements DatabaseConnectivity {
	@Override
	public String connectToDatabase(String databaseName, String databaseVersion) {
		return String.format("databaseName Connectivity got Completed with databaseName Name %s with Database Version %s", databaseName,databaseVersion);
	}

}
