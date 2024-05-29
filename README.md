# Game of Seminars

## Seminar 1: 

1. Проанализировать персонажей 
"Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах".
2. Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд).
3. Создать абстрактный класс и иерархию наследников. 
Расположить классы в пакет так, чтобы в основной программе небыло видно их полей. 
В не абстрактных классах переопределить метод toString() так чтобы он возвращал название класса или имя. 
Создать в основной программе по одному обьекту каждого не абстрактного класса и вывести в консоль его имя.

## Seminar 2:

1. Добавить в проект класс, предназначенный для хранения координат.
2. Добавить в абстрактный класс поле, экземпляр класс координат.
3. Пробросить координаты через конструкторы наследников так, чтобы создавая объекты вы передавали в параметрах имя и координаты.
4. Скорректировать алгоритм заполнения команд. Кроме имён каждый персонаж должен иметь координаты.
5. Одна команда находится с левой стороны другая с правой(у=0 и у=9).
6. В класс лучников добавить метод поиск ближайшего противника. Алгоритм расчёта расстояний реализовать в классе координат.

## Seminar 3

1.  Добавить в файл интерфейса метод void step() это будет основной метод взаимодействия с объектами.
2.  Добавить интерфейс в базовый абстрактный класс. Реализовать этот метод во всех классах наследниках. Для начала просто заглушкой.
3.  Доработать классы лучников. Лучник должен во первых проверить жив ли он и есть ли у него стрелы, если нет то завершить метод.
    Если всё да, то найти ближайшего противника и выстрелить по нему и, соответственно потратить одну стрелу.
4.  Реализовать весь функционал лучников в методе step().
5.  Добавить в абстрактный класс int поле инициатива. В классах наследников инициализировать это поле.
    Крестьянин = 0, маги=1, пехота=2, лучники=3.
6.  В мейне сделать так, чтобы сначала делали ход персонажи с наивысшей инициативой из обеих команд, а с наименьшей в конце.

## Seminar 4

1.  Реализовать метод step() пехоты. Первое проверяем живы ли мы, потом ищем ближайшего противника.
    Если противник в соседней клетке, наносим повреждение. Иначе двигаемся в сторну противника.
2.  Алгоритм движения, если dX>dY двигаемся по x иначе по y. dX и dY (разница наших координат и ближайшего противника)
    знаковые, от знака зависит направление.

## Seminar 5 

1.  Добавить в проект классы View и AnsiColors.
2.  Доработать проект так, чтобы выводилось состояние в консоль.
3.  Если в одной из команд погибли все, приложение закрывается с поздравлением победившей команды.