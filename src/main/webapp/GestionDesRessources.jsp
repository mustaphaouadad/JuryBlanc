<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List" %>
    <%@page import="model.Ressources"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <form action="AddRessource" method="post">
    <label>Nom de la Ressource:</label>
    <input type="text" name="nomRessource" required><br>

    <label>Type de la Ressource:</label>
    <input type="text" name="typeRessource" required><br>

    <label>Quantité:</label>
    <input type="number" name="quantite" required><br>

    <button type="submit">Ajouter</button>
</form>

     <table border="1">
        <thead>
            <tr>
                
                <th>Nom de la Ressource</th>
                <th>Type de la Ressource</th>
                <th>Quantité</th>
                <th>ID Fournisseur</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
        <%
    List<Ressources> ressources = (List<Ressources>) request.getAttribute("r");
    if (ressources != null && !ressources.isEmpty()) {
        for (Ressources res : ressources) {
%>
            <tr>
                
                <td><%= res.getNomRessource() %></td>
                <td><%= res.getTypeRessource() %></td>
                <td><%= res.getQuantite() %></td>
                <td><%= res.getIdFournisseur() %></td>
                <td>
                    <!-- Actions to modify or delete -->
                    <a href="EditRessource?idRessource=<%= res.getIdRessource() %>">Modifier</a>
                    <a href="DeleteRessource?idRessource=<%= res.getIdRessource() %>">Supprimer</a>
                </td>
            </tr>
<%
        }
    }
%>
        
        
        
        </tbody>
        </table>

</body>
</html>