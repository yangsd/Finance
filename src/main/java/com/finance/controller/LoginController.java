package com.finance.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.finance.constants.UserConstant;
import com.finance.dao.UserDao;
import com.finance.exception.BusinessException;
import com.finance.service.LoginService;
import com.finance.util.RandomCode;
import com.finance.vo.UserVO;

/**
 * 
 * @author sdyang
 * @date 2015年7月22日 下午5:43:58
 */
@Controller
public class LoginController {

	@Autowired
	UserDao userDao;
	
	@Autowired
	LoginService service;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView getLoginPage() {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}

	@RequestMapping(value = "/loginout", method = RequestMethod.GET)
	public String getLoginOutPage() {
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();	
		System.out.println("当前登录用户："+user.getUsername());
		System.out.println("当前登录角色："+user.getAuthorities().toString());
		
		return "login";
	}

	@RequestMapping(value = "/denied", method = RequestMethod.GET)
	public String getDeniedPage() {

		return "denied";

	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView getIndexPage() {		
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView getHomePage() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String getAadminPage() {
		return "admin";

	}

	@RequestMapping(value = "/randomnum", method = RequestMethod.GET)
	public @ResponseBody
	String randomid(HttpServletRequest request, HttpServletResponse response)
			throws IOException {

		int width = 80;

		int height = 20;

		int codeCount = 4;

		int fontHeight = height - 2;

		int xx = width / (codeCount + 1);

		int codeY = height - 4;

		String randomCode = RandomCode.genNumPassword(4);

		BufferedImage image = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);
		Graphics2D gra = image.createGraphics();

		gra.setColor(Color.WHITE);
		gra.fillRect(0, 0, width, height);

		Font font = new Font("Fixedsys", Font.PLAIN, fontHeight);

		gra.setFont(font);

		gra.setColor(Color.BLACK);

		Random random = new Random();

		gra.setColor(Color.BLACK);
		int red = 0, green = 0, blue = 0;
		char c;

		float colorDeep = 2;
		int rgbColorMax = Float.valueOf(255 / colorDeep).intValue();
		for (int i = 0; i < 4; i++) {
			c = randomCode.charAt(i);
			red = random.nextInt(rgbColorMax);
			green = random.nextInt(rgbColorMax);
			blue = random.nextInt(rgbColorMax);

			gra.setColor(new Color(red, green, blue));
			gra.drawString("" + c, (i + 1) * xx, codeY);
		}
		request.getSession().setAttribute(
				UserConstant.SESSION_VERIFICATIONCODE, randomCode);

		response.setHeader("Pragma", "no-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		response.setContentType("image/jpeg");
		ServletOutputStream sos = response.getOutputStream();
		ImageIO.write(image, "jpeg", sos);
		sos.close();

		return null;
	}
	
	@RequestMapping(value = "/lock", method = RequestMethod.GET)
	public ModelAndView getLockPage() {
		ModelAndView mav = new ModelAndView("lock");
		return mav;
	}
	
	@RequestMapping(value = "/unlock", method = RequestMethod.GET)
	public ModelAndView getUnlockPage() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}	
	
	@RequestMapping("/menu")
    @ResponseBody
    public String getMenu() throws BusinessException {
		
		String menu = service.getMenuByRole();
		
		return menu;
    }	

	@RequestMapping(value = "/getCurrentUser")
	@ResponseBody
	public String getCurrentUser() throws BusinessException{
		UserVO user = (UserVO) SecurityContextHolder.getContext().getAuthentication().getPrincipal();		
		return user.getName();
	}

}
