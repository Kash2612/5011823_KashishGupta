package com.bookstore.config;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MetricsConfig {

    @Bean
    public CustomMetrics customMetrics(MeterRegistry meterRegistry) {
        return new CustomMetrics(meterRegistry);
    }

    public static class CustomMetrics {
        public CustomMetrics(MeterRegistry meterRegistry) {
            meterRegistry.gauge("custom_metric_example", 42);
        }
    }
}
