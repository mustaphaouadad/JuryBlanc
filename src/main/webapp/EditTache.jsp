<%@page import="dao.RessourcesDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="model.Tache" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style/style.css">
 <!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<%Tache t=(Tache)request.getAttribute("t"); 
if (t == null) {
    out.println("<p style='color:red;'>Erreur : Tâche introuvable.</p>");
    return; 
} 
%>

   
                 <div class="container mt-5">
    <div class="row">
        <div class="col-md-8 offset-md-2">
            <div class="card">
                <div class="card-header bg-primary text-white">
                    <h4>Modifier Tache</h4>
                </div>
                <div class="card-body">
                <form action="EditTache" method="post">
                <input type="hidden" name="idTache" value="<%=t.getIdTache()%>">
                 <input type="hidden" name="idProjet" value="<%= t.getIdProjet() %>">
                
                <div class="form-group">
            <label for="descriptionTache">Description :</label>
           <textarea id="descriptionTache" name="descriptionTache" class="form-control" required><%=t.getDescriptionTache()%></textarea>
          </div>
          
           <div class="form-group">
            <label for="dateDebutTache">Date de Début :</label>
            <input type="date" id="startDate" name="dateDebutTache" value="<%=t.getDateDebutTache() %>" class="form-control" required>
          </div>
          
          <div class="form-group">
            <label for="dateFinTache">Date de Fin :</label>
            <input type="date" id="endDate" name="dateFinTache" value="<%=t.getDateFinTache() %>" class="form-control" required>
          </div>
          
          
           <div class="modal-footer">
        <button type="submit" class="btn btn-primary">Modifier Tache</button>
        
                
              <a type="button" href="DesplayTache?idProjet=<%= t.getIdProjet() %>" class="btn btn-secondary" >Fermer</a>
              
      </div>
     
                   
          
                </form>
                
                 </div>
                  </div>
                   </div>
                    </div>



</body>
</html>