!!ATTENTION, le fichier list.csv est gros, attention à l'ouvrir avec le bon outil.

Entrée: fichier csv brut au format: jour,type,count

Sortie voulue: list de "Stat", au format: jour, count total pour type Virus, count total pour type Grey, count total pour type Black, count total pour type White

La fonction migrateFromFile dans la class MigrationService est testé par le test dans MigrationServiceTest.

Interdiction de toucher au test unitaire.
Tout le reste peut être modifié, modification de fonction, ajout de class, etc...


Objectif n1: Ecrire la fonction migrateFromFile pour valider le test (sans écrire les résultats en dur...).

Objectif n2: Utiliser Reactor pour l'algorithme dans migrateFromFile

Objectif n2: Améliorer au mieux le temps de traitement
