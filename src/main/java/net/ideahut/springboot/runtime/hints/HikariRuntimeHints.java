package net.ideahut.springboot.runtime.hints;

import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.aot.hint.TypeReference;


public class HikariRuntimeHints implements RuntimeHintsRegistrar {

	@Override
	public void registerHints(RuntimeHints hints, ClassLoader loader) {
		hints.reflection().registerType(TypeReference.of("com.zaxxer.hikari.HikariConfig"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.zaxxer.hikari.HikariConfigMXBean"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.zaxxer.hikari.HikariDataSource"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.zaxxer.hikari.pool.HikariProxyConnection"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.zaxxer.hikari.pool.HikariProxyDatabaseMetaData"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.zaxxer.hikari.pool.HikariProxyPreparedStatement"));
		hints.reflection().registerType(TypeReference.of("com.zaxxer.hikari.pool.PoolBase"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.zaxxer.hikari.pool.PoolEntry"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.zaxxer.hikari.pool.ProxyPreparedStatement"));
	}
}
