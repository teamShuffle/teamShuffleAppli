package com.teamShuffle.action.inputTeamAndNumber;

import org.seasar.struts.annotation.Execute;

public class IndexAction {

	@Execute(validator = false)
	public String inputTeamAndNumber() {
	       return "inputTeamAndNumber.jsp";
	}
}
