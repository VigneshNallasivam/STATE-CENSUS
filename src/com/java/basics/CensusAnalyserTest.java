package com.java.basics;

public class CensusAnalyserTest 
{
	
	private static final String INDIA_CENSUS_CSV_FILE_PATH = "C:\\\\Users\\\\lab\\\\Desktop\\\\JAVA\\\\JAVA Assignments\\\\STATE CENSUS\\\\Basic Java Programs\\\\IndianStateCensus.csv";

    @Test
    public void givenIndianCensusCSVFileReturnsCorrectRecords() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            int numOfRecords = censusAnalyser.loadIndiaCensusData(INDIA_CENSUS_CSV_FILE_PATH);
            Assert.assertEquals(29,numOfRecords);
        } catch (CensusAnalyserException e) { }
    }

}
