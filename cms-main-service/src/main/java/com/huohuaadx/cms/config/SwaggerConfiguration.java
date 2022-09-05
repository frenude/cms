package com.huohuaadx.cms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.service.Contact;

/**
 * @author: Frenude
 * @mail: frenude@gmail.com
 * @date: created in 07 07,2021
 * @desc: //todo
 */
@Configuration
@EnableOpenApi
public class SwaggerConfiguration {
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(new ApiInfoBuilder()
                        .title("API Documentation!")
                        .description("Content Manage System")
                        .termsOfServiceUrl("http://git.huohuadsp.com/adx/cms")
                        .contact(new Contact("Frenude", "http://git.huohuadsp.com/adx/cms", "frenude@gmail.com"))
                        .version("1.0")
                        .build())
                .groupName("CMS")
                .select()
                //加了ApiOperation注解的方法，才生成接口文档
                // .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                //特定包下的类，才生成接口文档
                .apis(RequestHandlerSelectors.basePackage("com.huohuaadx.cms.controller"))
                .paths(PathSelectors.any())
                .build();
    }
}