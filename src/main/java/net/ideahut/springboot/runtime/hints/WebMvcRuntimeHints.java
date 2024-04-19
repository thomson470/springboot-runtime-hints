package net.ideahut.springboot.runtime.hints;

import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.aot.hint.TypeReference;


public class WebMvcRuntimeHints implements RuntimeHintsRegistrar {

	@Override
	public void registerHints(RuntimeHints hints, ClassLoader loader) {
		hints.resources().registerResourceBundle("jakarta.servlet.LocalStrings");
		hints.resources().registerResourceBundle("jakarta.servlet.http.LocalStrings");
		hints.resources().registerPattern("\\QMETA-INF/services/jakarta.el.ExpressionFactory\\E");
		hints.proxies().registerJdkProxy(
			TypeReference.of("org.springframework.web.bind.annotation.ControllerAdvice")
		);
		hints.proxies().registerJdkProxy(
			TypeReference.of("org.springframework.web.bind.annotation.ModelAttribute")
		);
		hints.proxies().registerJdkProxy(
			TypeReference.of("org.springframework.web.bind.annotation.PathVariable")
		);
		hints.proxies().registerJdkProxy(
			TypeReference.of("org.springframework.web.bind.annotation.RequestMapping")
		);
		hints.proxies().registerJdkProxy(
			TypeReference.of("org.springframework.web.bind.annotation.RequestParam")
		);
		hints.proxies().registerJdkProxy(
			TypeReference.of("org.springframework.web.bind.annotation.ResponseStatus")
		);
		hints.reflection().registerType(TypeReference.of("[Lorg.springframework.web.bind.annotation.RequestMethod"));
		hints.reflection().registerType(TypeReference.of("jakarta.faces.context.FacesContext"));
		hints.reflection().registerType(TypeReference.of("jakarta.servlet.Filter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.servlet.GenericFilter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.servlet.GenericServlet"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.servlet.MultipartConfigElement"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.servlet.Servlet"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.servlet.ServletConfig"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.servlet.ServletContext"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.servlet.http.HttpServlet"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("jakarta.servlet.http.PushBuilder"));
		hints.reflection().registerType(TypeReference.of("org.apache.jasper.servlet.JspServlet"));
		hints.reflection().registerType(TypeReference.of("org.springframework.format.FormatterRegistry"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.format.support.DefaultFormattingConversionService"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.format.support.FormattingConversionService"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.hateoas.server.mvc.TypeConstrainedMappingJackson2HttpMessageConverter"));
		hints.reflection().registerType(TypeReference.of("org.springframework.http.converter.AbstractGenericHttpMessageConverter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.http.converter.AbstractHttpMessageConverter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.http.converter.GenericHttpMessageConverter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.http.converter.HttpMessageConverter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.http.converter.StringHttpMessageConverter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.http.converter.json.GsonHttpMessageConverter"));
		hints.reflection().registerType(TypeReference.of("org.springframework.http.converter.json.Jackson2ObjectMapperBuilder"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.http.converter.json.MappingJackson2HttpMessageConverter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.WebApplicationInitializer"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.accept.ContentNegotiationManager"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.accept.ContentNegotiationStrategy"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.accept.MediaTypeFileExtensionResolver"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.bind.annotation.ControllerAdvice"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.bind.annotation.DeleteMapping"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.bind.annotation.ExceptionHandler"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.bind.annotation.GetMapping"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.bind.annotation.Mapping"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.bind.annotation.ModelAttribute"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.bind.annotation.PathVariable"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.bind.annotation.PostMapping"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.bind.annotation.PutMapping"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.bind.annotation.RequestBody"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.bind.annotation.RequestMapping"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.bind.annotation.RequestParam"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.bind.annotation.ResponseBody"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.bind.annotation.ResponseStatus"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.bind.annotation.RestController"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.client.DefaultRestClientBuilder"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.client.RestClient$Builder"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.context.ConfigurableWebApplicationContext"));
		hints.reflection().registerType(TypeReference.of("org.springframework.web.context.ServletContextAware"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.context.request.RequestContextHolder"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.context.request.ServletRequestAttributes"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.context.support.WebApplicationObjectSupport"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.cors.CorsConfigurationSource"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.filter.CharacterEncodingFilter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.filter.GenericFilterBean"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.filter.OncePerRequestFilter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.method.annotation.ExceptionHandlerMethodResolver"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.method.support.CompositeUriComponentsContributor"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.method.support.HandlerMethodArgumentResolver"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.method.support.InvocableHandlerMethod"));
		hints.reflection().registerType(TypeReference.of("org.springframework.web.method.support.UriComponentsContributor"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.multipart.MultipartFile"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.multipart.MultipartResolver"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.multipart.support.StandardMultipartHttpServletRequest$StandardMultipartFile"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.multipart.support.StandardServletMultipartResolver"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.reactive.DispatcherHandler"));
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.DispatcherServlet"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.FlashMapManager"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.FrameworkServlet"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.HandlerAdapter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.HandlerExceptionResolver"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.HandlerInterceptor"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.HandlerMapping"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.HttpServletBean"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.LocaleResolver"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.RequestToViewNameTranslator"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.ThemeResolver"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.View"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.ViewResolver"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.config.annotation.EnableWebMvc"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.config.annotation.WebMvcConfigurer"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.function.support.HandlerFunctionAdapter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.function.support.RouterFunctionMapping"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.handler.AbstractDetectingUrlHandlerMapping"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.handler.AbstractHandlerMapping"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.handler.AbstractHandlerMethodMapping"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.handler.AbstractHandlerMethodMapping$EmptyHandler"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.handler.AbstractUrlHandlerMapping"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.handler.HandlerExceptionResolverComposite"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.handler.HandlerMappingIntrospector"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.handler.MatchableHandlerMapping"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.handler.SimpleUrlHandlerMapping"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.i18n.AbstractLocaleResolver"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.mvc.HttpRequestHandlerAdapter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.mvc.SimpleControllerHandlerAdapter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.mvc.method.RequestMappingInfoHandlerMapping"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.mvc.method.RequestMappingInfoHandlerMapping$HttpOptionsHandler"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod"));
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.resource.ResourceUrlProvider"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.support.AbstractFlashMapManager"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.support.SessionFlashMapManager"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.support.WebContentGenerator"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.theme.AbstractThemeResolver"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.theme.FixedThemeResolver"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.view.BeanNameViewResolver"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.view.DefaultRequestToViewNameTranslator"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.servlet.view.ViewResolverComposite"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.util.UrlPathHelper"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.springframework.web.util.pattern.PathPatternParser"), MemberCategory.values());
		hints.reflection().registerType(TypeReference.of("org.webjars.WebJarAssetLocator"));
	}
}
