public class Wraper {
  public static void main(String[] args) {
    int x = 5;
    float y = 3.14f;
    long z = 6000;
    // autoboxing
    Integer intobj = x;
    Float floatobj = y;
    Long longobj = z;
    // unboxing
    int unboxx = intobj;
    float unboxy = floatobj;
    long unboxz = longobj;
    System.out.println(unboxx);
    System.out.println(unboxy);
    System.out.println(unboxz);
    // autounboxing
    int sum = x + intobj;
    float diff = y - floatobj;
    long product = z * longobj;
    System.out.println(sum);
    System.out.println(diff);
    System.out.println(product);
  }

}
