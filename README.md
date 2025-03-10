# UniversalSorter - Java Project

## Общая информация
**UniversalSorter** — приложение, реализующее алгоритмы сортировки и бинарного поиска для переданных классов. Работа производится с массивами, и все компоненты соответствуют стандартам архитектуры и кодстайла языка Java. Проект предполагает работу в команде с использованием системы контроля версий Git.

---

## Основные требования

1. **Циклическая работа программы:**
    - Программа выполняется в цикле. Выход возможен только через выбор пользователя.

2. **Ввод массива данных:**
   Пользователь выбирает способ заполнения массива:
    - **Ручной ввод.**
    - **Чтение из файла.**
    - **Генерация случайных данных.**

3. **Длина массива:**
    - Пользователь задаёт желаемую длину массива.

4. **Сортировка:**
    - Реализация сортировки слиянием (**MergeSort**).
    - Сортировка кастомных классов:
        - **Car** (мощность, модель, год производства).
        - **Book** (автор, название, количество страниц).
        - **RootVegetable** (тип, вес, цвет).
    - Дополнительная сортировка:
        - Числовое поле сортируется в натуральном порядке, если значение чётное.
        - Неизменяемое расположение элементов для нечётных значений.

5. **Бинарный поиск:**
    - Реализация поиска элементов в отсортированном массиве.

6. **Паттерн “Стратегия”:**
    - Используется для реализации алгоритмов сортировки и поиска.

7. **Паттерн “Builder”:**
    - Используется для создания экземпляров кастомных классов.

8. **Валидация данных:**
    - Проверка входных данных на корректность.

---

## Дополнительные задачи

1. **Дополнительная сортировка:**
    - Реализовать чётно-нечётную сортировку числового поля.

2. **Запись результатов в файл:**
    - Сохранение отсортированных коллекций и найденных значений в файл в режиме добавления данных.

---

## Технические детали

1. **Универсальность:**
    - Использование дженериков для работы с любыми типами данных.

2. **Валидация:**
    - Проверка данных на этапе ручного ввода или чтения из файла.

3. **Реализация поиска и сортировки:**
    - Не использовать стандартные библиотеки Java для сортировки и поиска.

4. **Файловый ввод/вывод:**
    - Реализация работы с файлами для чтения входных данных и записи результатов.

---

## Структура проекта

```plaintext
UniversalSorter/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── universalsorter/
│   │   │   │   │   ├── app/                          # Главный пакет приложения
│   │   │   │   │   │   ├── Main.java                 # Точка входа
│   │   │   │   │   ├── model/                        # Кастомные классы
│   │   │   │   │   │   ├── Car.java                  # Класс "Автомобиль"
│   │   │   │   │   │   ├── Book.java                 # Класс "Книга"
│   │   │   │   │   │   ├── RootVegetable.java        # Класс "Корнеплод"
│   │   │   │   │   ├── service/                      # Логика приложения
│   │   │   │   │   │   ├── SortStrategy.java         # Интерфейс "Стратегия"
│   │   │   │   │   │   ├── MergeSort.java            # Реализация MergeSort
│   │   │   │   │   │   ├── EvenOddSortDecorator.java # Доп. сортировка
│   │   │   │   │   │   ├── BinarySearch.java         # Реализация бинарного поиска
│   │   │   │   │   │   ├── FileHandler.java          # Работа с файлами
│   │   │   │   │   │   ├── Validator.java            # Валидация данных
│   │   │   │   │   ├── utils/                        # Утилиты
│   │   │   │   │   │   ├── InputUtils.java           # Утилиты для ввода данных
│   │   │   │   │   │   ├── RandomGenerator.java      # Генерация случайных данных
│   ├── test/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── universalsorter/
│   │   │   │   │   ├── service/
│   │   │   │   │   │   ├── MergeSortTest.java        # Тесты для MergeSort
│   │   │   │   │   │   ├── BinarySearchTest.java     # Тесты для BinarySearch
│   │   │   │   │   ├── model/
│   │   │   │   │   │   ├── CarTest.java              # Тесты для Car
│   │   │   │   │   │   ├── BookTest.java             # Тесты для Book
│   │   │   │   │   │   ├── RootVegetableTest.java    # Тесты для RootVegetable
├── .gitignore
├── pom.xml                                           # Конфигурация Maven
└── README.md                                         # Документация проекта
```

---

## Workflow для работы с Git

1. **Количество веток:**
    - Каждая задача выполняется в отдельной ветке.

2. **Мёрдж:**
    - После завершения работы ветки проходят код-ревью и объединяются в `master/main`.

3. **Именование веток:**
    - Формат: `feature/<описание-задачи>`.

---

## TODO:

1. Реализация всех алгоритмов.
2. Настройка и тестирование бинарного поиска и сортировки.
3. Добавление обработки файлов.
4. Покрытие проекта тестами.
5. Написание полной документации.


