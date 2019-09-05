import org.gradle.api.Project;
import org.gradle.api.Plugin;

class DemoExtension {
	String non_closure
	def override_closure = {}
}
class DemoPlugin implements Plugin<Project> {
	void apply(Project project) {
		project.extensions.create('demoExtension', DemoExtension)
	}
}