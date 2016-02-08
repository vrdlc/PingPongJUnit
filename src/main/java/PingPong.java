public class PingPong {
  public static void main(String[] args) {

  }
  public Boolean isPingPong(Integer number) {
    if (number % 15 == 0) {
      return true;
    } else if (number % 5 == 0) {
      return true;
    } else if(number % 3 == 0) {
      return true;
    } else {
    return false;
  }
}
}
