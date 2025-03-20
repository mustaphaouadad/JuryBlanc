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
    <title>Gestion des Tâches</title>
</head>
<body>
    <% 
        String idProjet = request.getParameter("idProjet");
        if (idProjet == null || idProjet.isEmpty()) { 
    %>
        <p style="color: red;">Erreur : ID du projet introuvable.</p>
    <% } else { %>
        <h2>Liste des Tâches du Projet ID: <%= idProjet %></h2>
        <table border="1">
            <tr>
                <th>Description</th>
                <th>Date Début</th>
                <th>Date Fin</th>
            </tr>
            <% 
                List<Tache> taches = (List<Tache>) request.getAttribute("t");
                if (taches != null && !taches.isEmpty()) {
                    for (Tache temp : taches) { 
            %>
                        <tr>
                            <td><%= temp.getDescriptionTache() %></td>
                            <td><%= temp.getDateDebutTache() %></td>
                            <td><%= temp.getDateFinTache() %></td>
                        </tr>
            <%      } 
                } else { %>
                    <tr>
                        <td colspan="3">Aucune tâche trouvée pour ce projet.</td>
                    </tr>
            <% } %>
        </table>

        <h2>Ajouter une Nouvelle Tâche</h2>
        <form action="AddTache" method="post">
            <input type="hidden" name="idProjet" value="<%= idProjet %>">
            
            <label for="descriptionTache">Description :</label>
            <textarea name="descriptionTache" required></textarea>
            
            <label for="dateDebutTache">Date de début :</label>
            <input type="date" name="dateDebutTache" required>
            
            <label for="dateFinTache">Date de fin :</label>
            <input type="date" name="dateFinTache" required>
            
            <button type="submit">Ajouter Tâche</button>
        </form>
    <% } %>
</body>
</html>
