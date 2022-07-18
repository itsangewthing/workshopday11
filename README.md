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

    deploy to heroku from master branch ALWAYS
    1. git branch
    2. git checkout master
    3. heroku login
    4. heroku apps:create
    5. git remote -v
    6. git push -u heroku master