<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.Connection, java.sql.PreparedStatement, java.sql.ResultSet" %>
<%@ page import="dao.DBConnect" %>
<%@ page import="java.util.List" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <% 
    String idProjet = request.getParameter("idProjet");
    if (idProjet == null || idProjet.isEmpty()) {
%>
    <p style="color: red;">Erreur : ID du projet introuvable.</p>
<%
    } else {
%>


<form action="AddTache" method="post">
<input type="hidden" name="idProjet" value="<%= idProjet %>">


 
   

    <label for="descriptionTache">Description :</label>
    <textarea name="descriptionTache"></textarea>

    <label for="dateDebutTache">Date de début :</label>
    <input type="date" name="dateDebutTache">

    <label for="dateFinTache">Date de fin :</label>
    <input type="date" name="dateFinTache">

    <button type="submit">Ajouter Tâche</button>
</form>
<% } %>

</body>
</html>