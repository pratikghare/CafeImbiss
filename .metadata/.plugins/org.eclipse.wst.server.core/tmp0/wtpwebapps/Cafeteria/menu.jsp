<!DOCTYPE html>
<html lang="en">
<%@page import="com.cafe.dto.User" %>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Menu | Imbiss Cafe</title>
    <link rel="icon" href="./images/logo/mainlogo.png">
    <link href="https://fonts.googleapis.com/css2?family=Chelsea+Market&family=Montserrat:wght@400;800;900&family=Bubblegum+Sans&family=Mali&family=Flamenco&family=Aclonica&family=Carter+One&family=Luckiest+Guy&family=Lato&family=Montserrat+Subrayada&family=Sarabun&family=Viga&family=Wellfleet&display=swap"
        rel="stylesheet">
    <link rel="stylesheet" href="./references/menu.css">
    <link rel="stylesheet" href="./references/footer.css">
    <link rel="stylesheet" href="./references/navigationBar.css">
    <link rel="stylesheet" href="./references/animation.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css">
</head>
<style>
	input[type="number"]{
		border: none;
	    background: rgba(255, 255, 255, 0.6);
	    padding: 7px 1em;
	    width:4em;
	    border-radius: 4px;
	    outline: none;
	}
	.add-btn{
		display:flex;
		align-items:center;
		justify-content:space-evenly;
	}
