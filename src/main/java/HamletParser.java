import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by thook on 10/7/15.
 */
public class HamletParser {
    private String horatio = "Horatio";
    private String hamlet = "Hamlet";
    private Pattern Horatio = Pattern.compile("horatio", Pattern.CASE_INSENSITIVE);
    private Pattern Hamlet = Pattern.compile("hamlet", Pattern.CASE_INSENSITIVE);
    private String leonString = "Leon";
    private String tariqString = "Tariq";

    private String hamletData;

    public HamletParser() {
        this.hamletData = loadFile();
    }

    private String loadFile() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("hamlet.txt").getFile());
        StringBuilder result = new StringBuilder("");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result.toString();
    }

    public String getHamletData() {
        return hamletData;
    }

    public Boolean find(){
        return null;
    }




    public String replaceHamletWithLeon(String input){
        Matcher m = Hamlet.matcher(input);
        StringBuffer sb = new StringBuffer();
        while (m.find()){
            String leon = "Leon";
            m.appendReplacement(sb, Matcher.quoteReplacement(leon));
        }
        m.appendTail(sb);
        System.out.println(sb.toString());
        return sb.toString();
    }

    public String replaceHoratioWithTariq(String input){
        Matcher m = Horatio.matcher(input);
        StringBuffer sb = new StringBuffer();
        while (m.find()){
            String tariq = "Tariq";
            m.appendReplacement(sb, Matcher.quoteReplacement(tariq));
        }
        m.appendTail(sb);
        System.out.println(sb.toString());
        return sb.toString();
    }





}
