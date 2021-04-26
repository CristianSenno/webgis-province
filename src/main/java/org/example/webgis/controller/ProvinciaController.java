package org.example.webgis.controller;

import java.util.List;

import org.example.webgis.model.Provincia;
import org.example.webgis.service.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ProvinciaController {
    private ProvinciaService provinciaService;

    public ProvinciaService getProvinciaService() {
        return provinciaService;
    }

    @Autowired
    public void setProvinciaService(ProvinciaService provinciaService) {
        this.provinciaService = provinciaService;
    }
    
    @RequestMapping(value = "/province/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String data() {
        // TODO retrieve geojson from service
        return getProvinciaService().listProvinceGeojson();
    }
    

}
