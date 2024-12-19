package com.pantxi.romannumbers;

public class ArabicRomanNumerals {
    public static String convert1_2_3(int nbr) {
        if (nbr == 3) return "III";
        else if (nbr == 2) return "II";
        else if (nbr == 1) return "I";
        return "";
    }
     public static String convert_nbrxdix(int nbr) {
    switch (nbr / 10) {
        case 1: return "X";
        case 2: return "XX";
        case 3: return "XXX";
        case 4: return "XL";
        case 5: return "L";
        default: return"nombre n'est pas valide";
     }
     }
     public static String convert_unite(int nbr) {
    switch (nbr) {
        case 9: return "IX";
        case 5: return "V";
        case 4: return "IV";
        default :return"nombre n'est pas valide";
     }
     }
     public static String convertnombre(int nbr) {
         String r = "";
         while (nbr >= 10) {
             r += "X";
             nbr -= 10;
             if (nbr == 9) {
                 r += "IX";
                 nbr -= 9;
             } else if (nbr >= 5) {
                 r= "V";
                 nbr -= 5;
             } else if (nbr == 4) {
                 r = "IV";
                 nbr -= 4;
             }
             if (nbr == 1 || nbr == 2 || nbr == 3) {
                 r += "I";
                 nbr -= 1;
             }

         }
         return r;
      } }

