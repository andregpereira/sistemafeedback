package com.bios.sistemafeedback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bios.sistemafeedback.model.Feedback;
import com.bios.sistemafeedback.repository.FeedbackRepository;

@Controller
@RequestMapping("/feedback")
public class FeedbackController {

	@Autowired
	private FeedbackRepository feedbackRepository;

	/**
	 * Carregar página de feedback
	 */
	@GetMapping
	public ModelAndView feedbackForm() {
		ModelAndView mav = new ModelAndView("/feedback/feedbackForm");
		// *lógica*
		return mav;
	}

	/**
	 * Página de revisão do feedback
	 */
	@PostMapping("/feedbackRevisao")
	private ModelAndView revisarFeedback(/* @ModelAttribute Feedback feedback */) {
		ModelAndView mav = new ModelAndView("/feedback/feedbackRevisao");
		// *lógica*
		return mav;
	}

	/**
	 * Página confirmando o envio do feedback
	 */
	@PostMapping("/feedbackEnviado")
	private ModelAndView enviarFeedback(/* @ModelAttribute Feedback feedback */) {
		ModelAndView mav = new ModelAndView("/feedback/feedbackEnviado");
		// *lógica*
		return mav;
	}

}
