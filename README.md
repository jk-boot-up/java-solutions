# java-solutions

Java solutions to problems
 
## How to generate this maven project

1. Generate maven project from archetype maven-archetype-quickstart from command line of your desired directory
    --- 
        * mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DgroupId=com.jk.explore -DartifactId=java-solutions
    ---
2. Delete the content from java-solutions/pom.xml:  
   ---
        <!-- FIXME change it to the project's website -->
        <url>http://www.example.com</url>
   ---
3. Add the following to java-solutions/pom.xml:
   ---
        <packaging>pom</packaging>
   ---
4. Update java version to 1.8 from 1.7

      ---
         old
                        <maven.compiler.source>1.7</maven.compiler.source>
                        <maven.compiler.target>1.7</maven.compiler.target>
      ---
         new
                        <maven.compiler.source>1.8</maven.compiler.source>
                        <maven.compiler.target>1.8</maven.compiler.target>
5. Remove junit dependencies in parent
        
      ---
          <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.11</version>
            <scope>test</scope>
          </dependency>
      ---
6. Generate sub module
      ---
          * cd java-solutions 
          * mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DgroupId=com.jk.explore -DartifactId=generic-problems-solutions
      ---
7. Update java-solutions/generic-problems-solutions/pom.xml
      --- 
            * Delete the following from :
                 <!-- FIXME change it to the project's website -->
                 <url>http://www.example.com</url>
            * Update java version to 1.8 from 1.7

                old
                           <maven.compiler.source>1.7</maven.compiler.source>
                           <maven.compiler.target>1.7</maven.compiler.target>
                new
                           <maven.compiler.source>1.8</maven.compiler.source>
                           <maven.compiler.target>1.8</maven.compiler.target>
            * Remove following dependency
                   <dependency>
                      <groupId>junit</groupId>
                      <artifactId>junit</artifactId>
                      <version>4.11</version>
                      <scope>test</scope>
                   </dependency>
      ---
8. Add the following to java-solutions/generic-problems-solutions/pom.xml
      ---
         * <packaging>jar</packaging>
      ---
9. Run the following command from java-solutions for build:
      ---
        * mvn clean install
      ---
10. Update the dependencies in any pom.xml as per the requirement like removing junit 4 and adding junit 5 dependencies etc


      