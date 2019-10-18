package fixtures;

public abstract class Fixture {
	public String name = "";
	public String shortDescription = "";
	public String longDescription = "";
	
	public String getName() {
		return name;
	}
	public String getShortDesc() {
		return shortDescription;
	}
	public String getLongDesc() {
		return longDescription;
	}
}
