public class Main
{
    public static void main(String[] args) {
        int typeInt = 1234;
        byte typeByte = 127;
        short typeShort = 23700;
        long typeLong = 12344321L;
        float typeFloat = 3.1234F;
        double typeDouble = 3.123123123;
        char typeChar =56;
        boolean typeBoolen = true;

        System.out.println("Значение переменной typeInt с типом int равно " + typeInt);
        System.out.println("Значение переменной typeByte с типом byte равно " + typeByte);
        System.out.println("Значение переменной typeShort с типом short равно " + typeShort);
        System.out.println("Значение переменной typeLong с типом lohg равно " + typeLong);
        System.out.println("Значение переменной typeFloat с типом float равно " + typeFloat);
        System.out.println("Значение переменной typeDouble с типом double равно " + typeDouble);
        System.out.println("Значение переменной tupeChar с типом double равно " + typeChar);
        System.out.println("Значение переменной tupeBoolen с типом double равно " + typeBoolen);


        typeDouble = 27.12;
        typeLong = 987_678_965_549L;
        typeFloat = 2.786F;
        typeByte = 67;
        typeInt = 27897;
        typeShort = -159;

        System.out.println("Значение переменной tupeInt с типом int равно " + typeInt);
        System.out.println("Значение переменной tupeByte с типом byte равно " + typeByte);
        System.out.println("Значение переменной tupeShort с типом short равно " + typeShort);
        System.out.println("Значение переменной tupeLong с типом lohg равно " + typeLong);
        System.out.println("Значение переменной tupeFloat с типом float равно " + typeFloat);
        System.out.println("Значение переменной tupeDouble с типом double равно " + typeDouble);


        int allPaper = 480;
        int classLP = 23;
        int classAS = 27;
        int classEA = 30;
        int allStudents = classEA + classAS + classLP;
        int paperPerStudent = allPaper / allStudents;

        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");


        int botleInTwoMinuts = 16;
        int botleIn20Min = botleInTwoMinuts * 10;
        int minInDay = (24 * 60);
        int botleInDay = botleInTwoMinuts * (minInDay/2);
        int botleInFreeDay = botleInDay * 3;
        int botleInMohthe = botleInDay * 30;

        System.out.println("За две минуты машина произвела " + botleInTwoMinuts + " штук бутылок");
        System.out.println("За двадцать минут машина произвела " + botleIn20Min + " штук бутылок");
        System.out.println("За день машина произвела " + botleInDay + " штук бутылок");
        System.out.println("За три дня машина произвела " + botleInFreeDay + " штук бутылок");
        System.out.println("За месяц машина произвела " + botleInMohthe + " штук бутылок");


        int totalCans = 120;
        int brownCansOnOneClass = 4;
        int whiteCansOnOneClass = 2;
        int countClass = totalCans / (brownCansOnOneClass + whiteCansOnOneClass);
        brownCansOnOneClass = brownCansOnOneClass * countClass;
        whiteCansOnOneClass = whiteCansOnOneClass * countClass;

        System.out.println("В школе, где " + countClass + " классов, нужно  " + whiteCansOnOneClass + " банок белой краски и " + brownCansOnOneClass + " банок коричневой краски");


        int bananCount = 5;
        int bananWiegth = 80;
        int milkCount = 200;
        int milkWiegth = 105;
        int iceCreemCount = 2;
        int iceCreemWiegth = 100;
        int egsCount = 4;
        int egsWiegth = 70;
        double totalWiegth = (bananWiegth * bananCount) + (milkWiegth * milkCount) + (iceCreemCount + iceCreemCount) + (iceCreemWiegth * iceCreemCount) + (egsCount * egsWiegth);
        double totalWiegthInKg = totalWiegth / 1000;
        System.out.println("Вкс в граммах равен " + totalWiegth);
        System.out.println("Вес в килограммах равен " + totalWiegthInKg);


        int weigth = 7;
        double minInDay1 = 0.250;
        double maxInDay = 0.500;
        double dayToResaltMin = weigth / minInDay1;
        double dayToResMax = weigth / maxInDay;
        double dayAverage = (dayToResMax + dayToResaltMin) / 2;

        System.out.println("Минимальное количество дней на похудение " + dayToResMax + " дней");
        System.out.println("Максимальное количество дней на похудение " + dayToResaltMin + " дней");
        System.out.println("В среднем на похужение уйдет " + dayAverage + " дней");

        int mashaZpInMonth = 67760;
        int denisZpInMonth = 83690;
        int kristinaZpInMonth = 76230;
        int mashZpAfterInMohth = mashaZpInMonth / 100 * 110;
        int denisZpAfterInMohth = denisZpInMonth / 100 * 110;
        int kristinaZpAfterInMobth = kristinaZpInMonth / 100 * 110;
        int mashInEar = mashaZpInMonth * 12;
        int denisInEar = denisZpInMonth * 12;
        int kristinaInEar = kristinaZpInMonth * 12;
        int mashaInEarAfter = mashZpAfterInMohth * 12;
        int denisInEarAfter = denisZpAfterInMohth * 12;
        int kristinaInEarAfner = kristinaZpAfterInMobth * 12;

        System.out.println("Маша теперь получает " + mashaZpInMonth + " годовой доход вырос на " + (mashaInEarAfter - mashInEar));
        System.out.println("Денис теперь получает " + denisZpAfterInMohth + " годовой доход вырос на " + (denisInEarAfter - denisInEar));
        System.out.println("Кристина теперь получает " + kristinaZpAfterInMobth + " годовой доход вырос на " + (kristinaInEarAfner - kristinaInEar));

    }
}