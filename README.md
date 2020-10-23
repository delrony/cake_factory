# An E-commerce Web Application with Spring Boot

## Project setup


1. Get the source code of the project from Github.
2. Open the project in Visual Studio (VS Code). "Spring Boot Extension Pack" extension is required.
3. To start the postgres server, create a .env file with DB name and credentials. Here is an example:
```
POSTGRES_USER=db_cake
POSTGRES_PASSWORD=easypass
POSTGRES_DB=cake_factory
```

4. Start the postgres docker container
```
docker-compose up -d
```

5. In VS Code open the .vscode/lunch.json file. Provide the DB credentials as environment variable. For example:

```
{
    "configurations": [
        {
            "type": "java",
            "name": "Spring Boot-CakeFactoryApplication<cake_factory>",
            "request": "launch",
            "cwd": "${workspaceFolder}",
            "console": "internalConsole",
            "mainClass": "com.delrony.cake_factory.CakeFactoryApplication",
            "projectName": "cake_factory",
            "args": "",
            "env": {
                "SPRING_DATASOURCE_USERNAME": "db_cake",
                "SPRING_DATASOURCE_PASSWORD": "easypass"
            }
        }
    ]
}

```

6. Start the application from VS Code.