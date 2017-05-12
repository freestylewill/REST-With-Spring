package com.baeldung.um.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.actuate.autoconfigure.MetricRepositoryAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.MetricsDropwizardAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.PublicMetricsAutoConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.baeldung.um.spring.UmContextConfig;
import com.baeldung.um.spring.UmMetricConfig;
import com.baeldung.um.spring.UmPersistenceJpaConfig;
import com.baeldung.um.spring.UmServiceConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { // @formatter:off
        UmContextConfig.class, 
        UmPersistenceJpaConfig.class, 
        UmServiceConfig.class, 
        UmMetricConfig.class,
        MetricRepositoryAutoConfiguration.class, 
        PublicMetricsAutoConfiguration.class,
        MetricsDropwizardAutoConfiguration.class
    }, loader = AnnotationConfigContextLoader.class)// @formatter:off
public class ServiceSpringIntegrationTest {

    @Test
    public final void whenContextIsBootstrapped_thenOk() {
        //
    }

}