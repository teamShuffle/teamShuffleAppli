package com.teamShuffle.action.inputName;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.teamShuffle.dto.InputNameDto;
import com.teamShuffle.form.InputNameForm;

public class IndexAction {
	@ActionForm
	@Resource
	protected InputNameForm inputNameForm;

	public InputNameDto inputNameDto;

	@Resource
	protected HttpServletRequest request;


	@Execute(validator = false)
	public String inputName() {
		inputNameDto.team = inputNameForm.team;
		inputNameDto.number = inputNameForm.number;
		if (inputNameDto.team > inputNameDto.number) {
			//チーム数の選択値2～5をリストにセットする
			List<Integer> teamList = new ArrayList<>();
	    	teamList.add(2);
	    	teamList.add(3);
	    	teamList.add(4);
	    	teamList.add(5);

	    	//人数の選択値2～50をリストにセットする
	    	List<Integer> numberList = new ArrayList<>();
	    	for (int number = 2; number <= 50; number++) {
	    		numberList.add(number);
	    	}
	    	request.setAttribute("teamList", teamList);
	    	request.setAttribute("numberList", numberList);
			request.setAttribute("error", "人数＞＝チーム数←これになるようにお願いします＾V＾");
			return "../inputTeamAndNumber/inputTeamAndNumber.jsp";
		}

	       return "inputName.jsp";
	}

}
