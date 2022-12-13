public class Main {

  public static void main(String[] args) {
    HomeworkCollection3Part2 homeworkCollection3Part2 = new HomeworkCollection3Part2();
    homeworkCollection3Part2.addMapRandomList("Ключ1");
    homeworkCollection3Part2.addMapRandomList("Ключ2");
    homeworkCollection3Part2.addMapRandomList("Ключ3");
    System.out.println(homeworkCollection3Part2);
    System.out.println("========================================================================");
    System.out.println(homeworkCollection3Part2.getMapStringInteger());
    System.out.println("========================================================================");
    Task task = new Task();
    task.putMapKeyValue(1, "Один");
    task.putMapKeyValue(2, "Два");
    task.putMapKeyValue(3, "Три");
    task.putMapKeyValue(4, "Четыре");
    task.putMapKeyValue(5, "Пять");
    task.putMapKeyValue(6, "Шесть");
    task.putMapKeyValue(7, "Семь");
    task.putMapKeyValue(8, "Восемь");
    task.putMapKeyValue(9, "Девять");
    task.putMapKeyValue(10, "Десять");
    task.toStringInfoKeyValue();
  }
}
