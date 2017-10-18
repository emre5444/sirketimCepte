package tr.com.github.emre.altun.sc.cucumber.stepdefs;

import tr.com.github.emre.altun.sc.SirketimcepteApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = SirketimcepteApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
