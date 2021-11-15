package EngAdapter;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class DataBaseEngTest {
    DataBaseEng db;
    @BeforeEach
    void setUp() {
        db = new DataBaseEng();
    }

    @org.junit.jupiter.api.Test
    void getUserData() {
        assertEquals("hello",db.getUserData());
    }

    @org.junit.jupiter.api.Test
    void getStatisticsData() {
        assertEquals("hello2",db.getStatisticsData());
    }
}