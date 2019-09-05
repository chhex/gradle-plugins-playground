package extensiontest;
import org.gradle.api.Action;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.plugins.JavaPlugin;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.plugins.PluginContainer;

public class InhouseConventionJavaPlugin implements Plugin<Project> {
	public void apply(Project project) {
		final ExtensionContainer ext = project.getExtensions();
		final PluginContainer plugins = project.getPlugins();
		plugins.apply(JavaPlugin.class);
		ext.create("javaConventions", InhouseConventionJavaExtension.class, project);
	}
}
