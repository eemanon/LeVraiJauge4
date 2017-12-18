## Tests Partie 4

Auteurs: Simon the Sorcerer & LoulouCanDance

# 1 Premi�re Iteration: Tout doit compiler
## 1.1 Le paquetage tec
...n'est pas complet. Il manque la classe "permettant de lancer la suite des tests du d�veloppeur" (17/12/2017)
Elle comporte � cette heure 5 fichiers javas, dont deux interfaces priv�s, deux publiques et l'exception control�e.

La contrainte physique pour les classes appartenant au paquetage tec est la suivante:
Si une classe n'est pas d�clar�e explicitement public elle n'est pas visible et accessible en dehors de son paquetage.

Le but des interfaces priv�es est d'assurer qu'une classe qui implemente ces interfaces possede les fonctions
d�finies. On les met priv�e car les fonctions d�finies ne sont pas directement r�levant pour l'utilisateur
du paquetage mais servent de guide � comment implementer le fonctionnement de l'interface publique.

## 1.2 Compilons l'existant
La classe autobus depend des interfaces Bus et Transport, la classe PassagerStandard de Usager et Passager.
Puis, la classe Autobus utilise la classe PassagerStandard et vice versa.

## 1.3 Ajouter les classes au paquetage
C'est fait...

## 1.4 Compilons les nouvelles classes
Stubs de m�thodes cr��e

## 1.5 Fin Iteration
v�rifi�

# 2 Deuxi�me Iteration: Instancation et Changement d'�tat
M�thodes toString impl�ment� pour Autobus et PassagerStandard

## 2.1 Coh�rence des �tats apr�s instanciation
Pour v�rifier la coh�rence des �tats apr�s instanciation il suffit de tester un seul passager. Son �tat est Dehors lors de son initialisation (selon la sp�cification dans l'interface).

Pour v�rifier le changement des �tats on peut rev�rifier son �tat apr�s chaque appel de modificateur.


# 3 Troisi�me it�ration: Interaction et stockage des passagers
# 3.1 Les classes faussaires
La condition � laquelle une instance de FauxPassager peut �tre remplac� par une instance de PassagerStandard est la suivante:
Elle doit implementer les m�mes interfaces.

