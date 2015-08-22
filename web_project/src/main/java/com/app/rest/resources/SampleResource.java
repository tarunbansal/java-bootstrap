package com.app.rest.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.app.persistence.model.UserModel;
import com.app.rest.errorhandling.AppException;
import com.app.service.sample.SampleAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.app.rest.bean.UserDetails;

/**
 * Created by rajdeep siddhapura.
 */

@Path("sample")
public class SampleResource
{

    private static final Logger LOGGER = LoggerFactory.getLogger(SampleResource.class);

    @GET
    @Path("sample1")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public UserDetails getSample() {
        UserDetails userDetails = new UserDetails();
        userDetails.setUserId(23l);
        userDetails.setEmail("rajdeep.siddhapura@gmail.com");
        userDetails.setPassword("foobar");
        return userDetails;
    }

    @POST
    @Path("AddUser")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public UserDetails addUser(UserDetails ud) throws AppException {
        UserDetails userDetails = new UserDetails();
        UserModel um = UserModel.generateModel(ud);

        SampleAPI.addUser(um);

        ud = um.generateResponse();
        return ud;
    }

}
