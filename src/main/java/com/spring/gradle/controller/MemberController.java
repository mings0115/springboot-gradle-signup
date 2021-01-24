package com.spring.gradle.controller;

import com.spring.gradle.domain.MemberDTO;
import com.spring.gradle.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class MemberController {

    private MemberService memberService;

    @GetMapping("/")
    public String index() {
        return "/home/index";
    }

    @GetMapping("/member/signup")
    public String signupForm(Model model) {
        model.addAttribute("member",new MemberDTO());

        return "/member/signupForm";
    }

    @PostMapping("/member/signup")
    public String signup(MemberDTO memberDTO) {
        memberService.signUp(memberDTO);

        return "redirect:/";
    }

    @GetMapping("/member/login")
    public String login() {
        return "/member/loginForm";
    }
}