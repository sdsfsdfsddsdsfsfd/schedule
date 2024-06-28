package com.kh.schedule;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.UserInfoDAO;
import dao.WorkspaceDAO;
import util.Common;
import vo.UserInfoVO;

@Controller
public class WorkSpaceController {

	@Autowired
	HttpSession session;

	WorkspaceDAO ws_dao;

	UserInfoDAO ui_dao;

	public void setWs_dao(WorkspaceDAO ws_dao) {
		this.ws_dao = ws_dao;
	}

	public void setUi_dao(UserInfoDAO ui_dao) {
		this.ui_dao = ui_dao;
	}

	@RequestMapping("workspace.do")
	public String workspace() {
		return Common.Visit_ws.VIEW_PATH + "workspace_main.jsp";
	}

	// [임의] 로그인 화면
	@RequestMapping(value = { "/", "login.do" })
	public String login() {
		return Common.Visit_login.VIEW_PATH + "login_form.jsp";
	}

	// [임의]로그인 확인
	@RequestMapping("login_check.do")
	public String login_check(UserInfoVO vo) {
		UserInfoVO u_vo = ui_dao.selectOne(vo.getId());

		System.out.println("결과 : " + u_vo.getEmail());

		if (u_vo != null) {
			if (u_vo.getId().equals(vo.getId()) && u_vo.getPwd().equals(vo.getPwd())) {
				System.out.println("성공");
				session.setAttribute("user", u_vo);
				return Common.Visit_ws.VIEW_PATH + "workspace_main.jsp";
			}
		}

		return "redirect:login.do";
	}

}
