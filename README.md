# vttp...

# Git commands

In project root folder <br/>
1. git init

Add files to staging <br/>
2. git add *

Commit files to local repo <br/>
3. git commit -m “initial commit”

Change branch name <br/>
4. git branch -m main

Link up remote repo to local repo <br/>
5. git remote add origin <repo url>

Push code up from local repo to remote repo <br/>
6. git push -u origin main

# Maven Compiler comand

In project root folder <br/>
./mvnw clean <br/>
mvnw.cmd clean <br/>

package the compiled bytecode classes into jar/war file<br />
./mvnw package <br />
mvnw.cmd package <br/>

delete target, redownload dependencies, recompile to class files, package to jar/war<br />
./mvnw clean package <br/>
mvnw.cmd clean package <br/>

run the application in embedded localhost server <br /> run application in embedded localhost server (test mode) (runningthe code w/o any args)
./mvnw spring-boot:run
mvnw.cmd spring-boot:run

to run and trace the log level
./mvnw spring-boot:run -Dspring-boot.run.arguments="--port=4000 --logLevel=TRACE"

# Railway
1. railway login --browserless
2. railway link // need to create project on railway first
3. railway up
--> execute in command promt in root folder.
