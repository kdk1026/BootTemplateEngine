package kr.co.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.test.model.Member;
import kr.co.test.service.TestService;

/**
 * <pre>
 * 개정이력
 * -----------------------------------
 * 2021. 5. 8. 김대광	최초작성
 * </pre>
 * 
 *
 * @author 김대광
 */
@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

	@Autowired
	private TestService testService;
	
	@GetMapping
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", "Hello, Thymeleaf");
		
		List<Member> list = testService.getList();
		mav.addObject("list", list);
		
		List<String> emptyList = new ArrayList<>();
		mav.addObject("emptyList", emptyList);
		
		mav.setViewName("/thymeleaf/index");
		return mav;
	}
	
}
