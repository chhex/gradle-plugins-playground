package nestedtest;
import org.gradle.api.NonNullApi;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.logging.Logger;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.plugins.JavaPlugin;
import org.gradle.api.plugins.PluginContainer;

@NonNullApi
public class NestedDemoPlugin implements Plugin<Project> {

	@Override
	public void apply(final Project project) {
		final Logger logger = project.getLogger();
		final ExtensionContainer ext = project.getExtensions();
		final PluginContainer plugins = project.getPlugins();
		logger.info("Applying Java Plugin");
		plugins.apply(JavaPlugin.class);
		ext.create("nestedExtension", DemoExtension.class, project);
	}

}
