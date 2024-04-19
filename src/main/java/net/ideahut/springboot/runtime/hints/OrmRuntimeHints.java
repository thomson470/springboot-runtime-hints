package net.ideahut.springboot.runtime.hints;

import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.aot.hint.TypeReference;


public class OrmRuntimeHints implements RuntimeHintsRegistrar {

	@Override
	public void registerHints(RuntimeHints hints, ClassLoader loader) {
		hints.resources().registerPattern("\\QMETA-INF/jpa-named-queries.properties\\E");
		hints.resources().registerPattern("\\QMETA-INF/orm.xml\\E");
		hints.resources().registerPattern("\\QMETA-INF/persistence.xml\\E");
		hints.resources().registerPattern("\\QMETA-INF/services/jakarta.persistence.spi.PersistenceProvider\\E");
		hints.resources().registerPattern("\\QMETA-INF/services/java.sql.Driver\\E");
		hints.resources().registerPattern("\\Qdata-all.sql\\E");
		hints.resources().registerPattern("\\Qdata.sql\\E");
		hints.resources().registerPattern("\\Qjndi.properties\\E");
		hints.resources().registerPattern("\\Qschema-all.sql\\E");
		hints.resources().registerPattern("\\Qschema.sql\\E");
		hints.proxies().registerJdkProxy(
			TypeReference.of("jakarta.persistence.EntityManager"),
			TypeReference.of("org.springframework.orm.jpa.EntityManagerProxy")
		);
		hints.proxies().registerJdkProxy(
			TypeReference.of("java.sql.Connection")
		);
		hints.reflection().registerType(TypeReference.of("[Ljava.sql.Statement"));
		hints.reflection().registerType(TypeReference.of("jakarta.persistence.AttributeOverride"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.persistence.AttributeOverrides"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.persistence.Column"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.persistence.Embeddable"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.persistence.EmbeddedId"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.persistence.Entity"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.persistence.EntityManager"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.persistence.EntityManagerFactory"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.persistence.Enumerated"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.persistence.GeneratedValue"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.persistence.Id"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.persistence.Index"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.persistence.JoinColumn"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.persistence.JoinColumns"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.persistence.Lob"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.persistence.ManyToOne"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.persistence.MappedSuperclass"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.persistence.Persistence"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.persistence.PersistenceContext"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.persistence.PersistenceProperty"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.persistence.Table"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.persistence.Transient"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.persistence.UniqueConstraint"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.transaction.Transactional"));
		hints.reflection().registerType(TypeReference.of("java.sql.Date"));
		hints.reflection().registerType(TypeReference.of("java.sql.Driver"));
		hints.reflection().registerType(TypeReference.of("java.sql.DriverManager"));
		hints.reflection().registerType(TypeReference.of("java.sql.SQLException"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("java.sql.Timestamp"));
		hints.reflection().registerType(TypeReference.of("java.sql.Types"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("java.sql.Wrapper"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("javax.sql.CommonDataSource"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("javax.sql.DataSource"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.sf.jsqlparser.parser.JSqlParser"));
		hints.reflection().registerType(TypeReference.of("org.springframework.dao.support.ChainedPersistenceExceptionTranslator"));
		hints.reflection().registerType(TypeReference.of("org.springframework.dao.support.DataAccessUtils"));
		hints.reflection().registerType(TypeReference.of("org.springframework.dao.support.PersistenceExceptionTranslationInterceptor"));
		hints.reflection().registerType(TypeReference.of("org.springframework.jdbc.core.JdbcOperations"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.jdbc.core.JdbcTemplate"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.jdbc.core.simple.DefaultJdbcClient"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.jdbc.core.simple.JdbcClient"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.jdbc.support.JdbcAccessor"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.orm.hibernate5.SpringSessionContext"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.orm.jpa.AbstractEntityManagerFactoryBean"));
		hints.reflection().registerType(TypeReference.of("org.springframework.orm.jpa.EntityManagerFactoryInfo"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.orm.jpa.EntityManagerProxy"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.orm.jpa.JpaTransactionManager"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.orm.jpa.JpaVendorAdapter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.orm.jpa.SharedEntityManagerCreator"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.orm.jpa.persistenceunit.PersistenceManagedTypes"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.orm.jpa.persistenceunit.SimplePersistenceManagedTypes"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.orm.jpa.vendor.AbstractJpaVendorAdapter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.orm.jpa.vendor.HibernateJpaDialect"));
		hints.reflection().registerType(TypeReference.of("org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.transaction.TransactionDefinition"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.transaction.annotation.AbstractTransactionManagementConfiguration"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.transaction.annotation.EnableTransactionManagement"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.transaction.annotation.Transactional"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.transaction.interceptor.TransactionAspectSupport"));
		hints.reflection().registerType(TypeReference.of("org.springframework.transaction.interceptor.TransactionInterceptor"));
		hints.reflection().registerType(TypeReference.of("org.springframework.transaction.interceptor.TransactionInterceptor$1"));
		hints.reflection().registerType(TypeReference.of("org.springframework.transaction.interceptor.TransactionalProxy"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.transaction.support.DefaultTransactionDefinition"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.transaction.support.TransactionOperations"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.transaction.support.TransactionTemplate"), MemberCategory.values());
	}
}
