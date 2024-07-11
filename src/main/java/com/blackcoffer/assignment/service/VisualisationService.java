package com.blackcoffer.assignment.service;

import com.blackcoffer.assignment.dto.Filters;
import com.blackcoffer.assignment.model.Visualisation;

import java.util.List;

public interface VisualisationService {

    List<Visualisation> getAllRecordsByParams(String endYear, String topic, String sector,
                                              String region, String pestle, String source,
                                              String swot, String country, String city);

    Filters getAllFilters();

}
