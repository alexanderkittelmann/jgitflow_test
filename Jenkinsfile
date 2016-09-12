#!/usr/bin/env groovy

node {
   // Mark the code checkout 'stage'....
   stage 'Checkout'

   // Checkout code from repository
   checkout scm

   // Get the maven tool.
   // ** NOTE: This 'M3' maven tool must be configured
   // **       in the global configuration.
   def mvnHome = tool 'M3'

   stage 'Build'
   sh "${mvnHome}/bin/mvn clean install"
   
   // stage 'Unittests'
   // sh "${mvnHome}/bin/mvn -P unittests"     
   
   // stage 'Integrationstests'
   // sh "${mvnHome}/bin/mvn -P integrationstests"
   
   // stage 'Kapazitaetstests'
   // sh "${mvnHome}/bin/mvn -P kapaziaetstests"
   
   // stage 'Manuelletests'
   // sh "${mvnHome}/bin/mvn -P manuelletests wildfly:deploy"
   
   if ("${env.BRANCH_NAME}".contains('feature')) {
    println "feature-Branch"
   }
   
   input message: "Does Release-Version look good?"
   
   // stage 'Deploy'
   // sh "${mvnHome}/bin/mvn wildfly:deploy"
}