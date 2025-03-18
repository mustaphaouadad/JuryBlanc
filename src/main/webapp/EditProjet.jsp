<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
                 <%Projet p=(Projet)request.getAttribute("p"); %>
                 
                 <div class="container mt-5">
    <div class="row">
        <div class="col-md-8 offset-md-2">
            <div class="card">
                <div class="card-header bg-primary text-white">
                    <h4>Modifier le Projet</h4>
                </div>
                <div class="card-body">
                 
                  <form action="EditProjet" method="post">
          <div class="form-group">
          <input type="hidden" name="idProjet" value="<%=p.getIdProjet()%>">
            <label for="projectName">Nom du Projet :</label>
            <input type="text" id="projectName" name="projectName" value="<%=p.getNomProjet() %>" class="form-control" required>
          </div>
          <div class="form-group">
            <label for="projectDescription">Description :</label>
           <textarea id="projectDescription" name="projectDescription" class="form-control" required><%=p.getDescriptionProjet() %></textarea>

          </div>
          <div class="form-group">
            <label for="startDate">Date de Début :</label>
            <input type="date" id="startDate" name="startDate" value="<%=p.getDateDebutProjrt() %>" class="form-control" required>
          </div>
          <div class="form-group">
            <label for="endDate">Date de Fin :</label>
            <input type="date" id="endDate" name="endDate" value="<%=p.getDateFinProjet() %>" class="form-control" required>
          </div>
          <div class="form-group">
            <label for="budget">Budget :</label>
            <input type="number" id="budget" name="budget" value="<%=p.getBudget() %>" class="form-control" required>
          </div>
      </div>
      <div class="modal-footer">
        <button type="submit" class="btn btn-primary">Modifier le Projet</button>
              <a type="button" href="DesplayProjet" class="btn btn-secondary" >Fermer</a>
      </div>
      </form>
      


<!-- Bootstrap JS Bundle (contient Popper.js et Bootstrap JS pour le fonctionnement des modales) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
<script src="style/main.js"  ></script>
<script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
</body>
</html>