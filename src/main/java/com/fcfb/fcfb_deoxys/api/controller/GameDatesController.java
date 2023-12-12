package com.fcfb.fcfb_deoxys.api.controller;

import com.fcfb.fcfb_deoxys.domain.GameDatesEntity;
import com.fcfb.fcfb_deoxys.api.repositories.GameDatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8082")
@RestController
@RequestMapping("/deoxys/game_dates")
public class GameDatesController {

    @Autowired
    GameDatesRepository gameDatesRepository;

    /**
     * Get the season of the game thread
     * @param threadTimestamp
     * @return
     */
    @GetMapping("/season/{thread_timestamp}")
    public ResponseEntity<Integer> getSeason(@PathVariable("thread_timestamp") String threadTimestamp) {
        threadTimestamp = threadTimestamp.replace("-", "/");
        Integer season = 0;
        Iterable<GameDatesEntity> seasons = gameDatesRepository.findAll();

        LocalDate threadDate = LocalDate.parse(threadTimestamp, java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));

        for (GameDatesEntity seasonData : seasons) {
            LocalDate startDate = LocalDate.parse(seasonData.getStartDate(), java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            LocalDate postseasonEndDate = (seasonData.getPostseasonEndDate() != null) ? LocalDate.parse(seasonData.getPostseasonEndDate(), java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy")) : null;

            if ((threadDate.isEqual(startDate) || threadDate.isAfter(startDate)) && postseasonEndDate == null){
                season = seasonData.getSeasonNumber();
                break;
            }
            if ((threadDate.isEqual(startDate) || threadDate.isAfter(startDate)) && threadDate.isBefore(postseasonEndDate)){
                season = seasonData.getSeasonNumber();
                break;
            }
        }

        if (season != 0) {
            return new ResponseEntity<>(season, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(season, HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Get the season of the game thread
     *
     * @param threadTimestamp
     * @return
     */
    @GetMapping("/week/{thread_timestamp}/{season}")
    public int getWeek(@PathVariable("thread_timestamp") String threadTimestamp,
                       @PathVariable("season") Integer season) {
        threadTimestamp = threadTimestamp.replace("-", "/");
        Optional<GameDatesEntity> seasonData = gameDatesRepository.findBySeasonNumber(season);

        if (seasonData.isPresent()) {
            LocalDate threadDate = LocalDate.parse(threadTimestamp, java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));

            LocalDate week_one_start_date = LocalDate.parse(seasonData.get().getWeekOneStartDate(), java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            LocalDate week_one_end_date = LocalDate.parse(seasonData.get().getWeekOneEndDate(), java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            if ((threadDate.isEqual(week_one_start_date) || threadDate.isAfter(week_one_start_date)) && threadDate.isBefore(week_one_end_date)) {
                return 1;
            }

            LocalDate week_two_start_date = LocalDate.parse(seasonData.get().getWeekTwoStartDate(), java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            LocalDate week_two_end_date = LocalDate.parse(seasonData.get().getWeekTwoEndDate(), java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            if ((threadDate.isEqual(week_two_start_date) || threadDate.isAfter(week_two_start_date)) && threadDate.isBefore(week_two_end_date)) {
                return 2;
            }

            LocalDate week_three_start_date = LocalDate.parse(seasonData.get().getWeekThreeStartDate(), java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            LocalDate week_three_end_date = LocalDate.parse(seasonData.get().getWeekThreeEndDate(), java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            if ((threadDate.isEqual(week_three_start_date) || threadDate.isAfter(week_three_start_date)) && threadDate.isBefore(week_three_end_date)) {
                return 3;
            }

            LocalDate week_four_start_date = LocalDate.parse(seasonData.get().getWeekFourStartDate(), java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            LocalDate week_four_end_date = LocalDate.parse(seasonData.get().getWeekFourEndDate(), java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            if ((threadDate.isEqual(week_four_start_date) || threadDate.isAfter(week_four_start_date)) && threadDate.isBefore(week_four_end_date)) {
                return 4;
            }

            LocalDate week_five_start_date = LocalDate.parse(seasonData.get().getWeekFiveStartDate(), java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            LocalDate week_five_end_date = LocalDate.parse(seasonData.get().getWeekFiveEndDate(), java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            if ((threadDate.isEqual(week_five_start_date) || threadDate.isAfter(week_five_start_date)) && threadDate.isBefore(week_five_end_date)) {
                return 5;
            }

            LocalDate week_six_start_date = LocalDate.parse(seasonData.get().getWeekSixStartDate(), java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            LocalDate week_six_end_date = LocalDate.parse(seasonData.get().getWeekSixEndDate(), java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            if ((threadDate.isEqual(week_six_start_date) || threadDate.isAfter(week_six_start_date)) && threadDate.isBefore(week_six_end_date)) {
                return 6;
            }

            LocalDate week_seven_start_date = LocalDate.parse(seasonData.get().getWeekSevenStartDate(), java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            LocalDate week_seven_end_date = LocalDate.parse(seasonData.get().getWeekSevenEndDate(), java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            if ((threadDate.isEqual(week_seven_start_date) || threadDate.isAfter(week_seven_start_date)) && threadDate.isBefore(week_seven_end_date)) {
                return 7;
            }

            LocalDate week_eight_start_date = LocalDate.parse(seasonData.get().getWeekEightStartDate(), java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            LocalDate week_eight_end_date = LocalDate.parse(seasonData.get().getWeekEightEndDate(), java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            if ((threadDate.isEqual(week_eight_start_date) || threadDate.isAfter(week_eight_start_date)) && threadDate.isBefore(week_eight_end_date)) {
                return 8;
            }

            LocalDate week_nine_start_date = LocalDate.parse(seasonData.get().getWeekNineStartDate(), java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            LocalDate week_nine_end_date = LocalDate.parse(seasonData.get().getWeekNineEndDate(), java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            if ((threadDate.isEqual(week_nine_start_date) || threadDate.isAfter(week_nine_start_date)) && threadDate.isBefore(week_nine_end_date)) {
                return 9;
            }

            LocalDate week_ten_start_date = LocalDate.parse(seasonData.get().getWeekTenStartDate(), java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            LocalDate week_ten_end_date = LocalDate.parse(seasonData.get().getWeekTenEndDate(), java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            if ((threadDate.isEqual(week_ten_start_date) || threadDate.isAfter(week_ten_start_date)) && threadDate.isBefore(week_ten_end_date)) {
                return 10;
            }

            LocalDate week_eleven_start_date = LocalDate.parse(seasonData.get().getWeekElevenStartDate(), java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            LocalDate week_eleven_end_date = LocalDate.parse(seasonData.get().getWeekElevenEndDate(), java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            if ((threadDate.isEqual(week_eleven_start_date) || threadDate.isAfter(week_eleven_start_date)) && threadDate.isBefore(week_eleven_end_date)) {
                return 11;
            }

            LocalDate week_twelve_start_date = LocalDate.parse(seasonData.get().getWeekTwelveStartDate(), java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            LocalDate week_twelve_end_date = LocalDate.parse(seasonData.get().getWeekTwelveEndDate(), java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            if ((threadDate.isEqual(week_twelve_start_date) || threadDate.isAfter(week_twelve_start_date)) && threadDate.isBefore(week_twelve_end_date)) {
                return 12;
            }

            return 13;
        }
        return 0;
    }
}