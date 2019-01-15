package com.candidjava.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.candidjava.spring.bean.Message;

;

@Controller
public class MessageController {

    Message message = new Message();

    @GetMapping("/message-index")
    public ModelAndView create(Message messasge) {
        return new ModelAndView("messagecreate");
    }

    @PostMapping("/createmessage")
    public ModelAndView send(Message message) {
        ModelAndView model = new ModelAndView("viewmsg");
        // user bean will be automatically binded to view . refer @ModelAttribute

        this.message.setId(message.getId());
        this.message.setSender_id(message.getSender_id());
        this.message.setReceiver_id(message.getReceiver_id());
        //	this.message.setDate(message.getDate());
        this.message.setData(message.getData());

        return model;
    }

    @GetMapping("/viewmsg")
    public ModelAndView viewData(Message message) {
        message.setId(this.message.getId());
        message.setSender_id(this.message.getSender_id());
        message.setReceiver_id(this.message.getReceiver_id());
        message.setData(this.message.getData());
        ModelAndView model = new ModelAndView("viewmsg");
        return model;
    }

}
