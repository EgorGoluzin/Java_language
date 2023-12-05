public class HW_1
{
    public static void main(String[] args)
    {
        //Объединение строк, метод Concat();
        String str1 = "Hello";
        String str2 = ", world";
        String concatenated = str1.concat(str2);
        System.out.println("Объединили 2 строки: " + concatenated);

        //Преобразование в строку, valueOf();
        int number = 69;
        String str_from_int = String.valueOf(number);
        System.out.println("Получили строку из числа: " + str_from_int);

        //Соединение строки с учётом разделителя: метод join();
        String[] words = {"Hello", "the", "best", "world"};
        String joined = String.join(" ", words);
        System.out.println("Объединённая строка:" + joined);

        //Сравнение двух строк, compare();
        String str3 = "Audi";
        String str4 = "Mercedes";
        int res = str3.compareTo(str4);
        System.out.println("Результат сравнения: " + res);

        //Возврат символ по индексу, charAt();
        char car = str3.charAt(2);
        System.out.println("Третья буква у str3: " + car);

        //Сравнение строк с учётом регистра, equals():
        str1 = "audi";
        boolean equal = str1.equals(str3);
        System.out.println("Результат сравнения 1-ой и 3-ей строк с учётом регистра: " + equal);

        //Сравнение без учёта регистра, equalsIgnoreCase();
        equal = str1.equalsIgnoreCase(str3);
        System.out.println("Без учёта регистра сравнения: " + equal);

        //Сравнение подстрок в строках, regionMatches();
        str1 = "Hello, world";
        boolean match = str1.regionMatches(0, "world", 0,12);
        System.out.println("Результат сравнения подстрок: " + match);

        //Нахождение индекса первого вхождения подстроки indexOf();
        int index = str1.indexOf("w");
        System.out.println("Номер первого вхождения w: " + index);

        // Нахождение индекс последнего вхождения подстроки, lastIndexOf();
        index = str1.lastIndexOf("o");
        System.out.println("Последнее вхождение o: " + index);

        // Определение начала строки с подстроки, startWith();
        boolean starts = str1.startsWith("He");
        System.out.println("Str1 начинается ли с He: " + starts);

        // Определение, заканчивается ли строка на подстроку, endWith();
        boolean ends = str1.endsWith("ld");
        System.out.println("Оканчивается ли на ld: " + ends);

        // В строке замена одну подстроку на другую, replace();
        String replace = str1.replace("world", "honey");
        System.out.println("Результат замены строк: " + replace);

        //  Удаление начальных и конечных пробелов, trim();
        str1 = "  Hello, world!  ";
        String trimmed = str1.trim();
        System.out.println("Удаление пробелов: " + trimmed);

        // Возврат подстроки
        str1 = trimmed;
        String subString = str1.substring(7);
        System.out.println("Подстрока: " + subString);

        // Перевод символов в нижний регистр, toLowerCase();
        str1 = "HELLO, WORLD!";
        str1= str1.toLowerCase();
        System.out.println("Нижний регистр: " + str1);

        // Перевод всех символов строки в верхний регистр, toUpperCase();
        str1 = str1.toUpperCase();
        System.out.println("Верхний регистр: " + str1);
    }
}
