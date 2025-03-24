<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List, java.util.ArrayList" %>
    <%@page import="model.Projet" %>
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
                           <ion-icon name="construct-outline"></ion-icon>
                        </span>
                        <span class="title">ConstructionXpert</span>
                    </a>
                </li>

                <li>
                    <a href="Dashboard">
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
                
            <!--        <li>
            <a href="GestionDesTaches.jsp">
                <span class="icon">
                    <ion-icon name="clipboard-outline"></ion-icon>
                </span>
                <span class="title">Gestion des Tâches</span>
            </a>
        </li> -->
                
                  <li>
            <a href="DesplayRessources">
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
                     <img src="img/1.jpeg" alt="Admin">
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
        <form action="AddProjet" method="post">
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
                    <th>Name</th>
                    <th>Description</th>
                    <th>Date Début</th>
                    <th>Date Fin</th>
                    <th>Budget</th>
                    <th>Actions</th>
                </tr>
            </thead>

            <tbody>
            
               <% List<Projet> p = (List<Projet>) request.getAttribute("p"); %>
                <% if (p != null && !p.isEmpty()) { 
                    for (Projet temp : p) { %>
                    <tr>
                     <td><%= temp.getNomProjet() %></td>

                        <td><%= temp.getDescriptionProjet() %></td>
                        <td><%= temp.getDateDebutProjrt() %></td>
                        <td><%= temp.getDateFinProjet() %></td>
                        <td><%= temp.getBudget() %></td>
                        <td>
                            <a href="EditProjet?idProjet=<%=temp.getIdProjet() %>" class="btn edit">
                                <ion-icon name="create-outline"></ion-icon> 
                            </a>
                            <a type="button" href="DeleteProjet?idProjet=<%=temp.getIdProjet() %>" class="btn delete">
                                <ion-icon name="trash-outline"></ion-icon> 
                            </a>
                            
                            <a type="button" class="btn add ajouter-tache" href="DesplayTache?idProjet=<%= temp.getIdProjet() %>">
                                 <ion-icon name="add-outline"></ion-icon> 
                          </a>
                            
                        </td>
                    </tr>
               
             <% } 
                } else { %>
                    <div class="col-12">
                        <p class="text-center text-danger fw-bold">Aucune offre emploi trouvée.</p>
                    </div>
                <% } %>
            </tbody>
        </table>
    </div>
</div>
</div>








<!-- Bootstrap JS Bundle (contient Popper.js et Bootstrap JS pour le fonctionnement des modales) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
<script src="style/main.js"  ></script>
<script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
</body>
</html>