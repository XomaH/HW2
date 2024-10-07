public class Main
{
    public static void main(String[] args) {
        int typeInt = 1234;
        byte typeByte = 127;
        short typeShort = 23700;
        long typeLong = 12344321L;
        float typeFloat = 3.1234F;
        double typeDouble = 3.123123123;

        System.out.println("Значение переменной tupeInt с типом int равно " + typeInt);
        System.out.println("Значение переменной tupeByte с типом byte равно " + typeByte);
        System.out.println("Значение переменной tupeShort с типом short равно " + typeShort);
        System.out.println("Значение переменной tupeLong с типом lohg равно " + typeLong);
        System.out.println("Значение переменной tupeFloat с типом float равно " + typeFloat);
        System.out.println("Значение переменной tupeDouble с типом double равно " + typeDouble);

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


        var allPaper = 480;
        var classLP = 23;
        var classAS = 27;
        var classEA = 30;
        var allStudents = classEA + classAS + classLP;
        var paperPerStudent = allPaper / allStudents;

        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");


        var botleInTwoMinuts = 16;
        var botleIn20Min = botleInTwoMinuts * 10;
        var minInDay = (24 * 60) / 2;
        var botleInDay = botleInTwoMinuts * minInDay;
        var botleInFreeDay = botleInDay * 3;
        var botleInMohthe = botleInDay * 30;

        System.out.println("За две минуты машина произвела " + botleInTwoMinuts + " штук бутылок");
        System.out.println("За двадцать минут машина произвела " + botleIn20Min + " штук бутылок");
        System.out.println("За день машина произвела " + botleInDay + " штук бутылок");
        System.out.println("За три дня машина произвела " + botleInFreeDay + " штук бутылок");
        System.out.println("За месяц машина произвела " + botleInMohthe + " штук бутылок");


        var totalCans = 120;
        var brownCansOnOneClass = 4;
        var whiteCansOnOneClass = 2;
        var countClass = totalCans / (brownCansOnOneClass + whiteCansOnOneClass);
        brownCansOnOneClass = brownCansOnOneClass * countClass;
        whiteCansOnOneClass = whiteCansOnOneClass * countClass;

        System.out.println("В школе, где " + countClass + " классов, нужно  " + whiteCansOnOneClass + " банок белой краски и " + brownCansOnOneClass + " банок коричневой краски");


        var bananCount = 5;
        var bananWiegth = 80;
        var milkCount = 200;
        var milkWiegth = 105;
        var iceCreemCount = 2;
        var iceCreemWiegth = 100;
        var egsCount = 4;
        var egsWiegth = 70;
        double totalWiegth = (bananWiegth * bananCount) + (milkWiegth * milkCount) + (iceCreemCount + iceCreemCount) + (iceCreemWiegth * iceCreemCount) + (egsCount * egsWiegth);
        double totalWiegthInKg = totalWiegth / 1000;
        System.out.println("Вкс в граммах равен " + totalWiegth);
        System.out.println("Вес в килограммах равен " + totalWiegthInKg);


        var weigth = 7;
        var minInDay1 = 0.250;
        var maxInDay = 0.500;
        var dayToResaltMin = weigth / minInDay1;
        var dayToResMax = weigth / maxInDay;
        var dayAverage = (dayToResMax + dayToResaltMin) / 2;

        System.out.println("Минимальное количество дней на похудение " + dayToResMax + " дней");
        System.out.println("Максимальное количество дней на похудение " + dayToResaltMin + " дней");
        System.out.println("В среднем на похужение уйдет " + dayAverage + " дней");

        var mashaZpInMonth = 67760;
        var denisZpInMonth = 83690;
        var kristinaZpInMonth = 76230;
        var mashZpAfterInMohth = mashaZpInMonth / 100 * 110;
        var denisZpAfterInMohth = denisZpInMonth / 100 * 110;
        var kristinaZpAfterInMobth = kristinaZpInMonth / 100 * 110;
        var mashInEar = mashaZpInMonth * 12;
        var denisInEar = denisZpInMonth * 12;
        var kristinaInEar = kristinaZpInMonth * 12;
        var mashaInEarAfter = mashZpAfterInMohth * 12;
        var denisInEarAfter = denisZpAfterInMohth * 12;
        var kristinaInEarAfner = kristinaZpAfterInMobth * 12;

        System.out.println("Маша теперь получает " + mashaZpInMonth + " годовой доход вырос на " + (mashaInEarAfter - mashInEar));
        System.out.println("Денис теперь получает " + denisZpAfterInMohth + " годовой доход вырос на " + (denisInEarAfter - denisInEar));
        System.out.println("Кристина теперь получает " + kristinaZpAfterInMobth + " годовой доход вырос на " + (kristinaInEarAfner - kristinaInEar));

    }}