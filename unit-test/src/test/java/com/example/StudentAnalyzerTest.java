package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentAnalyzerTest {
    
    @Test
    public void testCountExcellentStudents_Mixed() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(2, analyzer.countExcellentStudents(scores));
    }

    @Test
    public void testCountExcellentStudents_AllValid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> scores = Arrays.asList(8.0, 9.5, 10.0, 7.9);
        assertEquals(3, analyzer.countExcellentStudents(scores));
    }

    @Test
    public void testCountExcellentStudents_EmptyOrEdge() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
        assertEquals(0, analyzer.countExcellentStudents(Arrays.asList(0.0, 0.0)));
        assertEquals(1, analyzer.countExcellentStudents(Arrays.asList(10.0, 7.0)));
    }

    @Test
    public void testCalculateValidAverage_Mixed() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        double avg = analyzer.calculateValidAverage(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0));
        assertEquals(8.17, avg, 0.01);
    }

    @Test
    public void testCalculateValidAverage_AllValidAndEdge() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        double avg = analyzer.calculateValidAverage(Arrays.asList(10.0, 0.0, 8.0));
        assertEquals((10.0 + 0.0 + 8.0) / 3.0, avg, 1e-9);
    }

    @Test
    public void testCalculateValidAverage_NoValid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        double avg = analyzer.calculateValidAverage(Arrays.asList(-5.0, 11.0, null));
        assertEquals(0.0, avg, 1e-9);
    }
}
