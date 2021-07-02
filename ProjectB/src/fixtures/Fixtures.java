package fixtures;
//Abstract class to aid in the construction of the Room object
public abstract class Fixtures {
	protected String name;
	protected String shortDescription;
	protected String longDescription;
	
	public Fixtures(String name, String shortDescription, String longDescription) {
		super();
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}
	public Fixtures() {
		super();
	}
	public String getName() {
		return name;
	}
	public abstract void setName(String name);
	
	public String getShortDescription() {
		return shortDescription;
	}
	public abstract void setShortDescription(String shortDescription);
	
	public String getLongDescription() {
		return longDescription;
	}
	public abstract void setLongDescription(String longDescription);
}
