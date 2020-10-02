import java.util.Arrays;

public class DailyTemperatures {
  public static void main(String[] args) {
    int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
    System.out.println(Arrays.toString(new DailyTemperatures().dailyTemperatures(T)));
  }

  public int[] dailyTemperatures(int[] T) {
    if (T == null) return null;
    int[] days = new int[T.length];
    for (int i = 0; i < T.length; i++) {
      int day = 0;
      for (int j = i + 1; j < T.length; j++) {
        if (T[j] > T[i]) {
          day = j - i;
          break;
        }
      }
      days[i] = day;
    }
    return days;
  }
}
