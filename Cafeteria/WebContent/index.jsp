<!DOCTYPE html>
<%@page import="org.hibernate.Session"%>
<html lang="en">
<%@page import="com.cafe.dto.User" %>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Imbiss Cafe</title>
    <link rel="icon" href="./images/logo/mainlogo.png">
    <link href="https://fonts.googleapis.com/css2?family=Chelsea+Market&family=Montserrat:wght@400;800;900&family=Bubblegum+Sans&family=Mali&family=Flamenco&family=Aclonica&family=Carter+One&family=Luckiest+Guy&family=Lato&family=Montserrat+Subrayada&family=Sarabun&family=Viga&family=Wellfleet&display=swap"
        rel="stylesheet">
    <link rel="stylesheet" href="./references/main.css">
    <link rel="stylesheet" href="./references/footer.css">
    <link rel="stylesheet" href="./references/navigationBar.css">
    <link rel="stylesheet" href="./references/animation.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css">
</head>

<body>
    <!--NavigationBar-->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item mb-2 mt-1">
                    <a class="nav-link active" href="index.jsp">HOME</a>
                </li>
                <li class="nav-item mb-2 mt-1" >
                    <a class="nav-link" href="menu.jsp">VIEW OUR MENU</a>
                </li>
            </ul>
            <% if(session.getAttribute("user") != null){ %>
			<div class="dropdown ml-auto mr-5">
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
			<div class="ml-auto mr-5">
		<!-- 	<a href="loginForm.htm" class="btn btn-outline-secondary">Login</a> -->
				<a class="btn btn-outline-light" style="font-family: 'Chelsea Market'" href="loginForm.htm" role="button">Login</a> 
			</div>
			<%} %>
        </div>
    </nav>
    <!--EndofNavigationBar-->

    <!--Header-->
    <header class="header" style="background: linear-gradient(rgba(0, 0, 0, 0.3), rgba(0, 0, 0, 0.6)), url('./images/background/bkg-menu.jpg') center/cover no-repeat fixed;">
        <div class="hero">

            <a href="index.jsp" style="margin-left:50%; margin-top:2%;">
                <img id="main-logo" src="./images/logo/mainlogo.png" alt="LosPollosHermanos" />
            </a>
            <br><br>
            <div class="searchbar">
                <input class="search_input" type="text" name="" placeholder="Search...">
                <a href="#" class="search_icon"><i class="fas fa-search"></i></a>
            </div>

        </div>
    </header>
    <!--EndofHeader-->

    


    <!--WhatWeDo-->
    <div class="role">
        <div>
            <h1>
                Why Imbiss Cafe?
            </h1>
           <%--  <h2>Welcome, <%= session.getAttribute("user") != null ? ((User)session.getAttribute("user")).getUserName():"User" %></h2> --%>
        </div><br><br>
        <div>
            <p>The need for free food is real. Same goes for a job that lets you be you. Here at our Cafeteria we'll work with all your needs
            . Bring your real self to do this thing. And have some fun too. <b>WE GET YOU. WE GOT YOU! </b></p>
        </div>
    </div>

    <div class="video-grid-container">
        <div>

        

        </div>
    </div>

    <section class="wwd-container">
        <div class="wwd-franchise">
            <div class="wwd-content">
                <h5>FRANCHISING</h5>
                <h1>Become a Franchise</h1><br>
                <p>Our Cafeteria is constantly growing. From the first restaurant, we've continued to expand our vision to help other people become successful business owners by owning a franchise. We
                    look for franchisees who are committed to quality, not cutting corners.</p><br>
                <button>Learn more about Franchising</button>
            </div>
        </div>
        <div class="wwd-invesment">
            <div class="wwd-content">
                <h5>INVESTORS</h5>
                <h1>Investing in Quality</h1><br>
                <p>We believe in Quality! You will get the best quality food. That's our promise to you!</p>
                <br><br><button>SEE OUR PERFORMANCE</button>
            </div>
        </div>
    </section>
    <!--EndOfWhatWeDo-->

    <!--ChickenSandwich-->
    <section class="chicken-sandwich">
        <div>
            <h1></h1>
        </div>
        <div class="chicken-sandwich-content">
            <h1>Our food delivers-<br>and gets delivered.</h1><br><br><br>
            <p>If it's spicy you need, we got the OG Spicy Chicken Sandwich. We also got those Made to Crave chicken sandwiches your taste buds are dreaming about. Oh, and you know we're all about that nugg life.</p>
        </div>
    </section>
    <!--EndOfChickenSandwich-->


    <!--MenuSection-->
    <section class="menu" id="menu">
        <article class="menu-image"></article>
        <article class="menu-text">
            <div class="menu-text-center"><br><br><br><br><br>
                <p>It's the best ingredients. The spiciest spices. All prepared with loving care! And always delivered with a friendly smile. That's our promise.</p>
                <!-- <p style="font-size: 15px; text-align: right;">Gustavo Fring -- Owner and Proprietor</p> -->


                <br><a href="./menu.jsp">Explore</a><br>
                <!-- <img id="gustavo-image" src="images/people/gus.png" alt="Gustavo Fring" /> -->
            </div>
        </article>
    </section>
    <!--EndofMenuSection-->

    <!--SpicyChicken-->
    <section class="spicy-chicken">

        <div class="spicy-chicken-content">
            <form action="userMenu.htm">
                <h1>Pick your chicken.<br> Get 2 for $5.</h1><br><br>
                <p>Chicken fans, this one goes out to you. We're serving up the hits with 2 for $5.</p>
                <br>
                <p>You can get all hot with a Spicy Chicken Sandwich and a 10 PC Spicy Nugg, or keep it cool with a Homestyle Chicken Sandwich and 10 PC Crispy Nugg. You can even double up on the nuggs if you want.</p>
                <br>
                <p>However you shuffle them, if chicken is your jam, this deal is gonna bring the house down.</p><br>
                <button>START YOUR ORDER</button><br><br><br>
            </form>
        </div>
    </section>
    <!--EndOfSpicyChicken-->
    <div style="clear: both;">
    </div>
    <!--NutritionSection-->
    <section class="nutrition-section">
        <div class="nutrition-content">
            <h1>Nutrition Information</h1><br>
            <p>Allergens. Calories. Ingredients. Let's find something that checks all your boxes.</p>
            <br><button>Learn More</button><br><br>
        </div>
        <div>
            <img src="images/background/nutrition.jpg" alt="Nutrition" />
        </div>
    </section>

    <section class="copyright-sprite">
        <!--“Sprite” is a registered trademark of The Coca-Cola Company. Trademarks are the property of their respective owner. *First of all, no, a side is not similar to a sandwich. But-->
        <p> If you don't like something you got for breakfast, you can either show us your original receipt-like, your legit receipt. No tricky stuff. Or you can contact our Customer Care, give them your receipt and contact info, and they'll
            take care of you. Either way, you gotta do it by 10:30 AM the next day. Bottled drinks and full combos don't count. No credit or refunds, and only one exchange per receipt. We ARE still a business, after all. Promotion available for a limited
            time at participating locations only. Subject to cancellation at any time. Geez. Lawyers, amirite?</p>
    </section>
    <!--EndOfNutritionSection-->

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
            <h6>&copy; 2020 Pratik Ghare & Pratik Mohite. All Rights Reserved.</h6>
        </div>
    </footer>
    <!--EndOfFooter-->
</body>

</html>