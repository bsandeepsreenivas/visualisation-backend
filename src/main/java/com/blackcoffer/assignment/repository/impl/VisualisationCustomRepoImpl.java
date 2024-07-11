package com.blackcoffer.assignment.repository.impl;

import com.blackcoffer.assignment.model.Visualisation;
import com.blackcoffer.assignment.repository.VisualisationCustomRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VisualisationCustomRepoImpl implements VisualisationCustomRepo {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Visualisation> getAllRecordsByParams(String endYear, String topic, String sector,
                                                     String region, String pestle, String source,
                                                     String swot, String country, String city) {

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Visualisation> cq = cb.createQuery(Visualisation.class);

        Root<Visualisation> vis = cq.from(Visualisation.class);
        List<Predicate> predicates = new ArrayList<>();

        if (StringUtils.isNotBlank(endYear)) {
            predicates.add(cb.equal(vis.get("endYear"), endYear));
        }

        if (StringUtils.isNotBlank(topic)) {
            predicates.add(cb.equal(vis.get("topic"), endYear));
        }

        if (StringUtils.isNotBlank(sector)) {
            predicates.add(cb.equal(vis.get("sector"), sector));
        }

        if (StringUtils.isNotBlank(region)) {
            predicates.add(cb.equal(vis.get("region"), region));
        }

        if (StringUtils.isNotBlank(pestle)) {
            predicates.add(cb.equal(vis.get("pestle"), pestle));
        }

        if (StringUtils.isNotBlank(source)) {
            predicates.add(cb.equal(vis.get("source"), source));
        }

        if (StringUtils.isNotBlank(swot)) {
            predicates.add(cb.equal(vis.get("swot"), swot));
        }

        if (StringUtils.isNotBlank(country)) {
            predicates.add(cb.equal(vis.get("country"), country));
        }

        if (StringUtils.isNotBlank(city)) {
            predicates.add(cb.equal(vis.get("city"), city));
        }

        cq.where(predicates.toArray(new Predicate[0]));
        return entityManager.createQuery(cq).getResultList();
    }
}
