package com.report.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.report.dao.IReportDao;
import com.report.modelo.Report;

@Service
public class ReportServiceImpl implements IReportService{
	@Autowired
	private IReportDao dao;
	
	@Override
	public int save(Report report) {
		int result = 0;
		Report r = dao.save(report);
		if (!r.equals(null)) {
			result = 1;
		}
		return result;
	}

	@Override
	public List<Report> listaReport() {
		return (List<Report>) dao.findAll();
	}

	@Override
	public Optional<Report> getReportById(int id) {
		return dao.findById(id);
	}

	@Override
	public void delete(int id) {
		dao.deleteById(id);
	}
	
}
