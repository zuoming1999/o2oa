package com.x.organization.assemble.authentication.jaxrs.sso;

import com.x.base.core.project.exception.PromptException;

class ExceptionEmptyToken extends PromptException {

	private static final long serialVersionUID = 4132300948670472899L;

	ExceptionEmptyToken() {
		super("sso 没有提供解码令牌.");
	}
}
