package com.cafe.cntr;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.cafe.dto.Cart;
import com.cafe.dto.Menu;
import com.cafe.dto.User;
import com.cafe.serv.CartService;
import com.cafe.serv.CartServiceImple;
import com.cafe.serv.MenuServiceImple;
import com.cafe.serv.UserServiceImple;

@Controller
public class UserController {
	
	@Autowired
	private UserServiceImple userService;
	@Autowired
	private MenuServiceImple menuService;
	@Autowired 
	private CartServiceImple cartService;
	@Autowired
	private MailSender mailSender;
	
	@RequestMapping(value = "/regForm.htm")
	public String registerForm(ModelMap map) {
		map.put("user", new User());
		return "register";
	}
	
	@RequestMapping(value = "/regUser.htm", method = RequestMethod.POST)
	public String registerUser(User user) {
		System.out.println(user.getUserName());
		System.out.println(user.getUserEmail());
		System.out.println(user.getUserPass());
		System.out.println(user.getUserPhone());
		System.out.println(user.getUserCity());
		userService.addNewUser(user);
		return "login";
	}
	
	@RequestMapping(value = "/loginForm.htm")
	public String loginForm(ModelMap map) {
		map.put("user", new User());
		return "login";
	}
	
	@RequestMapping(value = "/validateUser.htm", method = RequestMethod.POST)
	public String validateUser(User user, HttpSession session, ModelMap map) {
		System.out.println(user.getUserEmail());
		System.out.println(user.getUserPass());
		if(userService.findUser(user)) {
			session.setAttribute("user", user);
		return "index";
			
		}
		else {
			map.put("logErr", "logErr");
			map.put("user", new User());
			return "login";
		}
	}
	
	@RequestMapping(value = "/validateUser.htm", method = RequestMethod.GET)
	public String validateUserGet(ModelMap map) {
		map.put("user", new User());
		return "login";
	}
	
	@RequestMapping(value = "/account.htm", method = RequestMethod.GET)
	public String showAccountPage(ModelMap map, HttpSession session)  {
		System.out.println(((User)session.getAttribute("user")).getUserId());
		User userDetails = userService.fetchAccountDetails(((User)session.getAttribute("user")).getUserId());
//		System.out.println(userDetails.getUserId());
//		System.out.println(userDetails.getUserName());
//		System.out.println(userDetails.getUserPass());
//		System.out.println(userDetails.getUserPhone());
//		System.out.println(userDetails.getUserEmail());
//		System.out.println(userDetails.getUserCity());
		map.put("userDetails", userDetails);
		System.out.println(userDetails);
		return "account";
	}
	
	@RequestMapping(value = "/accountDetails.htm", method = RequestMethod.POST)
	public String showAccountDetails(User userDetails, ModelMap map, HttpSession session)  {
		System.out.println("UPDATE USER DETAILS CALLED");
		int userId=0;
		if(session.getAttribute("user") != null)
			userId = ((User)session.getAttribute("user")).getUserId();
		else
			System.out.println("NULL");
		userDetails.setUserId(userId);
		if(userDetails.getUserPass().length() == 0)
			userDetails.setUserPass(((User)session.getAttribute("user")).getUserPass());
		System.out.println(userDetails.getUserId());
		
		userDetails.setProfilePic(((User)session.getAttribute("user")).getProfilePic());
		System.out.println(userDetails);
		userService.updateUserDetails(userDetails);
		map.put("userDetails", userDetails);
		return "account";
	}
	
	@RequestMapping(value = "/deleteUser.htm", method = RequestMethod.GET)
	public String deleteUser(HttpSession session, ModelMap map) {
		User user = (User)session.getAttribute("user");
		session.invalidate();
		File file = new File("C:\\Users\\prati\\OneDrive\\Desktop\\Cafeteria\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\Cafeteria\\images\\"+user.getProfilePic());
		if(file.delete())
			System.out.println(user.getProfilePic()+" deleted!");
		else
			System.out.println(user.getProfilePic()+" was unable to delete!");
		userService.deleteUserDetails(user);
		cartService.deleteUserCart(user.getUserId());
		map.put("user", new User());
		return "login";
	}
	
