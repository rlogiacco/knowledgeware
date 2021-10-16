package org.agileware.kb.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import org.agileware.kb.KnowledgewareApp;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = KnowledgewareApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
