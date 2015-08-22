package com.app.service.sample;

import com.app.persistence.model.UserModel;
import com.app.rest.errorhandling.AppException;

/**
 * Created by rajdeep siddhapura.
 */
public interface SampleService
{
	void call(String foo, String bar);

	void addUser(UserModel um) throws AppException;

}
