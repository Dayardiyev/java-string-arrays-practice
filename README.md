## Общие требования
1. Код приложения должен быть отформатирован в едином стиле и соответствовать Java Code Convention.
2. Если приложение содержит консольные меню или ввод/вывод, то они должны быть минимальными, достаточными и интуитивно понятными. Язык – English.
3. В комментарии к классу пропишите своё имя и номер задачи. По возможности добавлять содержательные комментарии к коду.
4. Java Collection Framework (за исключением java.util.Arrays) и регулярные выражения использовать нельзя

## Варианты заданий
Написать программу, осуществляющую обработку строк. Пользователь вводит следующие данные:
1. Количество строк (число)
2. Строки для обработки
3. Количество слов (число)
4. Слова

Реализуемые методы:
1. В массиве строк найти самую короткую строку
2. В массиве строк найти самую длинную строку
3. В массиве строк найти строки длина которых меньше средней
4. В массиве строк найти строки длина которых больше средней
5. В массиве слов найти слово в котором число различных символов минимально. Если таких слов несколько, найти первое из них
6. В массиве слов найти слово состоящее только из различных символов. Если таких слов несколько, найти первое из них
7. В массиве слов найти слово состоящее только из цифр. Если таких слов несколько, найти второе из них

## Пример ввода/вывода
```
Specify amount of lines:
3
Input line 1:
qwerty
Input line 2:
qw
Input line 3:
qwerty qwerty
1) Shortest line is qw (length is 2)
2) Longest line is qwerty qwerty (length is 13)
3) Lines longer than average length:
qwerty qwerty (length is 13)
4) Lines shorter than average length:
qw (length is 2)
qwerty (length is 6)
Specify amount of words:
4
Input word 1:
qqqqqqqqqqwe
Input word 2:
qwer
Input word 3:
123
Input word 4:
4321
5) Word with minimum various characters: qqqqqqqqqqwe
6) Word contains only various characters: qwer
7) Word contains only digits: 4321
```