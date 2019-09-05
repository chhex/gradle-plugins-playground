package extensiontest;
import java.util.Arrays;

import javax.inject.Inject;

import org.gradle.api.Project;
import org.gradle.api.plugins.JavaPlugin;
import org.gradle.api.plugins.JavaPluginConvention;
import org.gradle.api.tasks.SourceSet;
public class InhouseConventionJavaExtension {

	private final Project project;
	private String sourceDir = "src";

	@Inject
	public InhouseConventionJavaExtension(final Project project) {
		this.project = project;
	}
	
	public void setSourceDir(String sourceDir) {
		this.sourceDir = sourceDir;
	}
	
	public String getSourceDir() {
		return sourceDir;
	}
	
	public void configure() {
        JavaPluginConvention javaConvention =
                project.getConvention().getPlugin(JavaPluginConvention.class);
            SourceSet main = javaConvention.getSourceSets().getByName(SourceSet.MAIN_SOURCE_SET_NAME);
            main.getJava().setSrcDirs(Arrays.asList(sourceDir));
	}
}
