package srs.test;

import java.util.ArrayList;

import srs.domain.DataAccess;
import srs.domain.Section;

public class TestSections {
	public static void main(String[] args) {
		ArrayList<Section> sections = DataAccess.createSRSDao().getAllSection();
		if(sections != null) {
			for(Section s: sections) {
				System.out.println(s.getRepresentedCourse().getCourseName());
			}
		}
	}
}
