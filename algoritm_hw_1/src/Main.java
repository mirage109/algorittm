public class Main {

    //    Given an array arr[] of N elements, the challenge is to write a function to find a given element x in arr[] .
//
//
//    Линейный поиск используется для поиска ключевого элемента среди нескольких элементов.
//    Линейный поиск сегодня используется меньше, потому что он медленнее, чем бинарный поиск и хеширование.
//
//
//    Алгоритм:
//
//
//    Шаг 1: Обход массива
//    Шаг 2: Сопоставьте ключевой элемент с элементом массива
//    Шаг 3: Если ключевой элемент найден, верните позицию индекса элемента массива.
//    Шаг 4: Если ключевой элемент не найден, верните -1
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(find(array, -8));
        int[] arraySorted = new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 7, 7};
        int[] arraySorted1 = new int[]{1, 2, 2, 3, 3, 4, 4, 5, 5, 7, 7};
        int[] arraySorted2 = new int[]{1, 1, 2, 2, 3, 4, 4, 5, 5, 7, 7};
        int[] arraySorted3 = new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 7};
        System.out.println(findUnique(arraySorted1));
        System.out.println(findUnique(arraySorted2));
        System.out.println(findUnique(arraySorted3));
    }

    public static int find(int[] array, int element) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static int findUnique(int[] array) {
        if (array[array.length - 1] != array[array.length - 2]) {
            return array[array.length - 1];
        }
        for (int i = 0; i < array.length - 1; i += 2) {
            if (array[i] != array[i + 1]) {
                return array[i];
            }

        }
        return -1;
    }
}