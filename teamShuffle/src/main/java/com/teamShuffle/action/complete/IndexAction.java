package com.teamShuffle.action.complete;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

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

	@Execute(validator = false)
	public String complete() {
		completeDto.inputNameList = completeForm.inputNameList;
		Collections.shuffle(completeDto.inputNameList);
		int teamsu = inputNameDto.team;
		setList(completeDto);

		for (String name : completeDto.inputNameList) {
			completeDto.completeList.get(teamsu % inputNameDto.team).add(name);
			teamsu++;
		}
	    return "complete.jsp";
	}

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
