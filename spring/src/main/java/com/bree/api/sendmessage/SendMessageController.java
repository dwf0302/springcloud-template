package com.bree.api.sendmessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("sendMessage")
public class SendMessageController {

    @Autowired
    private SendMessageService sendMessageService;

    @GetMapping("phone")
    public String SendMessage(@RequestParam String phone){
        Map<String, Object> map = sendMessageService.SmsVerification(phone);
        System.out.println(map);
        return "发送成功";
    }


}
