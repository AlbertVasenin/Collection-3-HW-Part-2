import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Random;

public class HomeworkCollection3Part2 {

  private Map<String, List<Integer>> map;

  public HomeworkCollection3Part2() {
    this.map = new HashMap<>();
  }

  public Map<String, Integer> getMapStringInteger() {
    Map<String, Integer> stringIntegerMap = new HashMap<>();
    int sum = 0;
    for (Entry<String, List<Integer>> entry : map.entrySet()) {
      for (int i = 0; i < entry.getValue().size(); i++) {
        sum = sum + entry.getValue().get(i);
      }
      stringIntegerMap.put(entry.getKey(), sum);
    }
    return stringIntegerMap;
  }


  public void addMapRandomList(String key) {
    Random random = new Random();
    List<Integer> value = new ArrayList<>();
    while (value.size() < 3) {
      value.add(random.nextInt(1000));
      map.put(key, value);
    }
  }

  public Map<String, List<Integer>> getMap() {
    return map;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HomeworkCollection3Part2 that = (HomeworkCollection3Part2) o;
    return Objects.equals(map, that.map);
  }

  @Override
  public int hashCode() {
    return Objects.hash(map);
  }

  @Override
  public String toString() {
    return "map " + map;
  }
}
