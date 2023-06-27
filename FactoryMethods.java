import java.util.*;

interface SmartPhone {
  void use();
}

class Oppo implements SmartPhone {
  public void use() {
    System.out.println("Switching on Oppo Device..");
  }
}

class Redmi implements SmartPhone {
  public void use() {
    System.out.println("Switching on Redmi Device..");
  }
}

class Samsung implements SmartPhone {
  public void use() {
    System.out.println("Switching on Samsung Device..");
  }
}

class SwitchOn {
  // factory method
  public SmartPhone turn(String phone) {
    if (phone == null)
      return null;
    switch (phone) {
      case "Oppo":
        return new Oppo();
      case "Redmi":
        return new Redmi();
      case "Samsung":
        return new Samsung();
      default:
        throw new IllegalArgumentException("Unknown Device " + phone);
    }
  }
}

class FactoryMethods {
  public static void main(String[] args) {
    SwitchOn on = new SwitchOn();
    SmartPhone phone = on.turn("Samsung");
    phone.use();
  }
}