1. Создать класс [StringHelper](src/main/java/StringHelper.java) с методами:

**generate (int stringLength)**: принимает параметр типа int, возвращает alpha-numeric строку со случайными символами длиной, равной переданному параметру (прим.: generate(5) => "aNr4d")

**reverse (String str)**: принимает параметр типа String, возвращает перевернутую строку (прим.: reverse("qwerty") => "ytrewq")
  
**format (String []args)**: принимает строку(которую необходимо отформатировать) и аргументы для вставки. Аргументы вставляются в определенных местах, указанных через "{index}", т.е. {1}, {2}, {3}.. (прим.: входная строка "This {1} is {2}.", аргументы "string", "formatted". Выходная строка "This string is formatted"))
  
**camelCase (String strInput)**: принимает строку, возвращает строку в которой все буквы поочередно идут в разном регистре, начиная с заглавной("hello WORLD!" => "HeLlO wOrLd!")

2. Написать класс [StringHelperTest](src/test/java/StringHelperTest.java) c unit тестами на реализованные методы.

3. В классе [ReverseParameterizedTest](src/test/java/ReverseParameterizedTest.java) реализовать параметризованный тест (org.junit.runners.Parameterized) для метода reverse на 5 запусков.

4. Создать класс [IdGenerator](src/main/java/IdGenerator.java) с полем типа StringHelper и методом generateId принимающим длину идентификатора, который нужно сгенерить и возвращающий сгенерированный идентификатор строкой.

5. Написать unit тесты на метод generateId с использованием mock и stub. Классы [IdGeneratorStubTest](src/test/java/IdGeneratorStubTest.java) и [IdGeneratorMockTest](src/test/java/IdGeneratorMockTest.java)

6. Создать класс [Repository](src/main/java/Repository.java) с полем типа IdGenerator и методом save, принимающим Object и возвращающим строку. Метод имитирует сохранение в базу, т.е. генерит идентификатор (через IdGenerator) для сущности (всегда длиной 7 символов), печатает в консоль что сущность с "{id}" сохранена и возвращает id данной сущности. В случае если переданный объект null, выбрасывается непроверяемое исключение [EmptyObjectException](src/main/java/EmptyObjectException.java) (создать соответсвующий класс) с сообщением "Entity must not be null".

7. Написать класс [RepositoryTest](src/test/java/RepositoryTest.java) - unit тесты для класса Repository(случай с выбрасыванием EmptyObjectException должен быть покрыт отдельным тестом)
