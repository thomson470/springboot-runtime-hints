package net.ideahut.springboot.runtime.hints;

import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.aot.hint.TypeReference;


public class ApacheCommonHttpClientRuntimeHints implements RuntimeHintsRegistrar {

	@Override
	public void registerHints(RuntimeHints hints, ClassLoader loader) {
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.ChunkedInputStream"));
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.HeaderElement"));
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.HttpClient"));
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.HttpConnection"));
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.HttpMethodBase"));
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.HttpMethodDirector"));
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.HttpParser"));
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.HttpState"));
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.MultiThreadedHttpConnectionManager"));
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.SimpleHttpConnectionManager"));
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.auth.AuthChallengeProcessor"));
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.contrib.ssl.EasySSLProtocolSocketFactory"));
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.cookie.CookiePolicy"));
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.cookie.CookieSpec"));
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.cookie.CookieSpecBase"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.cookie.IgnoreCookiesSpec"));
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.cookie.NetscapeDraftSpec"));
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.cookie.RFC2109Spec"));
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.cookie.RFC2965Spec"));
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.methods.DeleteMethod"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.methods.EntityEnclosingMethod"));
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.methods.ExpectContinueMethod"));
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.methods.GetMethod"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.methods.HeadMethod"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.methods.OptionsMethod"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.methods.PostMethod"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.methods.PutMethod"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.params.DefaultHttpParams"));
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.params.HttpMethodParams"));
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.util.EncodingUtil"));
		hints.reflection().registerType(TypeReference.of("org.apache.commons.httpclient.util.IdleConnectionHandler"));
	}
}
