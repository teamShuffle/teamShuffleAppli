package com.teamShuffle.action.inputName;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.teamShuffle.dto.InputNameDto;
import com.teamShuffle.form.InputNameForm;

public class IndexAction {
	@ActionForm
	@Resource
	protected InputNameForm inputNameForm;

	public InputNameDto inputNameDto;


	@Execute(validator = false)
	public String inputName() {
		inputNameDto.team = inputNameForm.team;
		inputNameDto.number = inputNameForm.number;
	       return "inputName.jsp";
	}
}
