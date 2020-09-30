package com.test.business;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class BusinessDay {

	public static void main(String[] args) {

		// populate holiday list
		List<LocalDate> holidays = new ArrayList<>();
		holidays.add(LocalDate.of(2020, 10, 02));
		holidays.add(LocalDate.of(2020, 8, 15));
		holidays.add(LocalDate.of(2020, 1, 26));

		// ----------------- Check for Business Day--------
		LocalDate myDate = LocalDate.of(2020, 10, 2);
		System.out.println(new BusinessDay().isBusinessDay(myDate, Optional.of(holidays)));
	
		// ----------------- Count for Business Days--------
		LocalDate today = LocalDate.of(2020, 9, 30);
		System.out.println(new BusinessDay().countBusinessDaysBetween(today, today.plusDays(20), Optional.empty()));		//no holidays
        System.out.println(new BusinessDay().countBusinessDaysBetween(today, today.plusDays(20), Optional.of(holidays)));	//with holiday
    }

	public boolean isBusinessDay(LocalDate myDate, Optional<List<LocalDate>> holidays) {

		return (!holidays.get().contains(myDate) && myDate.getDayOfWeek() != DayOfWeek.SATURDAY
				&& myDate.getDayOfWeek() != DayOfWeek.SUNDAY);

	}

	public long countBusinessDaysBetween(LocalDate startDate, LocalDate endDate, Optional<List<LocalDate>> holidays) {

		Predicate<LocalDate> isHoliday = date -> holidays.isPresent() ? holidays.get().contains(date) : false;

		Predicate<LocalDate> isWeekend = date -> date.getDayOfWeek() == DayOfWeek.SATURDAY
				|| date.getDayOfWeek() == DayOfWeek.SUNDAY;

		long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

		long businessDays = Stream.iterate(startDate, date -> date.plusDays(1)).limit(daysBetween)
				.filter(isHoliday.or(isWeekend).negate()).count();
		
		return businessDays;
	}
}
