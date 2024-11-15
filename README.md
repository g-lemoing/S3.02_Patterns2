# Sprint 3 - Task 2 - Patterns 2a part
## Nivell 1 - Patró Builder
Apliquem el patró Builder per recrear la elaboració d'una pizza en passos successius: tipus de massa (fina, normal, doble), mida (individual o familiar), i els ingredients que la caracteritzen. L'usuari triarà la pizza entre les proposades a la carta, la mida i el tipus de massa.
#### Interfície Builder
Definim la interfície Builder, amb els mètodes necessaris per elaborar la pizza:
reset() --> per instanciar una nova Pizza;
setName() --> per establir el seu nom;
setDough(Dough dough) --> per establir el tipus de massa;
setSize(Size size) --> per establir la seva mida;
setToppings() --> per establir la llista d'ingredients;
getPizza() --> per obtenir el resultat
#### Classes concretes de Builder
Tindrem una classe concreta de Builder per a cada mena de pizza proposada, que implementarà els mètodes de la interfície Builder, amb dos atributs: un objecte Pizza, i el nom de la pizza (static i final).
#### Classe Pizza Master
És una classe que permet elaborar qualsevol mena de pizza proposada. Només té un mètode buildPizza() que rep 3 paràmetres: el Builder de la pizza escollida, la mida i el tipus de massa.
#### Aplicació client
L'aplicació client instancia un PizzaMaster(), i el Builder() de la pizza escollida per l'usuari. Un cop triades la massa i la mida, el PizzaMaster() 'construeix' la pizza personalitzada, i el producte final s'obté mitjançant el mètode getPizza() del Builder.

## Nivell 2 - Patró Observer

## Nivell 3 - Patró Callback


## Instruccions d'instal·lació
Tecnologies Utilitzades : IDE IntelliJ Idea v 2024.2.2 (Community Edition), Java, SDK openjdk-22 Oracle OpenJDK 22.0.2
Requisits: SDK openjdk-22 Oracle OpenJDK 22.0.2.

# Instal·lació: 
1. Clonar el repositorio de Github
git clone https://github.com/g-lemoing/S3.02_Patterns2.git
2. Abrir el IDE e importar el proyecto desde el repositorio local desde File > Open.

# Ejecución:
Localizar y abrir las classes Main de cada ejercicio, y ejecutarlas con el Run.

## Contribucions:
1. Crear un fork del repositorio: 
2. Clonar el repositorio hacia el directorio local marcado por git bash
 git clone https://github.com/YOUR-USERNAME/S3.02_Patterns2
3. Crear una rama
git branch BRANCH-NAME
git checkout BRANCH-NAME
4. Realizar cambios o comentarios, y hacer un commit: git commit -m 'mensaje cambios'
5. Subir cambios a tu nueva rama: git push origin BRANCH-NAME
6. Hacer un pull request



