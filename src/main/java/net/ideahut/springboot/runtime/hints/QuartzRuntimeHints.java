package net.ideahut.springboot.runtime.hints;

import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.aot.hint.TypeReference;


public class QuartzRuntimeHints implements RuntimeHintsRegistrar {

	@Override
	public void registerHints(RuntimeHints hints, ClassLoader loader) {
		hints.resources().registerPattern("\\Q/quartz.properties\\E");
		hints.resources().registerPattern("\\Qorg/quartz/core/quartz-build.properties\\E");
		hints.resources().registerPattern("\\Qorg/quartz/quartz.properties\\E");
		hints.resources().registerPattern("\\Qquartz.properties\\E");
		hints.reflection().registerType(TypeReference.of("org.quartz.Job"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.quartz.Scheduler"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.quartz.SchedulerMetaData"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.quartz.impl.StdScheduler"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.quartz.impl.StdSchedulerFactory"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.quartz.simpl.CascadingClassLoadHelper"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.quartz.simpl.RAMJobStore"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.quartz.simpl.RAMJobStoreBeanInfo"));
		hints.reflection().registerType(TypeReference.of("org.quartz.simpl.RAMJobStoreCustomizer"));
		hints.reflection().registerType(TypeReference.of("org.quartz.simpl.SimpleThreadPool"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.quartz.simpl.SimpleThreadPoolBeanInfo"));
		hints.reflection().registerType(TypeReference.of("org.quartz.simpl.SimpleThreadPoolCustomizer"));
		hints.reflection().registerType(TypeReference.of("org.quartz.spi.JobStore"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.quartz.spi.ThreadPool"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.scheduling.quartz.ResourceLoaderClassLoadHelper"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.scheduling.quartz.SchedulerAccessor"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.scheduling.quartz.SchedulerFactoryBean"), MemberCategory.values());
	}
}