	@RequestMapping(value = "/userMenu.htm")
	public String userMenu(ModelMap map, HttpSession session) {
		if(session.getAttribute("user") == null) {
			map.put("user", new User());
			return "login";
		}
		
		map.put("cart", new Cart());
		return "menu";
	}
	
	@RequestMapping(value = "/addToCart.htm", method = RequestMethod.POST)
	public String addToCart(Cart cart, ModelMap map, HttpSession session) {
		if(((User)session.getAttribute("user")) == null)
		{	
			map.put("user", new User());
			return "login";
		}
		
		if(cart.getQuantity() <= 0) {
			map.put("ZeroErr", cart.getItemId());
			return "menu";
		}
		
		int userId = ((User)session.getAttribute("user")).getUserId();
		int itemId = cart.getItemId();

		cart.setUserId(userId);
		

		Menu menu = menuService.getItem(cart.getItemId());
		cart.setCartPrice(menu.getItemPrice() * cart.getQuantity());

		cart.setItemName(menu.getItemName());
		Cart checkCart = cartService.getCartRecord(itemId, userId);
		System.out.println(cart);
		if(checkCart == null){
			System.out.println(cart.getItemId()+" "+cart.getQuantity());
			
			
			
			System.out.println("ADDED");
			cartService.addItem(cart);
		}
		else {
			checkCart.setItemName(menu.getItemName());
			checkCart.setCartPrice(cart.getCartPrice()+checkCart.getCartPrice());
			checkCart.setQuantity(cart.getQuantity()+checkCart.getQuantity());
			System.out.println(checkCart);
			System.out.println(cart);
			System.out.println("UPDATED");
			cartService.updateCart(checkCart);
		}		
		
		return "menu";
	}
	
	
	
	@RequestMapping(value = "/getCart.htm")
	public String getCart(ModelMap map, HttpSession session) {
		if(session.getAttribute("user") == null) {
			map.put("user", new User());
			return "login";
		}
		int userId = ((User)session.getAttribute("user")).getUserId();
		List<Cart> itemsList = cartService.getItems(userId);
		map.put("itemsList", itemsList);
		return "cart";
	}
	
	@RequestMapping(value = "/updateQuantity.htm", method = RequestMethod.POST)
	public String updateQuantity(Cart cart,HttpSession session, ModelMap map) {
//		System.out.println("INSIDE UPDATE QTY");
//		System.out.println(cart);
		if(session.getAttribute("user") == null){
			map.put("user", new User());
			return "login";
		}
		System.out.println(cart);
		int userId = ((User)session.getAttribute("user")).getUserId();
		
		if(cart.getQuantity() > 0) {
		Menu menu = menuService.getItem(cart.getItemId());
		cart.setCartPrice(menu.getItemPrice() * cart.getQuantity());
		cart.setItemName(menu.getItemName());
		cart.setUserId(userId);
		
		cartService.updateCart(cart);
		}
		else if(cart.getQuantity() == 0) {
			cartService.deleteItem(cart.getOrderId());
		}
		else{
			map.put("ZeroErr", cart.getOrderId());
		} 
		
		List<Cart> itemsList = cartService.getItems(userId);
		map.put("itemsList", itemsList);
		return "cart";
	}
	
	@RequestMapping(value = "/delItem.htm")
	public String deleteItemFromCart(@RequestParam int orderId, ModelMap map, HttpSession session) {
		int userId = ((User)session.getAttribute("user")).getUserId();
		cartService.deleteItem(orderId);
		List<Cart> itemsList = cartService.getItems(userId);
		map.put("itemsList", itemsList);
		return "cart";
	}
	
	@RequestMapping(value = "forgotForm.htm")
	public String forgotPassForm(HttpSession session) {
		if(((User)session.getAttribute("user")) != null)
			return "index";
		return "forgot";
	}
	
