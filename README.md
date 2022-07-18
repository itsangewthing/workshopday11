#workshop 11 Instructions

### Maven commands

1. mvnw
2. mvn compile
3. mvnw package
4. mvnw clean package
5. mvnw clean 
6. mvnw clean package spring-boot:run
7. mvnw spring-boot:run
8. mvnw spring-boot:run -Dspring-boot.run.arguments="--port=8080"


### git commands

    git init
    git remote add origin https://github.com/itsangewthing/projectname.git

    git add *
    git status
    git commit -m "<commit message>"
    git push -u origin main 
    git pull <remote> <local>

    git branch -a (all)

    -u (implies to commit all the uncommited )

    git checkout -b develop master / main
    git merge master/main branch 

    ----
    
    git checkout main/master

    git merge develop (merge changes in develop branch into master branch)

    // makes changes in master and need to synchronize this change to develop branch 

    // assume changes has already been checked into master branch 

    git checkout develop
    git merge master (merge changes done in master branch into develop branch)
    git push -u origin develop 