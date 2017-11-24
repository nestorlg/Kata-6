/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata6.model.Histogram;
import kata6.model.Mail;
import kata6.view.HistogramDisplay;
import kata6.view.MailHistogramBuilder;
import kata6.view.MailListReader;

/**
 *
 * @author usuario
 */
public class Kata6 {
    public static void main (String[] arg) throws FileNotFoundException, IOException {
        String filename = "emails.txt";
        List<Mail> mailList = MailListReader.read(filename);
        Histogram<String> histogram = MailHistogramBuilder.buildM(mailList);
        List<String> domList = new ArrayList<String>();
        for (int i = 0;i < mailList.size();i++) {
            domList.add(mailList.get(i).getDomain());
        }
        Histogram<String> histogramaDominios = MailHistogramBuilder.buildH(domList);
        List<Character> charList = new ArrayList<Character>();
        for (int i = 0;i < mailList.size();i++) {
            charList.add(mailList.get(i).getMail().charAt(0));
        }
        Histogram<Character> histogramaCaracteres = MailHistogramBuilder.buildC(charList);
        HistogramDisplay<String> histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}