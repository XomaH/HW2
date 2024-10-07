public class Main
{
    public static void main(String[] args)
    {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        var count = 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + count;
        cat = cat + count;
        paper = paper + count;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog += -3.5;
        cat += -1.6;
        paper += -7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend =19;
        System.out.println(friend);

        friend += + 2;
        System.out.println(friend);

        friend = friend /7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);

        frog = frog*10;
        System.out.println(frog);

        frog = frog/3.5;
        System.out.println(frog);

        frog = frog +4;
        System.out.println(frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight =boxer1 + boxer2;
        var weightDifference = boxer1 - boxer2;

        System.out.println("общий вес боксеров " + totalWeight);
        System.out.println("Разница в весе между двумя боксерами состявляет " + weightDifference);

        var ostatok = boxer1 % boxer2;

        System.out.println("остаток от деления " + ostatok);

        var hoursInWeek  = 640;
        var hoursInDay = 8;
        var allWorker = hoursInWeek / hoursInDay;

        System.out.println("Всего работников в компании - " +allWorker + " человек");

        allWorker = allWorker + 94;
        hoursInWeek = hoursInDay * allWorker;

        System.out.println("если в компании работает " + allWorker + " человек, то всего " + hoursInWeek + " часов работы может быть поделено между сотрудниками.");









    }
}