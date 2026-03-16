// PARTNER NAME: Prashanna khadka
// PARTNER NAME:
// CS111 SECTION #:
// DATE: 01/18/2026 

public class Main {

    public static void main(String[] args) {

        // ===== ASCII ART =====
        final String ASCII_ART_0 = "    .----.    .----.     ",
                     ASCII_ART_1 = "   (  --  \\  /  --  )    ",
                     ASCII_ART_2 = "          |  |           ",
                     ASCII_ART_3 = "         _/  \\_          ",
                     ASCII_ART_4 = "        (_    _)         ",
                     ASCII_ART_5 = "     ,    `--`    ,      ",
                     ASCII_ART_6 = "     \\'-.______.-'/      ",
                     ASCII_ART_7 = "      \\          /       ",
                     ASCII_ART_8 = "       '.--..--.'        ",
                     ASCII_ART_9 = "         `\"\"\"\"\"`         ",
                     ASCII_CREDIT = " ascii art by: jgs";

        // ===== TITLES =====
        final String TITLE_USA = "UNITED STATES OF AMERICA";
        final String TITLE_EAC = "EMPLOYMENT AUTHORIZATION CARD";

        // ===== LABELS =====
        final String LABEL_SURNAME = "Surname";
        final String LABEL_GIVEN_NAME = "Given Name";
        final String LABEL_USCIS = "USCIS#";
        final String LABEL_CATEGORY = "Category";
        final String LABEL_CARD = "Card#";
        final String LABEL_COUNTRY = "Country of Birth";
        final String LABEL_TERMS = "Terms and Conditions";
        final String LABEL_DOB = "Date of Birth";
        final String LABEL_SEX = "Sex";
        final String LABEL_VALID = "Valid From:";
        final String LABEL_EXPIRE = "Card Expires:";
        final String LABEL_DISCLAIMER = "NOT VALID FOR REENTRY TO U.S.";

        // ===== DATA =====
        String surname = "CHAPETON-LAMAS";
        String givenName = "NERY";
        String category = "C09";
        String cardNum = "SRC9876543210";
        String birthCountry = "Guatemala";
        String terms = "None";
        char sex = 'M';

        int uscis1 = 12, uscis2 = 4, uscis3 = 789;
        int birthDay = 1, birthYear = 1970;
        String birthMonth = "JAN";

        int validMonth = 2, validDay = 2, validYear = 2020;
        int expireMonth = 2, expireDay = 2, expireYear = 2022;

        // ===== FORMATTED VALUES =====
        String uscisNum = String.format("%03d-%03d-%03d", uscis1, uscis2, uscis3);
        String dateOfBirth = String.format("%02d %s %4d", birthDay, birthMonth, birthYear);
        String validDate = String.format("%02d/%02d/%04d", validMonth, validDay, validYear);
        String expireDate = String.format("%02d/%02d/%04d", expireMonth, expireDay, expireYear);

        final int WIDTH = 70;

        // ===== OUTPUT =====
        System.out.printf("║%-" + WIDTH + "s║%n", "           " + TITLE_USA);
        System.out.printf("║%-" + WIDTH + "s║%n", "                               " + TITLE_EAC);
        System.out.printf("║%-" + WIDTH + "s║%n", "");

        System.out.printf("║%-" + WIDTH + "s║%n", LABEL_SURNAME);
        System.out.printf("║%-" + WIDTH + "s║%n", surname);

        System.out.printf("║%-" + WIDTH + "s║%n", ASCII_ART_0 + LABEL_GIVEN_NAME);
        System.out.printf("║%-" + WIDTH + "s║%n", ASCII_ART_1 + givenName);

        System.out.printf("║%-" + WIDTH + "s║%n",
                ASCII_ART_2 + LABEL_USCIS + "         " + LABEL_CATEGORY + "       " + LABEL_CARD);
        System.out.printf("║%-" + WIDTH + "s║%n",
                ASCII_ART_3 + uscisNum + "    " + category + "            " + cardNum);

        System.out.printf("║%-" + WIDTH + "s║%n", ASCII_ART_4 + LABEL_COUNTRY);
        System.out.printf("║%-" + WIDTH + "s║%n", ASCII_ART_5 + birthCountry);

        System.out.printf("║%-" + WIDTH + "s║%n", ASCII_ART_6 + LABEL_TERMS);
        System.out.printf("║%-" + WIDTH + "s║%n", ASCII_ART_7 + terms);

        System.out.printf("║%-" + WIDTH + "s║%n",
                ASCII_ART_8 + LABEL_DOB + "  " + LABEL_SEX);
        System.out.printf("║%-" + WIDTH + "s║%n",
                ASCII_ART_9 + dateOfBirth + "    " + sex);

        System.out.printf("║%-" + WIDTH + "s║%n",
                "                         " + LABEL_VALID + "    " + validDate);
        System.out.printf("║%-" + WIDTH + "s║%n",
                "                         " + LABEL_EXPIRE + "  " + expireDate);

        System.out.printf("║%-" + WIDTH + "s║%n",
                ASCII_CREDIT + "       " + LABEL_DISCLAIMER);

        System.out.println("╚" + "═".repeat(WIDTH) + "╝");
    }
}