import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.1.3.RELEASE"
	id("org.jetbrains.kotlin.jvm") version "1.2.71"
	id("org.jetbrains.kotlin.plugin.spring") version "1.2.71"
}

apply(plugin = "io.spring.dependency-management")

group = "com.wrongwrong"
version = "0.0.1-SNAPSHOT"
val sourceCompatibility = "1.8"

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	implementation(group = "org.springframework.boot", name = "spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "1.8"
	}
}

val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
	freeCompilerArgs = listOf("-Xjsr305=strict")
	jvmTarget = "1.8"
}
