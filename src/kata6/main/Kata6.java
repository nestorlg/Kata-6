/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6.main;

import java.io.FileNotFoundException;
import java.io.IOException;
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
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay<String> histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}