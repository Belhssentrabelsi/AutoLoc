# AutoLoc





Plateforme de gestion de location de véhicules multi-agences (UP ASI, ESPRIT).



\## Objectifs du projet

Numériser le processus de location : réservation, contractualisation,

paiement, suivi de flotte et relances automatiques, via une API REST Spring Boot.



\## Acteurs

\- \*\*Client\*\* : consulte les véhicules disponibles, crée/annule une réservation, consulte ses contrats.

\- \*\*Agent d'agence\*\* : gère les véhicules, valide une réservation, établit un contrat, enregistre un paiement.

\- \*\*Responsable d'agence (Manager)\*\* : droits de l'agent, plus gestion des employés et statistiques de l'agence.

\- \*\*Administrateur\*\* : gère les agences, les catégories de véhicules, les statistiques globales et la configuration.



\## Stack technique

Java 17, Maven, Spring Boot, Spring Data JPA, MySQL 8, Lombok, Postman, IntelliJ IDEA Ultimate.



\## Cas d'utilisation principaux

\- \*\*Client\*\* : consulter les véhicules disponibles, créer une réservation, annuler une réservation, consulter ses contrats.

\- \*\*Agent d'agence\*\* : gérer les véhicules, valider une réservation, établir un contrat, enregistrer un paiement.

\- \*\*Responsable d'agence\*\* : gérer les employés, consulter les statistiques de l'agence (en plus des cas de l'agent).

\- \*\*Administrateur\*\* : gérer les agences et les catégories de véhicules, consulter les statistiques globales, configurer la plateforme.

