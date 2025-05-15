prog-5-ussd

Objectif : Démarrer un menu USSD basique en Java, en appliquant des bonnes pratiques de développement (convention de nommage, linter Checkstyle, CI avec GitHub Actions).

1. Convention de nommage

Classes : PascalCase (ex. UssdMenu)

Méthodes et variables : camelCase (ex. displayMenu, userInput)

Packages : com.example.ussd


2. Linter (Checkstyle)

Le projet utilise Checkstyle selon le standard Google Java Style. La configuration se trouve dans checkstyle.xml.

3. CI : GitHub Actions

Le workflow ci-lint.yml exécute :

Maven (mvn checkstyle:check) à chaque push.