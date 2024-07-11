package com.blackcoffer.assignment.repository;

import com.blackcoffer.assignment.model.Visualisation;

import java.util.List;

public interface VisualisationCustomRepo {

    List<Visualisation> getAllRecordsByParams(String endYear, String topic, String sector,
                                              String region, String pestle, String source,
                                              String swot, String country, String city);
}
