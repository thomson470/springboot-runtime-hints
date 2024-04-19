package net.ideahut.springboot.runtime.hints;

import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.aot.hint.TypeReference;


public class ByteBuddyRuntimeHints implements RuntimeHintsRegistrar {

	@Override
	public void registerHints(RuntimeHints hints, ClassLoader loader) {
		hints.proxies().registerJdkProxy(
			TypeReference.of("net.bytebuddy.description.method.MethodDescription$InDefinedShape$AbstractBase$Executable")
		);
		hints.proxies().registerJdkProxy(
			TypeReference.of("net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$Parameter")
		);
		hints.proxies().registerJdkProxy(
			TypeReference.of("net.bytebuddy.description.method.ParameterList$ForLoadedExecutable$Executable")
		);
		hints.proxies().registerJdkProxy(
			TypeReference.of("net.bytebuddy.description.type.TypeDefinition$Sort$AnnotatedType")
		);
		hints.proxies().registerJdkProxy(
			TypeReference.of("net.bytebuddy.description.type.TypeDescription")
		);
		hints.proxies().registerJdkProxy(
			TypeReference.of("net.bytebuddy.description.type.TypeDescription$ForLoadedType$Dispatcher")
		);
		hints.proxies().registerJdkProxy(
			TypeReference.of("net.bytebuddy.description.type.TypeDescription$Generic")
		);
		hints.proxies().registerJdkProxy(
			TypeReference.of("net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedExecutableExceptionType$Dispatcher")
		);
		hints.proxies().registerJdkProxy(
			TypeReference.of("net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedExecutableParameterType$Dispatcher")
		);
		hints.proxies().registerJdkProxy(
			TypeReference.of("net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedMethodReturnType$Dispatcher")
		);
		hints.proxies().registerJdkProxy(
			TypeReference.of("net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForComponentType$AnnotatedParameterizedType")
		);
		hints.proxies().registerJdkProxy(
			TypeReference.of("net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForTypeArgument$AnnotatedParameterizedType")
		);
		hints.proxies().registerJdkProxy(
			TypeReference.of("net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForTypeVariableBoundType$AnnotatedTypeVariable")
		);
		hints.proxies().registerJdkProxy(
			TypeReference.of("net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForTypeVariableBoundType$OfFormalTypeVariable$FormalTypeVariable")
		);
		hints.proxies().registerJdkProxy(
			TypeReference.of("net.bytebuddy.dynamic.loading.ClassInjector$UsingLookup$MethodHandles")
		);
		hints.proxies().registerJdkProxy(
			TypeReference.of("net.bytebuddy.dynamic.loading.ClassInjector$UsingLookup$MethodHandles$Lookup")
		);
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.description.method.MethodDescription$InDefinedShape$AbstractBase$Executable"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$Parameter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.description.method.ParameterList$ForLoadedExecutable$Executable"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.description.type.TypeDefinition$Sort$AnnotatedType"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.description.type.TypeDescription$ForLoadedType$Dispatcher"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedExecutableExceptionType$Dispatcher"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedExecutableParameterType$Dispatcher"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedMethodReturnType$Dispatcher"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForComponentType$AnnotatedParameterizedType"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForTypeArgument$AnnotatedParameterizedType"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForTypeVariableBoundType$AnnotatedTypeVariable"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$ForTypeVariableBoundType$OfFormalTypeVariable$FormalTypeVariable"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.dynamic.loading.ClassInjector$UsingLookup$MethodHandles"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.dynamic.loading.ClassInjector$UsingLookup$MethodHandles$Lookup"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.implementation.bind.annotation.AllArguments"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.implementation.bind.annotation.Argument"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.implementation.bind.annotation.BindingPriority"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.implementation.bind.annotation.Default"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.implementation.bind.annotation.DefaultCall"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.implementation.bind.annotation.DefaultCallHandle"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.implementation.bind.annotation.DefaultMethod"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.implementation.bind.annotation.FieldGetterHandle"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.implementation.bind.annotation.FieldSetterHandle"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.implementation.bind.annotation.FieldValue"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.implementation.bind.annotation.Origin"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.implementation.bind.annotation.StubValue"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.implementation.bind.annotation.Super"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.implementation.bind.annotation.SuperCall"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.implementation.bind.annotation.SuperCallHandle"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.implementation.bind.annotation.SuperMethod"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.implementation.bind.annotation.SuperMethodHandle"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.implementation.bind.annotation.This"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.utility.Invoker"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("net.bytebuddy.utility.Invoker$Dispatcher"), MemberCategory.values());
	}
}
