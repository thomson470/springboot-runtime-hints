package net.ideahut.springboot.runtime.hints;

import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.aot.hint.TypeReference;


public class TomcatRuntimeHints implements RuntimeHintsRegistrar {

	@Override
	public void registerHints(RuntimeHints hints, ClassLoader loader) {
		hints.resources().registerResourceBundle("org.apache.catalina.authenticator.LocalStrings");
		hints.resources().registerResourceBundle("org.apache.catalina.authenticator.jaspic.LocalStrings");
		hints.resources().registerResourceBundle("org.apache.catalina.connector.LocalStrings");
		hints.resources().registerResourceBundle("org.apache.catalina.core.LocalStrings");
		hints.resources().registerResourceBundle("org.apache.catalina.deploy.LocalStrings");
		hints.resources().registerResourceBundle("org.apache.catalina.loader.LocalStrings");
		hints.resources().registerResourceBundle("org.apache.catalina.mapper.LocalStrings");
		hints.resources().registerResourceBundle("org.apache.catalina.mbeans.LocalStrings");
		hints.resources().registerResourceBundle("org.apache.catalina.realm.LocalStrings");
		hints.resources().registerResourceBundle("org.apache.catalina.security.LocalStrings");
		hints.resources().registerResourceBundle("org.apache.catalina.session.LocalStrings");
		hints.resources().registerResourceBundle("org.apache.catalina.startup.LocalStrings");
		hints.resources().registerResourceBundle("org.apache.catalina.util.LocalStrings");
		hints.resources().registerResourceBundle("org.apache.catalina.valves.LocalStrings");
		hints.resources().registerResourceBundle("org.apache.catalina.webresources.LocalStrings");
		hints.resources().registerResourceBundle("org.apache.coyote.LocalStrings");
		hints.resources().registerResourceBundle("org.apache.coyote.http11.LocalStrings");
		hints.resources().registerResourceBundle("org.apache.coyote.http11.filters.LocalStrings");
		hints.resources().registerResourceBundle("org.apache.tomcat.util.LocalStrings");
		hints.resources().registerResourceBundle("org.apache.tomcat.util.buf.LocalStrings");
		hints.resources().registerResourceBundle("org.apache.tomcat.util.compat.LocalStrings");
		hints.resources().registerResourceBundle("org.apache.tomcat.util.descriptor.web.LocalStrings");
		hints.resources().registerResourceBundle("org.apache.tomcat.util.http.LocalStrings");
		hints.resources().registerResourceBundle("org.apache.tomcat.util.http.parser.LocalStrings");
		hints.resources().registerResourceBundle("org.apache.tomcat.util.modeler.LocalStrings");
		hints.resources().registerResourceBundle("org.apache.tomcat.util.net.LocalStrings");
		hints.resources().registerResourceBundle("org.apache.tomcat.util.scan.LocalStrings");
		hints.resources().registerResourceBundle("org.apache.tomcat.util.threads.LocalStrings");
		hints.resources().registerResourceBundle("org.apache.tomcat.websocket.LocalStrings");
		hints.resources().registerResourceBundle("org.apache.tomcat.websocket.server.LocalStrings");
		hints.resources().registerPattern("\\Qorg/apache/catalina/core/RestrictedFilters.properties\\E");
		hints.resources().registerPattern("\\Qorg/apache/catalina/core/RestrictedListeners.properties\\E");
		hints.resources().registerPattern("\\Qorg/apache/catalina/core/RestrictedServlets.properties\\E");
		hints.resources().registerPattern("\\Qorg/apache/catalina/loader/JdbcLeakPrevention.class\\E");
		hints.resources().registerPattern("\\Qorg/apache/catalina/util/CharsetMapperDefault.properties\\E");
		hints.resources().registerPattern("\\Qorg/apache/catalina/util/ServerInfo.properties\\E");
		hints.reflection().registerType(TypeReference.of("org.apache.catalina.authenticator.AuthenticatorBase"));
		hints.reflection().registerType(TypeReference.of("org.apache.catalina.connector.CoyoteAdapter"));
		hints.reflection().registerType(TypeReference.of("org.apache.catalina.core.ApplicationContextFacade"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.apache.catalina.core.ApplicationFilterChain"));
		hints.reflection().registerType(TypeReference.of("org.apache.catalina.core.StandardContextValve"));
		hints.reflection().registerType(TypeReference.of("org.apache.catalina.core.StandardEngineValve"));
		hints.reflection().registerType(TypeReference.of("org.apache.catalina.core.StandardHostValve"));
		hints.reflection().registerType(TypeReference.of("org.apache.catalina.core.StandardWrapperValve"));
		hints.reflection().registerType(TypeReference.of("org.apache.catalina.loader.JdbcLeakPrevention"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.apache.catalina.util.CharsetMapper"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.apache.catalina.valves.ErrorReportValve"));
		hints.reflection().registerType(TypeReference.of("org.apache.coyote.AbstractProcessorLight"));
		hints.reflection().registerType(TypeReference.of("org.apache.coyote.AbstractProtocol"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.apache.coyote.AbstractProtocol$ConnectionHandler"));
		hints.reflection().registerType(TypeReference.of("org.apache.coyote.http11.AbstractHttp11Protocol"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.apache.coyote.http11.Http11NioProtocol"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.apache.coyote.http11.Http11Processor"));
		hints.reflection().registerType(TypeReference.of("org.apache.tomcat.util.net.AbstractEndpoint"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.apache.tomcat.util.net.NioEndpoint"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.apache.tomcat.util.net.NioEndpoint$SocketProcessor"));
		hints.reflection().registerType(TypeReference.of("org.apache.tomcat.util.net.SocketProcessorBase"));
		hints.reflection().registerType(TypeReference.of("org.apache.tomcat.util.threads.TaskThread$WrappingRunnable"));
		hints.reflection().registerType(TypeReference.of("org.apache.tomcat.util.threads.ThreadPoolExecutor"));
		hints.reflection().registerType(TypeReference.of("org.apache.tomcat.util.threads.ThreadPoolExecutor$Worker"));
		hints.reflection().registerType(TypeReference.of("org.apache.tomcat.websocket.server.WsFilter"), MemberCategory.values());
	}
}
