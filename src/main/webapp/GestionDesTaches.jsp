<%@page import="model.Tache"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection, java.sql.PreparedStatement, java.sql.ResultSet" %>
<%@ page import="dao.DBConnect" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="style/style.css">
    
    
    <!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap Icons (CDN) -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css">
    <title>Gestion des Tâches</title>
</head>
<body>

<!-- nav -->
 <div class="navigation">
            <ul>
                 <li>
                    <a href="#">
                        <span class="icon">
                           <ion-icon name="construct-outline"></ion-icon>
                        </span>
                        <span class="title">ConstructionXpert</span>
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
                    <a href="DesplayProjet">
                        <span class="icon">
                             <ion-icon name="folder-open-outline"></ion-icon>
                        </span>
                        <span class="title">Gestion des Projets</span>
                    </a>
                </li>
                <!--  
                   <li>
            <a href="GestionDesTaches.jsp">
                <span class="icon">
                    <ion-icon name="clipboard-outline"></ion-icon>
                </span>
                <span class="title">Gestion des Tâches</span>
            </a>
        </li>-->
                
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
                
                 <div class="search">
                    <label>
                        <input type="text" placeholder="Search here">
                      
                    </label>
                </div>
                
                 <div class="user">
                    <img src="#" alt="">
                </div>
            </div>
                



    <% 
        String idProjet = request.getParameter("idProjet");
        if (idProjet == null || idProjet.isEmpty()) { 
    %>
        <p style="color: red;">Erreur : ID du projet introuvable.</p>
    <% } else { %>
       
        <div class="details">
    <div class="recentOrders">
        <div class="cardHeader">
            <h2>Gestion des Taches</h2>
            <a href="#" class="btn add-project" data-bs-toggle="modal" data-bs-target="#addProjectModal">Ajouter un Tache</a>
        </div>
        <table class="project-table">
            <thead>
            <tr>
                <th>Description</th>
                <th>Date Début</th>
                <th>Date Fin</th>
            </tr>
             </thead>
            
             <tbody>
            <% 
                List<Tache> taches = (List<Tache>) request.getAttribute("t");
                if (taches != null && !taches.isEmpty()) {
                    for (Tache temp : taches) { 
            %>
                        <tr>
                            <td><%= temp.getDescriptionTache() %></td>
                            <td><%= temp.getDateDebutTache() %></td>
                            <td><%= temp.getDateFinTache() %></td>
                            <td>
                            
                          <a href="EditTache?idTache=<%= temp.getIdTache() %>"class="btn edit">
                                <ion-icon name="create-outline"></ion-icon> 
                            </a>
                            <a type="button" href="DeleteTache?idTache=<%= temp.getIdTache() %>&idProjet=<%= temp.getIdProjet() %>" class="btn delete">
                                <ion-icon name="trash-outline"></ion-icon> 
                            </a>
                            
                            
                            
                            </td>
                            
                        </tr>
            <%      } 
                } else { %>
                    <tr>
                        <td colspan="3">Aucune tâche trouvée pour ce projet.</td>
                    </tr>
            <% } %>
        </tbody>
        </table>
    </div>
</div>
</div>
        

        <h2>Ajouter une Nouvelle Tâche</h2>
        !-- Modal -->
<div class="modal fade" id="addProjectModal" tabindex="-1" aria-labelledby="addProjectModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="addProjectModalLabel">Créer un Nouveau Tache</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        <form action="AddTache" method="post">
            <input type="hidden" name="idProjet" value="<%= idProjet %>">
            <div class="form-group">
            <label for="descriptionTache" >Description :</label>
            <textarea name="descriptionTache" class="form-control" required></textarea>
            </div>
          <div class="form-group">
            <label for="dateDebutTache">Date de début :</label>
            <input type="date" name="dateDebutTache" class="form-control" required>
            </div>
          <div class="form-group">
            <label for="dateFinTache">Date de fin :</label>
            <input type="date" name="dateFinTache" class="form-control" required>
            </div>
      <div class="modal-footer">
      <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Fermer</button>
        <button type="submit" class="btn btn-primary">Ajouter Tache</button>
      </div>
        </form>
         </div>
  </div>
</div>
        
    <% } %>
    
    <!-- Bootstrap JS Bundle (contient Popper.js et Bootstrap JS pour le fonctionnement des modales) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
<script src="style/main.js"  ></script>
<script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
</body>
</html>
