package ru.masterdata

import org.gradle.api.*

class CustomPlugin implements Plugin<Project> {
	void apply(Project project) {
		project.task('task1') << {
			println "custom plugin task1"
		}
		project.task('task2') << {
			println "custom plugin task2"
		}
	}
}
