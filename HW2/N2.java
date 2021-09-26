import java.util.Scanner;
public class N2 {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        String CheckRight = In.nextLine();
        switch (CheckRight) {
            case "q": CheckRight = "w"; break;
            case "w": CheckRight = "e"; break;
            case "e": CheckRight = "r"; break;
            case "r": CheckRight = "t"; break;
            case "t": CheckRight = "y"; break;
            case "y": CheckRight = "u"; break;
            case "u": CheckRight = "i"; break;
            case "i": CheckRight = "o"; break;
            case "p": CheckRight = "a"; break;
            case "a": CheckRight = "s"; break;
            case "s": CheckRight = "d"; break;
            case "d": CheckRight = "f"; break;
            case "f": CheckRight = "g"; break;
            case "g": CheckRight = "h"; break;
            case "h": CheckRight = "j"; break;
            case "j": CheckRight = "k"; break;
            case "k": CheckRight = "l"; break;
            case "l": CheckRight = "z"; break;
            case "z": CheckRight = "x"; break;
            case "x": CheckRight = "c"; break;
            case "c": CheckRight = "v"; break;
            case "v": CheckRight = "b"; break;
            case "b": CheckRight = "n"; break;
            case "n": CheckRight = "m"; break;
            case "m": CheckRight = "q"; break;
            default: CheckRight = "такой буквы нет:("; break;
        }
        System.out.println(CheckRight);
    }
}
