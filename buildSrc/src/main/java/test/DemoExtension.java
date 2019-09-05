package test;
import javax.inject.Inject;

import org.gradle.api.Action;
import org.gradle.api.Project;
public class DemoExtension {
	
	private final Project project;
	private String someRootProperty = "rootPropertyValue";
	private Nested nestedProperties = new Nested(this);
	
	@Inject
	public DemoExtension(final Project project) {
		this.project = project;
	}
	public String getSomeRootProperty() {
		return someRootProperty;
	}

	public void setSomeRootProperty(String someRootProperty) {
		this.someRootProperty = someRootProperty;
	}

	public Nested getNestedProperties() {
		return nestedProperties;
	}
	
	public void nestedProperties(Action<? super Nested> action) {
		action.execute(nestedProperties);
		nestedProperties.setRootData(this);
		
	}

	public Project getProject() {
		return project;
	}
	
	public void toLog() {
		System.out.println("Logging via to Log from Root Extension Object --->");
		System.out.println("Project : " + (project == null ? "<null>" : project.toString()));
		System.out.println("Logger : " + (project.getLogger() == null ? "<null>" : project.getLogger().toString()));
		System.out.println("someRootProperty: " + someRootProperty);
		System.out.println("Logging via to Log done.");
	}




	

}
