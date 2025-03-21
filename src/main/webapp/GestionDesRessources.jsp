<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

</body>
</html>