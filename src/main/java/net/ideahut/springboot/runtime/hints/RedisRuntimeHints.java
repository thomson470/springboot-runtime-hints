package net.ideahut.springboot.runtime.hints;

import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.aot.hint.TypeReference;


public class RedisRuntimeHints implements RuntimeHintsRegistrar {

	@Override
	public void registerHints(RuntimeHints hints, ClassLoader loader) {
		hints.resources().registerPattern("\\Qredis/clients/jedis/pom.properties\\E");
		hints.proxies().registerJdkProxy(
			TypeReference.of("org.springframework.data.redis.connection.RedisConnection")
		);
		hints.proxies().registerJdkProxy(
			TypeReference.of("org.springframework.data.redis.connection.StringRedisConnection"),
			TypeReference.of("org.springframework.data.redis.connection.DecoratedRedisConnection")
		);
		hints.reflection().registerType(TypeReference.of("org.springframework.data.redis.connection.DefaultedRedisConnection"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.data.redis.core.RedisAccessor"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.data.redis.core.RedisKeyValueAdapter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.data.redis.core.RedisKeyValueAdapter$EnableKeyspaceEvents"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.data.redis.core.RedisKeyValueAdapter$ShadowCopy"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.data.redis.core.RedisKeyValueTemplate"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.data.redis.core.RedisOperations"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.data.redis.core.RedisTemplate"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.data.redis.core.StringRedisTemplate"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.data.redis.core.convert.KeyspaceConfiguration"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.data.redis.core.convert.MappingConfiguration"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.data.redis.core.convert.MappingRedisConverter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.data.redis.core.convert.RedisConverter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.data.redis.core.convert.RedisCustomConversions"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.data.redis.core.convert.ReferenceResolver"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.data.redis.core.convert.ReferenceResolverImpl"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.data.redis.core.index.ConfigurableIndexDefinitionProvider"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.data.redis.core.index.IndexConfiguration"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.data.redis.core.index.IndexDefinitionProvider"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.data.redis.core.index.IndexDefinitionRegistry"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.data.redis.core.mapping.RedisMappingContext"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("redis.clients.jedis.JedisPool"), MemberCategory.values());
	}
}
