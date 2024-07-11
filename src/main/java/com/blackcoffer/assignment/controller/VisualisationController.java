package com.blackcoffer.assignment.controller;

import com.blackcoffer.assignment.dto.Filters;
import com.blackcoffer.assignment.model.Visualisation;
import com.blackcoffer.assignment.service.VisualisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/v1/api/visualisation")
public class VisualisationController {

    @Autowired
    private VisualisationService service;

    @GetMapping()
    public ResponseEntity<List<Visualisation>> getAllRecords(
            @RequestParam(required = false, name = "endYear") String endYear,
            @RequestParam(required = false, name = "topic") String topic,
            @RequestParam(required = false, name = "sector") String sector,
            @RequestParam(required = false, name = "region") String region,
            @RequestParam(required = false, name = "pestle") String pestle,
            @RequestParam(required = false, name = "source") String source,
            @RequestParam(required = false, name = "swot") String swot,
            @RequestParam(required = false, name = "country") String country,
            @RequestParam(required = false, name = "city") String city) {
        List<Visualisation> allRecords = service.getAllRecordsByParams(endYear, topic, sector, region, pestle, source, swot, country, city);
        return new ResponseEntity<>(allRecords, HttpStatus.OK);
    }

    @GetMapping("/filters")
    public ResponseEntity<Filters> getFilters() {
        Filters filters = service.getAllFilters();
        return new ResponseEntity<>(filters, HttpStatus.OK);
    }

}
