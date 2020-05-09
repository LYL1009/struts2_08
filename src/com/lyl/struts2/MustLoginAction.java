package com.lyl.struts2;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;

public class MustLoginAction implements Action {

	@Override
	public String execute() throws Exception {
		if(ServletActionContext.getRequest().getSession().getAttribute("user") == null) {
			//�ض��򵽵�¼ҳ��
			return LOGIN;
		}
		return SUCCESS;
	}

}
