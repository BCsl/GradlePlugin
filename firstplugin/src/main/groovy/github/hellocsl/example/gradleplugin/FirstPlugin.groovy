package github.hellocsl.example.gradleplugin

import org.gradle.api.Plugin
import org.gradle.api.Project

public class FirstPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task('testTask').doLast {
            println "Hello my first gradle plugin"
        }
    }
}
