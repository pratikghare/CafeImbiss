/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.58
 * Generated at: 2020-11-04 23:16:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.cafe.dto.User;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.cafe.dto.User");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Menu | Imbiss Cafe</title>\r\n");
      out.write("    <link rel=\"icon\" href=\"./images/logo/mainlogo.png\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Chelsea+Market&family=Montserrat:wght@400;800;900&family=Bubblegum+Sans&family=Mali&family=Flamenco&family=Aclonica&family=Carter+One&family=Luckiest+Guy&family=Lato&family=Montserrat+Subrayada&family=Sarabun&family=Viga&family=Wellfleet&display=swap\"\r\n");
      out.write("        rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./references/menu.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./references/footer.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./references/navigationBar.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./references/animation.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.6.3/css/all.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("\tinput[type=\"number\"]{\r\n");
      out.write("\t\tborder: none;\r\n");
      out.write("\t    background: rgba(255, 255, 255, 0.6);\r\n");
      out.write("\t    padding: 7px 1em;\r\n");
      out.write("\t    width:4em;\r\n");
      out.write("\t    border-radius: 4px;\r\n");
      out.write("\t    outline: none;\r\n");
      out.write("\t}\r\n");
      out.write("\t.add-btn{\r\n");
      out.write("\t\tdisplay:flex;\r\n");
      out.write("\t\talign-items:center;\r\n");
      out.write("\t\tjustify-content:space-evenly;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <!--NavigationBar-->\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark bg-primary sticky-top\">\r\n");
      out.write("\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("            <ul class=\"navbar-nav\">\r\n");
      out.write("                <li class=\"nav-item mb-2 mt-1\">\r\n");
      out.write("                    <a class=\"nav-link \" href=\"index.jsp\">HOME</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item mb-2 mt-1\" >\r\n");
      out.write("                    <a class=\"nav-link active\" href=\"menu.jsp\">VIEW OUR MENU</a>\r\n");
      out.write("                </li>\r\n");
      out.write("             \r\n");
      out.write("            </ul>\r\n");
      out.write("   ");
 
   boolean flag;
   if(flag = (session.getAttribute("user") != null)){ 
      out.write("\r\n");
      out.write("\t\t\t<div class=\"dropdown ml-auto mr-4\">\r\n");
      out.write("\t\t\t  <button style=\"font-family: 'Chelsea Market'\"  class=\"btn btn-outline-light dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("\t\t\t    ");
      out.print( session.getAttribute("user") != null ? ((User)session.getAttribute("user")).getUserName():"Hello" );
      out.write("\r\n");
      out.write("\t\t\t  </button>\r\n");
      out.write("\t\t\t  <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\r\n");
      out.write("\t\t\t    <a style=\"font-family: 'Montserrat'; font-size:15px\" class=\"dropdown-item\" href=\"account.htm\">Manage Account</a>\r\n");
      out.write("\t\t\t    <a style=\"font-family: 'Montserrat'; font-size:15px\" class=\"dropdown-item\" href=\"getCart.htm\">Cart</a>\r\n");
      out.write("\t\t\t    <div class=\"dropdown-divider\"></div>\r\n");
      out.write("          \t\t<a style=\"font-family: 'Montserrat'; font-size:15px\" class=\"dropdown-item\" href=\"logout.htm\">Logout</a>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t");
 }else{
      out.write("\r\n");
      out.write("\t\t\t<div class=\"ml-auto mr-4\">\r\n");
      out.write("\t\t<!-- \t<a href=\"loginForm.htm\" class=\"btn btn-outline-secondary\">Login</a> -->\r\n");
      out.write("\t\t\t\t<a class=\"btn btn-outline-light\" style=\"font-family: 'Chelsea Market'\" href=\"loginForm.htm\" role=\"button\">Login</a> \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t");
} 
      out.write("\t\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <!--EndofNavigationBar-->\r\n");
      out.write("\r\n");
      out.write("    <!--MENU SECTION-->\r\n");
      out.write("    <section class=\"menu-section\">\r\n");
      out.write("        <br><br>\r\n");
      out.write("        <h1>Menu</h1>\r\n");
      out.write("        <hr><br><br>\r\n");
      out.write("        <div>\r\n");
      out.write("            <div class=\"first-grid\">\r\n");
      out.write("                <div class=\"grid-item\">\r\n");
      out.write("                    <a href=\"#\"> <img id=\"breakfast-ad\" src=\"./images/menu/breakfast.jpg\" /></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"grid-item\">\r\n");
      out.write("                    <p>Combos</p>\r\n");
      out.write("                    <a href=\"#\"> <img src=\"./images/menu/combos.jpg\" /></a>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <form class=\"add-btn\" action=\"addToCart.htm\" method=\"post\" >\r\n");
      out.write("                    \t\t<input type=\"number\" name=\"quantity\" value=\"0\" />\r\n");
      out.write("\t                    \t<button class=\"btn btn-outline-secondary\">Add</button>\r\n");
      out.write("\t                    \t<input type=\"hidden\" name=\"itemId\" value=\"1\" />\r\n");
      out.write("\t                    \t\r\n");
      out.write("                    </form>\r\n");
      out.write("                    ");
 if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 1){
	                    	
      out.write("\r\n");
      out.write("\t                    \t<br>\r\n");
      out.write("\t                    \t<span style=\"color:red; font-size:14px;\">Quantity should be greater than 0!</span>\r\n");
      out.write("\t                    \t");
}} 
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"grid-item\">\r\n");
      out.write("                    <p>Feed the Fam Deals</p>\r\n");
      out.write("                    <a href=\"#\"> <img src=\"./images/menu/feed-fam-deals.jpg\" /></a><br>\r\n");
      out.write("                    <form class=\"add-btn\" action=\"addToCart.htm\" method=\"post\" >\r\n");
      out.write("                    \t\t<input type=\"number\" name=\"quantity\" value=\"0\" />\r\n");
      out.write("\t                    \t<input type=\"hidden\" name=\"itemId\" value=\"2\" />\r\n");
      out.write("\t                    \t<button class=\"btn btn-outline-secondary\">Add</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    ");
 if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 2){
	                    	
      out.write("\r\n");
      out.write("\t                    \t<br>\r\n");
      out.write("\t                    \t<span style=\"color:red; font-size:14px;\">Quantity should be greater than 0!</span>\r\n");
      out.write("\t                    \t");
}} 
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"first-grid\">\r\n");
      out.write("                <div class=\"grid-item\" style=\"margin-left: 0;\">\r\n");
      out.write("                    <p>Hamburgers</p>\r\n");
      out.write("                    <a href=\"#\"> <img src=\"./images/menu/hamburgers.jpg\" /></a><br>\r\n");
      out.write("                    <form class=\"add-btn\" action=\"addToCart.htm\" method=\"post\" >\r\n");
      out.write("                    \t\t<input type=\"number\" name=\"quantity\" value=\"0\" />\r\n");
      out.write("\t                    \t<input type=\"hidden\" name=\"itemId\" value=\"3\" />\r\n");
      out.write("\t                    \t<button class=\"btn btn-outline-secondary\">Add</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    ");
 if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 3){
	                    	
      out.write("\r\n");
      out.write("\t                    \t<br>\r\n");
      out.write("\t                    \t<span style=\"color:red; font-size:14px;\">Quantity should be greater than 0!</span>\r\n");
      out.write("\t                    \t");
}} 
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"grid-item chick-sand\" style=\"margin-left: 0; margin-top: -10px;\">\r\n");
      out.write("                    <p>Chicken Sandwiches & Nuggets</p>\r\n");
      out.write("                    <a href=\"#\"> <img src=\"./images/menu/chicken-sandwich-nuggets.jpg\" /></a><br>\r\n");
      out.write("                    <form class=\"add-btn\" action=\"addToCart.htm\" method=\"post\" >\r\n");
      out.write("                    \t\t<input type=\"number\" name=\"quantity\" value=\"0\" />\r\n");
      out.write("\t                    \t<input type=\"hidden\" name=\"itemId\" value=\"4\" />\r\n");
      out.write("\t                    \t<button class=\"btn btn-outline-secondary\">Add</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    ");
 if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 4){
	                    	
      out.write("\r\n");
      out.write("\t                    \t<br>\r\n");
      out.write("\t                    \t<span style=\"color:red; font-size:14px;\">Quantity should be greater than 0!</span>\r\n");
      out.write("\t                    \t");
}} 
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"grid-item\" style=\"margin-left: -7%;\">\r\n");
      out.write("                    <p>Fresh-Made Salads</p>\r\n");
      out.write("                    <a href=\"#\"> <img src=\"./images/menu/salads.jpg\" /></a><br>\r\n");
      out.write("                    <form class=\"add-btn\" action=\"addToCart.htm\" method=\"post\" >\r\n");
      out.write("                    \t\t<input type=\"number\" name=\"quantity\" value=\"0\" />\r\n");
      out.write("\t                    \t<input type=\"hidden\" name=\"itemId\" value=\"5\" />\r\n");
      out.write("\t                    \t<button class=\"btn btn-outline-secondary\" >Add</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    ");
 if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 5){
	                    	
      out.write("\r\n");
      out.write("\t                    \t<br>\r\n");
      out.write("\t                    \t<span style=\"color:red; font-size:14px;\">Quantity should be greater than 0!</span>\r\n");
      out.write("\t                    \t");
}} 
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"grid-item\">\r\n");
      out.write("                    <p>Fries & Sides</p>\r\n");
      out.write("                    <a href=\"#\"> <img src=\"./images/menu/siders.jpg\" /></a><br>\r\n");
      out.write("                    <form class=\"add-btn\" action=\"addToCart.htm\" method=\"post\" >\r\n");
      out.write("                    \t\t<input type=\"number\" name=\"quantity\" value=\"0\" />\r\n");
      out.write("\t                    \t<input type=\"hidden\" name=\"itemId\" value=\"6\" />\r\n");
      out.write("\t                    \t<button class=\"btn btn-outline-secondary\">Add</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    ");
 if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 6){
	                    	
      out.write("\r\n");
      out.write("\t                    \t<br>\r\n");
      out.write("\t                    \t<span style=\"color:red; font-size:14px;\">Quantity should be greater than 0!</span>\r\n");
      out.write("\t                    \t");
}} 
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"first-grid\">\r\n");
      out.write("                <div class=\"grid-item\">\r\n");
      out.write("                    <p>Breakfast Combos</p>\r\n");
      out.write("                    <a href=\"#\"> <img src=\"./images/menu/breakfast-combos.jpg\" /></a><br>\r\n");
      out.write("                    <form class=\"add-btn\" action=\"addToCart.htm\" method=\"post\" >\r\n");
      out.write("                    \t\t<input type=\"number\" name=\"quantity\" value=\"0\" />\r\n");
      out.write("\t                    \t<input type=\"hidden\" name=\"itemId\" value=\"7\" />\r\n");
      out.write("\t                    \t<button class=\"btn btn-outline-secondary\">Add</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    ");
 if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 7){
	                    	
      out.write("\r\n");
      out.write("\t                    \t<br>\r\n");
      out.write("\t                    \t<span style=\"color:red; font-size:14px;\">Quantity should be greater than 0!</span>\r\n");
      out.write("\t                    \t");
}} 
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"grid-item\">\r\n");
      out.write("                    <p>Croissants</p>\r\n");
      out.write("                    <a href=\"#\"> <img src=\"./images/menu/croissants.jpg\" /></a><br>\r\n");
      out.write("                    <form class=\"add-btn\" action=\"addToCart.htm\" method=\"post\" >\r\n");
      out.write("                    \t\t<input type=\"number\" name=\"quantity\" value=\"0\" />\r\n");
      out.write("\t                    \t<input type=\"hidden\" name=\"itemId\" value=\"8\" />\r\n");
      out.write("\t                    \t<button class=\"btn btn-outline-secondary\">Add</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    ");
 if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 8){
	                    	
      out.write("\r\n");
      out.write("\t                    \t<br>\r\n");
      out.write("\t                    \t<span style=\"color:red; font-size:14px;\">Quantity should be greater than 0!</span>\r\n");
      out.write("\t                    \t");
}} 
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"grid-item\">\r\n");
      out.write("                    <p>Biscuits</p>\r\n");
      out.write("                    <a href=\"#\"> <img src=\"./images/menu/biscuits.jpg\" /></a><br>\r\n");
      out.write("                    <form class=\"add-btn\" action=\"addToCart.htm\" method=\"post\" >\r\n");
      out.write("                    \t\t<input type=\"number\" name=\"quantity\" value=\"0\" />\r\n");
      out.write("\t                    \t<input type=\"hidden\" name=\"itemId\" value=\"9\" />\r\n");
      out.write("\t                    \t<button class=\"btn btn-outline-secondary\">Add</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    ");
 if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 9){
	                    	
      out.write("\r\n");
      out.write("\t                    \t<br>\r\n");
      out.write("\t                    \t<span style=\"color:red; font-size:14px;\">Quantity should be greater than 0!</span>\r\n");
      out.write("\t                    \t");
}} 
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"grid-item\">\r\n");
      out.write("                    <p>Classics</p>\r\n");
      out.write("                    <a href=\"#\"> <img src=\"./images/menu/classics.jpg\" /></a><br>\r\n");
      out.write("                    <form class=\"add-btn\" action=\"addToCart.htm\" method=\"post\" >\r\n");
      out.write("                    \t\t<input type=\"number\" name=\"quantity\" value=\"0\" />\r\n");
      out.write("\t                    \t<input type=\"hidden\" name=\"itemId\" value=\"10\" />\r\n");
      out.write("\t                    \t<button class=\"btn btn-outline-secondary\">Add</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    ");
 if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 10){
	                    	
      out.write("\r\n");
      out.write("\t                    \t<br>\r\n");
      out.write("\t                    \t<span style=\"color:red; font-size:14px;\">Quantity should be greater than 0!</span>\r\n");
      out.write("\t                    \t");
}} 
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"first-grid\">\r\n");
      out.write("                <div class=\"grid-item\">\r\n");
      out.write("                    <p>Coffee</p>\r\n");
      out.write("                    <a href=\"#\"> <img src=\"./images/menu/coffee.jpg\" /></a><br>\r\n");
      out.write("                    <form class=\"add-btn\" action=\"addToCart.htm\" method=\"post\" >\r\n");
      out.write("                    \t\t<input type=\"number\" name=\"quantity\" value=\"0\" />\r\n");
      out.write("\t                    \t<input type=\"hidden\" name=\"itemId\"  value=\"11\" />\r\n");
      out.write("\t                    \t<button class=\"btn btn-outline-secondary\">Add</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    ");
 if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 11){
	                    	
      out.write("\r\n");
      out.write("\t                    \t<br>\r\n");
      out.write("\t                    \t<span style=\"color:red; font-size:14px;\">Quantity should be greater than 0!</span>\r\n");
      out.write("\t                    \t");
}} 
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"grid-item\">\r\n");
      out.write("                    <p>Sides & more</p>\r\n");
      out.write("                    <a href=\"#\"> <img src=\"./images/menu/sides-more.jpg\" /></a><br>\r\n");
      out.write("                    <form class=\"add-btn\" action=\"addToCart.htm\" method=\"post\" >\r\n");
      out.write("                    \t\t<input type=\"number\" name=\"quantity\" value=\"0\" />\r\n");
      out.write("\t                    \t<input type=\"hidden\" name=\"itemId\" value=\"12\" />\r\n");
      out.write("\t                    \t<button class=\"btn btn-outline-secondary\">Add</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    \r\n");
      out.write("                    ");
 if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 12){
	                    	
      out.write("\r\n");
      out.write("\t                    \t<br>\r\n");
      out.write("\t                    \t<span style=\"color:red; font-size:14px;\">Quantity should be greater than 0!</span>\r\n");
      out.write("\t                    \t");
}} 
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"grid-item\">\r\n");
      out.write("                    <p>Beverages</p>\r\n");
      out.write("                    <a href=\"#\"> <img src=\"./images/menu/beverages.jpg\" /></a><br>\r\n");
      out.write("                    <form class=\"add-btn\" action=\"addToCart.htm\" method=\"post\" >\r\n");
      out.write("                    \t\t<input type=\"number\" name=\"quantity\" value=\"0\" />\r\n");
      out.write("\t                    \t<input type=\"hidden\" name=\"itemId\" value=\"13\" />\r\n");
      out.write("\t                    \t<button class=\"btn btn-outline-secondary\">Add</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    ");
 if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 13){
	                    	
      out.write("\r\n");
      out.write("\t                    \t<br>\r\n");
      out.write("\t                    \t<span style=\"color:red; font-size:14px;\">Quantity should be greater than 0!</span>\r\n");
      out.write("\t                    \t");
}} 
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"grid-item\">\r\n");
      out.write("                    <p>Frosty</p>\r\n");
      out.write("                    <a href=\"#\"> <img src=\"./images/menu/frosty.jpg\" /></a><br>\r\n");
      out.write("                    <form class=\"add-btn\" action=\"addToCart.htm\" method=\"post\" >\r\n");
      out.write("                    \t\t<input type=\"number\" name=\"quantity\" value=\"0\" />\r\n");
      out.write("\t                    \t<input type=\"hidden\" name=\"itemId\" value=\"14\" />\r\n");
      out.write("\t                    \t<button class=\"btn btn-outline-secondary\">Add</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    ");
 if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 14){
	                    	
      out.write("\r\n");
      out.write("\t                    \t<br>\r\n");
      out.write("\t                    \t<span style=\"color:red; font-size:14px;\">Quantity should be greater than 0!</span>\r\n");
      out.write("\t                    \t");
}} 
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"first-grid\">\r\n");
      out.write("                <div class=\"grid-item\">\r\n");
      out.write("                    <p>Bakery</p>\r\n");
      out.write("                    <a href=\"#\"> <img src=\"./images/menu/bakery.jpg\" /></a><br>\r\n");
      out.write("                    <form class=\"add-btn\" action=\"addToCart.htm\" method=\"post\" >\r\n");
      out.write("                    \t\t<input type=\"number\" name=\"quantity\" value=\"0\" />\r\n");
      out.write("\t                    \t<input type=\"hidden\" name=\"itemId\" value=\"15\" />\r\n");
      out.write("\t                    \t<button class=\"btn btn-outline-secondary\">Add</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    ");
 if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 15){
	                    	
      out.write("\r\n");
      out.write("\t                    \t<br>\r\n");
      out.write("\t                    \t<span style=\"color:red; font-size:14px;\">Quantity should be greater than 0!</span>\r\n");
      out.write("\t                    \t");
}} 
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"grid-item\">\r\n");
      out.write("                    <p>LPH's kids meal</p>\r\n");
      out.write("                    <a href=\"#\"> <img src=\"./images/menu/kids-meal.jpg\" /></a><br>\r\n");
      out.write("                    <form class=\"add-btn\" action=\"addToCart.htm\"  method=\"post\" >\r\n");
      out.write("                    \t\t<input type=\"number\" name=\"quantity\" value=\"0\" />\r\n");
      out.write("\t                    \t<input type=\"hidden\" name=\"itemId\" value=\"16\" />\r\n");
      out.write("\t                    \t<button class=\"btn btn-outline-secondary\">Add</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    ");
 if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 16){
	                    	
      out.write("\r\n");
      out.write("\t                    \t<br>\r\n");
      out.write("\t                    \t<span style=\"color:red; font-size:14px;\">Quantity should be greater than 0!</span>\r\n");
      out.write("\t                    \t");
}} 
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"grid-item\">\r\n");
      out.write("                    <p>Value Menu</p>\r\n");
      out.write("                    <a href=\"#\"> <img src=\"./images/menu/value-menu.jpg\" /></a><br>\r\n");
      out.write("                    <form class=\"add-btn\" action=\"addToCart.htm\" method=\"post\" >\r\n");
      out.write("                    \t\t<input type=\"number\" name=\"quantity\" value=\"0\" />\r\n");
      out.write("\t                    \t<input type=\"hidden\" name=\"itemId\" value=\"17\" />\r\n");
      out.write("\t                    \t<button class=\"btn btn-outline-secondary\">Add</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    ");
 if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 17){
	                    	
      out.write("\r\n");
      out.write("\t                    \t<br>\r\n");
      out.write("\t                    \t<span style=\"color:red; font-size:14px;\">Quantity should be greater than 0!</span>\r\n");
      out.write("\t                    \t");
}} 
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"grid-item\">\r\n");
      out.write("                    <p>Meal Deals</p>\r\n");
      out.write("                    <a href=\"#\"> <img src=\"./images/menu/meal-deals.jpg\" /></a><br>\r\n");
      out.write("                    <form class=\"add-btn\" action=\"addToCart.htm\" method=\"post\" >\r\n");
      out.write("                    \t\t<input type=\"number\" name=\"quantity\" value=\"0\" />\r\n");
      out.write("\t                    \t<input type=\"hidden\" name=\"itemId\" value=\"18\" />\r\n");
      out.write("\t                    \t<button class=\"btn btn-outline-secondary\">Add</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    ");
 if(request.getAttribute("ZeroErr") != null){ 
	                    		if((Integer)request.getAttribute("ZeroErr") == 18){
	                    	
      out.write("\r\n");
      out.write("\t                    \t<br>\r\n");
      out.write("\t                    \t<span style=\"color:red; font-size:14px;\">Quantity should be greater than 0!</span>\r\n");
      out.write("\t                    \t");
}} 
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"nutrition-info\">\r\n");
      out.write("            <p>2,000 calories a day is used for general nutrition advice, but calorie needs vary. <br>Additional Nutrition information available upon request.</p>\r\n");
      out.write("        </div><br>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!--END OF MENU SECTION-->\r\n");
      out.write("\r\n");
      out.write("    <!--Footer-->\r\n");
      out.write("   <footer>\r\n");
      out.write("    <div class=\"footer\">\r\n");
      out.write("        <div class=\"footer-left\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">Gift Card</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">Contact Us</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"https://www.amc.com/privacy\" target=\"_blank\">Privacy Policy</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"https://www.amc.com/terms\" target=\"_blank\">Terms and Conditions</a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            ");
 if(session.getAttribute("user") == null){ 
      out.write("\r\n");
      out.write("                <span><a href=\"loginForm.htm\">Sign in <i class=\"fas fa-sign-in-alt\"></i></a></span>\r\n");
      out.write("              ");
} 
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"footer-right\">\r\n");
      out.write("            <a href=\"https://twitter.com/pratikghare888\" target=_blank><i class=\"fab fa-twitter\"></i></a>\r\n");
      out.write("            <a href=\"https://www.instagram.com/pratikghare_/\" target=_blank><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("            <a href=\"https://www.facebook.com/pratikghare88\" target=_blank><i class=\"fab fa-facebook-f\"></i></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"footer-copyright\">\r\n");
      out.write("        <h6>FOR ENTERTAINMENT PURPOSES.</h6>\r\n");
      out.write("        <h6>&copy; 2020 Praik Ghare & Pratik Mohite. All Rights Reserved.</h6>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>\r\n");
      out.write("<!--EndOfFooter-->\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
