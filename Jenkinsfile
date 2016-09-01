node {
   // Mark the code checkout 'stage'....
   stage 'Checkout'
 
   // Checkout code from repository
   checkout scm
 
   // Get the maven tool.
   // ** NOTE: This 'M3' maven tool must be configured
   // **       in the global configuration.
   def mvnHome = tool 'M3'
 
   stage 'Unit Tests'
   sh "${mvnHome}/bin/mvn test -P unittests"
   
   stage "Integration Tests"
   sh "${mvnHome}/bin/mvn test -P integrationstests"
   
   // Mark the code build 'stage'....
   stage 'Build'
   // Run the maven build
   sh "${mvnHome}/bin/mvn clean install"   
   
   stage 'Deploy'
   sh "${mvnHome}/bin/mvn wildfly:deploy"
}