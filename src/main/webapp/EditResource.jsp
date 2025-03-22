<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="model.Ressources" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<% Ressources r =(Ressources) request.getAttribute("r"); %>


<div class="container mt-5">
    <div class="row">
        <div class="col-md-8 offset-md-2">
            <div class="card">
                <div class="card-header bg-primary text-white">
                    <h4>Modifier Resssource</h4>
                </div>
                <div class="card-body">

<form action="EditResources" method="post">
        <input type="hidden" name="idRessource" class="form-control"  value="<%= r.getIdRessource() %>">
        <div class="form-group">
        <label>Nom :</label>
        <input type="text" name="nomRessource" class="form-control"  value="<%= r.getNomRessource() %>" required> <br>
          </div>
          <div class="form-group">
        <label>Type :</label>
        <input type="text" name="typeRessource" class="form-control"  value="<%= r.getTypeRessource() %>" required> <br>
        </div>
          <div class="form-group">
        <label>Quantité :</label>
        <input type="number" name="quantite" class="form-control"  value="<%= r.getQuantite() %>" required> <br>
         </div>
          <div class="form-group">
        <label>ID Fournisseur :</label>
        <input type="number" value="1" class="form-control"  disabled> <br>
           </div>
              
        
           <div class="modal-footer">
        <button type="submit" class="btn btn-primary">Modifier Ressource</button>
        
                
              <a type="button" href="DesplayRessources" class="btn btn-secondary" >Fermer</a>
              
      </div>
    </form>
    </div>
    </div>
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