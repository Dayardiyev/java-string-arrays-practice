package com.epam.java_basic.string_processor;


/**
 * Code had been written by Alisher Dayardiyev
 */
public class StringProcessor {

    //  В массиве строк найти самую короткую строку
    public String findShortestLine(String[] arr) {
        String shortest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() < shortest.length()) {
                shortest = arr[i];
            }
        }
        return shortest;
    }


    //  В массиве строк найти самую длинную строку
    public String findLongestLine(String[] arr) {
        String largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > largest.length()) {
                largest = arr[i];
            }
        }
        return largest;
    }


    //  В массиве строк найти строки длина которых меньше средней
    public String[] findLinesShorterThanAverageLength(String[] arr) {
        int total = 0;
        for (String str : arr) {
            total += str.length();
        }

        int avg = total / arr.length;
        String result = "";
        for (String str : arr) {
            if (str.length() < avg) {
                result += str + ", ";
            }
        }

        String[] shorterLines = result.split(", ");
        return shorterLines;
    }


    //  В массиве строк найти строки длина которых больше средней
    public String[] findLinesLongerThanAverageLength(String[] arr) {
        int total = 0;
        for (String str : arr) {
            total += str.length();
        }

        int avg = total / arr.length;
        String result = "";
        for (String str : arr) {
            if (str.length() > avg) {
                result += str + ", ";
            }
        }

        return result.split(", ");
    }


    //    В массиве слов найти слово в котором число различных символов минимально.
//    Если таких слов несколько, найти первое из них
    public String findWordWithMinimumVariousCharacters(String[] words) {
        int[] wordCharacters = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            StringBuilder buffer = new StringBuilder();
            for (int j = 0; j < words[i].length(); j++) {
                if (!buffer.toString().contains(String.valueOf(words[i].charAt(j)))) {
                    buffer.append(words[i].charAt(j));
                }
            }
            wordCharacters[i] = buffer.length();
        }

        int min = 0;
        for (int i = 0; i < wordCharacters.length; i++) {
            if (wordCharacters[i] < wordCharacters[min]) {
                min = i;
            }
        }
        return words[min];
    }


    //    В массиве слов найти слово состоящее только из различных символов.
//    Если таких слов несколько, найти первое из них
    public String findWordConsistingOfVariousCharacters(String[] arr) {
        for (String str : arr) {
            boolean isUnique = true;
            for (int j = 0; j < str.length(); j++) {
                for (int k = j + 1; k < str.length(); k++) {
                    if (str.charAt(j) == str.charAt(k)) {
                        isUnique = false;
                        break;
                    }
                }
            }
            if (isUnique) {
                return str;
            }
        }

        return null;
    }

    //    В массиве слов найти слово состоящее только из цифр.
//    Если таких слов несколько, найти второе из них
    public String findWordConsistingOfDigits(String[] arr) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            try {
                Integer.parseInt(arr[i]);
                temp.append(i);
            } catch (NumberFormatException ignored) {
            }
        }
        if (temp.length() == 1) {
            return arr[Integer.parseInt(String.valueOf(temp.charAt(0)))];
        } else if (temp.length() != 0) {
            return arr[Integer.parseInt(String.valueOf(temp.charAt(1)))];
        }
        return null;
    }
}
