package net.ideahut.springboot.runtime.hints;

import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.aot.hint.TypeReference;


public class ValidationRuntimeHints implements RuntimeHintsRegistrar {

	@Override
	public void registerHints(RuntimeHints hints, ClassLoader loader) {
		hints.resources().registerPattern("\\QMETA-INF/services/jakarta.validation.ConstraintValidator\\E");
		hints.resources().registerPattern("\\QMETA-INF/services/jakarta.validation.spi.ValidationProvider\\E");
		hints.resources().registerPattern("\\QMETA-INF/services/jakarta.validation.valueextraction.ValueExtractor\\E");
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.AssertFalse"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.AssertFalse.List"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.AssertTrue"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.AssertTrue.List"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.DecimalMax"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.DecimalMax.List"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.DecimalMin"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.DecimalMin.List"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.Digits"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.Digits.List"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.Email"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.Email.List"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.Future"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.Future.List"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.FutureOrPresent"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.FutureOrPresent.List"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.Max"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.Max.List"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.Min"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.Min.List"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.Negative"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.Negative.List"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.NegativeOrZero"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.NegativeOrZero.List"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.NotBlank"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.NotBlank.List"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.NotEmpty"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.NotEmpty.List"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.NotNull"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.NotNull.List"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.Null"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.Null.List"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.Past"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.Past.List"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.PastOrPresent"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.PastOrPresent.List"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.Pattern"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.Pattern.Flag"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.Pattern.List"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.Positive"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.Positive.List"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.PositiveOrZero"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.PositiveOrZero.List"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.Size"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.constraints.Size.List"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.ConstraintValidator"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.ConstraintViolation"));
		hints.reflection().registerType(TypeReference.of("jakarta.validation.Valid"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.Validator"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.ValidatorFactory"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.validation.bootstrap.GenericBootstrap"));
	}
}
