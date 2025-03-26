<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>_Jury_Blanc</title>
</head>
<body>
<h2>Hello World!</h2>

<a href="Dashboard">adminDashboard</a>

<ul  id="list">
     <li > title 1  </li>
 </ul>

<button id="add"> Add </button>




<script>
    const list =document.getElementById('list');
    const  add = document.getElementById('add');

    add.addEventListener('click',()=>{


        list.innerHTML+='<li>title 2  </li>';


    })

</script>

<input id="txt" type="text" onclick= document.getElementById("txt").value.toUpperCase() > </input>
</body>
</html>
