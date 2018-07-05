package _07_greeting;

public class Greeting {
    public static String greeting(GreetingEnum timeZone) {
        switch (timeZone) {
            case Asa:   //朝の場合
                return "おはよう";
            case Hiru:  //昼の場合
                return "こんにちは";
            case Yoru:  //夜の場合
                return "こんばんは";
        }
        return null;    //上記以外の場合
    }
}

