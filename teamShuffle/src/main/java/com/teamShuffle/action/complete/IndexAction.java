package com.teamShuffle.action.complete;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.teamShuffle.action.inputName.InputNameValidator;
import com.teamShuffle.dto.CompleteDto;
import com.teamShuffle.dto.InputNameDto;
import com.teamShuffle.form.CompleteForm;

public class IndexAction {

	@ActionForm
	@Resource
	protected CompleteForm completeForm;

	public CompleteDto completeDto;


	@Resource
	public InputNameDto inputNameDto;

	@Resource
	protected HttpServletRequest request;

	@Execute(validator = false)
	public String complete() {
		InputNameValidator inputNameValidator = new InputNameValidator();
		completeDto.inputNameList = completeForm.inputNameList;
		if (inputNameValidator.validator(completeDto.inputNameList).size() > 0) {
			request.setAttribute("errorMassege", inputNameValidator.validator(completeDto.inputNameList));
			request.setAttribute("list", completeDto.inputNameList);
			return "../inputName/inputName.jsp";
		}

		Collections.shuffle(completeDto.inputNameList);
		int teamsu = inputNameDto.team;
		setList(completeDto);

		for (String name : completeDto.inputNameList) {
			completeDto.completeList.get(teamsu % inputNameDto.team).add(name);
			teamsu++;
		}
	    return "complete.jsp";
	}

	//各チームに名前を格納するリストを作成する。
	List<List<String>> setList(CompleteDto completeDto){
		List<String> first = new ArrayList<>();
		List<String> second = new ArrayList<>();
		List<String> third = new ArrayList<>();
		List<String> four = new ArrayList<>();
		List<String> five = new ArrayList<>();
		completeDto.completeList.add(first);
		completeDto.completeList.add(second);
		completeDto.completeList.add(third);
		completeDto.completeList.add(four);
		completeDto.completeList.add(five);
		return completeDto.completeList;
	}

}
