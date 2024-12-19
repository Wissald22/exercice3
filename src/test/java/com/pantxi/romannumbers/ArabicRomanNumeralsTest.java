package com.pantxi.romannumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArabicRomanNumeralsTest {

    @Test
    public void convertest() {

       assertEquals("X", ArabicRomanNumerals.convert_nbrxdix(10));
       /* assertEquals("IX", ArabicRomanNumerals.convert_unite(9));
        assertEquals("XX", ArabicRomanNumerals.convertnombre(19));
        assertEquals("II", ArabicRomanNumerals.convert1_2_3(2));*/
    }
}
