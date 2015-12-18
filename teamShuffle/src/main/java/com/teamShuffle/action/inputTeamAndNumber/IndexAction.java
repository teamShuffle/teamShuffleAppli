package com.teamShuffle.action.inputTeamAndNumber;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.seasar.struts.annotation.Execute;

public class IndexAction {

	@Resource
	protected HttpServletRequest request;

	@Execute(validator = false)
	public String inputTeamAndNumber() {
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
	       return "inputTeamAndNumber.jsp";
	}
}
