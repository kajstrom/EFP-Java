package fi.kajstrom.EFP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 */
public class Console {
    protected BufferedReader br;

    public Console() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public void print(String output) {
        System.out.print(output);
    }

    public void println(String output) {
        System.out.println(output);
    }

    public String readLine() {
        try {
            return br.readLine();
        } catch (Exception e) {
            return "";
        }
    }
}
