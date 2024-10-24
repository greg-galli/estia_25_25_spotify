
**Projet : Plateforme de gestion de médias audio (Spotify)**

**Contexte :** Vous allez développer une plateforme web de gestion de médias audio, inspirée de Spotify, en utilisant le framework Spring. Cette application permettra à ses utilisateurs d'écouter, d'organiser et de partager de la musique. Les utilisateurs pourront créer des playlists, voir des albums, des morceaux de musique et les profils des créateurs de playlists. Il y aura une gestion des accès en fonction du rôle de l'utilisateur (ADMIN / USER).

**Objectifs pédagogiques :**

-   Apprendre à structurer et développer une application web avec Spring.
-   Utiliser une base de données relationnelle pour stocker les informations sur les utilisateurs, les playlists, les albums, et les morceaux de musique.
-   Mettre en place une gestion des utilisateurs avec des rôles et des autorisations (ADMIN / USER).
-   Gérer l'édition des playlists et les fiches d'albums et de morceaux avec des visuels associés.
-   Créer une interface pour visualiser les profils des utilisateurs et leurs playlists.

**Fonctionnalités à implémenter :**

1.  **Gestion des utilisateurs et des rôles**

  -   Authentification des utilisateurs (inscription, connexion).
  -   Gestion des rôles (ADMIN / USER).
  -   Rôle ADMIN : accès à toutes les fonctionnalités, dont la gestion des utilisateurs et des contenus.
  -   Rôle USER : accès aux fonctionnalités basiques (création de playlists, ajout de musiques, consultation d'albums, etc.).
2.  **Gestion des playlists**

  -   Création, édition, suppression de playlists par les utilisateurs.
  -   Possibilité d'ajouter ou de retirer des morceaux de musique dans les playlists.
  -   Visualisation des playlists avec les titres et les visuels associés.
  -   Accès au profil du créateur de la playlist depuis la fiche de la playlist.
3.  **Fiches d'albums et de morceaux de musique**

  -   Création d'une fiche pour chaque album (titre, description, année, visuel).
  -   Création d'une fiche pour chaque morceau de musique (titre, durée, album associé, visuel).
  -   Recherche et consultation des albums et morceaux.
4.  **Gestion des profils utilisateurs**

  -   Visualisation du profil des utilisateurs (nom, playlists créées).
  -   Modification du profil utilisateur (image de profil, description, etc.).
5.  **Interface graphique**

  -   Mise en place d'une interface simple et ergonomique pour naviguer entre les playlists, les albums, et les profils.
  -   Chaque fiche (album, morceau, utilisateur) devra contenir un visuel pour illustrer le contenu.

**Contraintes techniques :**

-   Utilisation de **Spring Boot** pour la partie backend.
-   Utilisation d'une base de données relationnelle.
-   Pour les visuels (couvertures d'albums, images de profil), vous pouvez stocker les images dans un système de fichiers ou dans la base de données.
-   Utilisation d'un moteur de templating (parmi ceux proposés dans le cours) pour le rendu des pages HTML.

**Livrables :**

-   Code source du projet (hébergé sur une plateforme comme GitHub).
-   Documentation technique expliquant les choix d'implémentation.
-   Fichier README décrivant comment déployer et tester le projet.

**Évaluation :** Votre projet sera évalué sur les critères suivants :

-   Respect des fonctionnalités demandées.
-   Qualité du code (organisation, lisibilité, respect des principes SOLID).
-   Utilisation correcte de Spring et des technologies associées.
-   Design et ergonomie de l'interface.
-   Documentation fournie.

**Options ++:** Quelques bonus vous permettront de gagner des points :
- Utilisation de **Spring Security** pour la gestion des rôles et des autorisations.
- Mise en place d'un frontend séparé en Angular ou en React
- Lien avec l'API Spotify pour utiliser des données réelles
- Proposer une solution pour streamer la musique (jetez un coup d'œil du côté de spotdl)

**Malus++:** Quelques point vous feront perdre des points :
- Rendu sans readme ( -5 points )
- Plagiat (-10 à -25 points pour le copieur et le copié)

**Deadline :** [à venir, mais surement vers notre prochaine rencontre, vers février]