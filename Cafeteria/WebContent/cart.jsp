<!DOCTYPE html>
<%@page import="com.cafe.dto.Cart"%>
<%@page import="java.util.List"%>
<html lang="en">
<%@page import="com.cafe.dto.User" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cart | Imbiss Cafe</title>
    <link rel="icon" href="./images/logo/mainlogo.png">
    <link href="https://fonts.googleapis.com/css2?family=Chelsea+Market&family=Montserrat:wght@400;800;900&family=Bubblegum+Sans&family=Mali&family=Flamenco&family=Aclonica&family=Carter+One&family=Luckiest+Guy&family=Lato&family=Montserrat+Subrayada&family=Sarabun&family=Viga&family=Wellfleet&display=swap"
        rel="stylesheet">
    <link rel="stylesheet" href="./references/training.css">
    <link rel="stylesheet" href="./references/footer.css">
    <link rel="stylesheet" href="./references/navigationBar.css">
    <link rel="stylesheet" href="./references/animation.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css">
    <style>
		table {
		  font-family: 'Montserrat';
		  border-collapse: collapse;
		  width: 96%;
		  margin: 0 2%;
		}
		
		td, th {
		  border: 1px solid #dddddd;
		  text-align: left;
		  padding: 8px;
		}
		
		tr:nth-child(even) {
		  background-color: #dddddd;
		}
		th{
			color: rgb(10, 140, 82);
			font-weight: 600 !important;
			font-size: 19px !important;
		}
		.empty-cart{
			display:grid;
			grid-template-columns: 3fr 8fr 3fr;
			justify-content:center;
			margin-top:5em;
		}
		.empty-cart a{
			max-width: 10em;
			margin-top:2em;
		}
		.empty-cart >* {
			grid-column:2;
		}
		input[type="number"]{
			border:none;
			outline:none;
			border-radius: 5px;
			background: rgba(255,255,255,0.1) !important;
			width: 6em;
			padding: 5px 2em;
		}
		.edit-btn{
			outline: none;
			background: transparent;
			border:none;
			cursor:pointer;
		}
	</style>
</head>

<body>

	<% String name="User";
	if( session.getAttribute("user") != null)
	 name = ((User)session.getAttribute("user")).getUserName().split(" ")[0]; %>

    <!--NavigationBar-->
    <nav class="navbar navbar-expand-lg navbar-dark bg-secondary sticky-top">

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item mb-2 mt-1">
                    <a class="nav-link" href="index.jsp">HOME</a>
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
	 
   	<section style="min-height: 450px; display:flex; flex-direction:column;" >
   	<br>
   	<h1 style="margin-left:1em; font-family:'Montserrat'; font-weight:800"><%= name %>'s Cart</h1>
   	 <hr><br>
   	 <%
			  	List<Cart> list = (List<Cart>) request.getAttribute("itemsList");
			  	int i = 0;
			  	float total=0f;
			  	if(list.size() > 0){
			  %>
       
	   		<table>
			  <tr>
			    <th>No.</th>
			    <th>Product</th>
			    <th>Quatity</th>
			    <th>Price</th>
			    <th> </th>
			 
			  </tr>
			  <!-- <tr>
			    <td>Island Trading</td>
			    <td>Helen Bennett</td>
			    <td>UK</td>
			    <td>28.25</td>
			    <td><a href="delItem.htm"><i class="fas fa-edit text-primary"></i></a></td>
			    <td><a href="updateItem.htm"><i class="fas fa-trash-alt text-danger"></i></a></td>
			  </tr> -->
			 
			  <%
			  	for(Cart c : list){
			  		total += c.getCartPrice();
			  %>
			  
			   <tr>
			    <td><%= ++i %></td>
			    <td><%= c.getItemName() %></td>
			    
			    <td width="500">
			    <form method="post" action="updateQuantity.htm">
			    <input type="number" name="quantity" value="<%= c.getQuantity() %>" />
			     <input type="hidden" name="orderId" value="<%=c.getOrderId() %>" />
			     <input type="hidden" name="itemId" value="<%=c.getItemId() %>" />
			     <button class="edit-btn"><i class="fas fa-edit text-info "></i></button>
			     <% if(request.getAttribute("ZeroErr") != null){
			    	 	if((Integer)request.getAttribute("ZeroErr") == c.getOrderId()){
			    	 %>
			     <span style="color: red; font-size: 15px; margin-left:4em;">Quantity should be greater than 0.</span>
			     <%} 
			     }%>
			     </form>
			    </td>
			    <td><%= c.getCartPrice() %></td>
			   
		
			    
			    <td><a href="delItem.htm?orderId=<%=c.getOrderId() %>"><i class="fas fa-trash-alt text-danger"></i></a></td>
			  </tr>
			  <% } %>
			  <tr>
			  	<td></td>
			  	<td></td>
			  	<td class="text-primary" style="font-weight:600; text-align:center">Total Price => </td>
			  	<td><%= total %></td>
			  	<td></td>
			  </tr>
			</table>
			
			
			<div style="align-self:flex-end; margin-top:2em; margin-bottom:1em; margin-right: 1em">
				<a href="placeOrder.htm" class="btn btn-success"  style="font-family:'Montserrat'; color:#fff;">Proceed</a>
			</div>
			<% }
			  	else{ %>
				<div class="empty-cart">
					<div style="flex:1; display:flex; flex-direction:column; justify-content:center; align-items:center;">
						<h1 style="font-family: 'Montserrat'; "><i class="fas fa-exclamation-triangle text-danger"></i> Your Cart is Empty!</h1>
					<a href="userMenu.htm" class="btn btn-primary btn-block">Explore</a>
					</div>
				</div>
			<%} %>
   	</section>


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