<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<style>
h2 {text-align: center;}
h4 {text-align: right;}


body {
font-family: Arial, Helvetica, sans-serif;
}
.modal {
text-align: center;
display: none;
position: fixed;
z-index: 1;
padding-top: 100px;
left: 0;
top: 0;
width: 100%;
height: 100%;
background-color: rgba(0, 0, 0, 0.4);
}
.modalContent {
font-size: 20px;
font-weight: bold;
background-color: #fefefe;
margin: auto;
padding: 20px;
border: 1px solid #888;
width: 80%;
}
.close {
color: rgb(255, 65, 65);
float: right;
font-size: 40px;
font-weight: bold;
}
.close:hover,
.close:focus {
color: #ff1010;
cursor: pointer;
}
.modalContent button {
border: none;
border-radius: 4px;
font-size: 18px;
font-weight: bold;
padding: 10px;
}
.del {
background-color: rgb(255, 77, 77);
}
.del:hover {
background-color: rgb(255, 7, 7);
}
.cancel:hover {
background-color: rgb(167, 167, 167);
}
</style>

<h2>${restaurant.getName()} Restaurant</h2>
<h4>Welcome ${restaurantAdmin.getUsername()} </h4>
<h4><a href ="/CRUD/login">Logout </a></h4>

<h3><a href ="/CRUD/homepage">Homepage</a></h3>
<h3><a href ="/CRUD/edit/admin">Edit personal info</a></h3>
<h3><a href = "/CRUD/editRestaurant/${restaurant.getId()}">Edit Restaurant</a></h3>
<h3><a href ="/CRUD/view/dish">View Dishes</a></h3>
<h3><a href ="/CRUD/create/dish">Add a dish</a></h3>

<button class="openModal">Delete Account</button>
<div class="modal">
<div class="modalContent">
<span class="close">&times;</span>
<p>Are you sure you want to delete your account permanently?</p>
<button class="del" onclick="document.location='/CRUD/delete/admin'">Delete Account</button>
<button class="cancel" onclick="document.location='/CRUD/homepage'">Cancel</button>
</div>
</div>
<script>
var modal = document.querySelector(".modal");
var btn = document.querySelector(".openModal");
var span = document.querySelector(".close");
btn.addEventListener("click", () => {
modal.style.display = "block";
});
span.addEventListener("click", () => {
hideModal();
});
function hideModal() {
modal.style.display = "none";
}
window.onclick = function(event) {
if (event.target == modal) {
hideModal();
}
};
</script>
<body>
</body>

</html>