package com.antriksh.app.ls.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.antriksh.app.ls.api.UserInfoDTO;

@Controller
public class LCAppController {

	@RequestMapping("/")
	public String showHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {

		// Reding the data from the properties file

		return "home-page";
	}
	/* here are doing eveything by manual
	 * @RequestMapping("/") public String showHomePage(Model model) {
	 * 
	 * // Reding the data from the properties file
	 * 
	 * UserInfoDTO userInfoDTO = new UserInfoDTO(); model.addAttribute("userInfo",
	 * userInfoDTO); return "home-page"; }
	 */
	/* here we are doin everything manual
	 * @RequestMapping("/process-homepage") public String
	 * showResultPage(@RequestParam("userName") String userName1,
	 * 
	 * @RequestParam("crushName") String crushName1,Model model) {
	 * System.out.println("userName "+userName1);
	 * System.out.println("crushName "+crushName1);
	 * 
	 * model.addAttribute("userName",userName1);
	 * model.addAttribute("crushName",crushName1);
	 * 
	 * return "result-page"; }userInfo
	 */

	@RequestMapping("/process-homepage")
	public String showResultPage(@ModelAttribute("") UserInfoDTO userInfoDTO) {


		return "result-page";
	}

}
