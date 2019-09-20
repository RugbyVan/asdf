package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-09-20T10:18:46.136Z")

@RestSchema(schemaId = "projectdaf2")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Projectdaf2Impl {

    @Autowired
    private Projectdaf2Delegate userProjectdaf2Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectdaf2Delegate.helloworld(name);
    }

}
