package io.springboot.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseSrvice {
	
	
	@Autowired
	CourseRepository courserepo;
	
	public List<Course> getAllCourses(String id){
		List<Course> list= new ArrayList<>();
		courserepo.findByTopicId(id)
		.forEach(list::add);
		return list;
		
	}
	
	public Course getCourse(String id) {
		return courserepo.findById(id).get();
	}
	
	public void addCourse(Course course) {
		courserepo.save(course);
	}

	public void UpdateCourse(Course course) {
		
		courserepo.save(course);
		
	}

	public void deleteCourse(String id) {
		courserepo.deleteById(id);
		
	}
}