</style>
<body>

    <!--NavigationBar-->
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary sticky-top">

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item mb-2 mt-1">
                    <a class="nav-link " href="index.jsp">HOME</a>
                </li>
                <li class="nav-item mb-2 mt-1" >
                    <a class="nav-link active" href="menu.jsp">VIEW OUR MENU</a>
                </li>
             
            </ul>
   <% 
   boolean flag;
   if(flag = (session.getAttribute("user") != null)){ %>
			<div class="dropdown ml-auto mr-4">
			  <button style="font-family: 'Chelsea Market'"  class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
			    <%= session.getAttribute("user") != null ? ((User)session.getAttribute("user")).getUserName():"Hello" %>
			  </button>
			  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
			    <a style="font-family: 'Montserrat'; font-size:15px" class="dropdown-item" href="account.htm">Manage Account</a>
			    <a style="font-family: 'Montserrat'; font-size:15px" class="dropdown-item" href="getCart.htm">Cart</a>
			    <div class="dropdown-divider"></div>
          		<a style="font-family: 'Montserrat'; font-size:15px" class="dropdown-item" href="logout.htm">Logout</a>
			  </div>
			</div>
			<% }else{%>
			<div class="ml-auto mr-4">
		<!-- 	<a href="loginForm.htm" class="btn btn-outline-secondary">Login</a> -->
				<a class="btn btn-outline-light" style="font-family: 'Chelsea Market'" href="loginForm.htm" role="button">Login</a> 
			</div>
			<%} %>	
        </div>
    </nav>
    <!--EndofNavigationBar-->

    <!--MENU SECTION-->
    <section class="menu-section">
        <br><br>
        <h1>Menu</h1>
        <hr><br><br>
        <div>
            <div class="first-grid">
                <div class="grid-item">
                    <a href="#"> <img id="breakfast-ad" src="./images/menu/breakfast.jpg" /></a>
                </div>
                <div class="grid-item">
                    <p>Combos</p>
                    <a href="#"> <img src="./images/menu/combos.jpg" /></a>
                    <br>
                    <form class="add-btn" action="addToCart.htm" method="post" >
                    		<input type="number" name="quantity" value="0" />
	                    	<button class="btn btn-outline-secondary">Add</button>
	                    	<input type="hidden" name="itemId" value="1" />
	                    	
                    </form>
                    <% if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 1){
	                    	%>
	                    	<br>
	                    	<span style="color:red; font-size:14px;">Quantity should be greater than 0!</span>
	                    	<%}} %>
                </div>
                <div class="grid-item">
                    <p>Feed the Fam Deals</p>
                    <a href="#"> <img src="./images/menu/feed-fam-deals.jpg" /></a><br>
                    <form class="add-btn" action="addToCart.htm" method="post" >
                    		<input type="number" name="quantity" value="0" />
	                    	<input type="hidden" name="itemId" value="2" />
	                    	<button class="btn btn-outline-secondary">Add</button>
                    </form>
                    <% if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 2){
	                    	%>
	                    	<br>
	                    	<span style="color:red; font-size:14px;">Quantity should be greater than 0!</span>
	                    	<%}} %>
                </div>
            </div>
            <div class="first-grid">
                <div class="grid-item" style="margin-left: 0;">
                    <p>Hamburgers</p>
                    <a href="#"> <img src="./images/menu/hamburgers.jpg" /></a><br>
                    <form class="add-btn" action="addToCart.htm" method="post" >
                    		<input type="number" name="quantity" value="0" />
	                    	<input type="hidden" name="itemId" value="3" />
	                    	<button class="btn btn-outline-secondary">Add</button>
                    </form>
                    <% if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 3){
	                    	%>
	                    	<br>
	                    	<span style="color:red; font-size:14px;">Quantity should be greater than 0!</span>
	                    	<%}} %>
                </div>
                <div class="grid-item chick-sand" style="margin-left: 0; margin-top: -10px;">
                    <p>Chicken Sandwiches & Nuggets</p>
                    <a href="#"> <img src="./images/menu/chicken-sandwich-nuggets.jpg" /></a><br>
                    <form class="add-btn" action="addToCart.htm" method="post" >
                    		<input type="number" name="quantity" value="0" />
	                    	<input type="hidden" name="itemId" value="4" />
	                    	<button class="btn btn-outline-secondary">Add</button>
                    </form>
                    <% if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 4){
	                    	%>
	                    	<br>
	                    	<span style="color:red; font-size:14px;">Quantity should be greater than 0!</span>
	                    	<%}} %>
                </div>
                <div class="grid-item" style="margin-left: -7%;">
                    <p>Fresh-Made Salads</p>
                    <a href="#"> <img src="./images/menu/salads.jpg" /></a><br>
                    <form class="add-btn" action="addToCart.htm" method="post" >
                    		<input type="number" name="quantity" value="0" />
	                    	<input type="hidden" name="itemId" value="5" />
	                    	<button class="btn btn-outline-secondary" >Add</button>
                    </form>
                    <% if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 5){
	                    	%>
	                    	<br>
	                    	<span style="color:red; font-size:14px;">Quantity should be greater than 0!</span>
	                    	<%}} %>
                </div>
                <div class="grid-item">
                    <p>Fries & Sides</p>
                    <a href="#"> <img src="./images/menu/siders.jpg" /></a><br>
                    <form class="add-btn" action="addToCart.htm" method="post" >
                    		<input type="number" name="quantity" value="0" />
	                    	<input type="hidden" name="itemId" value="6" />
	                    	<button class="btn btn-outline-secondary">Add</button>
                    </form>
                    <% if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 6){
	                    	%>
	                    	<br>
	                    	<span style="color:red; font-size:14px;">Quantity should be greater than 0!</span>
	                    	<%}} %>
                </div>
            </div>
            <div class="first-grid">
                <div class="grid-item">
                    <p>Breakfast Combos</p>
                    <a href="#"> <img src="./images/menu/breakfast-combos.jpg" /></a><br>
                    <form class="add-btn" action="addToCart.htm" method="post" >
                    		<input type="number" name="quantity" value="0" />
	                    	<input type="hidden" name="itemId" value="7" />
	                    	<button class="btn btn-outline-secondary">Add</button>
                    </form>
                    <% if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 7){
	                    	%>
	                    	<br>
	                    	<span style="color:red; font-size:14px;">Quantity should be greater than 0!</span>
	                    	<%}} %>
                </div>
                <div class="grid-item">
                    <p>Croissants</p>
                    <a href="#"> <img src="./images/menu/croissants.jpg" /></a><br>
                    <form class="add-btn" action="addToCart.htm" method="post" >
                    		<input type="number" name="quantity" value="0" />
	                    	<input type="hidden" name="itemId" value="8" />
	                    	<button class="btn btn-outline-secondary">Add</button>
                    </form>
                    <% if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 8){
	                    	%>
	                    	<br>
	                    	<span style="color:red; font-size:14px;">Quantity should be greater than 0!</span>
	                    	<%}} %>
                </div>
                <div class="grid-item">
                    <p>Biscuits</p>
                    <a href="#"> <img src="./images/menu/biscuits.jpg" /></a><br>
                    <form class="add-btn" action="addToCart.htm" method="post" >
                    		<input type="number" name="quantity" value="0" />
	                    	<input type="hidden" name="itemId" value="9" />
	                    	<button class="btn btn-outline-secondary">Add</button>
                    </form>
                    <% if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 9){
	                    	%>
	                    	<br>
	                    	<span style="color:red; font-size:14px;">Quantity should be greater than 0!</span>
	                    	<%}} %>
                </div>
                <div class="grid-item">
                    <p>Classics</p>
                    <a href="#"> <img src="./images/menu/classics.jpg" /></a><br>
                    <form class="add-btn" action="addToCart.htm" method="post" >
                    		<input type="number" name="quantity" value="0" />
	                    	<input type="hidden" name="itemId" value="10" />
	                    	<button class="btn btn-outline-secondary">Add</button>
                    </form>
                    <% if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 10){
	                    	%>
	                    	<br>
	                    	<span style="color:red; font-size:14px;">Quantity should be greater than 0!</span>
	                    	<%}} %>
                </div>
            </div>
            <div class="first-grid">
                <div class="grid-item">
                    <p>Coffee</p>
                    <a href="#"> <img src="./images/menu/coffee.jpg" /></a><br>
                    <form class="add-btn" action="addToCart.htm" method="post" >
                    		<input type="number" name="quantity" value="0" />
	                    	<input type="hidden" name="itemId"  value="11" />
	                    	<button class="btn btn-outline-secondary">Add</button>
                    </form>
                    <% if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 11){
	                    	%>
	                    	<br>
	                    	<span style="color:red; font-size:14px;">Quantity should be greater than 0!</span>
	                    	<%}} %>
                </div>
                <div class="grid-item">
                    <p>Sides & more</p>
                    <a href="#"> <img src="./images/menu/sides-more.jpg" /></a><br>
                    <form class="add-btn" action="addToCart.htm" method="post" >
                    		<input type="number" name="quantity" value="0" />
	                    	<input type="hidden" name="itemId" value="12" />
	                    	<button class="btn btn-outline-secondary">Add</button>
                    </form>
                    
                    <% if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 12){
	                    	%>
	                    	<br>
	                    	<span style="color:red; font-size:14px;">Quantity should be greater than 0!</span>
	                    	<%}} %>
                </div>
                <div class="grid-item">
                    <p>Beverages</p>
                    <a href="#"> <img src="./images/menu/beverages.jpg" /></a><br>
                    <form class="add-btn" action="addToCart.htm" method="post" >
                    		<input type="number" name="quantity" value="0" />
	                    	<input type="hidden" name="itemId" value="13" />
	                    	<button class="btn btn-outline-secondary">Add</button>
                    </form>
                    <% if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 13){
	                    	%>
	                    	<br>
	                    	<span style="color:red; font-size:14px;">Quantity should be greater than 0!</span>
	                    	<%}} %>
                </div>
                <div class="grid-item">
                    <p>Frosty</p>
                    <a href="#"> <img src="./images/menu/frosty.jpg" /></a><br>
                    <form class="add-btn" action="addToCart.htm" method="post" >
                    		<input type="number" name="quantity" value="0" />
	                    	<input type="hidden" name="itemId" value="14" />
	                    	<button class="btn btn-outline-secondary">Add</button>
                    </form>
                    <% if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 14){
	                    	%>
	                    	<br>
	                    	<span style="color:red; font-size:14px;">Quantity should be greater than 0!</span>
	                    	<%}} %>
                </div>
            </div>
            <div class="first-grid">
                <div class="grid-item">
                    <p>Bakery</p>
                    <a href="#"> <img src="./images/menu/bakery.jpg" /></a><br>
                    <form class="add-btn" action="addToCart.htm" method="post" >
                    		<input type="number" name="quantity" value="0" />
	                    	<input type="hidden" name="itemId" value="15" />
	                    	<button class="btn btn-outline-secondary">Add</button>
                    </form>
                    <% if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 15){
	                    	%>
	                    	<br>
	                    	<span style="color:red; font-size:14px;">Quantity should be greater than 0!</span>
	                    	<%}} %>
                </div>
                <div class="grid-item">
                    <p>LPH's kids meal</p>
                    <a href="#"> <img src="./images/menu/kids-meal.jpg" /></a><br>
                    <form class="add-btn" action="addToCart.htm"  method="post" >
                    		<input type="number" name="quantity" value="0" />
	                    	<input type="hidden" name="itemId" value="16" />
	                    	<button class="btn btn-outline-secondary">Add</button>
                    </form>
                    <% if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 16){
	                    	%>
	                    	<br>
	                    	<span style="color:red; font-size:14px;">Quantity should be greater than 0!</span>
	                    	<%}} %>
                </div>
                <div class="grid-item">
                    <p>Value Menu</p>
                    <a href="#"> <img src="./images/menu/value-menu.jpg" /></a><br>
                    <form class="add-btn" action="addToCart.htm" method="post" >
                    		<input type="number" name="quantity" value="0" />
	                    	<input type="hidden" name="itemId" value="17" />
	                    	<button class="btn btn-outline-secondary">Add</button>
                    </form>
                    <% if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 17){
	                    	%>
	                    	<br>
	                    	<span style="color:red; font-size:14px;">Quantity should be greater than 0!</span>
	                    	<%}} %>
                </div>
                <div class="grid-item">
                    <p>Meal Deals</p>
                    <a href="#"> <img src="./images/menu/meal-deals.jpg" /></a><br>
                    <form class="add-btn" action="addToCart.htm" method="post" >
                    		<input type="number" name="quantity" value="0" />
	                    	<input type="hidden" name="itemId" value="18" />
	                    	<button class="btn btn-outline-secondary">Add</button>
                    </form>
                    <% if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 18){
	                    	%>
	                    	<br>
	                    	<span style="color:red; font-size:14px;">Quantity should be greater than 0!</span>
	                    	<%}} %>
                </div>
            </div>
        </div>
        <div class="nutrition-info">
            <p>2,000 calories a day is used for general nutrition advice, but calorie needs vary. <br>Additional Nutrition information available upon request.</p>
        </div><br>
    </section>
    <!--END OF MENU SECTION-->

    <!--Footer-->
   <footer>
    <div class="footer">
        <div class="footer-left">
            <ul>
                <li>
                    <a href="#">Gift Card</a>
                </li>
                <li>
                    <a href="#">Contact Us</a>
                </li>
                <li>
                    <a href="https://www.amc.com/privacy" target="_blank">Privacy Policy</a>
                </li>
                <li>
                    <a href="https://www.amc.com/terms" target="_blank">Terms and Conditions</a>
                </li>
            </ul>
            <% if(session.getAttribute("user") == null){ %>
                <span><a href="loginForm.htm">Sign in <i class="fas fa-sign-in-alt"></i></a></span>
              <%} %>
        </div>

        <div class="footer-right">
            <a href="https://twitter.com/pratikghare888" target=_blank><i class="fab fa-twitter"></i></a>
            <a href="https://www.instagram.com/pratikghare_/" target=_blank><i class="fab fa-instagram"></i></a>
            <a href="https://www.facebook.com/pratikghare88" target=_blank><i class="fab fa-facebook-f"></i></a>
        </div>
    </div>
    <div class="footer-copyright">
        <h6>FOR ENTERTAINMENT PURPOSES.</h6>
        <h6>&copy; 2020 Praik Ghare & Pratik Mohite. All Rights Reserved.</h6>
    </div>
</footer>
<!--EndOfFooter-->
</body>
<script>
	
</script>
</html>