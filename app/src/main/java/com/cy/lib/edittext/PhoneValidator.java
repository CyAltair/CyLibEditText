package com.cy.lib.edittext;


public class PhoneValidator implements CyEditText.Validator {

	@Override
	public boolean validate(String input) {
		return !(input.length() < 11);
	}

	@Override
	public String validateErrorMsg() {
		return "长度不对";
	}

}
