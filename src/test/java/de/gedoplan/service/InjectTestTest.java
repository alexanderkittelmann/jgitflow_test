package de.gedoplan.service;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import de.gedoplan.InjectTest;

@RunWith(Arquillian.class)
public class InjectTestTest {

  @Inject
  private Calculator calculator;
  
  @Deployment
  public static WebArchive createDeployment() {
    WebArchive webArchive = ShrinkWrap.create(WebArchive.class, "test.war")
        .addClasses(InjectTest.class, Calculator.class, InjectTestTest.class);
    Path currentRelativePath = Paths.get("");
    File webXml = new File(currentRelativePath.toAbsolutePath().toString() + "/src/main/webapp/WEB-INF/web.xml");
    webArchive.addAsWebInfResource(webXml);
    return webArchive;
  }

  @Test
  public void testDividieren()
  {
    Assert.assertEquals(calculator.dividieren(2, 1).intValue(), 1);
  }
}
