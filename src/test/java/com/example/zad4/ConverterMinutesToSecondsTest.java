package com.example.zad4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConverterMinutesToSecondsTest {


    @Test
    void shouldConverterMinutesToSeconds(){
        int resultConverterMinutesToSeconds = ConvertMinutesToSeconds.getConverterMinutesToSeconds(15);

        Assertions.assertEquals(900,resultConverterMinutesToSeconds);
    }
}
