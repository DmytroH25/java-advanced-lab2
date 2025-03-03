# Серіалізатор проанотованих об’єктів в XML та JSON

## Автор
Дмитро Гордун ІА-22

## Опис
Цей проєкт реалізує серіалізацію проанотованих об'єктів у формати JSON та XML на Java. Він включає класи для серіалізації об'єктів за допомогою ручних та рефлексійних серіалізаторів, а також анотації для визначення кореневих елементів та полів.

## Структура проєкту
- `src/Book.java`: Представляє книгу з назвою, автором та ISBN.
- `src/Library.java`: Представляє бібліотеку з назвою та місцем.
- `src/Member.java`: Представляє члена бібліотеки з ідентифікатором, ім'ям та датою членства.
- `src/ManualSerializer.java`: Надає методи для ручної серіалізації об'єктів у формати JSON та XML.
- `src/ReflectionSerializer.java`: Надає методи для серіалізації об'єктів у формати JSON та XML за допомогою рефлексії.
- `src/XmlJsonRoot.java`: Анотація для визначення кореневого елемента для серіалізації у формати XML та JSON.
- `src/XmlJsonField.java`: Анотація для визначення елемента поля для серіалізації у формати XML та JSON.
- `src/Main.java`: Точка входу в додаток, що демонструє функціонал серіалізації.

## Інструкції зі збірки та запуску

### Необхідні умови
- Java Development Kit (JDK) 11 або вище
- IntelliJ IDEA або будь-яке інше Java IDE

### Кроки для збірки та запуску
1. **Клонувати репозиторій:**
   ```sh
   git clone https://github.com/DmytroH25/java-advanced-lab2.git
