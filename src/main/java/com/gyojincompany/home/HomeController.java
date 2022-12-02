package com.gyojincompany.home;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gyojincompany.home.dto.MemberDto;
import com.gyojincompany.home.repository.MemberRepository;

@Controller
public class HomeController {
	
	@Autowired
	MemberRepository memberRepository;
	
	@RequestMapping(value = "/join")
	public String join() {
		return "join";
	}
	
	@RequestMapping(value = "/joinOk")
	public String joinOk(HttpServletRequest request, Model model) {
		
		
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));//int로 형변환
		int grade = Integer.parseInt(request.getParameter("grade"));//int로 형변환
		String etc = request.getParameter("etc");
		
		MemberDto memberDto = new MemberDto();
		
		memberDto.setName(name);
		memberDto.setAge(age);
		memberDto.setGrade(grade);
		memberDto.setEtc(etc);
		
		MemberDto mDto  = memberRepository.save(memberDto);
		
		System.out.println(mDto.toString());		
		
		model.addAttribute("mDto", mDto);
		
		return "joinOk";
	}
	
	@RequestMapping(value = "/search")
	public String search() {
		
		List<MemberDto> memberDtos = memberRepository.findByName("홍길동");
		
		for(MemberDto memberDto : memberDtos) {
			System.out.println(memberDto.toString());
		}
		
		return "searchResult";
	}

}
