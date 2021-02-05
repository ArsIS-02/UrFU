/*. Выполнить пример 1 из раздела 2.
Отработать код с помощью отладчика и привести скриншоты минимум трех точек обработанных отладчиком.*/
package example_02_84;
public class din {
    public static void main(String[] args) {
// создание несвязанных узлов с помощью конструктора
        Node node0 = new Node(0, null); // 0-й узел – будет головой в списке
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null); // последний узел – будет хвостом в списке
// связывание узлов в список с помощью ссылок
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
// вывод списка с использованием вспомогательной переменной ref,
// соответствующей текущему значению ссылки при прохождении по списку
        Node ref = node0; // для перемещения по списку достаточно помнить голову
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        } }}