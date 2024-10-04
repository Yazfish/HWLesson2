
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1 \n");
        //Задача 1
        // Объявите переменные типа int, byte, short, long, float, double.
        // Название переменных может быть любым, но если состоит из двух слов и более,
        // должно соответствовать правилу camelCase.
        // Выведите в консоль значение каждой переменной в формате
        // «Значение переменной … с типом … равно …».

        byte aValue = 1;
        System.out.println("Значение переменной a с типом byte равно " + aValue);
        short bValue = 130;
        System.out.println("Значение переменной b с типом short равно " + bValue);
        int cValue = 40100;
        System.out.println("Значение переменной c с типом int равно " + cValue);
        long dValue = 100500L;
        System.out.println("Значение переменной d с типом long равно " + dValue);
        float iValue = 1.5465783f;
        System.out.println("Значение переменной i с типом float равно " + iValue);
        double eValue = 1.8282838565777;
        System.out.println("Значение переменной e с типом double равно " + eValue);

        System.out.println("\nЗадача 2 \n");
        //Задача 2
        //Ниже дан список различных значений. Инициализируйте переменные,
        // используйте изученные ранее типы переменных.
        //Значения:
        //27.12
        //987 678 965 549
        //2,786
        //569
        //-159
        //27897
        //67
        float catValue = 27.12f;
        long dogValue = 987_678_965_549L;
        String flyValue = "2,787";
        short beeValue = 569;
        short ratValue = -159;
        int appleValue = 27897;
        byte waterValue = 67;

        System.out.println(catValue + "\n" + dogValue + "\n" + flyValue + "\n"
                + beeValue + "\n" + ratValue + "\n" + appleValue + "\n" + waterValue);

        System.out.println("\nЗадача 3 \n");
        //Задача 3
        //Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна,
        // ведут три класса.
        //У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников,
        // у Екатерины Андреевны — 30 учеников.
        //Три учительницы закупили все вместе 480 листов бумаги на все три класса.
        // Посчитайте, сколько достанется листов каждому ученику.
        //Результат задачи выведите в консоль в формате:
        // «На каждого ученика рассчитано … листов бумаги».
        //Для объявления переменных не используйте тип var.

        byte studentsClass1 = 23;
        byte studentsClass2 = 27;
        byte studentsClass3 = 30;
        short paperListsTotal = 480;

        int paperPerStudent = paperListsTotal / (studentsClass1 + studentsClass2 + studentsClass3);

        System.out.println("На каждого ученика расчитано " + paperPerStudent + " листов бумаги.");

        System.out.println("\nЗадача 4 \n");
        //Задача 4
        //Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты.
        // Какая производительность машины будет:
        //за 20 минут,
        //в сутки,
        //за 3 дня,
        //за 1 месяц?
        //Рассчитывайте производительность работы машины в том случае,
        // если она работает без перерыва заданный промежуток времени.
        //Результаты подсчетов выведите в консоль в формате:
        // «За … машина произвела … штук бутылок».
        //Для объявления переменных не используйте тип var.
        byte productivityPerMinute = 16 / 2;
        byte minuteInHour = 60;
        byte workTime1 = 20;
        int workTime2 = minuteInHour * 24;
        int workTime3 = workTime2 * 3;
        int workTime4 = workTime2 * 30;

        int productPerTime1 = productivityPerMinute * workTime1;
        int productPerTime2 = workTime2 * productivityPerMinute;
        int productPerTime3 = workTime3 * productivityPerMinute;
        int productPerTime4 = workTime4 * productivityPerMinute;

        System.out.println("За " + workTime1 + "минут машина произвела " + productPerTime1 +
                " бутылок.");
        System.out.println("За сутки машина произвела " + productPerTime2 + " бутылок.");
        System.out.println("За 3 дня машина произвела " + productPerTime3 + " бутылок.");
        System.out.println("За месяц машина произвела " + productPerTime4 + " бутылок.");

        System.out.println("\nЗадача 5 \n");
        //Задача 5
        //На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
        // На один класс уходит 2 банки белой и 4 банки коричневой краски.
        // Сколько банок каждой краски было куплено?
        //Выведите результат задачи в консоль в формате:
        // «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».
        //Для объявления переменных не используйте тип var.

        byte brownCanPerRoom = 4;
        byte whiteCanPerRoom = 2;

        int totalRooms = 120 / (brownCanPerRoom + whiteCanPerRoom);
        int totalBrownCan = totalRooms * brownCanPerRoom;
        int totalWhiteCan = totalRooms * whiteCanPerRoom;

        System.out.println("В школе, где " + totalRooms + " классов, нужно " + totalWhiteCan +
                " банок белой краски и " + totalBrownCan + " банок коричневой краски.");

        System.out.println("\nЗадача 6 \n");
        //Задача 6
        //Спортсмены следят за своим весом и тщательно относятся к тому,
        // что и сколько они съедают.
        //Вот один из рецептов, по которому спортсмен готовит себе завтрак:
        // Бананы — 5 штук (1 банан — 80 грамм).
        // Молоко — 200 мл (100 мл = 105 грамм).
        // Мороженое-пломбир — 2 брикета по 100 грамм.
        // Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
        //Смешать всё в блендере — и готово.
        //Подсчитайте вес (количество граммов) такого спортзавтрака,
        // а затем переведите его в килограммы.
        //Результат в граммах и килограммах напечатайте в консоль.

        byte banana = 5;
        byte milk = 2;
        byte iceCream = 2;
        byte egg = 4;

        byte bananaWeightPer1 = 80;
        byte milkWeightPer1 = 105;
        byte iceCreamPer1 = 100;
        byte eggWeightPer1 = 70;

        int bananaTotalWeight = banana*bananaWeightPer1;
        int milkTotalWeight = milk*milkWeightPer1;
        int iceCreamTotalWeight = iceCream*iceCreamPer1;
        int eggsTotalWeight = egg*eggWeightPer1;

        int totalFoodWeightGr = bananaTotalWeight+milkTotalWeight+iceCreamTotalWeight+eggsTotalWeight;
        int gramsInKG = 1000;
        float totalFoodWeightKg = (float) totalFoodWeightGr/gramsInKG;

        System.out.println("Вес завтрака спортсмена = " + totalFoodWeightGr + " грамм," +
                " \n или " + totalFoodWeightKg + " килограмм.");


        System.out.println("\nЗадача 7 \n");
        //Задача 7
        //Правила соревнований обновились, и спортсмену, чтобы оставаться
        // в своей весовой категории, нужно сбросить 7 кг. Тренер скорректировал
        // рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
        //Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять
        // каждый день по 250 грамм, а сколько — если каждый день будет худеть на 500 грамм.
        //Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться
        // результата похудения.
        //Результаты всех подсчетов выведите в консоль.

        byte totalWeight = 7;
        short gramInKg1 = 1000;
        short weightPerProg1 = 250;
        short weightPerProg2 = 500;

        int daysProg1 = totalWeight*gramInKg1/weightPerProg1;
        int daysProg2 = totalWeight*gramInKg1/weightPerProg2;

        System.out.println("Если сбрасывать в день по " + weightPerProg1 + " грамм, потребуется "
        + daysProg1 + " дней.");
        System.out.println("Если сбрасывать в день по " + weightPerProg2 + " грамм, потребуется "
        + daysProg2 + " дней.");

        System.out.println("\nЗадача 8 \n");
        //Задача 8
        //Представим, что мы работаем в большой компании, штат которой
        // состоит из нескольких сотен сотрудников. В компании есть правило:
        // чем дольше сотрудник работает в компании, тем ценнее он для бизнеса.
        // Поэтому сотрудники, которые работают в компании дольше 3 лет, получают
        // повышение зарплаты раз в год. Каждый год повышение составляет 10% от текущей зарплаты.
        //К вам пришел руководитель с задачей автоматизировать повышение
        // зарплаты, а также провести расчет для следующих сотрудников:
        //Маша получает 67 760 рублей в месяц.
        //Денис получает 83 690 рублей в месяц.
        //Кристина получает 76 230 рублей в месяц.
        //Каждому нужно увеличить зарплату на 10% от текущей месячной.
        // Дополнительно руководитель попросил посчитать разницу между годовым
        // доходом с нынешней зарплатой и после повышения.
        //Посчитайте, сколько будет получать каждый из сотрудников,
        // а также разницу между годовым доходом до и после повышения.
        //Выведите в консоль информацию по каждому сотруднику.
        // Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».


        // Применена переменная  float, т.к. это деньги и возможны расчеты с получением копеек.

        float salaryMasha = 67760f;
        float salaryDenis = 83690f;
        float salaryKristina = 76230f;
        float increaseCoefficient = 1.1f;
        byte mansInYear = 12;

        float newSalaryMasha = salaryMasha*increaseCoefficient;
        float diffSalaryMasha = (newSalaryMasha-salaryMasha)*mansInYear;

        System.out.println("Маша теперь получает "+newSalaryMasha + " рублей, " +
                "её годовой доход вырос на " + diffSalaryMasha + " рублей.");

        float newSalaryDenis = salaryDenis*increaseCoefficient;
        float diffSalaryDenis = (newSalaryDenis-salaryDenis)*mansInYear;

        System.out.println("Денис теперь получает "+newSalaryDenis + " рублей, " +
                "его годовой доход вырос на " + diffSalaryDenis + " рублей.");

        float newSalaryKristina = salaryKristina*increaseCoefficient;
        float diffSalaryKristina = (newSalaryKristina-salaryKristina)*mansInYear;

        System.out.println("Кристина теперь получает "+newSalaryKristina + " рублей, " +
                "её годовой доход вырос на " + diffSalaryKristina + " рублей.");






    }
}