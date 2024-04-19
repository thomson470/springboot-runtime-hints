package net.ideahut.springboot.runtime.hints;

import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.aot.hint.TypeReference;


public class ApacheCommonPoolClientRuntimeHints implements RuntimeHintsRegistrar {

	@Override
	public void registerHints(RuntimeHints hints, ClassLoader loader) {
		hints.reflection().registerType(TypeReference.of("org.apache.commons.pool2.ObjectPool"));
		hints.reflection().registerType(TypeReference.of("org.apache.commons.pool2.impl.DefaultEvictionPolicy"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.apache.commons.pool2.impl.DefaultPooledObjectInfo"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.apache.commons.pool2.impl.GenericObjectPoolMXBean"), MemberCategory.values());
	}
}
