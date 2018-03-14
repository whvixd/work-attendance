package com.coder520.common.task;

import com.coder520.attend.dao.AttendMapper;
import com.coder520.attend.service.AttendService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by wangzhx 2017/11/20.
 */
public class AttendCheckTask {

    @Autowired
    private AttendService attendService;

    public  void checkAttend(){

        attendService.checkAttend();

    }
}
