package net.ideahut.springboot.runtime.hints;

import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.aot.hint.TypeReference;


public class SecurityRuntimeHints implements RuntimeHintsRegistrar {

	@Override
	public void registerHints(RuntimeHints hints, ClassLoader loader) {
		hints.reflection().registerType(TypeReference.of("com.sun.crypto.provider.AESCipher$General"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.sun.crypto.provider.ARCFOURCipher"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.sun.crypto.provider.ChaCha20Cipher$ChaCha20Poly1305"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.sun.crypto.provider.DESCipher"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.sun.crypto.provider.DESedeCipher"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.sun.crypto.provider.DHParameters"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.sun.crypto.provider.GaloisCounterMode$AESGCM"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.sun.crypto.provider.TlsKeyMaterialGenerator"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.sun.crypto.provider.TlsMasterSecretGenerator"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.sun.crypto.provider.TlsPrfGenerator$V12"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("java.security.AccessController"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("java.security.AlgorithmParametersSpi"));
		hints.reflection().registerType(TypeReference.of("java.security.AllPermission"));
		hints.reflection().registerType(TypeReference.of("java.security.KeyStoreSpi"));
		hints.reflection().registerType(TypeReference.of("java.security.SecureClassLoader"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("java.security.SecureRandomParameters"));
		hints.reflection().registerType(TypeReference.of("java.security.SecurityPermission"));
		hints.reflection().registerType(TypeReference.of("java.security.interfaces.ECPrivateKey"));
		hints.reflection().registerType(TypeReference.of("java.security.interfaces.ECPublicKey"));
		hints.reflection().registerType(TypeReference.of("javax.net.SocketFactory"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("javax.net.ssl.SSLHandshakeException"));
		hints.reflection().registerType(TypeReference.of("javax.security.auth.x500.X500Principal"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.pkcs12.PKCS12KeyStore"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.pkcs12.PKCS12KeyStore$DualFormatPKCS12"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.provider.DSA$SHA224withDSA"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.provider.DSA$SHA256withDSA"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.provider.JavaKeyStore$JKS"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.provider.MD5"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.provider.NativePRNG"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.provider.SHA"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.provider.SHA2$SHA224"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.provider.SHA2$SHA256"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.provider.SHA5$SHA384"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.provider.SHA5$SHA512"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.provider.X509Factory"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.rsa.PSSParameters"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.rsa.RSAKeyFactory$Legacy"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.rsa.RSAPSSSignature"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.rsa.RSASignature$SHA224withRSA"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.ssl.SSLContextImpl$TLSContext"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.ssl.TrustManagerFactoryImpl$PKIXFactory"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.x509.AuthorityInfoAccessExtension"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.x509.AuthorityKeyIdentifierExtension"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.x509.BasicConstraintsExtension"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.x509.CRLDistributionPointsExtension"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.x509.CertificatePoliciesExtension"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.x509.ExtendedKeyUsageExtension"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.x509.IssuerAlternativeNameExtension"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.x509.KeyUsageExtension"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.x509.NetscapeCertTypeExtension"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.x509.PrivateKeyUsageExtension"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.x509.SubjectAlternativeNameExtension"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("sun.security.x509.SubjectKeyIdentifierExtension"), MemberCategory.values());
	}
}
