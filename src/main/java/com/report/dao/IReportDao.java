package com.report.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.report.modelo.Report;

@Repository
public interface IReportDao  extends CrudRepository<Report, Serializable>{

}
