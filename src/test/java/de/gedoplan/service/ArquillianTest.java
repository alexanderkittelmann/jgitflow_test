//package de.gedoplan.service;
//
//import java.io.File;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.UUID;
//
//import javax.inject.Inject;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.transaction.HeuristicMixedException;
//import javax.transaction.HeuristicRollbackException;
//import javax.transaction.NotSupportedException;
//import javax.transaction.RollbackException;
//import javax.transaction.SystemException;
//import javax.transaction.UserTransaction;
//
//import org.jboss.arquillian.container.test.api.Deployment;
//import org.jboss.arquillian.junit.Arquillian;
//import org.jboss.shrinkwrap.api.ShrinkWrap;
//import org.jboss.shrinkwrap.api.spec.WebArchive;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
//import de.gedoplan.domain.Person;
//
//@RunWith(Arquillian.class)
//public class ArquillianTest {
//  
//  private static final String deploymentName = UUID.randomUUID().toString();
//
//  @Inject
//  private Calculator calculator;
//  
//  @PersistenceContext(unitName="test")
//  EntityManager entityManager;
//  
//  @Inject
//  UserTransaction userTransaction;
//  
//  @Deployment
//  public static WebArchive createDeployment() {
//    WebArchive webArchive = ShrinkWrap.create(WebArchive.class, deploymentName+".war")
//        .addClasses(Calculator.class, ArquillianTest.class, Person.class);
//    Path currentRelativePath = Paths.get("");
//    File webXml = new File(currentRelativePath.toAbsolutePath().toString() + "/src/main/webapp/WEB-INF/web.xml");
//    webArchive.addAsWebInfResource(webXml);
//    File persistenceXml = new File(currentRelativePath.toAbsolutePath().toString() + "/src/main/resources/META-INF/persistence.xml");
//    webArchive.addAsResource(persistenceXml, "META-INF/persistence.xml");
//    System.out.println(webArchive.getContent().toString());
//    return webArchive;
//  }
//
//  @Test
//  public void testDividieren()
//  {    
//    Assert.assertEquals(calculator.dividieren(2, 1).intValue(), 2);
//  }
//  
//  @Test
//  public void testPersist() 
//  {
//    Person person = new Person();
//    person.setName("Meier");
//    person.setVorname("Hugo");
//    
//    try {
//      userTransaction.begin();
//      entityManager.persist(person);
//      userTransaction.commit();
//    }
//    catch (NotSupportedException e) {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    }
//    catch (SystemException e) {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    }
//    catch (SecurityException e) {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    }
//    catch (IllegalStateException e) {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    }
//    catch (RollbackException e) {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    }
//    catch (HeuristicMixedException e) {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    }
//    catch (HeuristicRollbackException e) {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    }
//    
//    
//    System.out.println("Hugo_ID: " + person.getId());
//    
//    Assert.assertEquals(entityManager.find(Person.class, person.getId()).getVorname(), "Hugo");
//  }
//}
