package com.coder520.workflow.service;

import com.coder520.workflow.entity.ReAttend;

import java.util.List;
/**
 * Created by wangzhx 2017/11/29.
 */
public interface ReAttendService {

    void startReAttendFlow(ReAttend reAttend);

    List<ReAttend> listTasks(String userName);

    void approve(ReAttend reAttend);

    List<ReAttend> listReAttend(String username);
}
