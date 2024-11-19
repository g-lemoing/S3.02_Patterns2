# Sprint 3 - Task 2 - Patterns 2a part
## Nivell 1 - Patró Builder
Apliquem el patró Builder per recrear la elaboració d'una pizza en passos successius: tipus de massa (fina, normal, doble), mida (individual o familiar), i els ingredients que la caracteritzen. L'usuari triarà la pizza entre les proposades a la carta, la mida i el tipus de massa.
#### Interfície Builder
Definim la interfície Builder, amb els mètodes necessaris per elaborar la pizza:<br/>
reset() --> per instanciar una nova Pizza;<br/>
setName() --> per establir el seu nom;<br/>
setDough(Dough dough) --> per establir el tipus de massa;<br/>
setSize(Size size) --> per establir la seva mida;<br/>
setToppings() --> per establir la llista d'ingredients;<br/>
getPizza() --> per obtenir el resultat<br/>
#### Classes concretes de Builder
Tindrem una classe concreta de Builder per a cada mena de pizza proposada, que implementarà els mètodes de la interfície Builder, amb dos atributs: un objecte Pizza, i el nom de la pizza (static i final).
#### Classe Pizza Master
És una classe que permet elaborar qualsevol mena de pizza proposada. Només té un mètode buildPizza() que rep 3 paràmetres: el Builder de la pizza escollida, la mida i el tipus de massa.
#### Aplicació client
L'aplicació client instancia un PizzaMaster(), i el Builder() de la pizza escollida per l'usuari. Un cop triades la massa i la mida, el PizzaMaster() 'construeix' la pizza personalitzada, i el producte final s'obté mitjançant el mètode getPizza() del Builder.

## Nivell 2 - Patró Observer
El patró Observer permet notificar a una llista de observers o subscribers un esdeveniment o canvi d'estat d'un Observable. En aquest exercici, l'Observable és un agent de borsa i els observers agències de borsa receptores.
#### Interfície Agency
Definim una interfície Agency amb un únic mètode update(), que és el que invocarà l'agent de borsa per notificar un canvi a les agències concretes (classe StockExchangeAgencgy), que implementaran aquest mètode.
#### Observable
La classe de l'Observable, StockExchangeAgent, té com a atributs una llista de subscriptors i un esdeveniment. També conté dos mètodes per afegir i treure subscriptors, ja que només les agències de borsa que estiguin subscrites rebran aquests avisos, i evidentment un mètode per notificar un esdeveniment.
#### Client
La classe Main instancia l'Observable, vàries agències de borsa i les dona d'alta com a subscriptors.
Establim l'esdeveniment de què la borsa està pujant, i comprovem que cada agència rep la notificació.
Establim l'esdeveniment de què la borsa està baixant, i comprovem que cada agència rep la notificació.
Donem de baixa una de les agències, establim un nou esdeveniment, i comprovem que només les agències subscrites reben la notificació.

## Nivell 3 - Patró Callback
Implementem el patró Callback per simular la validació d'un pagament en una sabateria per una passarel·la de pagament.
#### Interfície Callback
Declarem un únic mètode NotifyShop(), per notificar a la botiga quan la validació hagi terminat. Contindrà el pagament referit i el resultat de la transacció.
#### Classe que invoca (botiga)
Té com a atribut la passarel·la de pagament i implementa el mètode de la interfície: indica el resultat de la transacció i en cas de ser exitosa, retorna un número de referència de la transacció. Conté també un mètode per cridar al mètode de validació de la passarel·la.
#### Classe invocada (passarel·la)
La classe invocada té com a atribut un objecte Callback i un mètode que aquí simula una validació de pagament. Una funció boolean random determina si la transacció queda validada, i en cas de que sí, assigna un número de referencia a la mateixa. Crida al mètode notifyShop() del Callback, passant per paràmetre tant el pagament de referència com el resultat.
#### Client
La classe client instancia la classe de la botiga i demana a l'usuari l'import i el mètode de pagament a utilitzar. Invoca llavors el mètode de validació de la botiga, que desencadena tot el procés de validació.

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



