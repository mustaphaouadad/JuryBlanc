<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="style/style.css">
</head>
<body>

<div class="container">
            <div class="navigation">
            <ul>
                <li>
                    <a href="#">
                        <span class="icon">
                            <ion-icon name="logo-apple"></ion-icon>
                        </span>
                        <span class="title">Xenos Xenos</span>
                    </a>
                </li>

                <li>
                    <a href="#">
                        <span class="icon">
                            <ion-icon name="home-outline"></ion-icon>
                        </span>
                        <span class="title">Dashboard</span>
                    </a>
                </li>

                <li>
                    <a href="#">
                        <span class="icon">
                            <ion-icon name="people-outline"></ion-icon>
                        </span>
                        <span class="title">Fournisseur</span>
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
                        <ion-icon name="search-outline"></ion-icon>
                    </label>
                </div>

                <div class="user">
                    <img src="#" alt="">
                </div>
            </div>
            
               <!-- ======================= Cards ================== -->
               <div class="cardBox">
    <div class="card">
        <div>
            <div class="numbers">12</div> 
            <div class="cardName"> Projets</div>
        </div>
        <div class="iconBx">
            <ion-icon name="folder-open-outline"></ion-icon>
        </div>
    </div>

    <div class="card">
        <div>
            <div class="numbers">45</div> 
            <div class="cardName">Tâches</div>
        </div>
        <div class="iconBx">
            <ion-icon name="clipboard-outline"></ion-icon>
        </div>
    </div>

    <div class="card">
        <div>
            <div class="numbers">30</div> 
            <div class="cardName">Ressources</div>
        </div>
        <div class="iconBx">
            <ion-icon name="construct-outline"></ion-icon>
        </div>
    </div>

    <div class="card">
        <div>
            <div class="numbers">8</div> 
            <div class="cardName">Fournisseurs</div>
        </div>
        <div class="iconBx">
            <ion-icon name="business-outline"></ion-icon>
        </div>
    </div>
    
     <div class="card">
                    <div>
                        <div class="numbers">$7,842</div>
                        <div class="cardName">Earning</div>
                    </div>

                    <div class="iconBx">
                        <ion-icon name="cash-outline"></ion-icon>
                    </div>
                </div>
</div>
                   <!-- ================ Order Details List ================= -->
    <div class="details">
    <div class="recentOrders">
        <div class="cardHeader">
            <h2> Gestion tache</h2>
            <a href="#" class="btn">Add task</a>
        </div>

        <table>
            <thead>
                <tr>
                    <td>eeeee</td>
                    <td>eeeeeee</td>
                    <td>eeeee</td>
                    <td>action</td>
                </tr>
            </thead>

            <tbody>
                <tr>
                    <td>eeeeeeee  </td>
                    <td>zzzzzzzzz</td>
                    <td> SQL</td>
                  <td>
  <a href="#" class="btn edit">
    <ion-icon name="create-outline"></ion-icon> 
  </a>
  <a href="#" class="btn delete">
    <ion-icon name="trash-outline"></ion-icon> 
  </a>
</td>
                </tr>

                <tr>
                    <td>rrrrrrrrrr</td>
                    <td>eeeeeeee</td>
                    <td>Figma</td>
                  <td>
  <a href="#" class="btn edit">
    <ion-icon name="create-outline"></ion-icon> 
  </a>
  <a href="#" class="btn delete">
    <ion-icon name="trash-outline"></ion-icon> 
  </a>
</td>
                </tr>

                <tr>
                    <td>API</td>
                    <td> qqqqqqqqq</td>
                    <td>Java Spring Boot</td>
                    <td>
  <a href="#" class="btn edit">
    <ion-icon name="create-outline"></ion-icon> 
  </a>
  <a href="#" class="btn delete">
    <ion-icon name="trash-outline"></ion-icon> 
  </a>
</td>
                </tr>

                <tr>
                    <td>aaa</td>
                    <td>aa</td>
                    <td>ddd</td>
                   <td>
  <a href="#" class="btn edit">
    <ion-icon name="create-outline"></ion-icon> 
  </a>
  <a href="#" class="btn delete">
    <ion-icon name="trash-outline"></ion-icon> 
  </a>
</td>
            </tbody>
        </table>
    </div>




               








</div>
</div>
</div>

<script src="style/main.js"></script>
<script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
</body>
</html>