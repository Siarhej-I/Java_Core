package by.homework.lesson8;

public class StringClass {

    String txt;

    public StringClass() {

    }

    public StringClass(String txt) {
        this.txt = txt;
    }

    /*1.2.В этом методе необходимо выполнить следующую логику.
    Если строка в 1-ом параметре заканчивается строкой из второго параметра, то необходимо вырезать из строки 1-ого параметра
    значение строки не включающей строку из второго параметра. Иначе вернуть строку из 1-ого параметра приведённую к верхнему регистру.
Пример. Есть 1-ая строка «Я люблю java» и 2-ая строка «java». Так как первая строка оканчивается такой же строкой что и 2-ая строка (java),
то метод должен вернуть «Я люблю» иначе метод должен вернуть «Я ЛЮБЛЮ».
В этом методе нужно использовать методы для работы со строками: endWith(), indexOf(), substring(), toUpperCase();*/
    public String stringMethod(String first, String second) {
        String result = new String();
        if (first.endsWith(second)) {
            result = first.substring(0, first.indexOf(second));
        } else {
            result = first.substring(0, first.indexOf(second)).toUpperCase();
        }
        return result;
    }

    /*2. Дан текст:
"Каждая строка, создаваемая с помощью оператора new,литерала (заключенная в двойные апострофы) и ли метода класса, создающего строку,
является экземпляром класса String. Особенностью объекта класса String является то,
что его значение не может быть изменено после создания объекта при помощи любого метода класса.
Изменение строки всегда приводит к созданию нового объекта в heap. Сама объектная ссылка при этом сохраняет прежнее значение и хранится в стеке.
Произведенные изменения можно сохранить переинициализируя ссылку."
2.1 В тексте после символа каждого слова с индексом k вставить заданную подстроку. Используемые методы (split(), substring())
Вынести это в отдельный метод с сигнатурой public String (int k, String text)*/
    public String addString(int k, String text) {
        int lengthArr = this.txt.split("[.,\\s]+").length;
        String[] strArray = new String[lengthArr];
        String[] strArrayNew = new String[lengthArr + 1];
        strArray = this.txt.split("[.,\\s]+");
        int i = 0;
        for (String s : strArray) {
            strArrayNew[i] = s;
            if (i == k) {
                strArrayNew[i + 1] = text;
                i += 2;
            } else i++;
        }
        String resultText = String.join(" ", strArrayNew);
        return resultText;
    }

    /*3.1 Из текста удалить все символы, кроме пробелов, не являющиеся буквами.
    Между последовательностями подряд идущих букв оставить хотя бы один пробел. (задача с использованием регулярных выражений) */
    public String replaceString(){
        String expression = "(?<=[a-zA-Zа-яА-Я])\\d+(?=[a-zA-Zа-яА-Я])|\\[\\d+\\]";
        String finishText = this.txt.replaceAll(expression,"");
        return finishText;
    }
}
