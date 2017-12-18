## Tests Partie 4

Auteurs: Simon the Sorcerer & LoulouCanDance

# 1 Première Iteration: Tout doit compiler
## 1.1 Le paquetage tec
...n'est pas complet. Il manque la classe "permettant de lancer la suite des tests du développeur" (17/12/2017)
Elle comporte à cette heure 5 fichiers javas, dont deux interfaces privés, deux publiques et l'exception controlée.

La contrainte physique pour les classes appartenant au paquetage tec est la suivante:
Si une classe n'est pas déclarée explicitement public elle n'est pas visible et accessible en dehors de son paquetage.

Le but des interfaces privées est d'assurer qu'une classe qui implemente ces interfaces possede les fonctions
définies. On les met privée car les fonctions définies ne sont pas directement rélevant pour l'utilisateur
du paquetage mais servent de guide à comment implementer le fonctionnement de l'interface publique.

## 1.2 Compilons l'existant
La classe autobus depend des interfaces Bus et Transport, la classe PassagerStandard de Usager et Passager.
Puis, la classe Autobus utilise la classe PassagerStandard et vice versa.

## 1.3 Ajouter les classes au paquetage
C'est fait...

## 1.4 Compilons les nouvelles classes
Stubs de méthodes créée

## 1.5 Fin Iteration
vérifié

# 2 Deuxième Iteration: Instancation et Changement d'état
Méthodes toString implémenté pour Autobus et PassagerStandard

## 2.1 Cohérence des états après instanciation
Pour vérifier la cohérence des états après instanciation il suffit de tester un seul passager. Son état est Dehors lors de son initialisation (selon la spécification dans l'interface).

Pour vérifier le changement des états on peut revérifier son état après chaque appel de modificateur.


# 3 Troisième itération: Interaction et stockage des passagers
# 3.1 Les classes faussaires
La condition à laquelle une instance de FauxPassager peut être remplacé par une instance de PassagerStandard est la suivante:
Elle doit implementer les mêmes interfaces.

