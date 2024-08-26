package com.bookstore.config;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;

@Configuration
public class XmlConfig {

    @Bean
    public MappingJackson2XmlHttpMessageConverter xmlHttpMessageConverter() {
        MappingJackson2XmlHttpMessageConverter xmlConverter = new MappingJackson2XmlHttpMessageConverter();
        xmlConverter.setXmlMapper(new XmlMapper());
        return xmlConverter;
    }
}