	@RequestMapping(value = "/forgot_password.htm",method = RequestMethod.POST)
	public String forgotPassword(@RequestParam String userEmail,ModelMap map) {		
		String pass = userService.forgotPassword(userEmail);
		String msg = "You are not Registered!";
		if(pass != null) {	
			System.out.println("Email Id not Found");
			SimpleMailMessage message = new SimpleMailMessage();  
	        message.setFrom("cdacmumbai3@gmail.com");  
	        message.setTo(userEmail);  
	        message.setSubject("Your password");  
	        message.setText(pass);  
	        //sending message   
	        mailSender.send(message);
			msg = "Check you email for Password!";
		}
		System.out.println(pass+" " +msg);
		//map.put("user", new User());
		map.put("mailMessage", msg);
		return "forgot";
	}
	
	@RequestMapping(value = "/changePassForm.htm", method = RequestMethod.GET)
	public String changePassForm(@RequestParam String userEmail, ModelMap map) {
		System.out.println(userEmail);
		map.put("userEmail", userEmail);
		return "changePass";
	}
	
	@RequestMapping(value = "/changePass.htm", method = RequestMethod.POST)
	public String changeUserPass(@RequestParam String userPass, @RequestParam String reUserPass, @RequestParam int userEmail, HttpSession session, ModelMap map) {
		System.out.println(userPass+" "+reUserPass+" "+userEmail);
		if(!userPass.equals(reUserPass)) {
			//System.out.println("Pass did not match");
			map.put("PassNotMatch", "PassNotMatch");
			map.put("userEmail", userEmail);
			return "changePass";
		}
		map.put("user", new User());
		userService.updatePassword(userEmail, userPass);
		return "login";
	}
	
	@RequestMapping(value = "/changePass.htm", method = RequestMethod.GET)
	public String passLogin(HttpSession session) {
		if(session.getAttribute("user") != null)
			return "index";
		return "login";
	}	
	
	
	@RequestMapping(value = "/upload_file.htm", method = RequestMethod.POST)
	public String uploadFile(@RequestParam("file") MultipartFile file,HttpSession session, HttpServletRequest request,ModelMap map) {
		String fileName = "0";
		
		System.out.println("Inside File upload");
		User user = (User)session.getAttribute("user");
		if (!file.isEmpty()) {
			try {
				File oldFile = new File("C:\\Users\\prati\\OneDrive\\Desktop\\Cafeteria\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\Cafeteria\\images\\"+user.getProfilePic());
				if(oldFile.delete())
					System.out.println(user.getProfilePic()+" deleted!");
				else
					System.out.println(user.getProfilePic()+" was unable to delete!");
				byte[] bytes = file.getBytes();
				
				fileName = file.getOriginalFilename();
				fileName = fileName.substring(fileName.lastIndexOf("."));
				
				
				
				fileName = user.getUserId()+fileName;
				
				

				// Creating the directory to store file
				String rootPath = request.getServletContext().getRealPath("/");
				File dir = new File(rootPath + File.separator + "images");
				if (!dir.exists())
					dir.mkdirs();

				// Create the file on server
				
				
				String filePath = dir.getAbsolutePath()+ File.separator +fileName;
				
				System.out.println("Server File Location= "+ filePath );
				
				File serverFile = new File(filePath);
				
						
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();
				
				userService.uploadImage(fileName, user.getUserId());
				
				user.setProfilePic(fileName);
				User userDetails = userService.fetchAccountDetails(((User)session.getAttribute("user")).getUserId());
				map.put("userDetails", userDetails);
				System.out.println(user);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}	
		
		return "account";
	}
	
	@RequestMapping(value = "/updateProfile.htm")
	public String updateProfileForm(ModelMap map, HttpSession session) {
		if(session.getAttribute("user") == null) {
			map.put("user", new User());
			return "login";
		}
		return "updateProfile";
	}
	
	@RequestMapping(value = "placeOrder.htm")
	public String placeOrder(HttpSession session) {
		if(session.getAttribute("user") == null)
			return "login";
		
		int userId = ((User)session.getAttribute("user")).getUserId();
		cartService.deleteUserCart(userId);
		
		return "invoice";
	}
	
	@RequestMapping(value = "/logout.htm")
	public String logout(ModelMap map, HttpSession session) {
		map.put("user", new User());
		session.invalidate();
		return "login";
	}
	
}
