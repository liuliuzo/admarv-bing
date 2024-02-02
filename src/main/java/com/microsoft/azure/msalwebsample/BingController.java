package com.microsoft.azure.msalwebsample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BingController {
    private static final Logger log = LoggerFactory.getLogger(BingController.class);

    @RequestMapping(value = "/admarv/bingOauthCallBack", method = RequestMethod.GET)
    public String bingOauthCallBack(
            @RequestParam(required = false) String code, 
            @RequestParam(required = false) String state,
            @RequestParam(required = false) String error, 
            @RequestParam(required = false) String error_reason,
            @RequestParam(required = false) String error_description) {
        log.info("code:{}", code);
        log.info("state:{}", state);
        log.info("error:{}", error);
        log.info("error_reason:{}", error_reason);
        log.info("error_description:{}", error_description);
        return    " code:" + code + " state:" + state 
                + " error:" + error + " error_reason:" + error_reason 
                + " error_description:" + error_description;
    }
}
