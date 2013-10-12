package com.skowwi.skoVCR;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.skowwi.skoVCR.model.Series;

@Component
public class Test {

	@Autowired
	private SeriesRepository seriesRepository;
	
	public void Test(){
		final List<Series> series = new ArrayList<Series>();
		
		final Series naruto = new Series();
		naruto.setTitle("Naruto");
		
		series.add(naruto);
		final Series homeland = new Series();
		homeland.setTitle("Homeland");
		
		series.add(homeland);
		
		
		
		System.out.println("before insert (no id):");
		for (final Series u : series) {
			System.out.format("  â— %s\n", u);
		}
		System.out.println();

		// persist series
		seriesRepository.save(series);
		System.out.println("after insert (with id):");
		for (final Series u : series) {
			System.out.format("  â— %s\n", u);
		}
		System.out.println();

		// find series by username
		final String pattern = "Pa%";
		System.out.format("series with username like %s\n", pattern);
		final List<Series> foundSeriess = seriesRepository.findByTitleLike(pattern);
		for (final Series u : foundSeriess) {
			System.out.format("  â— %s\n", u);
		}
		System.out.println();

		// update user
		if (!foundSeriess.isEmpty()) {
			final Series dbSeries = foundSeriess.get(0);
			dbSeries.setTitle("pgotthard");
			seriesRepository.save(dbSeries);

			final Series updatedDbSeries = seriesRepository.findOne(dbSeries.getId());
			System.out.format(" after update:\n  â— %s\n\n", updatedDbSeries);
		}

		// get all series from db
		System.out.println("all series:");
		for (final Series u : seriesRepository.findAll()) {
			System.out.format("  â— %s\n", u);
		}
		System.out.println();

		// delete all series from db
		/*System.out.format("count before deletion: %s\n", seriesRepository.count());
		seriesRepository.deleteAll();
		System.out.format(" count after deletion: %s", seriesRepository.count());*/
	}
}
