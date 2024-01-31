import java.util.Arrays;

class Program { //Todo изменить название класса

    public int[] arr; //Todo Сделать возвращаемый массив

    public int capacity;

    public int size;

    Program() {
        arr = new int[1];
        capacity = 1;
        size = 0;
    }

    public void addData(int data) {
        if (size == capacity) {
            int[] temp = new int[1 + capacity];

            if (capacity >= 0) System.arraycopy(arr, 0, temp, 0, capacity);
//            for (int i = 0; i < capacity; i++) {
//                temp[i] = arr[i];
//            }

            capacity += 1;
            arr = temp;
        }

        arr[size] = data;
        size++;
    }

    public void add(int data, int index) throws IndexOutOfBoundsException {
        try {
            if (index == capacity) {
                addData(data);
            } else {
                arr[index] = data;
            }
        } catch (IndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public int getElement(int index) {
        if (index < size) {
            return arr[index];
        } else {
            return -1;
        }
    }

    public void delete() { //Todo сделать удаление по индексу
        size--;
    }

    public int getSize() {
        return size;
    }

    public int getСapacity() {
        return capacity;
    }

    public static void main(String args[]) { //Todo разделить на классы
        Program arrList = new Program();

        for (int i = 0; i < 10; i++) {
            arrList.addData((int) ((Math.random() * 101) - 50));
        }

        arrList.info(arrList);

        System.out.println("\n\tДобавляем элемент в начало списка");
        arrList.add((int) (Math.random() * 101), -100);

        System.out.println("Элементы массива:");
        System.out.println(Arrays.toString(arrList.arr));
        System.out.println("Получим элемент находящийся под индексом '1':\n" + arrList.getElement(1));

        System.out.println("\n\tУдаляем последний элемент списка");
        arrList.delete();

        arrList.info(arrList);
    }

    public void info(Program arrList) {
        System.out.println("Размер массива: " + arrList.getSize());
        System.out.println("Емкость массива: " + arrList.getСapacity());
        System.out.println("Элементы массива:");
        System.out.println(Arrays.toString(arrList.arr));
    }
}