# Projet : Plateforme de gestion de médias audio (Spotify)

## Contexte
Ce projet consiste à développer une plateforme web de gestion de médias audio, inspirée de **Spotify**, en utilisant le framework **Spring**.  
L'application permettra aux utilisateurs d'écouter, d'organiser et de partager de la musique à travers différentes fonctionnalités :

- Création et gestion de **playlists**
- Consultation de **fiches d’albums et de morceaux**
- Accès aux **profils des créateurs de playlists**
- Gestion des **rôles utilisateurs** (ADMIN / USER)

## Objectifs pédagogiques

L'objectif de ce projet est de permettre aux étudiants de :

- Structurer et développer une **application web avec Spring**
- Utiliser une **base de données relationnelle** pour stocker les utilisateurs, playlists, albums et morceaux
- Implémenter une **gestion des rôles et des autorisations** (ADMIN / USER)
- Mettre en place une interface pour **gérer et visualiser les playlists, albums et morceaux avec leurs visuels associés**
- Développer une interface permettant la **consultation des profils utilisateurs et de leurs playlists**

---

# Partie 1 : Développement de l'application avec Spring

## Fonctionnalités à implémenter

### Gestion des utilisateurs et des rôles

- Authentification des utilisateurs (inscription, connexion)
- Gestion des rôles :
    - **ADMIN** : accès à toutes les fonctionnalités, y compris la gestion des utilisateurs et des contenus
    - **USER** : accès aux fonctionnalités basiques (création de playlists, ajout de musiques, consultation d'albums, etc.)

### Gestion des playlists

- Création, édition et suppression de playlists
- Ajout et suppression de morceaux de musique dans une playlist
- Visualisation des playlists avec leurs titres et visuels associés
- Accès au profil du créateur de la playlist depuis la fiche de la playlist

### Fiches d'albums et de morceaux de musique

- Création d'une fiche pour chaque album (titre, description, année, visuel)
- Création d'une fiche pour chaque morceau de musique (titre, durée, album associé, visuel)
- Recherche et consultation des albums et morceaux

### Gestion des profils utilisateurs

- Visualisation des profils utilisateurs (nom, playlists créées)
- Modification du profil utilisateur (image de profil, description, etc.)

### Interface graphique

- Mise en place d'une interface ergonomique permettant la navigation entre les playlists, albums et profils
- Ajout de visuels pour chaque fiche (album, morceau, utilisateur)

### Contraintes techniques

- Utilisation de **Spring Boot** pour le backend
- Utilisation d'une **base de données relationnelle**
- Stockage des visuels (couvertures d'albums, images de profil) dans un système de fichiers ou en base de données
- Utilisation d'un **moteur de templating** pour le rendu des pages HTML

---

# Partie 2 : API REST complète pour Music / Album / Artist

Cette partie consiste à développer une **API REST complète** permettant de manipuler les entités **Music**, **Album** et **Artist**.

## Routes à implémenter

### Endpoints pour la gestion des entités

| Ressource  | GET (liste) | POST (création) | 
|------------|------------|----------------|
| /api/musics  | ✅ | ✅ |
| /api/albums  | ✅ | ✅ |
| /api/artists | ✅ | ✅ |

| Ressource  | GET (détail) | PUT (modification) | PATCH (mise à jour partielle) | DELETE (suppression) |
|------------|------------|----------------|-------------|--------------------|
| /api/music/{id} | ✅ | ✅ | ✅ | ✅ |
| /api/album/{id} | ✅ | ✅ | ✅ | ✅ |
| /api/artist/{id} | ✅ | ✅ | ✅ | ✅ |

## Gestion des erreurs

- Implémenter une **gestion propre des erreurs**, avec des messages explicites.
- Si un même code HTTP est utilisé plusieurs fois pour un même endpoint, **le message d'erreur doit être différent** pour permettre un débogage efficace.

Exemples :
- `404 Not Found` pour un ID inexistant : `"L'album avec l'ID 123 n'existe pas"`
- `400 Bad Request` pour une requête invalide : `"Le champ 'titre' est obligatoire"`
- `409 Conflict` en cas de duplication de données : `"Un artiste avec ce nom existe déjà"`

## Tests avec Postman

- Fournir une **collection Postman** avec **une requête par endpoint et par code d'état HTTP retourné**
- Tester **tous les cas possibles**, y compris les erreurs
- Implémenter **une authentification dans Postman** via un endpoint `/api/auth/login` qui récupérera un `access_token`
- Configurer **Postman pour injecter automatiquement** l’`access_token` dans les autres requêtes
- Permettre d'exécuter **tous les tests en une seule fois** via **l'option "Run" de Postman**

---
# Partie 3 : Ajout de tests au projet

Afin d'assurer la robustesse et la fiabilité de votre application, vous devez ajouter plusieurs tests dans votre projet :

## 1. Tests unitaires

- Implémentez **au moins une classe de tests unitaires** pour vérifier le bon fonctionnement de certaines méthodes de vos services ou contrôleurs.
- Utilisez **JUnit** et **Mockito** pour simuler des dépendances lorsque nécessaire.

## 2. Test d’intégration

- Ajoutez un **test d’intégration** pour vérifier que les différentes couches de votre application (contrôleur, service, repository) fonctionnent bien ensemble.
- Utilisez une **base de données en mémoire** (ex. H2) pour ce test.

## 3. Test fonctionnel sur un endpoint de l’API REST

- Rédigez un **test fonctionnel** sur un **point d’entrée** de votre API REST.
- Ce test devra envoyer une requête HTTP et vérifier **le statut de réponse et le contenu retourné**.
- Utilisez **Spring Boot Test** et **MockMvc** pour interagir avec votre API sans lancer un serveur complet.

---

## Livrables

- **Code source du projet**, hébergé sur une plateforme comme GitHub
- **Documentation technique**, expliquant les choix d'implémentation
- **Fichier README**, détaillant la procédure de déploiement et de test du projet
- **Collection Postman prête à l'emploi**, avec tous les cas de test

## Critères d'évaluation

Le projet sera évalué sur les points suivants :

- Respect des fonctionnalités demandées
- Qualité du code (organisation, lisibilité, respect des principes SOLID)
- Bonne utilisation de Spring et des technologies associées
- Design et ergonomie de l’interface
- **Complétude et rigueur des tests Postman**
- Documentation fournie

## Options bonus

Quelques améliorations permettront d'obtenir des points supplémentaires :

- **Implémentation de Spring Security** pour la gestion des rôles et des autorisations
- **Développement d’un frontend séparé** en Angular ou React
- **Lien avec l’API Spotify** pour utiliser des données réelles
- **Ajout du streaming audio** (ex. utilisation de spotdl)

## Malus

Certains éléments entraîneront des pénalités :

- **Absence de README** : -5 points
- **Plagiat** : -10 à -25 points pour le copieur et le copié

## Deadline

La deadline sera déterminée à la fin de la semaine