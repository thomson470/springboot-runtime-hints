package net.ideahut.springboot.runtime.hints;

import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.aot.hint.TypeReference;


public class FormatterRuntimeHints implements RuntimeHintsRegistrar {

	@Override
	public void registerHints(RuntimeHints hints, ClassLoader loader) {
		hints.resources().registerPattern("\\QMETA-INF/services/com.fasterxml.jackson.databind.Module\\E");
		hints.resources().registerPattern("\\QMETA-INF/services/javax.xml.stream.XMLEventFactory\\E");
		hints.resources().registerPattern("\\QMETA-INF/services/javax.xml.stream.XMLInputFactory\\E");
		hints.resources().registerPattern("\\QMETA-INF/services/javax.xml.stream.XMLOutputFactory\\E");
		hints.reflection().registerType(TypeReference.of("[Lcom.fasterxml.jackson.databind.deser.BeanDeserializerModifier"));
		hints.reflection().registerType(TypeReference.of("[Lcom.fasterxml.jackson.databind.deser.Deserializers"));
		hints.reflection().registerType(TypeReference.of("[Lcom.fasterxml.jackson.databind.deser.KeyDeserializers"));
		hints.reflection().registerType(TypeReference.of("[Lcom.fasterxml.jackson.databind.deser.ValueInstantiators"));
		hints.reflection().registerType(TypeReference.of("[Lcom.fasterxml.jackson.databind.ser.BeanSerializerModifier"));
		hints.reflection().registerType(TypeReference.of("[Lcom.fasterxml.jackson.databind.ser.Serializers"));
		hints.reflection().registerType(TypeReference.of("com.fasterxml.jackson.annotation.JacksonAnnotation"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.fasterxml.jackson.annotation.JsonFormat"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.fasterxml.jackson.annotation.JsonIgnore"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.fasterxml.jackson.core.JsonGenerator"));
		hints.reflection().registerType(TypeReference.of("com.fasterxml.jackson.core.ObjectCodec"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.fasterxml.jackson.core.TreeCodec"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.fasterxml.jackson.core.Versioned"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.fasterxml.jackson.databind.Module"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.fasterxml.jackson.databind.ObjectMapper"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.fasterxml.jackson.databind.ext.Java7SupportImpl"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.fasterxml.jackson.databind.module.SimpleModule"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.fasterxml.jackson.databind.ser.std.ClassSerializer"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.fasterxml.jackson.dataformat.cbor.CBORFactory"));
		hints.reflection().registerType(TypeReference.of("com.fasterxml.jackson.dataformat.smile.SmileFactory"));
		hints.reflection().registerType(TypeReference.of("com.fasterxml.jackson.dataformat.xml.XmlMapper"));
		hints.reflection().registerType(TypeReference.of("com.fasterxml.jackson.datatype.jdk8.Jdk8Module"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.fasterxml.jackson.datatype.jsr310.JavaTimeModule"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.fasterxml.jackson.module.paramnames.ParameterNamesModule"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.google.common.base.Optional"));
		hints.reflection().registerType(TypeReference.of("com.google.gson.Gson"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("com.google.gson.GsonBuilder"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.json.bind.Jsonb"));
		hints.reflection().registerType(TypeReference.of("jakarta.xml.bind.Binder"));
		hints.reflection().registerType(TypeReference.of("jakarta.xml.ws.WebServiceRef"));
		hints.reflection().registerType(TypeReference.of("javax.json.bind.annotation.JsonbDateFormat"));
		hints.reflection().registerType(TypeReference.of("org.xmlbeam.XBProjector"));
		hints.reflection().registerType(TypeReference.of("org.yaml.snakeyaml.Yaml"));
	}
}
