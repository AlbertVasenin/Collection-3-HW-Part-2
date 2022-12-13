import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class Task {

  private Map<Integer, String> integersStrings;

  public Task() {
    this.integersStrings = new HashMap<>();
  }

  public void putMapKeyValue(Integer key, String value) {
    integersStrings.put(key, value);
  }

  public Map<Integer, String> getIntegersStrings() {
    return integersStrings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task task = (Task) o;
    return Objects.equals(integersStrings, task.integersStrings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integersStrings);
  }

  @Override
  public String toString() {
    return "integersStrings " + integersStrings;
  }

  public void toStringInfoKeyValue() {
    for (Entry<Integer, String> integerStringEntry : integersStrings.entrySet()) {
      System.out.println(integerStringEntry.getKey() + ":" + integerStringEntry.getValue() + "\n");
    }
  }
}
