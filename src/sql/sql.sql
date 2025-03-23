create database gestionConstruction;

create table Projets(
idProjet int primary key auto_increment,
NomProjet varchar(25)not null,
descriptionProjet varchar(255) not null,
dateDebutProjrt date not null,
dateFinProjet date not null ,
budget double not null

);

create table Taches(
idTache int primary key auto_increment,
dateDebutTache date not null,
dateFinTache date not null,
descriptionTache varchar(255) not null,
idProjet int,
 foreign key (idProjet) references  Projets(idProjet) ON DELETE CASCADE
);

create table Ressources(
idRessource int primary key auto_increment,
nomRessource varchar(55)not null,
typeRessource varchar(255) not null,
quantite int not null,
idFournisseur int,
 foreign key (idFournisseur) references Fournisseurs(idFournisseur)ON DELETE CASCADE
);

create table TacheRessources(
idtacheRS int primary key auto_increment,
quantiteAssocier int not null,
idTache int ,
idRessource int,
 foreign key (idRessource) references Ressources(idRessource),
 foreign key (idTache) references Taches(idTache)ON DELETE CASCADE
);