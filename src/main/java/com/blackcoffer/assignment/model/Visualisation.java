package com.blackcoffer.assignment.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "master_data")
public class Visualisation {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long record;
    @Column(name = "end_year")
    private String endYear;
    private Double citylng;
    private Double citylat;
    private int intensity;
    private String sector;
    private String topic;
    private String insight;
    private String swot;
    private String url;
    private String region;
    @Column(name = "start_year")
    private String startYear;
    private Double impact;
    private String added;
    private String published;
    private String city;
    private String country;
    private int relevance;
    private String pestle;
    private String source;
    private String title;
    private int likelihood;


}
