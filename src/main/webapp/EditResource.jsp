<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="model.Ressources" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% Ressources r =(Ressources) request.getAttribute("r"); %>

<form action="EditResources" method="post">
        <input type="hidden" name="idRessource" value="<%= r.getIdRessource() %>">

        <label>Nom :</label>
        <input type="text" name="nomRessource" value="<%= r.getNomRessource() %>" required> <br>

        <label>Type :</label>
        <input type="text" name="typeRessource" value="<%= r.getTypeRessource() %>" required> <br>

        <label>Quantité :</label>
        <input type="number" name="quantite" value="<%= r.getQuantite() %>" required> <br>

        <label>ID Fournisseur :</label>
        <input type="number" value="1" disabled> <br>

        <button type="submit">Modifier</button>
    </form>

</body>
</html>