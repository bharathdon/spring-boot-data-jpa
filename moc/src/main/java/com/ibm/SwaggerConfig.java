//package com.ibm;
//
//import org.springframework.context.annotation.Configuration;
//
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//	public Docket api(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.merlinsoftech.controller"))
//                .paths(PathSelectors.any())
//                .build().apiInfo(apiEndPointInfo());
//    }
//
//    public ApiInfo apiEndPointInfo(){
//        return  new ApiInfoBuilder().title("bhartah api")
//                .contact(new springfox.documentation.service.Contact("bharath", "abc.com", "abc@gmail.com"))
//                .licenseUrl("abc.com").version("1.0").build();
//    }
//}
