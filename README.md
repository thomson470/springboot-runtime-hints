# Springboot RuntimeHints <img height="32" src="https://avatars.githubusercontent.com/u/317776?s=48&v=4" alt="Spring"> <img height="32" src="https://raw.githubusercontent.com/ideahut-apps-team/ideahut-springboot-docs/main/docs/images/logo.png" alt="Ideahut">

- Kumpulan RuntimeHints yang diperlukan untuk AOT (Ahead of Time Optimizations) di Spring Native.
- Bisa dicoba di [Springboot 3x Native](https://github.com/thomson470/ideahut-springboot-3x-template-native).

### Cara 1:
``` java
@Configuration
@ImportRuntimeHints(
	RuntimeHintsConfig.Registrar.class
)
class RuntimeHintsConfig 
	static class Registrar implements RuntimeHintsRegistrar {
		@Override
		public void registerHints(RuntimeHints hints, ClassLoader loader) {
			new SpringRuntimeHints().registerHints(hints, loader);
			new TomcatRuntimeHints().registerHints(hints, loader);
			new WebMvcRuntimeHints().registerHints(hints, loader);
			new IdeahutRuntimeHints().registerHints(hints, loader);
			// Tambah di sini untuk definisi proxies, resources, bundles, & reflections yang diperlukan aplikasi.
		}
	}
}
```

### Cara 2:
``` java
@Configuration
@ImportRuntimeHints(
	SpringRuntimeHints.class,
	TomcatRuntimeHints.class,
	WebMvcRuntimeHints.class,
	IdeahutRuntimeHints.class
)
class RuntimeHintsConfig {
	
}
```

## Referensi
- [AOT](https://docs.spring.io/spring-framework/reference/core/aot.html)
- [GraalVM](https://docs.spring.io/spring-boot/docs/current/reference/html/native-image.html)


