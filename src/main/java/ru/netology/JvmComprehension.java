package ru.netology;

public class JvmComprehension {
    // Класс JvmComprehension отдается для загрузки в систему
    // загрузчиков классов. Этот класс хранится в MetaSpace.

    public static void main(String[] args) {
        // В области памяти Stack Memory создается фрейм(кадр) main()
        // 1 - В области памяти Stack Memory в main() кадре создается переменная i примитивного типа int
        // и переменной i присваивается значение 1
        int i = 1;

        // 2 - В куче Heap создается объект Object,
        // в области памяти Stack Memory в main() кадре создается ссылка "o" на объект Object в куче
        Object o = new Object();

        // 3 - В куче Heap создается объект Integer со значением 2,
        // в области памяти StackMemory в main() кадре создается ссылка "ii" на объект Integer в куче
        Integer ii = 2;

        // 4 - В области памяти Stack Memory создается фрейм(кадр) printAll(),
        // в который передаются:
        // ссылка "o" на объект Object в куче,
        // переменная i,
        // ссылка "ii" на объект Integer в куче
        printAll(o, i, ii);

        // 7 - В области памяти Stack Memory в  println() кадре
        // передается ссылка на объект типа String со значением "finished",
        // созданный в куче (Heap)
        System.out.println("finished");

        // Срабатывает сборщик мусора Garbage Collector в ходе выполнения программы.
    }

    private static void printAll(Object o, int i, Integer ii) {
        // 5 - В куче Heap создается объект Integer со значением 700,
        // в области памяти Stack Memory в printAll() кадре создается ссылка "uselessVar"
        // на объект в куче
        Integer uselessVar = 700;
        // 6 - В области памяти Stack Memory создается фрейм(кадр) println(),
        // куда передаются ссылки:
        // "o" на Object в куче Heap,
        // "i" на int в main() кадре области памяти Stack Memory,
        // "ii" на Integer в куче Heap.
        // В области памяти Stack Memory создается фрейм(кадр) toString()
        System.out.println(o.toString() + i + ii);
    }
}