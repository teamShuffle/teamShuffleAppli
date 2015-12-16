package com.teamShuffle.action.complete;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.teamShuffle.dto.CompleteDto;
import com.teamShuffle.form.CompleteForm;

public class IndexAction {

	@ActionForm
	@Resource
	protected CompleteForm completeForm;

	public CompleteDto completeDto;

	@Execute(validator = false)
	public String complete() {
		completeDto.inputName = completeForm.inputNameData;
	    return "complete.jsp";
	}

}
