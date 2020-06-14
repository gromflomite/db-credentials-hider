package model;

public class DbCredentials {

	private String dbUsername = "";
	private String dbPassword = "";
	private String dbLocation = "";

	protected DbCredentials() {
		this.dbUsername = "";		// DB user			
		this.dbPassword = "";		// DB password
		this.dbLocation = "jdbc:";	// Database URL-path
	}

	protected String getDbUsername() {
		return this.dbUsername;
	}

	protected String getDbPassword() {
		return this.dbPassword;
	}
	
	protected String getDbLocation() {
		return this.dbLocation;
	}
}
