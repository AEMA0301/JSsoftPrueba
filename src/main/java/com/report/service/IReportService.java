package com.report.service;

import java.util.List;
import java.util.Optional;

import com.report.modelo.Report;

public interface IReportService {
	public int save (Report report);
	public List<Report> listaReport();
	public Optional<Report> getReportById(int id);
	public void delete (int id);
}
