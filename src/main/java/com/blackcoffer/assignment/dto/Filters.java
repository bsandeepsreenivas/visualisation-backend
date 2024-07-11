package com.blackcoffer.assignment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Filters {

    private List<String> endYear;
    private List<String> topic;
    private List<String> sector;
    private List<String> region;
    private List<String> pestle;
    private List<String> source;
    private List<String> swot;
    private List<String> country;
    private List<String> city;

}
