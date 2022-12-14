package Interfaces;

public class MultipleInterfaceEg {
    interface Gift {
        void present();
    }

    interface Guest {
        void present();
    }

    interface Presentable extends Gift, Guest {
    }

    public static void main(String[] args) {
        Presentable johnny = new Presentable() {
            @Override
            public void present() {
                System.out.println("Heeeereee's Johnny!!!");
            }
        };
        johnny.present();                     // "Heeeereee's Johnny!!!"

        ((Gift) johnny).present();            // "Heeeereee's Johnny!!!"
        ((Guest) johnny).present();           // "Heeeereee's Johnny!!!"

        Gift johnnyAsGift = (Gift) johnny;
        johnnyAsGift.present();               // "Heeeereee's Johnny!!!"

        Guest johnnyAsGuest = (Guest) johnny;
        johnnyAsGuest.present();              // "Heeeereee's Johnny!!!"
    }
}
