/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.58
 * Generated at: 2020-11-05 13:29:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.cafe.dto.Cart;
import java.util.List;
import com.cafe.dto.User;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.20.RELEASE.jar", Long.valueOf(1604153983133L));
    _jspx_dependants.put("jar:file:/C:/Users/prati/OneDrive/Desktop/Cafeteria/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Cafeteria/WEB-INF/lib/spring-webmvc-4.3.20.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1539572356000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.cafe.dto.Cart");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Cart | Imbiss Cafe</title>\r\n");
      out.write("    <link rel=\"icon\" href=\"./images/logo/mainlogo.png\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Chelsea+Market&family=Montserrat:wght@400;800;900&family=Bubblegum+Sans&family=Mali&family=Flamenco&family=Aclonica&family=Carter+One&family=Luckiest+Guy&family=Lato&family=Montserrat+Subrayada&family=Sarabun&family=Viga&family=Wellfleet&display=swap\"\r\n");
      out.write("        rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./references/training.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./references/footer.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./references/navigationBar.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./references/animation.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.6.3/css/all.css\">\r\n");
      out.write("    <style>\r\n");
      out.write("\t\ttable {\r\n");
      out.write("\t\t  font-family: 'Montserrat';\r\n");
      out.write("\t\t  border-collapse: collapse;\r\n");
      out.write("\t\t  width: 96%;\r\n");
      out.write("\t\t  margin: 0 2%;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\ttd, th {\r\n");
      out.write("\t\t  border: 1px solid #dddddd;\r\n");
      out.write("\t\t  text-align: left;\r\n");
      out.write("\t\t  padding: 8px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\ttr:nth-child(even) {\r\n");
      out.write("\t\t  background-color: #dddddd;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tth{\r\n");
      out.write("\t\t\tcolor: rgb(10, 140, 82);\r\n");
      out.write("\t\t\tfont-weight: 600 !important;\r\n");
      out.write("\t\t\tfont-size: 19px !important;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.empty-cart{\r\n");
      out.write("\t\t\tdisplay:grid;\r\n");
      out.write("\t\t\tgrid-template-columns: 3fr 8fr 3fr;\r\n");
      out.write("\t\t\tjustify-content:center;\r\n");
      out.write("\t\t\tmargin-top:5em;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.empty-cart a{\r\n");
      out.write("\t\t\tmax-width: 10em;\r\n");
      out.write("\t\t\tmargin-top:2em;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.empty-cart >* {\r\n");
      out.write("\t\t\tgrid-column:2;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tinput[type=\"number\"]{\r\n");
      out.write("\t\t\tborder:none;\r\n");
      out.write("\t\t\toutline:none;\r\n");
      out.write("\t\t\tborder-radius: 5px;\r\n");
      out.write("\t\t\tbackground: rgba(255,255,255,0.1) !important;\r\n");
      out.write("\t\t\twidth: 6em;\r\n");
      out.write("\t\t\tpadding: 5px 2em;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.edit-btn{\r\n");
      out.write("\t\t\toutline: none;\r\n");
      out.write("\t\t\tbackground: transparent;\r\n");
      out.write("\t\t\tborder:none;\r\n");
      out.write("\t\t\tcursor:pointer;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");
 String name="User";
	if( session.getAttribute("user") != null)
	 name = ((User)session.getAttribute("user")).getUserName().split(" ")[0]; 
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--NavigationBar-->\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark bg-secondary sticky-top\">\r\n");
      out.write("\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("            <ul class=\"navbar-nav\">\r\n");
      out.write("                <li class=\"nav-item mb-2 mt-1\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"index.jsp\">HOME</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item mb-2 mt-1\" >\r\n");
      out.write("                    <a class=\"nav-link\" href=\"menu.jsp\">VIEW OUR MENU</a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write(" \t\t");
 if(session.getAttribute("user") != null){ 
      out.write("\r\n");
      out.write("\t\t\t<div class=\"dropdown ml-auto mr-5\">\r\n");
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
      out.write("\t\t\t<div class=\"ml-auto mr-5\">\r\n");
      out.write("\t\t<!-- \t<a href=\"loginForm.htm\" class=\"btn btn-outline-secondary\">Login</a> -->\r\n");
      out.write("\t\t\t\t<a class=\"btn btn-outline-light\" style=\"font-family: 'Chelsea Market'\" href=\"loginForm.htm\" role=\"button\">Login</a> \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <!--EndofNavigationBar-->\r\n");
      out.write("\t \r\n");
      out.write("   \t<section style=\"min-height: 450px; display:flex; flex-direction:column;\" >\r\n");
      out.write("   \t<br>\r\n");
      out.write("   \t<h1 style=\"margin-left:1em; font-family:'Montserrat'; font-weight:800\">");
      out.print( name );
      out.write("'s Cart</h1>\r\n");
      out.write("   \t <hr><br>\r\n");
      out.write("   \t ");

			  	List<Cart> list = (List<Cart>) request.getAttribute("itemsList");
			  	int i = 0;
			  	float total=0f;
			  	if(list.size() > 0){
			  
      out.write("\r\n");
      out.write("       \r\n");
      out.write("\t   \t\t<table>\r\n");
      out.write("\t\t\t  <tr>\r\n");
      out.write("\t\t\t    <th>No.</th>\r\n");
      out.write("\t\t\t    <th>Product</th>\r\n");
      out.write("\t\t\t    <th>Quatity</th>\r\n");
      out.write("\t\t\t    <th>Price</th>\r\n");
      out.write("\t\t\t    <th> </th>\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t  </tr>\r\n");
      out.write("\t\t\t  <!-- <tr>\r\n");
      out.write("\t\t\t    <td>Island Trading</td>\r\n");
      out.write("\t\t\t    <td>Helen Bennett</td>\r\n");
      out.write("\t\t\t    <td>UK</td>\r\n");
      out.write("\t\t\t    <td>28.25</td>\r\n");
      out.write("\t\t\t    <td><a href=\"delItem.htm\"><i class=\"fas fa-edit text-primary\"></i></a></td>\r\n");
      out.write("\t\t\t    <td><a href=\"updateItem.htm\"><i class=\"fas fa-trash-alt text-danger\"></i></a></td>\r\n");
      out.write("\t\t\t  </tr> -->\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t  ");

			  	for(Cart c : list){
			  		total += c.getCartPrice();
			  
      out.write("\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t   <tr>\r\n");
      out.write("\t\t\t    <td>");
      out.print( ++i );
      out.write("</td>\r\n");
      out.write("\t\t\t    <td>");
      out.print( c.getItemName() );
      out.write("</td>\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t    <td width=\"500\">\r\n");
      out.write("\t\t\t    <form method=\"post\" action=\"updateQuantity.htm\">\r\n");
      out.write("\t\t\t    <input type=\"number\" name=\"quantity\" value=\"");
      out.print( c.getQuantity() );
      out.write("\" />\r\n");
      out.write("\t\t\t     <input type=\"hidden\" name=\"orderId\" value=\"");
      out.print(c.getOrderId() );
      out.write("\" />\r\n");
      out.write("\t\t\t     <input type=\"hidden\" name=\"itemId\" value=\"");
      out.print(c.getItemId() );
      out.write("\" />\r\n");
      out.write("\t\t\t     <button class=\"edit-btn\"><i class=\"fas fa-edit text-info \"></i></button>\r\n");
      out.write("\t\t\t     ");
 if(request.getAttribute("ZeroErr") != null){
			    	 	if((Integer)request.getAttribute("ZeroErr") == c.getOrderId()){
			    	 
      out.write("\r\n");
      out.write("\t\t\t     <span style=\"color: red; font-size: 15px; margin-left:4em;\">Quantity should be greater than 0.</span>\r\n");
      out.write("\t\t\t     ");
} 
			     }
      out.write("\r\n");
      out.write("\t\t\t     </form>\r\n");
      out.write("\t\t\t    </td>\r\n");
      out.write("\t\t\t    <td>");
      out.print( c.getCartPrice() );
      out.write("</td>\r\n");
      out.write("\t\t\t   \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t    <td><a href=\"delItem.htm?orderId=");
      out.print(c.getOrderId() );
      out.write("\"><i class=\"fas fa-trash-alt text-danger\"></i></a></td>\r\n");
      out.write("\t\t\t  </tr>\r\n");
      out.write("\t\t\t  ");
 } 
      out.write("\r\n");
      out.write("\t\t\t  <tr>\r\n");
      out.write("\t\t\t  \t<td></td>\r\n");
      out.write("\t\t\t  \t<td></td>\r\n");
      out.write("\t\t\t  \t<td class=\"text-primary\" style=\"font-weight:600; text-align:center\">Total Price => </td>\r\n");
      out.write("\t\t\t  \t<td>");
      out.print( total );
      out.write("</td>\r\n");
      out.write("\t\t\t  \t<td></td>\r\n");
      out.write("\t\t\t  </tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div style=\"align-self:flex-end; margin-top:2em; margin-bottom:1em; margin-right: 1em\">\r\n");
      out.write("\t\t\t\t<a href=\"placeOrder.htm\" class=\"btn btn-success\"  style=\"font-family:'Montserrat'; color:#fff;\">Proceed</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t");
 }
			  	else{ 
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"empty-cart\">\r\n");
      out.write("\t\t\t\t\t<div style=\"flex:1; display:flex; flex-direction:column; justify-content:center; align-items:center;\">\r\n");
      out.write("\t\t\t\t\t\t<h1 style=\"font-family: 'Montserrat'; \"><i class=\"fas fa-exclamation-triangle text-danger\"></i> Your Cart is Empty!</h1>\r\n");
      out.write("\t\t\t\t\t<a href=\"userMenu.htm\" class=\"btn btn-primary btn-block\">Explore</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("   \t</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--Footer-->\r\n");
      out.write("    <footer>\r\n");
      out.write("        <div class=\"footer\">\r\n");
      out.write("            <div class=\"footer-left\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">Gift Card</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">Contact Us</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"https://www.amc.com/privacy\" target=\"_blank\">Privacy Policy</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"https://www.amc.com/terms\" target=\"_blank\">Terms and Conditions</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              \r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"footer-right\">\r\n");
      out.write("                <a href=\"https://twitter.com/pratikghare888\" target=_blank><i class=\"fab fa-twitter\"></i></a>\r\n");
      out.write("                <a href=\"https://www.instagram.com/pratikghare_/\" target=_blank><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                <a href=\"https://www.facebook.com/pratikghare88\" target=_blank><i class=\"fab fa-facebook-f\"></i></a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"footer-copyright\">\r\n");
      out.write("            <h6>FOR ENTERTAINMENT PURPOSES.</h6>\r\n");
      out.write("            <h6>&copy; 2020 Pratik Ghare & Pratik Mohite. All Rights Reserved.</h6>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <!--EndOfFooter-->\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
