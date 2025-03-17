<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style/style.css">

    <!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap Icons (CDN) -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css">

<title>Insert title here</title>
</head>
<body>


<!-- nav -->
 <div class="navigation">
            <ul>
                <li>
                    <a href="#">
                        <span class="icon">
                            <ion-icon name="logo-apple"></ion-icon>
                        </span>
                        <span class="title">Xenos Xenos</span>
                    </a>
                </li>

                <li>
                    <a href="AdminDashboard.jsp">
                        <span class="icon">
                            <ion-icon name="home-outline"></ion-icon>
                        </span>
                        <span class="title">Dashboard</span>
                    </a>
                </li>
                
              
                <li>
                    <a href="GestionDesProjets.jsp">
                        <span class="icon">
                             <ion-icon name="folder-open-outline"></ion-icon>
                        </span>
                        <span class="title">Gestion des Projets</span>
                    </a>
                </li>
                
                   <li>
            <a href="#">
                <span class="icon">
                    <ion-icon name="clipboard-outline"></ion-icon>
                </span>
                <span class="title">Gestion des Tâches</span>
            </a>
        </li>
                
                  <li>
            <a href="#">
                <span class="icon">
                    <ion-icon name="hammer-outline"></ion-icon>
                </span>
                <span class="title">Gestion des Ressources</span>
            </a>
        </li>
         <li>
                    <a href="#">
                        <span class="icon">
                            <ion-icon name="people-outline"></ion-icon>
                        </span>
                        <span class="title">Gestion des Fournisseur</span>
                    </a>
                </li>
                

                <li>
                    <a href="#">
                        <span class="icon">
                            <ion-icon name="log-out-outline"></ion-icon>
                        </span>
                        <span class="title">Sign Out</span>
                    </a>
                </li>
            </ul>
        </div>
         <!-- ========================= Main ==================== -->
        <div class="main">
            <div class="topbar">
                <div class="toggle">
                    <ion-icon name="menu-outline"></ion-icon>
                </div>

                

                <div class="user">
                    <img src="#" alt="">
                </div>
            </div>


<!-- Modal -->
<div class="modal fade" id="addProjectModal" tabindex="-1" aria-labelledby="addProjectModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="addProjectModalLabel">Créer un Nouveau Projet</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        <!-- Formulaire de création de projet -->
        <form action="#" method="post">
          <div class="form-group">
            <label for="projectName">Nom du Projet :</label>
            <input type="text" id="projectName" name="projectName" class="form-control" required>
          </div>
          <div class="form-group">
            <label for="projectDescription">Description :</label>
            <textarea id="projectDescription" name="projectDescription" class="form-control" required></textarea>
          </div>
          <div class="form-group">
            <label for="startDate">Date de Début :</label>
            <input type="date" id="startDate" name="startDate" class="form-control" required>
          </div>
          <div class="form-group">
            <label for="endDate">Date de Fin :</label>
            <input type="date" id="endDate" name="endDate" class="form-control" required>
          </div>
          <div class="form-group">
            <label for="budget">Budget :</label>
            <input type="number" id="budget" name="budget" class="form-control" required>
          </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Fermer</button>
        <button type="submit" class="btn btn-primary">Créer le Projet</button>
      </div>
      </form>
    </div>
  </div>
</div>



 <!-- Liste des Projets -->
       <div class="details">
    <div class="recentOrders">
        <div class="cardHeader">
            <h2>Gestion des Projets</h2>
            <a href="#" class="btn add-project" data-bs-toggle="modal" data-bs-target="#addProjectModal">Ajouter un Projet</a>
        </div>

        <table class="project-table">
            <thead>
                <tr>
                    <th>Nom du Projet</th>
                    <th>Description</th>
                    <th>Date de Début</th>
                    <th>Date de Fin</th>
                    <th>Budget</th>
                    <th>Actions</th>
                </tr>
            </thead>

            <tbody>
                <tr>
                    <td>Projet Alpha</td>
                    <td>Construction d'un bâtiment</td>
                    <td>2025-01-01</td>
                    <td>2025-12-31</td>
                    <td>500,000 MAD</td>
                    <td>
                        <a href="#" class="btn edit">
                            <ion-icon name="create-outline"></ion-icon> 
                        </a>
                        <a href="#" class="btn delete">
                            <ion-icon name="trash-outline"></ion-icon> 
                        </a>
                    </td>
                </tr>
                <tr>
                    <td>Projet Beta</td>
                    <td>Rénovation d'une école</td>
                    <td>2025-03-01</td>
                    <td>2025-09-30</td>
                    <td>200,000 MAD</td>
                    <td>
                        <a href="#" class="btn edit">
                            <ion-icon name="create-outline"></ion-icon> 
                        </a>
                        <a href="#" class="btn delete">
                            <ion-icon name="trash-outline"></ion-icon> 
                        </a>
                    </td>
                </tr>
                <!-- Ajoute d'autres lignes ici -->
            </tbody>
        </table>
    </div>
</div>


<!-- Bootstrap JS Bundle (contient Popper.js et Bootstrap JS pour le fonctionnement des modales) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
<script src="style/main.js"  ></script>
<script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
</body>
</html>