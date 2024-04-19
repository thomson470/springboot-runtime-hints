package net.ideahut.springboot.runtime.hints;

import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.aot.hint.TypeReference;


public class LogRuntimeHints implements RuntimeHintsRegistrar {

	@Override
	public void registerHints(RuntimeHints hints, ClassLoader loader) {
		hints.resources().registerPattern("\\QMETA-INF/services/ch.qos.logback.classic.spi.Configurator\\E");
		hints.resources().registerPattern("\\QMETA-INF/services/java.lang.System$LoggerFinder\\E");
		hints.resources().registerPattern("\\QMETA-INF/services/org.apache.juli.logging.Log\\E");
		hints.resources().registerPattern("\\QMETA-INF/services/org.slf4j.spi.SLF4JServiceProvider\\E");
		hints.resources().registerPattern("\\QMETA-INF/spring/logback-pattern-rules\\E");
		hints.resources().registerPattern("\\Qlogback-spring.groovy\\E");
		hints.resources().registerPattern("\\Qlogback-spring.xml\\E");
		hints.resources().registerPattern("\\Qlogback-test-spring.groovy\\E");
		hints.resources().registerPattern("\\Qlogback-test-spring.xml\\E");
		hints.resources().registerPattern("\\Qlogback-test.groovy\\E");
		hints.resources().registerPattern("\\Qlogback-test.scmo\\E");
		hints.resources().registerPattern("\\Qlogback-test.xml\\E");
		hints.resources().registerPattern("\\Qlogback.groovy\\E");
		hints.resources().registerPattern("\\Qlogback.scmo\\E");
		hints.resources().registerPattern("\\Qlogback.xml\\E");
		hints.reflection().registerType(TypeReference.of("ch.qos.logback.classic.BasicConfigurator"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("ch.qos.logback.classic.LoggerContext"));
		hints.reflection().registerType(TypeReference.of("ch.qos.logback.classic.joran.SerializedModelConfigurator"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("ch.qos.logback.classic.pattern.DateConverter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("ch.qos.logback.classic.pattern.FileOfCallerConverter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("ch.qos.logback.classic.pattern.LevelConverter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("ch.qos.logback.classic.pattern.LineOfCallerConverter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("ch.qos.logback.classic.pattern.LineSeparatorConverter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("ch.qos.logback.classic.pattern.MDCConverter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("ch.qos.logback.classic.pattern.MessageConverter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("ch.qos.logback.classic.pattern.MethodOfCallerConverter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("ch.qos.logback.classic.util.DefaultJoranConfigurator"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("java.util.logging.LogManager"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("java.util.logging.LoggingMXBean"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("java.util.logging.SimpleFormatter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.apache.logging.log4j.core.impl.Log4jContextFactory"));
		hints.reflection().registerType(TypeReference.of("org.apache.logging.log4j.spi.ExtendedLogger"));
		hints.reflection().registerType(TypeReference.of("org.apache.logging.slf4j.SLF4JProvider"));
		hints.reflection().registerType(TypeReference.of("org.jboss.logging.Logger"));
		hints.reflection().registerType(TypeReference.of("org.slf4j.Logger"));
		hints.reflection().registerType(TypeReference.of("org.slf4j.bridge.SLF4JBridgeHandler"));
		hints.reflection().registerType(TypeReference.of("org.slf4j.spi.LocationAwareLogger"), MemberCategory.values());
	}
}
