import java.util.Random;

public class StringHelper {

    char[] alphaNumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();

    public String generate(int stringLength) {
        char[] ch = new char[stringLength];
        int len = alphaNumeric.length - 1;
        Random random = new Random();
        for (int i = 0; i < stringLength; i++)
            ch[i] = alphaNumeric[random.nextInt(len)];
        return String.valueOf(ch);
    }

    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public String format(String[] args) {
        for (int i = args.length - 1; i > 0; i--) {
            String regex = "{" + i + "}";
            args[0] = args[0].replace(regex, args[i]);
        }
        return args[0];
    }

    public String camelCase(String strInput) {
        char[] ch = strInput.toCharArray();
        int len = ch.length - 1;
        ch[len] = Character.toUpperCase(ch[len]);
        for (int i = 0; i < len; i += 2) {
            ch[i]   = Character.toUpperCase(ch[i]);
            ch[i+1] = Character.toLowerCase(ch[i+1]);
        }
        return String.valueOf(ch);
    }
}
