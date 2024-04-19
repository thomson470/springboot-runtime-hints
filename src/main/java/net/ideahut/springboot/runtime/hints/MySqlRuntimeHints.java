package net.ideahut.springboot.runtime.hints;

import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.aot.hint.TypeReference;


public class MySqlRuntimeHints implements RuntimeHintsRegistrar {

	@Override
	public void registerHints(RuntimeHints hints, ClassLoader loader) {
		hints.resources().registerResourceBundle("com.mysql.cj.LocalizedErrorMessages");
		hints.resources().registerPattern("\\Qcom/mysql/cj/TlsSettings.properties\\E");
		hints.reflection().registerType(TypeReference.of("com.mysql.cj.conf.url.SingleConnectionUrl"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.mysql.cj.exceptions.CJException"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.mysql.cj.exceptions.StatementIsClosedException"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread"));
		hints.reflection().registerType(TypeReference.of("com.mysql.cj.jdbc.ClientPreparedStatement"));
		hints.reflection().registerType(TypeReference.of("com.mysql.cj.jdbc.Driver"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.mysql.cj.jdbc.exceptions.SQLError"));
		hints.reflection().registerType(TypeReference.of("com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping"));
		hints.reflection().registerType(TypeReference.of("com.mysql.cj.log.StandardLogger"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.mysql.cj.protocol.StandardSocketFactory"), MemberCategory.values());
	}
}
