package com.bree.api.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("hello")
public class WebsocketController {

    @Autowired
    private MyWebSocket myWebSocket;

    @RequestMapping("/message")
    public Map<String, Object> sendMessage(){
        Map<String, Object> map = new HashMap<String, Object>();
        myWebSocket.sendMessage("0","你好");

        return map;
    }
}
