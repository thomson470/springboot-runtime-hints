package net.ideahut.springboot.runtime.hints;

import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.aot.hint.TypeReference;


public class MailRuntimeHints implements RuntimeHintsRegistrar {

	@Override
	public void registerHints(RuntimeHints hints, ClassLoader loader) {
		hints.resources().registerPattern("\\QMETA-INF/javamail.address.map\\E");
		hints.resources().registerPattern("\\QMETA-INF/javamail.charset.map\\E");
		hints.resources().registerPattern("\\QMETA-INF/javamail.default.address.map\\E");
		hints.resources().registerPattern("\\QMETA-INF/javamail.default.providers\\E");
		hints.resources().registerPattern("\\QMETA-INF/javamail.providers\\E");
		hints.resources().registerPattern("\\QMETA-INF/mailcap.default\\E");
		hints.resources().registerPattern("\\QMETA-INF/mailcap\\E");
		hints.resources().registerPattern("\\QMETA-INF/services/jakarta.activation.spi.MailcapRegistryProvider\\E");
		hints.resources().registerPattern("\\QMETA-INF/services/jakarta.activation.spi.MimeTypeRegistryProvider\\E");
		hints.resources().registerPattern("\\QMETA-INF/services/jakarta.mail.Provider\\E");
		hints.resources().registerPattern("\\Qorg/springframework/mail/javamail/mime.types\\E");
		hints.reflection().registerType(TypeReference.of("com.sun.mail.handlers.multipart_mixed"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.sun.mail.handlers.text_html"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.sun.mail.imap.IMAPProvider"));
		hints.reflection().registerType(TypeReference.of("com.sun.mail.imap.IMAPSSLProvider"));
		hints.reflection().registerType(TypeReference.of("com.sun.mail.pop3.POP3Provider"));
		hints.reflection().registerType(TypeReference.of("com.sun.mail.pop3.POP3SSLProvider"));
		hints.reflection().registerType(TypeReference.of("com.sun.mail.smtp.SMTPProvider"));
		hints.reflection().registerType(TypeReference.of("com.sun.mail.smtp.SMTPSSLProvider"));
		hints.reflection().registerType(TypeReference.of("com.sun.mail.smtp.SMTPTransport"), MemberCategory.values());
	}
}
