package com.blackcoffer.assignment.repository;

import com.blackcoffer.assignment.model.Visualisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface VisualisationRepo extends JpaRepository<Visualisation, Long>, VisualisationCustomRepo {


    @Query(nativeQuery = true, value = "select distinct(end_year) from master_data order by end_year ASC")
    List<String> getEndYears();

    @Query(nativeQuery = true, value = "select distinct(topic) from master_data order by topic ASC")
    List<String> getTopics();

    @Query(nativeQuery = true, value = "select distinct(sector) from master_data order by sector ASC")
    List<String> getSectors();

    @Query(nativeQuery = true, value = "select distinct(region) from master_data order by region ASC")
    List<String> getRegions();

    @Query(nativeQuery = true, value = "select distinct(pestle) from master_data order by pestle ASC")
    List<String> getPestles();

    @Query(nativeQuery = true, value = "select distinct(source) from master_data order by source ASC")
    List<String> getSources();

    @Query(nativeQuery = true, value = "select distinct(swot) from master_data order by swot ASC")
    List<String> getSwots();

    @Query(nativeQuery = true, value = "select distinct(country) from master_data order by country ASC")
    List<String> getCountries();

    @Query(nativeQuery = true, value = "select distinct(city) from master_data order by city ASC")
    List<String> getCities();

}
