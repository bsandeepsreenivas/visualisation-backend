package com.blackcoffer.assignment.service.impl;

import com.blackcoffer.assignment.dto.Filters;
import com.blackcoffer.assignment.model.Visualisation;
import com.blackcoffer.assignment.repository.VisualisationRepo;
import com.blackcoffer.assignment.service.VisualisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisualisationServiceImpl implements VisualisationService {

    @Autowired
    private VisualisationRepo repo;


    @Override
    public List<Visualisation> getAllRecordsByParams(String endYear, String topic, String sector,
                                                     String region, String pestle, String source,
                                                     String swot, String country, String city) {
        return repo.getAllRecordsByParams(endYear, topic, sector, region, pestle, source, swot, country, city);
    }

    @Override
    public Filters getAllFilters() {
        Filters filters = new Filters();
        filters.setEndYear(repo.getEndYears());
        filters.setTopic(repo.getTopics());
        filters.setSector(repo.getSectors());
        filters.setRegion(repo.getRegions());
        filters.setPestle(repo.getPestles());
        filters.setSource(repo.getSources());
        filters.setSwot(repo.getSwots());
        filters.setCountry(repo.getCountries());
        filters.setCity(repo.getCities());
        return filters;
    }
}
