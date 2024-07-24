package com.hoandhh.adminlte.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogonController {
    @RequestMapping("/logon")
    public String logon() {
        return "admin/logon";
    }
}
