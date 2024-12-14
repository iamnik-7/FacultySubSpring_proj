package com.tka.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.FacultySubDao;
import com.tka.entity.Faculty;
import com.tka.entity.Subject;

@Service
public class FacultySubService {
	@Autowired
	FacultySubDao dao;
	public ArrayList<String> getAllFacultySubNames()
	{
		ArrayList<String> slist=new ArrayList<String>();
		ArrayList<Faculty> alFacultysubList=dao.allFacultysubinfo();
		for(Faculty faculty:alFacultysubList) {
			List<Subject>sublist=faculty.getSubnames();
			for(Subject subject:sublist) {
				slist.add(subject.getSubname());
			}
		
		
		}

	return slist;

}
}