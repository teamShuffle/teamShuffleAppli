package com.teamShuffle.action.inputName;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class InputNameValidator {

	public Map<String, String> validator (List<String> inputNameList) {
		Map<String , String> errorMessageMap = new HashMap<>();

		if (isEmpty(inputNameList)) {
			errorMessageMap.put("error", "名前が未記入のところがありますよー");
		}

		if (overLapNameCheck(inputNameList)) {
			errorMessageMap.put("overlap", "名前が重複してますよー。同じ名前は入力しないでー");
		}
		return errorMessageMap;
	}

	// 全ての名前が記入されていなければtrueを返す。
	private boolean isEmpty(List<String> inputNameList) {
		for (String inputName : inputNameList) {
			if (inputName.isEmpty()) {
				return true;
			}
		}
		return false;
	}

	// Listの中に同じ名前が格納されていたらtrueを返す
	private boolean overLapNameCheck(List<String> inputNameList) {

		Set<String> nameSet = new HashSet<>();
		for (String inputName : inputNameList) {
			if (nameSet.contains(inputName)) {
				if (!inputName.equals("")) {
					return true;
				}
			} else {
				nameSet.add(inputName);
			}
		}
		return false;
	}
}
