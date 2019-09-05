package nestedtest;
import org.gradle.api.logging.Logger;

public class Nested {
	
	private String nestedProperty = "nestedProperty";
	private DemoExtension rootData;

	public Nested(DemoExtension demoExtension) {
		this.rootData = demoExtension;
	}

	public Nested() {
	}

	public String getNestedProperty() {
		return nestedProperty;
	}

	public void setNestedProperty(String nestedProperty) {
		this.nestedProperty = nestedProperty;
	}

	public DemoExtension getRootData() {
		return rootData;
	}

	public void setRootData(DemoExtension rootData) {
		this.rootData = rootData;
	}
	
	public void toLog() {
		System.out.println("Logging via to Log from Neste  ****>");
		System.out.println("nestedProperty: " + nestedProperty);
		System.out.println("rootData: ");
		rootData.toLog();
		System.out.println("Logging via Nested to Log done.");
	}


	
	

}
