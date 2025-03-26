
let list = document.querySelectorAll(".navigation li");

function activeLink() {
  list.forEach((item) => {
    item.classList.remove("hovered");
  });
  this.classList.add("hovered");
}

list.forEach((item) => item.addEventListener("mouseover", activeLink));


let toggle = document.querySelector(".toggle");
let navigation = document.querySelector(".navigation");
let main = document.querySelector(".main");

toggle.onclick = function () {
  navigation.classList.toggle("active");
  main.classList.toggle("active");
};






document.getElementById("taskForm").addEventListener("submit", function(event) {
    let isValid = true;

   
    let dateDebut = document.getElementById("dateDebutTache").value;
    let dateFin = document.getElementById("dateFinTache").value;


    let dateDebutError = document.getElementById("dateDebutError");
    let dateFinError = document.getElementById("dateFinError");

   
    dateDebutError.innerText = "";
    dateFinError.innerText = "";


     
    if (dateDebut === "") {
        dateDebutError.innerText = "Veuillez choisir une date de début.";
        isValid = false;
    }
    if (dateFin === "") {
        dateFinError.innerText = "Veuillez choisir une date de fin.";
        isValid = false;
    }
    if (dateDebut !== "" && dateFin !== "" && dateDebut > dateFin) {
        dateFinError.innerText = "La date de fin doit être après la date de début.";
        isValid = false;
    }

    
    if (!isValid) {
        event.preventDefault();
    }
});


function confirmDelete() {
    return confirm("Êtes-vous sûr de vouloir supprimer ?");
}




